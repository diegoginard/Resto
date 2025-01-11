
package BaseDatos;

import Entidades.Mesa;
import Entidades.Mozo;
import Entidades.Pedido;
import Vistas.Utilidades;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PedidoData {
    
    private Connection con = null;
    private Mesa mesa = new Mesa();
    private Mozo mozo = new Mozo();
    private MozoData mozoDat = new MozoData();
    private MesaData md = new MesaData();
    private Pedido ped = new Pedido();
    
    public PedidoData(){
        
        con = Conexion.getConexion();
    }
    public int GuardarPedidoID(Pedido pedido) {
        
        int idGenerado = -1;
        try {
            String sql = "INSERT INTO pedido (idMozo, IdMesa, fechaHora, cobrada, importe, estado) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pedido.getMozo().getIdMozo());
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
            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al guardar el PedidoId" + ex.getMessage(), 2000);
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
    
     public List<Pedido> listarPedidos(){
        
        List<Pedido> Pedidos = new ArrayList<>();
        
        
        try {
            
            String sql = "SELECT * FROM Pedido ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
          
            while (rs.next()) {
                Pedido pedi = new Pedido();
                pedi.setIdPedido(rs.getInt("idPedido"));
                mesa = md.ObtenerMesasId(rs.getInt("idMesa"));
                pedi.setMesa(mesa);
                mozo = mozoDat.ObtenerMozoId(rs.getInt("idMozo"));
                pedi.setMozo(mozo);
                pedi.setFechaHora(rs.getTimestamp("fechaHora").toLocalDateTime());
                pedi.setCobrada(rs.getBoolean("cobrada"));
                pedi.setImporte(rs.getDouble("importe"));
                pedi.setEstado(rs.getString("estado"));
                Pedidos.add(pedi);
            
            }
            
            ps.close();

        }catch (SQLException ex) {

           Utilidades.mostrarDialogoTemporal("Base de datos", "Error al al listar los Pedidos " + ex.getMessage(), 2000);

        }

        return Pedidos;
    
    }
    
    public List<Pedido> listarPedidosMesa(int id){
        
        List<Pedido> Pedidos = new ArrayList<>();
    
        try {
            
            String sql = "SELECT * FROM Pedido WHERE idMesa = ? AND cobrada = false";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
          
            while (rs.next()) {
                
                Pedido ped = new Pedido();
                ped.setIdPedido(rs.getInt("idPedido"));
                mesa = md.ObtenerMesasId(rs.getInt("idMesa"));
                ped.setMesa(mesa);
                mozo = mozoDat.ObtenerMozoId(rs.getInt("idMozo"));
                ped.setMozo(mozo);
                ped.setFechaHora(rs.getTimestamp("fechaHora").toLocalDateTime());
                ped.setCobrada(rs.getBoolean("cobrada"));
                ped.setImporte(rs.getDouble("importe"));
                ped.setEstado(rs.getString("estado"));
                Pedidos.add(ped);
            
            }
            
            ps.close();

        }catch (SQLException ex) {

            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al listar los pedidos por mesa " + ex.getMessage(), 2000);

        }

        return Pedidos;
    
    }
    
    public List<Pedido> listarPedidosMesaPendientes(int id){
        
        List<Pedido> Pedidos = new ArrayList<>();
    
        try {
            
            String sql = "SELECT * FROM Pedido WHERE idMesa = ? AND cobrada = false AND estado = 'PENDIENTE'";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
          
            while (rs.next()) {
                
                Pedido ped = new Pedido();
                ped.setIdPedido(rs.getInt("idPedido"));
                mesa = md.ObtenerMesasId(rs.getInt("idMesa"));
                ped.setMesa(mesa);
                mozo = mozoDat.ObtenerMozoId(rs.getInt("idMozo"));
                ped.setMozo(mozo);
                ped.setFechaHora(rs.getTimestamp("fechaHora").toLocalDateTime());
                ped.setCobrada(rs.getBoolean("cobrada"));
                ped.setImporte(rs.getDouble("importe"));
                ped.setEstado(rs.getString("estado"));
                Pedidos.add(ped);
            
            }
            
            ps.close();

        }catch (SQLException ex) {

            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al listar los pedidos pendiente por mesa" + ex.getMessage(), 2000);

        }

        return Pedidos;
    
    }
    
    public List<Pedido> listarMesasPedidosEntregados(int id){
        
        List<Pedido> Pedidos = new ArrayList<>();
    
        try {
            
            String sql = "SELECT * FROM Pedido WHERE idMesa = ? AND cobrada = false AND estado = 'ENTREGADO'";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
          
            while (rs.next()) {
                
                Pedido ped = new Pedido();
                ped.setIdPedido(rs.getInt("idPedido"));
                mesa = md.ObtenerMesasId(rs.getInt("idMesa"));
                ped.setMesa(mesa);
                mozo = mozoDat.ObtenerMozoId(rs.getInt("idMozo"));
                ped.setMozo(mozo);
                ped.setFechaHora(rs.getTimestamp("fechaHora").toLocalDateTime());
                ped.setCobrada(rs.getBoolean("cobrada"));
                ped.setImporte(rs.getDouble("importe"));
                ped.setEstado(rs.getString("estado"));
                Pedidos.add(ped);
            
            }
            
            ps.close();

        }catch (SQLException ex) {
            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al listar los pedidos por mesa cobradas " + ex.getMessage(), 2000);
        }
        return Pedidos;
    }
    
    public void modificarEstadoPedido(String estado , int idPedido){
        
        String sql = "UPDATE pedido SET estado = ? WHERE idPedido = ?";
        
        try {
            
            PreparedStatement ps= con.prepareStatement(sql);

            ps.setString(1, estado);
            ps.setInt(2,idPedido);
            int exito= ps.executeUpdate();
            
            if (exito==1) {
                Utilidades.mostrarDialogoTemporal("Base de datos", "Pedido modificado", 2000);
            }
            
        } catch (SQLException ex) {           
            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al modificar el estado del Pedido " + ex.getMessage(), 2000);
        }
    }
    
    public void modificarPedidoCobrado(boolean cobrada , int idPedido){
        
        String sql = "UPDATE pedido SET cobrada = ? WHERE idPedido = ?";
        
        try {
            
            PreparedStatement ps= con.prepareStatement(sql);

            ps.setBoolean(1, cobrada);
            ps.setInt(2,idPedido);
            int exito= ps.executeUpdate();
            
//            if (exito==1) {
//                Utilidades.mostrarDialogoTemporal("Base de datos", "Pedido modificado", 2000);
//            }
            
        } catch (SQLException ex) {           
            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al modificar el pedido cobrado " + ex.getMessage(), 2000);
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
                mozo = mozoDat.ObtenerMozoId(rs.getInt("idMozo"));
                ped.setMozo(mozo);
                ped.setFechaHora(rs.getTimestamp("fechaHora").toLocalDateTime());
                ped.setCobrada(rs.getBoolean("cobrada"));
                ped.setImporte(rs.getDouble("importe"));
                ped.setEstado(rs.getString("Estado"));
               
            }
            
            ps.close();

        }catch (SQLException ex) {

            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al obtener el id del Pedido" + ex.getMessage(), 2000);

        }

        return ped; 
    }
 
     public List<Pedido> listarPedidoMesero(int idMozo){
        
        List<Pedido> mesero = new ArrayList<>();
    
        try {
            
            String sql = "SELECT * FROM Pedido WHERE idMozo LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMozo); // Configura el primer parámetro con el valor de búsqueda
            ResultSet rs = ps.executeQuery();
          
            while (rs.next()) {
                Pedido ped = new Pedido();
                ped.setIdPedido(rs.getInt("idPedido"));
                mesa = md.ObtenerMesasId(rs.getInt("idMesa"));
                ped.setMesa(mesa);
                mozo = mozoDat.ObtenerMozoId(rs.getInt("idMozo"));
                ped.setMozo(mozo);
                ped.setFechaHora(rs.getTimestamp("fechaHora").toLocalDateTime());
                ped.setImporte(rs.getDouble("importe"));
                ped.setCobrada(rs.getBoolean("cobrada"));
                ped.setEstado(rs.getString("estado"));
                mesero.add(ped);
            
            }
            
            ps.close();

        }catch (SQLException ex) {
            Utilidades.mostrarDialogoTemporal("Base de datos", "Error generar la lista de Pedidos " + ex.getMessage(), 2000);
        }

        return mesero;
    }
     
        public List<Pedido> listarPedidoFecha(LocalDate fecha){
        
        List<Pedido> listaFecha = new ArrayList<>();
    
        try {
            
            String sql = "SELECT * FROM Pedido WHERE fechaHora= ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
          
            while (rs.next()) {
                Pedido ped = new Pedido();
                ped.setIdPedido(rs.getInt("idPedido"));
                mesa = md.ObtenerMesasId(rs.getInt("idMesa"));
                ped.setMesa(mesa);
                mozo = mozoDat.ObtenerMozoId(rs.getInt("idMozo"));
                ped.setMozo(mozo);
                ped.setFechaHora(rs.getTimestamp("fechaHora").toLocalDateTime());
                ped.setCobrada(rs.getBoolean("cobrada"));
                ped.setEstado(rs.getString("estado"));
                listaFecha.add(ped);
            
            }
            
            ps.close();

        }catch (SQLException ex) {

            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al generar la lista por fecha de los Pedidos" + ex.getMessage(), 2000);

        }

        return listaFecha;
    
    } 
        
        public List<Pedido> listarPedidoFechaDia(LocalDateTime fechad){
        
        List<Pedido> listaFechaD = new ArrayList<>();
    
        try {
        
            String sql = "SELECT * FROM Pedido WHERE DATE(fechaHora) = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setTimestamp(1, Timestamp.valueOf(fechad));
            ResultSet rs = ps.executeQuery();
          
            while (rs.next()) {
                Pedido ped = new Pedido();
                ped.setIdPedido(rs.getInt("idPedido"));
                mesa = md.ObtenerMesasId(rs.getInt("idMesa"));
                ped.setMesa(mesa);
                mozo = mozoDat.ObtenerMozoId(rs.getInt("idMozo"));
                ped.setMozo(mozo);
                ped.setFechaHora(rs.getTimestamp("fechaHora").toLocalDateTime());
                ped.setImporte(rs.getDouble("importe"));
                ped.setCobrada(rs.getBoolean("cobrada"));
                ped.setEstado(rs.getString("estado"));
                listaFechaD.add(ped);
            
            }
            
            ps.close();

        }catch (SQLException ex) {

            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al listar pedidos por fecha y dia" + ex.getMessage(), 2000);

        }

        return listaFechaD;
    
    }  
        
    public List<Pedido> listarPedidosCobradosPorMeseroEnElDia(Mozo mozo, LocalDate fecha) {
    
        List<Pedido> pedidos = new ArrayList<>();

    try {
        String sql = "SELECT * FROM Pedido WHERE idMozo = ? AND DATE(fechaHora) = ? AND cobrada = true";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, mozo.getIdMozo());
        ps.setDate(2, Date.valueOf(fecha));
        ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Pedido ped = new Pedido();
                ped.setIdPedido(rs.getInt("idPedido"));
                mesa = md.ObtenerMesasId(rs.getInt("idMesa"));
                ped.setMesa(mesa);
                mozo = mozoDat.ObtenerMozoId(rs.getInt("idMozo"));
                ped.setMozo(mozo);
                ped.setFechaHora(rs.getTimestamp("fechaHora").toLocalDateTime());
                ped.setCobrada(rs.getBoolean("cobrada"));
                ped.setEstado(rs.getString("estado"));
                pedidos.add(ped);
            }

            ps.close();
        } catch (SQLException ex) {
            
            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al listar pedidos por mesero b" + ex.getMessage(), 2000);
            
        }

    return pedidos;
    
    }
    
    public List<Pedido> listarPedidosDeMesaEnFechaYRangoHorario(int idMesa, LocalDate fecha, LocalDateTime horaInicio, LocalDateTime horaFin) {
    List<Pedido> pedidos = new ArrayList<>();

    try {
        
        String sql = "SELECT * FROM Pedido WHERE idMesa = ? AND DATE(fechaHora) = ? AND TIME(fechaHora) BETWEEN ? AND ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idMesa);
        ps.setDate(2, Date.valueOf(fecha));
        ps.setTimestamp(3, Timestamp.valueOf(horaInicio));
        ps.setTimestamp(4, Timestamp.valueOf(horaFin));
        ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                
                Pedido ped = new Pedido();
                ped.setIdPedido(rs.getInt("idPedido"));
                mesa = md.ObtenerMesasId(rs.getInt("idMesa"));
                ped.setMesa(mesa);
                mozo = mozoDat.ObtenerMozoId(rs.getInt("idMozo"));
                ped.setMozo(mozo);
                ped.setFechaHora(rs.getTimestamp("fechaHora").toLocalDateTime());
                ped.setCobrada(rs.getBoolean("cobrada"));
                ped.setEstado(rs.getString("estado"));
                pedidos.add(ped);
            }

            ps.close();
            
        } catch (SQLException ex) {

            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al listar pedidos de mesa por hora " + ex.getMessage(), 2000);
            
        }

        return pedidos;
    }
    
    public List<Pedido> listarPedidosEstadoPendiente(){
        
        List<Pedido> pedidos = new ArrayList<>();
        
        try {
            
            String sql = "SELECT * FROM pedido WHERE estado = 'PENDIENTE'";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
          
            while (rs.next()) {
                Pedido pedi = new Pedido();
                pedi.setIdPedido(rs.getInt("idPedido"));
                mesa = md.ObtenerMesasId(rs.getInt("idMesa"));
                pedi.setMesa(mesa);
                mozo = mozoDat.ObtenerMozoId(rs.getInt("idMozo"));
                pedi.setMozo(mozo);
                pedi.setFechaHora(rs.getTimestamp("fechaHora").toLocalDateTime());
                pedi.setCobrada(rs.getBoolean("cobrada"));
                pedi.setImporte(rs.getDouble("importe"));
                pedi.setEstado(rs.getString("estado"));
                pedidos.add(pedi);
            
            }
            
            ps.close();

        }catch (SQLException ex) {
           Utilidades.mostrarDialogoTemporal("Base de datos", "Error al al listar los Pedidos e nestado PENDIENTE " + ex.getMessage(), 2000);
        }

        
        return pedidos;
    };
}
