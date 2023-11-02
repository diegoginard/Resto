
package BaseDatos;

import Entidades.Mesa;
import Entidades.Pedido;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
    public int GuardarPedidoID(Pedido pedido) {
        
        int idGenerado = -1; // Valor por defecto si no se puede obtener el ID generado

        try {
            
            String sql = "INSERT INTO pedido (nombreMesero, IdMesa, fechaHora, cobrada, importe, estado) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, pedido.getNombreMesero());
            ps.setInt(2, pedido.getMesa().getIdMesa());
            ps.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
            ps.setBoolean(4, false);
            ps.setDouble(5, pedido.getImporte());
            ps.setString(6, "PENDIENTE");
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                
                idGenerado = rs.getInt(1); // Obtiene el ID generado
                
            }
            
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }

        return idGenerado;
        
    }
    
    public void guardarPedido(Pedido ped) {

        String sql = "INSERT INTO pedido (nombreMesero, IdMesa, fechaHora , cobrada , importe, estado) VALUES (?,?,?,?,?,?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, ped.getNombreMesero());
            ps.setInt(2,ped.getMesa().getIdMesa());
            ps.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
            System.out.println(Timestamp.valueOf(LocalDateTime.now()));
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
                
//                JOptionPane.showMessageDialog(null, "Pedido Modificado");
           
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
                Pedido pedi = new Pedido();
                pedi.setIdPedido(rs.getInt("idPedido"));
                mesa = md.ObtenerMesasId(rs.getInt("idMesa"));
                pedi.setMesa(mesa);
                pedi.setNombreMesero(rs.getString("nombreMesero"));
                pedi.setFechaHora(rs.getTimestamp("fechaHora").toLocalDateTime());
                pedi.setCobrada(rs.getBoolean("cobrada"));
                pedi.setImporte(rs.getDouble("importe"));
                pedi.setEstado(rs.getString("estado"));
                Pedidos.add(pedi);
            
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
            
            String sql = "SELECT * FROM Pedido WHERE idMesa = ? AND cobrada = false";
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
    
    public List<Pedido> listarPedidosMesaEntregadas(int id){
        
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
 
     public List<Pedido> listarPedidoMesero(String meseroN){
        
        List<Pedido> mesero = new ArrayList<>();
    
        try {
            
            String sql = "SELECT * FROM Pedido WHERE nombreMesero LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, meseroN + "%"); // Configura el primer parámetro con el valor de búsqueda
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
                mesero.add(ped);
            
            }
            
            ps.close();

        }catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pedidos" + ex.getMessage());

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
                ped.setNombreMesero(rs.getString("nombreMesero"));
                ped.setFechaHora(rs.getTimestamp("fechaHora").toLocalDateTime());
                ped.setCobrada(rs.getBoolean("cobrada"));
                ped.setEstado(rs.getString("estado"));
                listaFecha.add(ped);
            
            }
            
            ps.close();

        }catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pedidos" + ex.getMessage());

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
                ped.setNombreMesero(rs.getString("nombreMesero"));
                ped.setFechaHora(rs.getTimestamp("fechaHora").toLocalDateTime());
                ped.setImporte(rs.getDouble("importe"));
                ped.setCobrada(rs.getBoolean("cobrada"));
                ped.setEstado(rs.getString("estado"));
                listaFechaD.add(ped);
            
            }
            
            ps.close();

        }catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pedidos" + ex.getMessage());

        }

        return listaFechaD;
    
    }  
        
    public List<Pedido> listarPedidosCobradosPorMeseroEnElDia(String Mesero, LocalDate fecha) {
    
        List<Pedido> pedidos = new ArrayList<>();

    try {
        String sql = "SELECT * FROM Pedido WHERE nombreMesero = ? AND DATE(fechaHora) = ? AND cobrada = true";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, Mesero);
        ps.setDate(2, Date.valueOf(fecha));
        ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Pedido ped = new Pedido();
                ped.setIdPedido(rs.getInt("idPedido"));
                mesa = md.ObtenerMesasId(rs.getInt("idMesa"));
                ped.setMesa(mesa);
                ped.setNombreMesero(rs.getString("nombreMesero"));
                ped.setFechaHora(rs.getTimestamp("fechaHora").toLocalDateTime());
                ped.setCobrada(rs.getBoolean("cobrada"));
                ped.setEstado(rs.getString("estado"));
                pedidos.add(ped);
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pedidos: " + ex.getMessage());
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
                ped.setNombreMesero(rs.getString("nombreMesero"));
                ped.setFechaHora(rs.getTimestamp("fechaHora").toLocalDateTime());
                ped.setCobrada(rs.getBoolean("cobrada"));
                ped.setEstado(rs.getString("estado"));
                pedidos.add(ped);
            }

            ps.close();
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pedidos: " + ex.getMessage());
        }

        return pedidos;
    }
    
    public boolean pasarAlibre(int idMesa) {
        
        try {
            
            String sql = "SELECT COUNT(*) FROM Pedido WHERE idMesa = ? AND cobrado = 'PENDIENTE'";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMesa);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                
                int cantidadPedidosPendientes = rs.getInt(1);
                return cantidadPedidosPendientes > 0; // Si hay al menos un pedido pendiente, no se puede modificar a "LIBRE"
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al verificar el estado del pedido: " + ex.getMessage());
        }

        return true; // Si ocurre un error, se asume que no se puede modificar el pedido
    }
}
