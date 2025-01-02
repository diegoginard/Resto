package BaseDatos;

import Vistas.Utilidades;
import java.io.*;
import java.sql.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.function.Consumer;

public class Conexion {

    private static String DRIVER;
    private static String URL;
    private static String DB;
    private static String USUARIO;
    private static String PASSWORD;
    private static String URL1;
    private static String USUARIO1;
    private static String PASSWORD1;
    private static String sqlFilePath = "resto.sql";
    private static String sqlconfigPath = "configSql.txt";
    private static String ConexconfigPath = "config.txt";
    private static Connection connection;

    private Conexion() {
    }

    private static void cargarArchivoConfiguracion(String filePath, String[] keys, Consumer<Properties> propertyConsumer) {
        Properties properties = new Properties();
        File archivoConfig = new File(filePath);

        if (!archivoConfig.exists()) {
            try (FileOutputStream fos = new FileOutputStream(archivoConfig)) {
                for (String key : keys) {
                    properties.setProperty(key, "");
                }
                properties.store(fos, "Archivo de configuración generado automáticamente.");
                Utilidades.mostrarDialogoTemporal("Archivo Creado", "Archivo " + filePath + " creado con valores predeterminados.", 2000);
            } catch (IOException e) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, "Error al crear archivo: " + filePath, e);
            }
        } else {
            try (FileInputStream fis = new FileInputStream(archivoConfig)) {
                properties.load(fis);
                propertyConsumer.accept(properties);
            } catch (IOException e) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, "Error al cargar archivo: " + filePath, e);
                Utilidades.mostrarDialogoTemporal("Error", "No se pudo cargar el archivo " + filePath, 4000);
            }
        }
    }

    private static void cargarConfiguracion() {
        cargarArchivoConfiguracion(ConexconfigPath, new String[]{"DRIVER", "URL", "DB", "USUARIO", "PASSWORD"}, props -> {
            DRIVER = props.getProperty("DRIVER");
            URL = props.getProperty("URL");
            DB = props.getProperty("DB");
            USUARIO = props.getProperty("USUARIO");
            PASSWORD = props.getProperty("PASSWORD");
        });
    }

    private static void cargarConfiguracionSql() {
        cargarArchivoConfiguracion(sqlconfigPath, new String[]{"URL", "USUARIO", "PASSWORD"}, props -> {
            URL1 = props.getProperty("URL");
            USUARIO1 = props.getProperty("USUARIO");
            PASSWORD1 = props.getProperty("PASSWORD");
        });
    }

    public static Connection getConexion() {
        if (connection == null) {
            cargarConfiguracion(); // Cargar configuración al inicializar

            try {
                // Cargar el driver desde la configuración
                Class.forName(DRIVER);
                connection = DriverManager.getConnection(URL + DB, USUARIO, PASSWORD);

                Utilidades.mostrarDialogoTemporal("Conexión Exitosa", "Conectado correctamente a la base de datos.", 2000);

            } catch (ClassNotFoundException ex) {

                Utilidades.mostrarDialogoTemporal("Error", "Error al cargar el Driver: " + ex.getMessage(), 2000);
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);

            } catch (SQLException ex) {

                Utilidades.mostrarDialogoTemporal("Error al conectar a la base de datos: ", "     " + ex.getMessage(), 2000);
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);

            } catch (NullPointerException ex) {

                Utilidades.mostrarDialogoTemporal("Error", "No se puede leer el archivo config.txt." + ex.getMessage(), 3000);
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return connection;
    }

    public static void cerrarConexion() {
        if (connection != null) {
            try {
                connection.close();
                connection = null; // Reiniciar el objeto para futuras conexiones
                Utilidades.mostrarDialogoTemporal("Desconexión Exitosa", "Se desconectó correctamente de la base de datos.", 2000);
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, "Error al cerrar la conexión", ex);
                Utilidades.mostrarDialogoTemporal("Error", "Error al cerrar la conexión: " + ex.getMessage(), 3000);
            }
        } else {
            Utilidades.mostrarDialogoTemporal("Info", "No hay conexión activa para cerrar.", 2000);
        }
    }

    public static void crearBD() {
        cargarConfiguracionSql(); // Asegurarse de que la configuración esté cargada

        try (Connection connection = DriverManager.getConnection(URL1, USUARIO1, PASSWORD1); Statement statement = connection.createStatement(); BufferedReader reader = new BufferedReader(new FileReader(sqlFilePath))) {

            Utilidades.mostrarDialogoTemporal("Conexión Establecida", "Conexión a la base de datos configurada establecida.", 2000);

            // Leer el archivo SQL y ejecutar los comandos
            StringBuilder sql = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sql.append(line);
                if (line.trim().endsWith(";")) { // Ejecutar comando al encontrar punto y coma
                    statement.execute(sql.toString());
                    sql.setLength(0); // Limpiar buffer para el siguiente comando
                }
            }

            Utilidades.mostrarDialogoTemporal("Operación Exitosa", "Base de datos creada exitosamente.", 2000);

        } catch (SQLException e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, "Error al ejecutar el script SQL", e);
            Utilidades.mostrarDialogoTemporal("Error", "SQLException..." + e.getMessage(), 4000);
            eliminarBaseDeDatosCompleta();
        } catch (IOException e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, "Error al leer el archivo SQL", e);
            Utilidades.mostrarDialogoTemporal("Error", "Error al leer el archivo SQL: " + e.getMessage(), 8000);
        }
    }

    public static void eliminarBaseDeDatosCompleta() {
        cargarConfiguracionSql(); // Asegurarse de que la configuración esté cargada

        try (Connection connection = DriverManager.getConnection(URL1, USUARIO1, PASSWORD1); Statement statement = connection.createStatement()) {

            // Comando para eliminar toda la base de datos
            String dropDatabaseSQL = "DROP DATABASE IF EXISTS " + DB;
            statement.executeUpdate(dropDatabaseSQL);

            Utilidades.mostrarDialogoTemporal("Operación Exitosa", "Base de datos eliminada exitosamente: " + DB, 2000);

        } catch (SQLException e) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, "Error al eliminar la base de datos", e);
            Utilidades.mostrarDialogoTemporal("Error", "SQLException: " + e.getMessage(), 4000);
        }
    }
}
