
package BaseDatos;

import Entidades.Pedido;
import java.sql.*;
import javax.swing.JOptionPane;

public class PedidoData {
    
    private Connection con = null;
    
    public PedidoData(){
        
        con = Conexion.getConexion();
    }
    
    public void guardarPedido(Pedido ped){
        
        String sql = "INSERT INTO pedido (idMesa , nombreMesero , fechaHora , importe , cobrada) VALUES (?,?,?,?,?)"; 
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, ped.getMesa().getIdMesa());
            ps.setString(2, ped.getNombreMesero());
            ps.setTimestamp(3, Timestamp.valueOf(ped.getFechaHora()));
            ps.setDouble(4, ped.getImporte());
            ps.setBoolean(5, ped.isCobrada());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
           
            if (rs.next()) {

               ped.setIdPedido(rs.getInt(1));
                
               JOptionPane.showMessageDialog(null, "Pedido Guardado ");
            
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla " + ex.getMessage());
            
        }
    }
      public void eliminarPedido (int idPedido){
        
        String sql = "DELETE FROM pedido WHERE idPedido=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPedido);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pedido eliminado ");
            ps.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
