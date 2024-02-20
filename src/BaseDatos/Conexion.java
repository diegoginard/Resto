
package BaseDatos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Conexion {
    
    private static final String URL="jdbc:mariadb://localhost/";
    private static final String DB="resto";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static Connection connection;
    
    private Conexion(){
        
    }
    
    public static Connection getConexion() {

        if (connection == null) {

            try {

                Class.forName("org.mariadb.jdbc.Driver");

                connection = DriverManager.getConnection(URL + DB, USUARIO, PASSWORD);

                // Instanciar JOptionPane
                JOptionPane option = new JOptionPane("", JOptionPane.INFORMATION_MESSAGE);

                // Ponerle las opciones que queramos que no estén en el constructor
                option.setMessage("Conectado exitosamente");

                // Obtener el dialogo
                JDialog dialog = option.createDialog(null, "Base de datos");
                
                // Configurar el botón de opción para que no se muestre
                option.setOptions(new Object[]{});
        
                // Lanzar un hilo que pasado un tiempo cierre el diálogo
                new Thread(() -> {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    dialog.setVisible(false);
                }).start();

                // Hacer visible el diálogo
                // Esta llamada se queda bloqueada hasta que el usuario cierre el diálogo
                // Por ello es importante haber lanzado el hilo antes
                dialog.setVisible(true);

                //  Destruir el diálogo cuando el operador lo ha cerrado.
                dialog.dispose();

            } catch (ClassNotFoundException ex) {

                JOptionPane.showMessageDialog(null, "Error al cargar los Drivers: " + ex.getMessage());

            } catch (SQLException ex) {

                //JOptionPane.showMessageDialog(null, "Error a Conectarse a la Base Datos. \n" + ex.getMessage());
                
                JOptionPane option1 = new JOptionPane("", JOptionPane.INFORMATION_MESSAGE);
                option1.setMessage("Error a Conectarse a la Base Datos. \n" + ex.getMessage());

                // Obtener el dialogo
                JDialog dialog = option1.createDialog(null, "Base de datos");    
                
                dialog.setVisible(true);
            }
        }
        
        return connection;
    
    }  
}
