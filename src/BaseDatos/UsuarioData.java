
package BaseDatos;

import Entidades.Usuario;
import Vistas.Utilidades;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class UsuarioData {

    private Connection con = null;

    public UsuarioData() {

        con = Conexion.getConexion();

    }

    public void crearUsuario(Usuario user) {

        String sql = "INSERT INTO usuario(idUsuario,usuario, password, nombre, apellido, edad, telefono, dni,"
                + " fechaNacimiento, activo) VALUES (null,?,?,?,?,?,?,?,?,?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, user.getUsuario());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getNombre());
            ps.setString(4, user.getApellido());
            ps.setInt(5, user.getEdad());
            ps.setInt(6, user.getTelefono());
            ps.setInt(7, user.getDni());
            ps.setDate(8, java.sql.Date.valueOf(user.getFechaNacimiento()));
            ps.setBoolean(9, user.getActivo());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                user.setIdUsuario(rs.getInt(1));

                Utilidades.mostrarDialogoTemporal("Base de datos", "Usuario creado", 2000);

            }

            ps.close();

        } catch (SQLException ex) {

            Vistas.Utilidades.mostrarDialogoTemporal("Error al acceder a la tabla usuario ", ex.getMessage(), 2000);

        }
    }
    
    public void eliminarUsuario(int id) {
        String sql = "DELETE FROM usuario WHERE idUsuario = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();

            if (exito >= 1) {
                Utilidades.mostrarDialogoTemporal("Base de datos", "Usuario Eliminada", 2000);
            } else {
                Utilidades.mostrarDialogoTemporal("Base de datos", "No se encontró el usuario", 2000);
            }

            ps.close();
            
        } catch (SQLException ex) {
            Utilidades.mostrarDialogoTemporal("Base de datos", "Error, no se pudo eliminar al usuario de la tabla " + ex.getMessage(), 2000);
        }
    }
    
    public void modificarUsuario(Usuario user) {
        
        String sql = "UPDATE usuario SET usuario = ?, password = ?, nombre = ?, apellido = ?, edad = ?, dni = ?, telefono = ?,"
                + " fechaNacimiento = ?, activo = ? WHERE idUsuario = ?";

        try {
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
           
            ps.setString(1, user.getUsuario());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getNombre());
            ps.setString(4, user.getApellido());
            ps.setInt(5, user.getEdad());
            ps.setInt(6, user.getDni());
            ps.setInt(7, user.getTelefono());
            ps.setDate(8, java.sql.Date.valueOf(user.getFechaNacimiento()));
            ps.setBoolean(9, user.getActivo());
            ps.setInt(10, user.getIdUsuario());
            

            int exito = ps.executeUpdate();

            if (exito == 1) {
                Utilidades.mostrarDialogoTemporal("Base de datos", "Usuario Modificada", 2000);
            }
        } catch (SQLException ex) {
            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al modificar el usuario" + ex.getMessage(), 2000);
        }
    }

    public List<Usuario> listarUsuarios() {
        
        List<Usuario> listUsuario = new ArrayList<>();

        try {
            String sql = "SELECT * FROM usuario";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Usuario usu1 = new Usuario();
                usu1.setIdUsuario(rs.getInt("idUsuario"));
                usu1.setUsuario(rs.getString("usuario"));
                usu1.setPassword(rs.getString("password"));
                usu1.setNombre(rs.getString("nombre")); // Completa todos los campos necesarios
                usu1.setApellido(rs.getString("apellido"));
                usu1.setEdad(rs.getInt("edad"));
                usu1.setDni(rs.getInt("dni"));
                usu1.setTelefono(rs.getInt("telefono"));
                usu1.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                usu1.setActivo(rs.getBoolean("activo"));
                
                listUsuario.add(usu1);
            }

            ps.close();
        } catch (SQLException ex) {
            Vistas.Utilidades.mostrarDialogoTemporal("Error al acceder a la tabla usuario: ", ex.getMessage(), 2000);
        }

        return listUsuario;
    }

    public Usuario buscarUsuario(String usuario, String contraseña) {

        Usuario user = null;
        String sql = "SELECT * FROM usuario WHERE usuario = ? AND password = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, contraseña);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                user = new Usuario();
                user.setIdUsuario(rs.getInt("idUsuario"));
                user.setUsuario(rs.getString("usuario"));
                user.setPassword(rs.getString("password"));
                user.setNombre(rs.getString("nombre"));
                user.setApellido(rs.getString("apellido"));
                user.setEdad(rs.getInt("edad"));
                user.setDni(rs.getInt("dni"));
                user.setTelefono(rs.getInt("telefono"));
                user.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                user.setActivo(rs.getBoolean("activo"));

            }

            ps.close();

        } catch (SQLException ex) {
            Vistas.Utilidades.mostrarDialogoTemporal("Error al buscar usuario en la base de datos", ex.getMessage(), 2000);
        }

        return user;
    }
}
