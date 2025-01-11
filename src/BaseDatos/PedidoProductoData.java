
package BaseDatos;

import Entidades.PedidoProducto;
import Vistas.Utilidades;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class PedidoProductoData {

    private Connection con = null;
    private PedidoData pd = new PedidoData();
    private ProductoData pdat = new ProductoData();
    
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
            }

            ps.close();

            } else {
                Utilidades.mostrarDialogoTemporal("Base de datos", "Pedido cobrado, debe generar uno nuevo", 2000);   
            }

        } catch (SQLException ex) {
            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al acceder a la tabla PedidoProducto " + ex.getMessage(), 2000);
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
            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al acceder a la tabla PedidoProducto " + ex.getMessage(), 2000);
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
                
                Utilidades.mostrarDialogoTemporal("Base de datos", "Producto Eliminado", 2000);
            
            }else{              
                Utilidades.mostrarDialogoTemporal("Base de datos", "No se encontro el producto", 2000);
            }
            
            ps.close();
            
        } catch (SQLException ex) {           
            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al acceder a la tabla PedidoProducto " + ex.getMessage(), 2000);
        }
    }
}
