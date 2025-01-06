
package BaseDatos;

import Entidades.Mozo;
import java.sql.Connection;
import Vistas.Utilidades;    
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MozoData {
    
      private Connection con = null;

    public MozoData() {
        
        con = Conexion.getConexion();
        
    }
    
    public void crearMozo(Mozo mozo) {

        String sql = "INSERT INTO mozo(nombre, apellido, edad, dni, telefono, fechaNacimiento, activo) VALUES (?,?,?,?,?,?,?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, mozo.getNombre());
            ps.setString(2, mozo.getApellido());
            ps.setInt(3,mozo.getEdad());
            ps.setInt(4, mozo.getDni());
            ps.setString(5, mozo.getTelefono());
            ps.setDate(6, java.sql.Date.valueOf(mozo.getFechaNacimiento()));
            ps.setBoolean(7, mozo.isActivo());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                mozo.setIdMozo(rs.getInt(1));
                Utilidades.mostrarDialogoTemporal("Base de datos", "Mozo creado", 2000);

            }

            ps.close();

        } catch (SQLException ex) {
            Vistas.Utilidades.mostrarDialogoTemporal("Error al acceder a la tabla mozo ", ex.getMessage(), 2000);
        }
    }
    
    public void eliminarMozo(int id) {
        
        String sql = "DELETE FROM mozo WHERE idMozo = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();

            if (exito >= 1) {
                Utilidades.mostrarDialogoTemporal("Base de datos", "Mozo Eliminado", 2000);
            } else {
                Utilidades.mostrarDialogoTemporal("Base de datos", "No se encontró el mozo", 2000);
            }

            ps.close();

        } catch (SQLException ex) {
            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al Eliminar en la tabla mozo" + ex.getMessage(), 2000);
        }
    }

    public void modificarMozo(Mozo mozo) {
        
        String sql = "UPDATE mozo SET nombre = ?, apellido = ?, edad = ?, dni = ?, telefono = ?, "
                + "fechaNacimiento = ?, activo = ? WHERE idMozo = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, mozo.getNombre());
            ps.setString(2, mozo.getApellido());
            ps.setInt(3,mozo.getEdad());
            ps.setInt(4, mozo.getDni());
            ps.setString(5, mozo.getTelefono());
            ps.setDate(6, java.sql.Date.valueOf(mozo.getFechaNacimiento()));
            ps.setBoolean(7, mozo.isActivo());
            ps.setInt(8, mozo.getIdMozo());
   
            int exito = ps.executeUpdate();
          
            if (exito == 1) {
               Utilidades.mostrarDialogoTemporal("Base de datos", "Mozo Modificado", 2000);
            }

        } catch (SQLException ex) {
            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al acceder a la tabla mozo" + ex.getMessage(), 2000);
        }
    }
    
    public List<Mozo> listarMozos(){
        
        List<Mozo> mozos = new ArrayList<>();
    
        try {
            
            String sql = "SELECT * FROM mozo ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
          
            while (rs.next()) {
                
                Mozo mozo = new Mozo();
                mozo.setIdMozo(rs.getInt("idMozo"));
                mozo.setNombre(rs.getString("nombre"));
                mozo.setApellido(rs.getString("apellido"));
                mozo.setEdad(rs.getInt("edad"));
                mozo.setDni(rs.getInt("dni"));
                mozo.setTelefono(rs.getString("telefono"));
                mozo.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                mozo.setActivo(rs.getBoolean("activo"));
               
                mozos.add(mozo);
            
            }
            
            ps.close();

        }catch (SQLException ex) {
           Utilidades.mostrarDialogoTemporal("Base de datos", "Error al acceder a la tabla mozo" + ex.getMessage(), 2000);
        }

        return mozos;
    
    }
}
