
package BaseDatos;

import Entidades.Mesa;
import Entidades.Pedido;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PedidoData {
    
    private Connection con = null;
    private Mesa mesa = new Mesa();
    private MesaData md = new MesaData();
    
    public PedidoData(){
        
        con = Conexion.getConexion();
    }
        
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
    
    public void modificarPedido(Pedido pe){
        
        String sql = "UPDATE pedido SET idPedido = ? , idMesa = ? , nombreMesero = ? , "
                + "fechaHora = ? , importe = ? , cobrada = ? , estado = ? WHERE idPedido = ?";
        
        try {
            
            PreparedStatement ps= con.prepareStatement(sql);

            ps.setInt(1, pe.getIdPedido());
            ps.setInt(2, pe.getMesa().getIdMesa());
            ps.setString(3, pe.getNombreMesero());
            ps.setTimestamp(4,Timestamp.valueOf(pe.getFechaHora()));
            ps.setDouble(5, pe.getImporte());
            ps.setBoolean(6, pe.isCobrada());
            ps.setString(7, pe.getEstado());
            ps.setInt(8,pe.getIdPedido());
            int exito= ps.executeUpdate();
            
            if (exito==1) {
                
                JOptionPane.showMessageDialog(null, "Pedido Modificado");
           
            }
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Pedido"+ex.getMessage());
        
        }
    }
    
     public List<Pedido> listarPedidos(){
        
        List<Pedido> Pedidos = new ArrayList<>();
    
        try {
            
            String sql = "SELECT * FROM Pedido ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
          
            while (rs.next()) {
                Pedido ped = new Pedido();
                ped.setIdPedido(rs.getInt("idPedido"));
                mesa = md.ObtenerMesasId(rs.getInt("idMesa"));
                ped.setMesa(mesa);
                ped.setNombreMesero(rs.getString("nombreMesero"));
                ped.setFechaHora(rs.getTimestamp("fechaHora").toLocalDateTime());
                ped.setImporte(rs.getDouble("importe"));
                ped.setCobrada(rs.getBoolean("cobrada"));
                ped.setEstado(rs.getString("estado"));
                Pedidos.add(ped);
            
            }
            
            ps.close();

        }catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pedidos" + ex.getMessage());

        }

        return Pedidos;
    
    }
    
}
