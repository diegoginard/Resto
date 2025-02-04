package BaseDatos;

import Entidades.Producto;
import Vistas.Utilidades;
import java.sql.*;
import java.util.*;

public class ProductoData {

    private Connection con = null;

    public ProductoData() {

        con = Conexion.getConexion();
    }

    public void guardarProducto(Producto pro) {

        String sql = "INSERT INTO producto(nombreProducto, precio, stock, categoria) VALUE(?,?,?,?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, pro.getNombre());
            ps.setDouble(2, pro.getPrecio());
            ps.setInt(3, pro.getStock());
            ps.setString(4, pro.getCategoria());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                pro.setIdProducto(rs.getInt(1));
                Utilidades.mostrarDialogoTemporal("Base de datos", "Producto Guardado", 2000);
            }

            ps.close();

        } catch (SQLException ex) {

            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al acceder a la tabla producto " + ex.getMessage(), 2000);
        }
    }

    public int eliminarProducto(int id) {
        String sql = "DELETE FROM producto WHERE idProducto = ?";
        PreparedStatement ps = null;

        try {
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();

            if (exito >= 1) {
                return 1;
                
                
            } else {
                
                Utilidades.mostrarDialogoTemporal("Base de datos", "No se encontró el producto", 2000);
                return 0;
            }
            
        } catch (SQLException ex) {
            
            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al Eliminar el producto " + ex.getMessage(), 2000);
            
        } finally {
            
            if (ps != null) {
                
                try {
                    
                    ps.close();
                    
                } catch (SQLException ex) {
                    
                    Utilidades.mostrarDialogoTemporal("Base de datos", "Error al cerrar el PreparedStatement " + ex.getMessage(), 2000);
                }
            }
        }
        return 2;
    }

    public void ModificarProducto(Producto produ) {

        String sql = "UPDATE producto SET nombreProducto = ?, precio = ?, stock = ?, categoria = ? WHERE idProducto = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
           
            ps.setString(1, produ.getNombre());
            ps.setDouble(2, produ.getPrecio());
            ps.setInt(3, produ.getStock());
            ps.setString(4, produ.getCategoria());
            ps.setInt(5, produ.getIdProducto());

            int exito = ps.executeUpdate();

            if (exito == 1) {
//                Utilidades.mostrarDialogoTemporal("Base de datos", "Producto Modificado", 2000);
            }

        } catch (SQLException ex) {

            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al acceder a la tabla" + ex.getMessage(), 2000);
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
                prod.setCategoria(rs.getString("categoria"));
                productos.add(prod);

            }

            ps.close();

        } catch (SQLException ex) {

            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al acceder a la tabla Productos" + ex.getMessage(), 2000);
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
                prod.setCategoria(rs.getString("categoria"));
                productos.add(prod);
            }

            ps.close();

        } catch (SQLException ex) {

            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al acceder a la tabla Productos" + ex.getMessage(), 2000);
        }

        return productos;
    }

    public List<Producto> BuscarProductosXidPedido(int id) {

        List<Producto> productos = new ArrayList<>();

        try {

            String sql = "SELECT p.nombreProducto, p.precio FROM producto p JOIN pedidoproducto pp "
                    + "ON p.idProducto = pp.idProducto WHERE pp.idPedido = ?;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id); // Configura el primer parámetro con el valor de búsqueda
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Producto prod = new Producto();

                prod.setNombre(rs.getString("nombreProducto"));
                prod.setPrecio(rs.getDouble("precio"));

                productos.add(prod);
            }

            ps.close();

        } catch (SQLException ex) {

            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al acceder a la tabla Productos" + ex.getMessage(), 2000);
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
                prod.setCategoria(rs.getString("categoria"));
                productos.add(prod);
            }

            ps.close();

        } catch (SQLException ex) {

            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al acceder a la tabla Productos" + ex.getMessage(), 2000);
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
                prod.setCategoria(rs.getString("categoria"));
                productos.add(prod);
            }

            ps.close();

        } catch (SQLException ex) {

            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al acceder a la tabla Productos" + ex.getMessage(), 2000);
        }

        return productos;
    }

    public List<Producto> listarProductos() {

        List<Producto> productos = new ArrayList<>();

        try {

            String sql = "SELECT * FROM producto";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Producto prod = new Producto();
                prod.setIdProducto(rs.getInt("idProducto"));
                prod.setNombre(rs.getString("nombreProducto"));
                prod.setPrecio(rs.getDouble("precio"));
                prod.setStock(rs.getInt("stock"));
                prod.setCategoria(rs.getString("categoria"));
                productos.add(prod);
            }

            ps.close();

        } catch (SQLException ex) {

            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al acceder a la tabla producto" + ex.getMessage(), 2000);
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
                prod.setCategoria(rs.getString("categoria"));
                productos.add(prod);
            }

            ps.close();

        } catch (SQLException ex) {

            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al acceder a la tabla Productos" + ex.getMessage(), 2000);
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
                prod.setCategoria(rs.getString("categoria"));
                productos.add(prod);
            }

            ps.close();

        } catch (SQLException ex) {

            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al acceder a la tabla Productos" + ex.getMessage(), 2000);
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
                prod.setCategoria(rs.getString("categoria"));
                productos.add(prod);
            }

            ps.close();

        } catch (SQLException ex) {

            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al acceder a la tabla Producto" + ex.getMessage(), 2000);
        }

        return productos;
    }

    public List<Producto> listarProdCateg(int buscar) {

        List<Producto> productos = new ArrayList<>();

        try {

            String sql = "SELECT * FROM producto WHERE categoria = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, buscar); // Configura el primer parámetro con el valor de búsqueda
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Producto prod = new Producto();
                prod.setIdProducto(rs.getInt("idProducto"));
                prod.setNombre(rs.getString("nombreProducto"));
                prod.setPrecio(rs.getDouble("precio"));
                prod.setStock(rs.getInt("stock"));
                prod.setCategoria(rs.getString("categoria"));
                productos.add(prod);

            }

            ps.close();

        } catch (SQLException ex) {

            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al acceder a la tabla producto" + ex.getMessage(), 2000);
        }

        return productos;
    }

    public Producto ObtenerPrductoId(int id) {

        Producto produ = new Producto();

        try {

            String sql = "SELECT * FROM producto WHERE idProducto = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                produ.setIdProducto(rs.getInt("idProducto"));
                produ.setNombre(rs.getString("nombreProducto"));
                produ.setPrecio(rs.getDouble("precio"));
                produ.setStock(rs.getInt("stock"));
                produ.setCategoria(rs.getString("categoria"));
            }

            ps.close();

        } catch (SQLException ex) {

            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al acceder a la tabla Producto" + ex.getMessage(), 2000);
        }

        return produ;
    }
}
