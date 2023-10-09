
package BaseDatos;

import Entidades.Mesa;
import Entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class MesaData {
    
    private Connection con = null;
    
     public MesaData(){
        
        con = Conexion.getConexion();
        
    }   
    
    
    public void crearMesa(Mesa mesa){
        
    String sql = "INSERT INTO mesa(numero, estadoMesa, capacidad) VALUES (?,?,?)"; 
    
        try {
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, mesa.getNumero());
            ps.setString(2, mesa.getEstadoMesa());
            ps.setInt(3, mesa.getCapacidad());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
           
            if (rs.next()) {

               mesa.setIdMesa(rs.getInt(1));
                
               JOptionPane.showMessageDialog(null, "Mesa Guardada ");
            
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mesa " + ex.getMessage());
            
        }
    }
   
    public void eliminarMesa(int id){
        
         String sql = "DELETE FROM mesa WHERE idMesa = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            
            if(exito >= 1){
                
            JOptionPane.showMessageDialog(null, "Mesa Eliminada");
            
            }else{
                
                JOptionPane.showMessageDialog(null, "No se encontro la mesa");
            
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, " Error al Eliminar la tabla" + ex.getMessage());

        }
    }
    
    public void modificarMesa(Mesa mesa){
   
        String sql = "UPDATE mesa SET idMesa= ?, numero = ?, estadoMesa = ?, capacidad = ? WHERE idMesa = ?";
        
        try {
            
            PreparedStatement ps= con.prepareStatement(sql);

            ps.setInt(1, mesa.getIdMesa());
            ps.setInt(2, mesa.getNumero());
            ps.setString(3, mesa.getEstadoMesa());
            ps.setInt(4, mesa.getCapacidad());
            ps.setInt(5, mesa.getIdMesa());
            
            int exito= ps.executeUpdate();
            
            if (exito==1) {
                
                JOptionPane.showMessageDialog(null, "Mesa Modificada");
           
            }
            
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla"+ex.getMessage());
        
        }
    }
    
    public List<Mesa> listarMesas(){
        List<Mesa> Mesas = new ArrayList<>();
    
        try {
            String sql = "SELECT * FROM mesa WHERE idMesa";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Mesa mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("idMesa"));
                mesa.setNumero(rs.getInt("numero"));
                mesa.setEstadoMesa(rs.getString("estadoMesa"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                Mesas.add(mesa);
            
            }
            
            ps.close();

        }catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mesa" + ex.getMessage());

        }

        return Mesas;
    
    }
}
