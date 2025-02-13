package BaseDatos;

import Entidades.Mesa;
import Vistas.Utilidades;
import java.sql.*;
import java.util.*;

public class MesaData {

    private Connection con = null;

    public MesaData() {

        con = Conexion.getConexion();
    }

    public boolean crearMesa(Mesa mesa) {

        String sql = "INSERT INTO mesa(numero, estadoMesa, capacidad, activo) VALUES (?, ?, ?, ?)";

        try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setInt(1, mesa.getNumero());
            ps.setString(2, mesa.getEstadoMesa());
            ps.setInt(3, mesa.getCapacidad());
            ps.setBoolean(4, mesa.isActivo());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {

                mesa.setIdMesa(rs.getInt(1));
                Utilidades.mostrarDialogoTemporal("Base de datos", "Mesa Guardada", 2000);
                return true;
            }

        } catch (SQLException ex) {

            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al guardar la mesa: " + ex.getMessage(), 2000);
        }

        return false;
    }

    public void eliminarMesa(int numero) {

        String sql = "DELETE FROM mesa WHERE numero = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, numero);
            int exito = ps.executeUpdate();

            if (exito >= 1) {

                Utilidades.mostrarDialogoTemporal("Base de datos", "Mesa Eliminada", 2000);

            } else {

                Utilidades.mostrarDialogoTemporal("Base de datos", "No se encontró la mesa", 2000);
            }

            ps.close();

        } catch (SQLException ex) {

            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al eliminar la mesa " + ex.getMessage(), 2000);
        }
    }

    public boolean modificarMesa(Mesa mesa) {

        String sql = "UPDATE mesa SET numero = ?, estadoMesa = ?, capacidad = ?, activo = ? WHERE idMesa = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, mesa.getNumero());
            ps.setString(2, mesa.getEstadoMesa());
            ps.setInt(3, mesa.getCapacidad());
            ps.setBoolean(4, mesa.isActivo());
            ps.setInt(5, mesa.getIdMesa());
            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;

        } catch (SQLException ex) {

            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al modificar la mesa: " + ex.getMessage(), 2000);
            return false;
        }
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

            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al modificar mesas libres " + ex.getMessage(), 2000);
        }
    }

    public void modificarMesaEstado(int id, int estado) {

        String sql = "UPDATE mesa SET estadoMesa = ? WHERE idMesa = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, estado);
            ps.setInt(2, id);

            int exito = ps.executeUpdate();

            if (exito == 1) {
//                Utilidades.mostrarDialogoTemporal("Base de datos", "Mesa Modificada", 2000);
            }

        } catch (SQLException ex) {

            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al modificar estado de la mesa: " + ex.getMessage(), 2000);
        }
    }

    private List<Mesa> buscarMesas(String sql, Object... parametros) {

        List<Mesa> mesas = new ArrayList<>();

        try (PreparedStatement ps = con.prepareStatement(sql)) {

            for (int i = 0; i < parametros.length; i++) {

                ps.setObject(i + 1, parametros[i]);
            }

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Mesa mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("idMesa"));
                mesa.setNumero(rs.getInt("numero"));
                mesa.setEstadoMesa(rs.getString("estadoMesa"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setActivo(rs.getBoolean("activo"));
                mesas.add(mesa);
            }

        } catch (SQLException ex) {

            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al buscar mesas: " + ex.getMessage(), 2000);
        }

        return mesas;
    }

    public List<Mesa> listarMesasLibres() {

        String sql = "SELECT * FROM mesa WHERE estadoMesa = 1";
        return buscarMesas(sql);
    }

    public List<Mesa> listarTodasLasMesas() {

        String sql = "SELECT * FROM mesa";
        return buscarMesas(sql);
    }

    public List<Mesa> BuscarMesasNumero(String buscar) {

        String sql = "SELECT * FROM mesa WHERE numero LIKE ?";
        return buscarMesas(sql, buscar + "%");
    }

    public List<Mesa> BuscarMesasEstado(String buscar) {

        String sql = "SELECT * FROM mesa WHERE estadoMesa LIKE ?";
        return buscarMesas(sql, buscar + "%");
    }

    public List<Mesa> BuscarMesasCapacidad(String buscar) {

        String sql = "SELECT * FROM mesa WHERE capacidad LIKE ?";
        return buscarMesas(sql, buscar + "%");
    }

    public List<Mesa> BuscarMesasEstadoMesa(String buscar) {

        String sql = "SELECT * FROM mesa WHERE estadoMesa LIKE ?";
        return buscarMesas(sql, buscar + "%");
    }

    public List<Mesa> listarMesasConPedido() {

        Set<Mesa> mesasSet = new HashSet<>(); // Usar un Set para evitar duplicados

        try {
            String sql = "SELECT DISTINCT m.* FROM mesa m JOIN pedido p ON m.idMesa = p.idMesa WHERE p.estado != 'CANCELADO' AND p.cobrada = 0";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Mesa mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("idMesa"));
                mesa.setNumero(rs.getInt("numero"));
                mesa.setEstadoMesa(rs.getString("estadoMesa"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setActivo(rs.getBoolean("activo"));
                mesasSet.add(mesa); // Añadir al Set
            }

            ps.close();

        } catch (SQLException ex) {

            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al listar todas las mesas " + ex.getMessage(), 2000);
        }

        return new ArrayList<>(mesasSet); // Convertir el Set a List
    }

    public List<Mesa> listarMesasConPedidoEntregado() {

        Set<Mesa> mesasSet = new HashSet<>(); // Usar un Set para evitar duplicados

        try {

            String sql = "SELECT DISTINCT m.* FROM mesa m JOIN pedido p ON m.idMesa = p.idMesa WHERE p.estado = 'ENTREGADO' AND p.cobrada = 0";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Mesa mesa = new Mesa();
                mesa.setIdMesa(rs.getInt("idMesa"));
                mesa.setNumero(rs.getInt("numero"));
                mesa.setEstadoMesa(rs.getString("estadoMesa"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setActivo(rs.getBoolean("activo"));
                mesasSet.add(mesa); // Añadir al Set
            }

            ps.close();

        } catch (SQLException ex) {

            Utilidades.mostrarDialogoTemporal("Base de datos", "Error al listar todas las mesas " + ex.getMessage(), 2000);
        }

        return new ArrayList<>(mesasSet); // Convertir el Set a List
    }

    public Mesa ObtenerMesasId(int id) {

        Mesa mesa = new Mesa();

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

    public Mesa ObtenerIdMesasXnumMesa(int id) {

        Mesa mesa = new Mesa();

        try {

            String sql = "SELECT * FROM mesa WHERE numero = ?";
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
}
