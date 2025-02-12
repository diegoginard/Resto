package BaseDatos;

import Entidades.Pedido;
import Vistas.Utilidades;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PedidoData {

    private Connection con = null;
    private MozoData mozoDat = new MozoData();
    private MesaData md = new MesaData();

    public PedidoData() {

        con = Conexion.getConexion();
    }

    public int GuardarPedidoID(Pedido pedido) {

        int idGenerado = -1;

        try {

            String sql = "INSERT INTO pedido (idMozo, IdMesa, fechaHora, cobrada, importe, estado) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pedido.getMozo().getIdMozo());
            System.out.println(pedido.getMozo().getIdMozo());
            ps.setInt(2, pedido.getMesa().getIdMesa());
            ps.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
            ps.setBoolean(4, false);
            ps.setDouble(5, pedido.getImporte());
            ps.setString(6, "PENDIENTE");
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                idGenerado = rs.getInt(1);
            }

        } catch (Exception ex) {

            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al guardar el PedidoId " + ex.getMessage(), 2000);
            System.out.println(ex.getMessage());
        }

        return idGenerado;
    }

    public void guardarPedido(Pedido ped) {

        String sql = "INSERT INTO pedido (idMozo, IdMesa, fechaHora , cobrada , importe, estado) VALUES (?,?,?,?,?,?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ped.getMozo().getIdMozo());
            ps.setInt(2, ped.getMesa().getIdMesa());
            ps.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
            ps.setBoolean(4, false);
            ps.setDouble(5, ped.getImporte());
            ps.setString(6, "PENDIENTE");
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                ped.setIdPedido(rs.getInt(1));
                Utilidades.mostrarDialogoTemporal("Base de datos", "Pedido Guardado", 2000);
            }
            ps.close();

        } catch (SQLException ex) {
            
            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al guardar el Pedido" + ex.getMessage(), 2000);
        }
    }

    public void eliminarPedido(int idPedido) {

        String sql = "DELETE FROM pedido WHERE idPedido = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPedido);
            ps.executeUpdate();
            Utilidades.mostrarDialogoTemporal("Base de datos", "Pedido eliminado correctamente", 2000);
            ps.close();

        } catch (SQLException ex) {
            
            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al eliminar el Pedido" + ex.getMessage(), 2000);
        }
    }

    public void modificarImportePedido(Pedido pe) {

        String sql = "UPDATE pedido SET importe = ? WHERE idPedido = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, pe.getImporte());
            ps.setInt(2, pe.getIdPedido());
            ps.executeUpdate();

        } catch (SQLException ex) {
            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al modificar el Pedido " + ex.getMessage(), 2000);
        }
    }

    public void modificarEstadoPedido(String estado, int idPedido) {

        String sql = "UPDATE pedido SET estado = ? WHERE idPedido = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, estado);
            ps.setInt(2, idPedido);
            int exito = ps.executeUpdate();

//            if (exito==1) {
//                Utilidades.mostrarDialogoTemporal("Base de datos", "Pedido modificado", 2000);
//            }
        } catch (SQLException ex) {
            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al modificar el estado del Pedido " + ex.getMessage(), 2000);
        }
    }

    public void modificarPedidoCobrado(boolean cobrada, int idPedido) {

        String sql = "UPDATE pedido SET cobrada = ? WHERE idPedido = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setBoolean(1, cobrada);
            ps.setInt(2, idPedido);
            int exito = ps.executeUpdate();

//            if (exito==1) {
//                Utilidades.mostrarDialogoTemporal("Base de datos", "Pedido modificado", 2000);
//            }
        } catch (SQLException ex) {
            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al modificar el pedido cobrado " + ex.getMessage(), 2000);
        }
    }

    public Pedido obtenerPedidoId(int id) {

        Pedido ped = new Pedido();

        try {

            String sql = "SELECT * FROM pedido WHERE idPedido = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                ped.setIdPedido(rs.getInt("idPedido"));
                ped.setMesa(md.ObtenerMesasId(rs.getInt("idMesa")));
                ped.setMozo(mozoDat.ObtenerMozoId(rs.getInt("idMozo")));
                ped.setFechaHora(rs.getTimestamp("fechaHora").toLocalDateTime());
                ped.setCobrada(rs.getBoolean("cobrada"));
                ped.setImporte(rs.getDouble("importe"));
                ped.setEstado(rs.getString("Estado"));
            }

            ps.close();

        } catch (SQLException ex) {
            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al obtener el id del Pedido" + ex.getMessage(), 2000);
        }

        return ped;
    }

    public Pedido obtenerPedidoIdXmesa(int id) {

        Pedido ped = new Pedido();

        try {

            String sql = "SELECT * FROM pedido p JOIN mesa m ON p.idMesa = m.idMesa WHERE p.estado != 'CANCELADO' AND p.cobrada = 0 AND p.idMesa = ?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                ped.setIdPedido(rs.getInt("idPedido"));
                ped.setMesa(md.ObtenerMesasId(rs.getInt("idMesa")));
                ped.setMozo(mozoDat.ObtenerMozoId(rs.getInt("idMozo")));
                ped.setFechaHora(rs.getTimestamp("fechaHora").toLocalDateTime());
                ped.setCobrada(rs.getBoolean("cobrada"));
                ped.setImporte(rs.getDouble("importe"));
                ped.setEstado(rs.getString("Estado"));
            }

            ps.close();

        } catch (SQLException ex) {
            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al obtener el id del Pedido" + ex.getMessage(), 2000);
        }

        return ped;
    }

    private List<Pedido> buscarPedidos(String sql, Object... parametros) {

        List<Pedido> pedidos = new ArrayList<>();

        try (PreparedStatement ps = con.prepareStatement(sql)) {

            for (int i = 0; i < parametros.length; i++) {
                ps.setObject(i + 1, parametros[i]);
            }

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Pedido ped = new Pedido();
                ped.setIdPedido(rs.getInt("idPedido"));
                ped.setMesa(md.ObtenerMesasId(rs.getInt("idMesa")));
                ped.setMozo(mozoDat.ObtenerMozoId(rs.getInt("idMozo")));
                ped.setFechaHora(rs.getTimestamp("fechaHora").toLocalDateTime());
                ped.setCobrada(rs.getBoolean("cobrada"));
                ped.setImporte(rs.getDouble("importe"));
                ped.setEstado(rs.getString("estado"));
                pedidos.add(ped);
            }

        } catch (SQLException ex) {

            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al buscar pedidos: " + ex.getMessage(), 2000);
        }

        return pedidos;
    }

    public List<Pedido> listarPedidos() {

        String sql = "SELECT * FROM Pedido";
        return buscarPedidos(sql);
    }

    public List<Pedido> listarPedidosMesa(int id) {

        String sql = "SELECT * FROM Pedido WHERE idMesa = ? AND cobrada = false";
        return buscarPedidos(sql, id);
    }

    public List<Pedido> listarMesasPedidosEntregados(int id) {

        String sql = "SELECT * FROM Pedido WHERE idMesa = ? AND cobrada = false AND estado = 'ENTREGADO'";
        return buscarPedidos(sql, id);
    }

    public List<Pedido> listarPedidoMesero(int idMozo) {

        String sql = "SELECT * FROM Pedido WHERE idMozo LIKE ?";
        return buscarPedidos(sql, idMozo);
    }

    public List<Pedido> listarPedidoFechaDia(LocalDateTime fechad) {

        String sql = "SELECT * FROM Pedido WHERE DATE(fechaHora) = ? ";
        return buscarPedidos(sql, fechad);
    }

    public List<Pedido> listarPedidosCobradosPorMeseroEnElDia(int idMozo, LocalDate fecha) {

        String sql = "SELECT * FROM Pedido WHERE idMozo = ? AND DATE(fechaHora) = ?";
        return buscarPedidos(sql, idMozo, fecha);
    }

    public List<Pedido> listarPedidosDeMesaEnFechaYRangoHorario(int idMesa, LocalDate fecha, LocalDateTime horaInicio, LocalDateTime horaFin) {

        String sql = "SELECT * FROM Pedido WHERE idMesa = ? AND DATE(fechaHora) = ? AND TIME(fechaHora) BETWEEN ? AND ?";
        return buscarPedidos(sql, idMesa, fecha, horaInicio, horaFin);
    }

    public List<Pedido> listarPedidosEstadoPendiente() {

        String sql = "SELECT * FROM pedido WHERE estado = 'PENDIENTE'";
        return buscarPedidos(sql);
    }

    public boolean mesaTieneMasDeUnPedidoNoCobrado(int idMesa) {

        boolean tieneMasDeUnPedidoNoCobrado = false;

        try {

            String sql = "SELECT COUNT(p.idPedido) AS pedidosNoCobrados "
                    + "FROM pedido p "
                    + "WHERE p.idMesa = ? AND p.estado != 'CANCELADO' AND p.cobrada = 0";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMesa);  // Establecer el parámetro idMesa
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int count = rs.getInt("pedidosNoCobrados");
                tieneMasDeUnPedidoNoCobrado = count < 1;
            }

            ps.close();

        } catch (SQLException ex) {

            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al verificar pedidos no cobrados para la mesa " + ex.getMessage(), 2000);
        }

        return tieneMasDeUnPedidoNoCobrado;
    }
}
