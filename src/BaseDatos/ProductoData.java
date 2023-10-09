
package BaseDatos;

import BaseDatos.Conexion;
import Entidades.Producto;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class ProductoData {
   
    private Connection con = null;
      
    public ProductoData(){
        
        con = Conexion.getConexion();
        
    }
  
    
    public void guardarProducto(Producto pro){
        
        String sql="INSERT INTO producto(nombreProducto, precio, stock, estadoProducto) VALUES (?,?,?,?)"; 
      
        try {
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, pro.getNombre());
            ps.setDouble(2, pro.getPrecio());
            ps.setInt(3, pro.getStock());
            ps.setBoolean(4, pro.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
           
            if (rs.next()) {

               pro.setIdProducto(rs.getInt(1));
                
               JOptionPane.showMessageDialog(null, "Producto Guardado ");
            
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto " + ex.getMessage());
            
        }
    }
    
    public void eliminarProducto(int id) {

        String sql = "DELETE FROM producto WHERE idProducto = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            
            if(exito >= 1){
                
            JOptionPane.showMessageDialog(null, "Producto Eliminado");
            
            }else{
                
                JOptionPane.showMessageDialog(null, "No se encontro el producto");
            
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, " Error al Eliminar la tabla" + ex.getMessage());

        }
    }
    
    public void ModificarProducto(Producto produ){
   
        String sql = "UPDATE producto SET idProducto= ?, nombreProducto = ?, precio = ?, stock = ?, estadoProducto = ? WHERE idProducto = ?";
        
        try {
            
            PreparedStatement ps= con.prepareStatement(sql);

            ps.setInt(1, produ.getIdProducto());
            ps.setString(2, produ.getNombre());
            ps.setDouble(3, produ.getPrecio());
            ps.setInt(4, produ.getStock());
            ps.setBoolean(5, produ.isEstado());
            ps.setInt(6, produ.getIdProducto());
            
            int exito= ps.executeUpdate();
            
            if (exito==1) {
                
                JOptionPane.showMessageDialog(null, "Producto Modificado");
           
            }
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla"+ex.getMessage());
        
        }
    }
    
    public List<Producto> BuscarProductos(String buscar) {
      List<Producto> productos = new ArrayList<>();
        try {
            
            String sql = "SELECT * FROM Producto WHERE idProducto LIKE ? OR nombre LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%" + buscar + "%"); // Configura el primer parámetro con el valor de búsqueda
            ps.setString(2, "%" + buscar + "%"); // Configura el segundo parámetro con el valor de búsqueda
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Producto prod = new Producto();
                prod.setIdProducto(rs.getInt("idProducto"));
                prod.setNombre(rs.getString("nombre"));
                prod.setPrecio(rs.getDouble("precio"));
                prod.setEstado(rs.getBoolean("estado"));
                productos.add(prod);

            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Productos" + ex.getMessage());

        }

        return productos;

    }
    
    public List<Producto> listarProductos(){
        List<Producto> productos = new ArrayList<>();
        try {
            
            String sql = "SELECT * FROM producto WHERE estadoProducto = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Producto prod = new Producto();
                prod.setIdProducto(rs.getInt("idProducto"));
                prod.setNombre(rs.getString("nombreProducto"));
                prod.setPrecio(rs.getDouble("precio"));
                prod.setStock(rs.getInt("stock"));
                prod.setEstado(rs.getBoolean("estadoProducto"));
                productos.add(prod);
            
            }
            
            ps.close();

        }catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto" + ex.getMessage());

        }

        return productos;
    
    }
    
}
