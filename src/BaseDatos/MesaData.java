
package BaseDatos;

import Entidades.Mesa;
import java.sql.*;
import java.util.*;
import javax.swing.*;


public class MesaData {
    
    private Connection con = null;
    private Mesa mesa = new Mesa();
     public MesaData(){
        
        con = Conexion.getConexion();
        
    }   
    
    
    public void crearMesa(Mesa mesa){
        
    String sql = "INSERT INTO mesa(numero, estadoMesa, capacidad,activo) VALUES (?,?,?,?)"; 
    
        try {
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, mesa.getNumero());
            ps.setString(2, mesa.getEstadoMesa());
            ps.setInt(3, mesa.getCapacidad());
            ps.setBoolean(4, true);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
           
            if (rs.next()) {

               mesa.setIdMesa(rs.getInt(1));
                
               JOptionPane.showMessageDialog(null, "Mesa Guardada ");
            
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mesa " + ex.getMessage());
            
        }
    }
   
    public void eliminarMesa(int id){
        
         String sql = "DELETE FROM mesa WHERE idMesa = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            
            if(exito >= 1){
                
            JOptionPane.showMessageDialog(null, "Mesa Eliminada");
            
            }else{
                
                JOptionPane.showMessageDialog(null, "No se encontro la mesa");
            
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, " Error al Eliminar la tabla" + ex.getMessage());

        }
    }
    
    public void modificarMesa(Mesa mesa){
   
        String sql = "UPDATE mesa SET idMesa= ?, numero = ?, estadoMesa = ?, capacidad = ? WHERE idMesa = ?";
        
        try {
            
            PreparedStatement ps= con.prepareStatement(sql);

            ps.setInt(1, mesa.getIdMesa());
            ps.setInt(2, mesa.getNumero());
            ps.setString(3, mesa.getEstadoMesa());
            ps.setInt(4, mesa.getCapacidad());
            ps.setInt(5, mesa.getIdMesa());
            
            int exito= ps.executeUpdate();
            
            if (exito==1) {
                
                JOptionPane.showMessageDialog(null, "Mesa Modificada");
           
            }
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla"+ex.getMessage());
        
        }
    }
    
    public List<Mesa> listarMesas(){
        
        List<Mesa> Mesas = new ArrayList<>();
    
        try {
            
            String sql = "SELECT * FROM mesa WHERE activo = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Mesa mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("idMesa"));
                mesa.setNumero(rs.getInt("numero"));
                mesa.setEstadoMesa(rs.getString("estadoMesa"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setActivo(Boolean.TRUE);
                Mesas.add(mesa);
            
            }
            
            ps.close();

        }catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mesa" + ex.getMessage());

        }

        return Mesas;
    
    }
    
      public Mesa ObtenerMesasId(int id){
    
        try {
            
            String sql = "SELECT * FROM mesa WHERE idMesa = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Mesa mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("idMesa"));
                mesa.setNumero(rs.getInt("numero"));
                mesa.setEstadoMesa(rs.getString("estadoMesa"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setActivo(rs.getBoolean("activo"));
            
            }
            
            ps.close();

        }catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mesa" + ex.getMessage());

        }

        return mesa;
    
    }
    
    public void modificarMesaLibre(){
   
        String sql = "UPDATE mesa SET estadoMesa = 1";
        
        try {
            
            PreparedStatement ps= con.prepareStatement(sql);
            int exito= ps.executeUpdate();
            
            if (exito==1) {
                
                JOptionPane.showMessageDialog(null, "Mesas Modificada");
           
            }
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla"+ex.getMessage());
        
        }
    }
    
    public List<Mesa> BuscarMesasNumero(String buscar){
        
        List <Mesa> mesasNumero = new ArrayList();
        
        try {
            
            String sql = "SELECT * FROM mesa WHERE numero LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, buscar + "%"); // Configura el primer parámetro con el valor de búsqueda
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Mesa mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("idMesa"));
                mesa.setNumero(rs.getInt("numero"));
                mesa.setEstadoMesa(rs.getString("estadoMesa"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setActivo(rs.getBoolean("activo"));
                mesasNumero.add(mesa);

            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesa" + ex.getMessage());

        }
    
    return mesasNumero;
    
    }
    
    public List<Mesa> BuscarMesasCapacidad(String buscar){
        
        List <Mesa> mesasNumero = new ArrayList();
        
        try {
            
            String sql = "SELECT * FROM mesa WHERE capacidad LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, buscar + "%"); // Configura el primer parámetro con el valor de búsqueda
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Mesa mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("idMesa"));
                mesa.setNumero(rs.getInt("numero"));
                mesa.setEstadoMesa(rs.getString("estadoMesa"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setActivo(rs.getBoolean("activo"));
                mesasNumero.add(mesa);

            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesa" + ex.getMessage());

        }
    
    return mesasNumero;
    
    }
    
    public List<Mesa> BuscarMesasEstadoMesa(String buscar){
        
        List <Mesa> mesasNumero = new ArrayList();
        
        try {
            
            String sql = "SELECT * FROM mesa WHERE estadoMesa LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, buscar + "%"); // Configura el primer parámetro con el valor de búsqueda
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Mesa mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("idMesa"));
                mesa.setNumero(rs.getInt("numero"));
                mesa.setEstadoMesa(rs.getString("estadoMesa"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setActivo(rs.getBoolean("activo"));
                mesasNumero.add(mesa);

            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesa" + ex.getMessage());

        }
    
    return mesasNumero;
    
    }
    
    public List<Mesa> BuscarMesasActivo(String buscar){
        
        List <Mesa> mesasNumero = new ArrayList();
        
        try {
            
            String sql = "SELECT * FROM mesa WHERE activo LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, buscar + "%"); // Configura el primer parámetro con el valor de búsqueda
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Mesa mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("idMesa"));
                mesa.setNumero(rs.getInt("numero"));
                mesa.setEstadoMesa(rs.getString("estadoMesa"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setActivo(rs.getBoolean("activo"));
                mesasNumero.add(mesa);

            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesa" + ex.getMessage());

        }
    
    return mesasNumero;
    
    }
    
    public List<Mesa> BuscarMesasId(String buscar){
        
        List <Mesa> mesasNumero = new ArrayList();
        
        try {
            
            String sql = "SELECT * FROM mesa WHERE idMesa LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, buscar + "%"); // Configura el primer parámetro con el valor de búsqueda
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Mesa mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("idMesa"));
                mesa.setNumero(rs.getInt("numero"));
                mesa.setEstadoMesa(rs.getString("estadoMesa"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setActivo(rs.getBoolean("activo"));
                mesasNumero.add(mesa);

            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesa" + ex.getMessage());

        }
    
    return mesasNumero;
    
    }
    public void modificarMesaEstado(int id, String estado){
   
        String sql = "UPDATE mesa SET estadoMesa = ? WHERE idMesa = ?";
        
        try {
            
            PreparedStatement ps= con.prepareStatement(sql);

            ps.setString(1, estado);
            ps.setInt(2, id);
            
            int exito= ps.executeUpdate();
            
            if (exito==1) {
                
//                JOptionPane.showMessageDialog(null, "Mesa Modificada");
           
            }
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla"+ex.getMessage());
        
        }
    }
}
