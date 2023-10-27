
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
    PedidoProducto pedpro = new PedidoProducto();
    Producto pro = new Producto();
    ProductoData pdat = new ProductoData();
    
    public PedidoProductoData(){
    
        con = Conexion.getConexion();
    
    }

    public void crearPedProd(PedidoProducto pedprod) {

        String sql = "INSERT INTO pedidoproducto(idPedido, idProducto, cantidad, importe, estado) VALUES (?, ?, ?, ?, ?)";
        System.out.println(pedprod.getProducto().getIdProducto());
        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

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
    
    List<PedidoProducto> BuscarProductosxIdPedido(int id){
    
        List<PedidoProducto> Pedidos = new ArrayList<>();
        
        try {
            
            String sql = "SELECT * FROM pedidoproducto WHERE idPedido = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
          
            while (rs.next()) {
                
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

        return null;
        
    }
}
