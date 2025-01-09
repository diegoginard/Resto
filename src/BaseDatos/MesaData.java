
package BaseDatos;

import Entidades.Mesa;
import Vistas.Utilidades;
import java.sql.*;
import java.util.*;

public class MesaData {

    private Connection con = null;
    private Mesa mesa = new Mesa();

    public MesaData() {
        con = Conexion.getConexion();
    }

    public void crearMesa(Mesa mesa) {
        String sql = "INSERT INTO mesa(numero, estadoMesa, capacidad,activo) VALUES (?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, mesa.getNumero());
            ps.setString(2, mesa.getEstadoMesa());
            ps.setInt(3, mesa.getCapacidad());
            ps.setBoolean(4, mesa.isActivo());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                mesa.setIdMesa(rs.getInt(1));
                Utilidades.mostrarDialogoTemporal("Base de datos", "Mesa Guardada ", 2000);
            }

            ps.close();
        } catch (SQLException ex) {
            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al acceder a la tabla mesa: " + ex.getMessage(), 2000);
        }
    }

    public void eliminarMesa(int id) {
        String sql = "DELETE FROM mesa WHERE idMesa = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();

            if (exito >= 1) {
                Utilidades.mostrarDialogoTemporal("Base de datos", "Mesa Eliminada", 2000);
            } else {
                Utilidades.mostrarDialogoTemporal("Base de datos", "No se encontró la mesa", 2000);
            }

            ps.close();
        } catch (SQLException ex) {
            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al eliminar la tabla: " + ex.getMessage(), 2000);
        }
    }

    public void modificarMesa(Mesa mesa) {
        String sql = "UPDATE mesa SET idMesa = ?, numero = ?, estadoMesa = ?, capacidad = ?, activo = ? WHERE idMesa = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, mesa.getIdMesa());
            ps.setInt(2, mesa.getNumero());
            ps.setString(3, mesa.getEstadoMesa());
            ps.setInt(4, mesa.getCapacidad());
            ps.setBoolean(5, mesa.isActivo());
            ps.setInt(6, mesa.getIdMesa());

            int exito = ps.executeUpdate();

            if (exito == 1) {
//                Utilidades.mostrarDialogoTemporal("Base de datos", "Mesa Modificada", 2000);
            }
        } catch (SQLException ex) {
            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al modificar la mesa " + ex.getMessage(), 2000);
        }
    }

    public List<Mesa> listarMesas() {
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
                mesa.setActivo(rs.getBoolean("activo"));
                Mesas.add(mesa);
            }

            ps.close();
        } catch (SQLException ex) {
            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al listar mesas: " + ex.getMessage(), 2000);
        }

        return Mesas;
    }

    public List<Mesa> listarTodasLasMesas() {
        List<Mesa> Mesas = new ArrayList<>();

        try {
            String sql = "SELECT * FROM mesa";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Mesa mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("idMesa"));
                mesa.setNumero(rs.getInt("numero"));
                mesa.setEstadoMesa(rs.getString("estadoMesa"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setActivo(rs.getBoolean("activo"));
                Mesas.add(mesa);
            }

            ps.close();
        } catch (SQLException ex) {
            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al listar todas las mesas: " + ex.getMessage(), 2000);
        }

        return Mesas;
    }

    public Mesa ObtenerMesasId(int id) {
        try {
            String sql = "SELECT * FROM mesa WHERE idMesa = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                mesa.setIdMesa(rs.getInt("idMesa"));
                mesa.setNumero(rs.getInt("numero"));
                mesa.setEstadoMesa(rs.getString("estadoMesa"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setActivo(rs.getBoolean("activo"));
            }

            ps.close();
        } catch (SQLException ex) {
            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al obtener mesa por ID: " + ex.getMessage(), 2000);
        }

        return mesa;
    }

    public void modificarMesaLibre() {
        String sql = "UPDATE mesa SET estadoMesa = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                Utilidades.mostrarDialogoTemporal("Base de datos", "Mesas Modificadas", 2000);
            }
        } catch (SQLException ex) {
            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al modificar mesas libres: " + ex.getMessage(), 2000);
        }
    }

    public List<Mesa> BuscarMesasNumero(String buscar) {
        List<Mesa> mesasNumero = new ArrayList<>();

        try {
            String sql = "SELECT * FROM mesa WHERE numero LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, buscar + "%");
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
            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al buscar mesas por número: " + ex.getMessage(), 2000);
        }

        return mesasNumero;
    }

    public List<Mesa> BuscarMesasEstado(String buscar) {
        List<Mesa> mesasEstado = new ArrayList<>();

        try {
            String sql = "SELECT * FROM mesa WHERE estadoMesa LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, buscar + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Mesa mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("idMesa"));
                mesa.setNumero(rs.getInt("numero"));
                mesa.setEstadoMesa(rs.getString("estadoMesa"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setActivo(rs.getBoolean("activo"));
                mesasEstado.add(mesa);
            }

            ps.close();
        } catch (SQLException ex) {
            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al buscar mesas por estado: " + ex.getMessage(), 2000);
        }

        return mesasEstado;
    }

    public List<Mesa> BuscarMesasCapacidad(String buscar) {
        List<Mesa> mesasNumero = new ArrayList<>();

        try {
            String sql = "SELECT * FROM mesa WHERE capacidad LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, buscar + "%");
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
            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al buscar mesas por capacidad: " + ex.getMessage(), 2000);
        }

        return mesasNumero;
    }

    public List<Mesa> BuscarMesasEstadoMesa(String buscar) {
        List<Mesa> mesasNumero = new ArrayList<>();

        try {
            String sql = "SELECT * FROM mesa WHERE estadoMesa LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, buscar + "%");
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
            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al buscar mesas por estado de mesa: " + ex.getMessage(), 2000);
        }

        return mesasNumero;
    }

    public List<Mesa> BuscarMesasActivo(String buscar) {
        List<Mesa> mesasNumero = new ArrayList<>();

        try {
            String sql = "SELECT * FROM mesa WHERE activo LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, buscar + "%");
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
            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al buscar mesas por activo: " + ex.getMessage(), 2000);
        }

        return mesasNumero;
    }

    public List<Mesa> BuscarMesasId(String buscar) {
        List<Mesa> mesasNumero = new ArrayList<>();

        try {
            String sql = "SELECT * FROM mesa WHERE idMesa LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, buscar + "%");
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
            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al buscar mesas por ID: " + ex.getMessage(), 2000);
        }

        return mesasNumero;
    }

    public void modificarMesaEstado(int id, String estado) {
        String sql = "UPDATE mesa SET estadoMesa = ? WHERE idMesa = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, estado);
            ps.setInt(2, id);

            int exito = ps.executeUpdate();

            if (exito == 1) {
                Utilidades.mostrarDialogoTemporal("Base de datos", "Mesa Modificada", 2000);
            }
        } catch (SQLException ex) {
            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al modificar estado de la mesa: " + ex.getMessage(), 2000);
        }
    }
}
