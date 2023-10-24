
package BaseDatos;

import Entidades.Mesa;
import Entidades.Pedido;
import Entidades.PedidoProducto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class PedidoProductoData {

    private Connection con = null;
    private Mesa mesa = new Mesa();
    private Pedido pedido = new Pedido();
    private PedidoProducto pedpro = new PedidoProducto();

    public void crearPedProd(PedidoProducto pedprod) {

        String sql = "INSERT INTO pedidoproducto(idPedido, idProducto, cantidad, estado) VALUES (?, ?, ?, ?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, pedpro.getPedido().getIdPedido());
            ps.setInt(2, pedpro.getProducto().getIdProducto());
            ps.setInt(3, pedpro.getCantidad());
            ps.setBoolean(4,true);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                pedpro.setIdPedidoProducto(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "PedidoProducto Guardado ");

            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla " + ex.getMessage());

        }

    }

}
