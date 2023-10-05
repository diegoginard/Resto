
package Entidades;

public class Mesa {
    private int idMesa;
    private int mesa;
    private boolean estadoMesa;
    private int capacidad;

    public Mesa() {
    }

    public Mesa(int mesa, boolean estadoMesa, int capacidad) {
        this.mesa = mesa;
        this.estadoMesa = estadoMesa;
        this.capacidad = capacidad;
    }

    public Mesa(int idMesa, int mesa, boolean estadoMesa, int capacidad) {
        this.idMesa = idMesa;
        this.mesa = mesa;
        this.estadoMesa = estadoMesa;
        this.capacidad = capacidad;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public boolean isEstadoMesa() {
        return estadoMesa;
    }

    public void setEstadoMesa(boolean estadoMesa) {
        this.estadoMesa = estadoMesa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Mesa{" + "idMesa=" + idMesa + ", mesa=" + mesa + ", estadoMesa=" + estadoMesa + ", capacidad=" + capacidad + '}';
    }
    
}
