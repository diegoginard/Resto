
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

        String sql = "INSERT INTO mozo(nombre, apellido, dni, telefono) VALUES (?,?,?,?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, mozo.getNombre());
            ps.setString(2, mozo.getApellido());
            ps.setInt(3, mozo.getDni());
            ps.setInt(4, mozo.getTelefono());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                mozo.setIdMozo(rs.getInt(1));

                Utilidades.mostrarDialogoTemporal("Base de datos", "Usuario creado", 2000);

            }

            ps.close();

        } catch (SQLException ex) {

            Vistas.Utilidades.mostrarDialogoTemporal("Error al acceder a la tabla usuario ", ex.getMessage(), 2000);

        }
    }
    
    public void eliminarMozo(int id) {
        String sql = "DELETE FROM mozo WHERE idProducto = ?";

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

    public void ModificarProducto(Mozo mozo) {
        
        String sql = "UPDATE producto SET idProducto= ?, nombre = ?, apellido = ?, dni = ?, telefono = ? WHERE idProducto = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, mozo.getIdMozo());
            ps.setString(2, mozo.getNombre());
            ps.setString(3, mozo.getApellido());
            ps.setInt(4, mozo.getDni());
            ps.setInt(5, mozo.getTelefono());

            int exito = ps.executeUpdate();

            if (exito == 1) {
               Utilidades.mostrarDialogoTemporal("Base de datos", "Mozo Modificado", 2000);
            }

        } catch (SQLException ex) {
            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al acceder a la tabla mozo" + ex.getMessage(), 2000);
        }
    }
    
    public List<Mozo> listarPedidos(){
        
        List<Mozo> mozos = new ArrayList<>();
    
        try {
            
            String sql = "SELECT * FROM mozo ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
          
            while (rs.next()) {
                Mozo mozo = new Mozo();
                mozo.setIdMozo(rs.getInt("idMozo"));
                mozo.setNombre(rs.getString("nombre"));
                mozo.setApellido(rs.getString("fapellido"));
                mozo.setDni(rs.getInt("dni"));
                mozo.setTelefono(rs.getInt("telefono"));
               
                mozos.add(mozo);
            
            }
            
            ps.close();

        }catch (SQLException ex) {

           Utilidades.mostrarDialogoTemporal("Base de datos", "Error al acceder a la tabla mozo" + ex.getMessage(), 2000);

        }

        return mozos;
    
    }

}
