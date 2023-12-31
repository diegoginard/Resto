
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
    Pedido ped = new Pedido();
    PedidoData pd = new PedidoData();
    Producto pro = new Producto();
    ProductoData pdat = new ProductoData();
    
    public PedidoProductoData(){
    
        con = Conexion.getConexion();
    
    }

    public void crearPedProd(PedidoProducto pedprod) {

        String sql = "INSERT INTO pedidoproducto(idPedido, idProducto, cantidad, importe, estado) VALUES (?, ?, ?, ?, ?)";
        
        double precio =  pedprod.getProducto().getPrecio();
        double cantidad =  pedprod.getCantidad();
        double total = precio * cantidad;

        try {

            if (! pedprod.getPedido().isCobrada()){
                
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, pedprod.getPedido().getIdPedido());
            ps.setInt(2, pedprod.getProducto().getIdProducto());
            ps.setInt(3, pedprod.getCantidad());
            ps.setDouble(4, total);
            ps.setBoolean(5, true);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
             if (rs.next()) {

                pedprod.setIdPedidoProducto(rs.getInt(1));

//                JOptionPane.showMessageDialog(null, "Producto agregado al pedido");
            }

            ps.close();

            } else {
                JOptionPane.showMessageDialog(null, "Pedido cobrado, debe generar uno nuevo");
            }
                
            

           
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla " + ex.getMessage());

        }
    }
    
    public List<PedidoProducto> BuscarProductosxIdPedido(int id){
    
        List<PedidoProducto> Pedidos = new ArrayList<>();
        
        try {
            
            String sql = "SELECT * FROM pedidoproducto WHERE idPedido = ? AND estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
          
            while (rs.next()) {
                
                PedidoProducto pedpro = new PedidoProducto();
                pedpro.setIdPedidoProducto(rs.getInt("idPedidoProducto"));
                pedpro.setPedido(pd.obtenerPedidoId(rs.getInt("idPedido")));
                pedpro.setProducto(pdat.ObtenerPrductoId(rs.getInt("idProducto")));
                pedpro.setCantidad(rs.getInt("cantidad"));
                pedpro.setImporte(rs.getDouble("importe"));
                pedpro.setEstado(rs.getBoolean("estado"));
                Pedidos.add(pedpro);
            
            }
            
            ps.close();

        }catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pedidos" + ex.getMessage());

        }

        return Pedidos;
        
    }
    public void eliminarPedidoProducto(int id) {

        String sql = "DELETE FROM pedidoproducto WHERE idPedidoProducto = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            
            if(exito >= 1){
                
//            JOptionPane.showMessageDialog(null, "Producto Eliminado");
            
            }else{
                
                JOptionPane.showMessageDialog(null, "No se encontro el producto");
            
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, " Error al Eliminar la tabla" + ex.getMessage());

        }
    }
}
