
package BaseDatos;

import Entidades.Pedido;
import Entidades.PedidoProducto;
import Entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class PedidoProductoData {

    private Connection con = null;
    
    public PedidoProductoData(){
    
        con = Conexion.getConexion();
    
    }

    public void crearPedProd(PedidoProducto pedprod) {

        String sql = "INSERT INTO pedidoproducto(idPedido, idProducto, cantidad, importe, estado) VALUES (?, ?, ?, ?, ?)";
        System.out.println(pedprod.getProducto().getIdProducto());
        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
//            System.out.println(pedpro.getProducto().getIdProducto());
            ps.setInt(1, pedprod.getPedido().getIdPedido());
            ps.setInt(2, pedprod.getProducto().getIdProducto());
            ps.setInt(3, pedprod.getCantidad());
            ps.setDouble(4, pedprod.getImporte());
            ps.setBoolean(5,true);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                pedprod.setIdPedidoProducto(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Producto agregado al pedido");

            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla " + ex.getMessage());

        }
    }
//    List<PedidoProducto> BuscarProductosxIdPedido(int id){
//    
//        
//        try {
//            
//            String sql = "SELECT * FROM pedidoproducto WHERE idPedido = ?";
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1,id);
//            ResultSet rs = ps.executeQuery();
//          
//            while (rs.next()) {
//                
//                Pedido ped = new Pedido();
//                ped.setIdPedido(rs.getInt("idPedido"));
//                mesa = md.ObtenerMesasId(rs.getInt("idMesa"));
//                ped.setMesa(mesa);
//                ped.setNombreMesero(rs.getString("nombreMesero"));
//                ped.setFechaHora(rs.getTimestamp("fechaHora").toLocalDateTime());
//                ped.setCobrada(rs.getBoolean("cobrada"));
//                ped.setImporte(rs.getDouble("importe"));
//                ped.setEstado(rs.getString("estado"));
//                Pedidos.add(ped);
//            
//            }
//            
//            ps.close();
//
//        }catch (SQLException ex) {
//
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pedidos" + ex.getMessage());
//
//        }
//
//        
//        return null;
//        
//    }
}
