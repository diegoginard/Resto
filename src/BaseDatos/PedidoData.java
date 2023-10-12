
package BaseDatos;

import Entidades.Mesa;
import Entidades.Pedido;
import java.sql.*;
import javax.swing.JOptionPane;

public class PedidoData {
    
    private Connection con = null;
    
    public PedidoData(){
        
        con = Conexion.getConexion();
    }
    
    Pedido pe = new Pedido();
    Mesa me =new Mesa();
        
    public void guardarPedido(Pedido ped) {

        String sql = "INSERT INTO pedido (idMesa , nombreMesero , fechaHora , importe , cobrada , estado) VALUES (?,?,?,?,?,?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, ped.getMesa().getIdMesa());
            ps.setString(2, ped.getNombreMesero());
            ps.setTimestamp(3, Timestamp.valueOf(ped.getFechaHora()));
            ps.setDouble(4, ped.getImporte());
            ps.setBoolean(5, ped.isCobrada());
            ps.setString(6, ped.getEstado());
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

    public void eliminarPedido(int idPedido) {

        String sql = "DELETE FROM pedido WHERE idPedido = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPedido);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pedido eliminado ");
            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "No se pudo acceder a la tabla pedidos " + ex.getMessage());
        }
    }
    
    public void modificarPedido(int id){
        
        String sql = "UPDATE pedido SET idPedido = ? , idMesa = ? , nombreMesero = ? , "
                + "fechaHora = ? , importe = ? , cobrada = ? , estado = ? WHERE idPedido = ?";
        
        try {
            
            PreparedStatement ps= con.prepareStatement(sql);

            ps.setInt(1, pe.getIdPedido());
            ps.setInt(2, me.getIdMesa());
            ps.setString(3, pe.getNombreMesero());
            ps.setTimestamp(4,Timestamp.valueOf(pe.getFechaHora()));
            ps.setDouble(5, pe.getImporte());
            ps.setBoolean(6, pe.isCobrada());
            ps.setString(7, pe.getEstado());
            ps.setInt(8,id);
            int exito= ps.executeUpdate();
            
            if (exito==1) {
                
                JOptionPane.showMessageDialog(null, "Pedido Modificado");
           
            }
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Pedido"+ex.getMessage());
        
        }
    }
}
