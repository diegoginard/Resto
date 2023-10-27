
package BaseDatos;

import Entidades.Producto;
import java.sql.*;
import java.util.*;
import javax.swing.*;

public class ProductoData {
   
    private Connection con = null;
      
    public ProductoData(){
        
        con = Conexion.getConexion();
        
    }
  
    public void guardarProducto(Producto pro){
        
        String sql="INSERT INTO producto(nombreProducto, precio, stock, estadoProducto,categoria) VALUE(?,?,?,?,?)"; 
      
        try{
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, pro.getNombre());
            ps.setDouble(2, pro.getPrecio());
            ps.setInt(3, pro.getStock());
            ps.setBoolean(4, true);
            ps.setString(5, pro.getCategoria());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
           
            if(rs.next()) {

               pro.setIdProducto(rs.getInt(1));
                
               JOptionPane.showMessageDialog(null, "Producto Guardado ");
            
            }
            
            ps.close();
            
        }catch(SQLException ex) {
            
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
   
        String sql = "UPDATE producto SET idProducto= ?, nombreProducto = ?, precio = ?, stock = ?, estadoProducto = ?, categoria = ? WHERE idProducto = ?";
        
        try {
            
            PreparedStatement ps= con.prepareStatement(sql);

            ps.setInt(1, produ.getIdProducto());
            ps.setString(2, produ.getNombre());
            ps.setDouble(3, produ.getPrecio());
            ps.setInt(4, produ.getStock());
            ps.setBoolean(5, produ.isEstado());
            ps.setString(6,produ.getCategoria());
            ps.setInt(7, produ.getIdProducto());
            
            int exito= ps.executeUpdate();
            
            if (exito==1) {
                
                JOptionPane.showMessageDialog(null, "Producto Modificado");
           
            }
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla"+ex.getMessage());
        
        }
    }
    
    public List<Producto> BuscarProductosNombre(String buscar) {
        
      List<Producto> productos = new ArrayList<>();
      
        try {
            
            String sql = "SELECT * FROM Producto WHERE nombreProducto LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, buscar + "%"); // Configura el primer parámetro con el valor de búsqueda
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Producto prod = new Producto();
                prod.setIdProducto(rs.getInt("idProducto"));
                prod.setNombre(rs.getString("nombreProducto"));
                prod.setPrecio(rs.getDouble("precio"));
                prod.setStock(rs.getInt("stock"));
                prod.setEstado(rs.getBoolean("estadoProducto"));
                prod.setCategoria(rs.getString("categoria"));
                productos.add(prod);

            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Productos" + ex.getMessage());

        }

        return productos;

    }
    
    public List<Producto> BuscarProductosId(String buscar) {
        
      List<Producto> productos = new ArrayList<>();
      
        try {
            
            String sql = "SELECT * FROM Producto WHERE idProducto LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, buscar + "%"); // Configura el primer parámetro con el valor de búsqueda
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Producto prod = new Producto();
                prod.setIdProducto(rs.getInt("idProducto"));
                prod.setNombre(rs.getString("nombreProducto"));
                prod.setPrecio(rs.getDouble("precio"));
                prod.setStock(rs.getInt("stock"));
                prod.setEstado(rs.getBoolean("estadoProducto"));
                prod.setCategoria(rs.getString("categoria"));
                productos.add(prod);

            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Productos" + ex.getMessage());

        }

        return productos;

    }
    
    public List<Producto> BuscarProductosPrecio(String buscar) {
        
      List<Producto> productos = new ArrayList<>();
      
        try {
            
            String sql = "SELECT * FROM Producto WHERE precio LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, buscar + "%"); // Configura el primer parámetro con el valor de búsqueda
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Producto prod = new Producto();
                prod.setIdProducto(rs.getInt("idProducto"));
                prod.setNombre(rs.getString("nombreProducto"));
                prod.setPrecio(rs.getDouble("precio"));
                prod.setStock(rs.getInt("stock"));
                prod.setEstado(rs.getBoolean("estadoProducto"));
                prod.setCategoria(rs.getString("categoria"));
                productos.add(prod);

            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Productos" + ex.getMessage());

        }

        return productos;

    }

    public List<Producto> BuscarProductoStock(String buscar) {

        List<Producto> productos = new ArrayList<>();

        try {

            String sql = "SELECT * FROM Producto WHERE stock LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, buscar + "%"); // Configura el primer parámetro con el valor de búsqueda
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Producto prod = new Producto();
                prod.setIdProducto(rs.getInt("idProducto"));
                prod.setNombre(rs.getString("nombreProducto"));
                prod.setPrecio(rs.getDouble("precio"));
                prod.setStock(rs.getInt("stock"));
                prod.setEstado(rs.getBoolean("estadoProducto"));
                prod.setCategoria(rs.getString("categoria"));
                productos.add(prod);

            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Productos" + ex.getMessage());

        }

        return productos;

    }
    
    public List<Producto> BuscarProductoEstado(String buscar) {

        List<Producto> productos = new ArrayList<>();

        try {

            String sql = "SELECT * FROM Producto WHERE estadoProducto LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, buscar + "%"); // Configura el primer parámetro con el valor de búsqueda
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Producto prod = new Producto();
                prod.setIdProducto(rs.getInt("idProducto"));
                prod.setNombre(rs.getString("nombreProducto"));
                prod.setPrecio(rs.getDouble("precio"));
                prod.setStock(rs.getInt("stock"));
                prod.setEstado(rs.getBoolean("estadoProducto"));
                prod.setCategoria(rs.getString("categoria"));
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
                prod.setCategoria(rs.getString("categoria"));
                productos.add(prod);
            
            }
            
            ps.close();

        }catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto" + ex.getMessage());

        }

        return productos;
    
    }
    
    public List<Producto> BuscarCategComida(String buscar) {

        List<Producto> productos = new ArrayList<>();

        try {

            String sql = "SELECT * FROM Producto WHERE categoria = 1 AND nombreProducto LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, buscar + "%"); // Configura el primer parámetro con el valor de búsqueda
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Producto prod = new Producto();
                prod.setIdProducto(rs.getInt("idProducto"));
                prod.setNombre(rs.getString("nombreProducto"));
                prod.setPrecio(rs.getDouble("precio"));
                prod.setStock(rs.getInt("stock"));
                prod.setEstado(rs.getBoolean("estadoProducto"));
                prod.setCategoria(rs.getString("categoria"));
                productos.add(prod);

            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Productos" + ex.getMessage());

        }

        return productos;

    }
    
    public List<Producto> BuscarCategBebida(String buscar) {

        List<Producto> productos = new ArrayList<>();

        try {

            String sql = "SELECT * FROM Producto WHERE categoria = 2 AND nombreProducto LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, buscar + "%"); // Configura el primer parámetro con el valor de búsqueda
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Producto prod = new Producto();
                prod.setIdProducto(rs.getInt("idProducto"));
                prod.setNombre(rs.getString("nombreProducto"));
                prod.setPrecio(rs.getDouble("precio"));
                prod.setStock(rs.getInt("stock"));
                prod.setEstado(rs.getBoolean("estadoProducto"));
                prod.setCategoria(rs.getString("categoria"));
                productos.add(prod);

            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Productos" + ex.getMessage());

        }

        return productos;

    }
    
    public List<Producto> BuscarCategPostre(String buscar) {

        List<Producto> productos = new ArrayList<>();

        try {

            String sql = "SELECT * FROM Producto WHERE categoria = 3 AND nombreProducto LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, buscar + "%"); // Configura el primer parámetro con el valor de búsqueda
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Producto prod = new Producto();
                prod.setIdProducto(rs.getInt("idProducto"));
                prod.setNombre(rs.getString("nombreProducto"));
                prod.setPrecio(rs.getDouble("precio"));
                prod.setStock(rs.getInt("stock"));
                prod.setEstado(rs.getBoolean("estadoProducto"));
                prod.setCategoria(rs.getString("categoria"));
                productos.add(prod);

            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Productos" + ex.getMessage());

        }

        return productos;

    }
    
    public List<Producto> listarProdCateg(int buscar){
        
        List<Producto> productos = new ArrayList<>();
        
        try {
            
            String sql = "SELECT * FROM producto WHERE categoria = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, buscar ); // Configura el primer parámetro con el valor de búsqueda
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                Producto prod = new Producto();
                prod.setIdProducto(rs.getInt("idProducto"));
                prod.setNombre(rs.getString("nombreProducto"));
                prod.setPrecio(rs.getDouble("precio"));
                prod.setStock(rs.getInt("stock"));
                prod.setEstado(rs.getBoolean("estadoProducto"));
                prod.setCategoria(rs.getString("categoria"));
                productos.add(prod);
            
            }
            
            ps.close();

        }catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto" + ex.getMessage());

        }

        return productos;
    
    }
     public Producto ObtenerPrductoId(int id){
         
        Producto produ = new Producto();
        try {
            
            String sql = "SELECT * FROM producto WHERE idProducto = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                produ.setIdProducto(rs.getInt("idProducto"));
                produ.setNombre(rs.getString("nombre"));
                produ.setPrecio(rs.getDouble("precio"));
                produ.setStock(rs.getInt("stock"));
                produ.setEstado(rs.getBoolean("estado"));
                produ.setCategoria(rs.getString("categoria"));
            
            }
            
            ps.close();

        }catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla mesa" + ex.getMessage());

        }

        return produ;
    
    }
}
