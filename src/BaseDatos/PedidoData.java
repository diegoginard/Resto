
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
    private Pedido ped = new Pedido();
    
    public PedidoData(){
        
        con = Conexion.getConexion();
    }
        
    public void guardarPedido(Pedido ped) {

        String sql = "INSERT INTO pedido (nombreMesero, IdMesa, fechaHora , cobrada , importe, estado) VALUES (?,?,?,?,?,?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, ped.getNombreMesero());
            ps.setInt(2,ped.getMesa().getIdMesa());
            ps.setTimestamp(3, Timestamp.valueOf(ped.getFechaHora()));
            ps.setBoolean(4, false);
            ps.setDouble(5, ped.getImporte());
            ps.setString(6, "PENDIENTE");
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
                + "fechaHora = ? , cobrada = ? , importe = ? , estado = ? WHERE idPedido = ?";
        
        try {
            
            PreparedStatement ps= con.prepareStatement(sql);

            ps.setInt(1, pe.getIdPedido());
            ps.setInt(2, pe.getMesa().getIdMesa());
            ps.setString(3, pe.getNombreMesero());
            ps.setTimestamp(4,Timestamp.valueOf(pe.getFechaHora()));
            ps.setBoolean(5, pe.isCobrada());
            ps.setDouble(6, pe.getImporte());
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
                ped.setCobrada(rs.getBoolean("cobrada"));
                ped.setImporte(rs.getDouble("importe"));
                ped.setEstado(rs.getString("estado"));
                Pedidos.add(ped);
            
            }
            
            ps.close();

        }catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pedidos" + ex.getMessage());

        }

        return Pedidos;
    
    }
    
    public List<Pedido> listarPedidosMesa(int id){
        
        List<Pedido> Pedidos = new ArrayList<>();
    
        try {
            
            String sql = "SELECT * FROM Pedido WHERE idMesa = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
          
            while (rs.next()) {
                
                Pedido ped = new Pedido();
                ped.setIdPedido(rs.getInt("idPedido"));
                mesa = md.ObtenerMesasId(rs.getInt("idMesa"));
                ped.setMesa(mesa);
                ped.setNombreMesero(rs.getString("nombreMesero"));
                ped.setFechaHora(rs.getTimestamp("fechaHora").toLocalDateTime());
                ped.setCobrada(rs.getBoolean("cobrada"));
                ped.setImporte(rs.getDouble("importe"));
                ped.setEstado(rs.getString("estado"));
                Pedidos.add(ped);
            
            }
            
            ps.close();

        }catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pedidos" + ex.getMessage());

        }

        return Pedidos;
    
    }
    public void modificarEstadoPedido(Pedido pe){
        
        String sql = "UPDATE pedido SET  nombreMesero = ? , "
                + " cobrada = ? , importe = ? , estado = ? WHERE idPedido = ?";
        
        try {
            
            PreparedStatement ps= con.prepareStatement(sql);

            ps.setString(1, pe.getNombreMesero());
            ps.setBoolean(2, pe.isCobrada());
            ps.setDouble(3, pe.getImporte());
            ps.setString(4, pe.getEstado());
            ps.setInt(5,pe.getIdPedido());
            int exito= ps.executeUpdate();
            
            if (exito==1) {
                
                JOptionPane.showMessageDialog(null, "Pedido Modificado");
           
            }
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Pedido"+ex.getMessage());
        
        }
    }
    
    public Pedido obtenerPedidoId (int id){
       try {
            
            String sql = "SELECT * FROM pedido WHERE idPedido = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                ped.setIdPedido(rs.getInt("idPedido"));
                mesa =  md.ObtenerMesasId(rs.getInt("idMesa"));
                ped.setMesa(mesa);
                ped.setNombreMesero(rs.getString("nombreMesero"));
                ped.setFechaHora(rs.getTimestamp("fechaHora").toLocalDateTime());
                ped.setCobrada(rs.getBoolean("cobrada"));
                ped.setImporte(rs.getDouble("importe"));
                ped.setEstado(rs.getString("Estado"));
               
            }
            
            ps.close();

        }catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla" + ex.getMessage());

        }

        return ped; 
    }
}
