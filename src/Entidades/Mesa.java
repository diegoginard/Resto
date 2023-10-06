
package Entidades;

public class Mesa {
    private int idMesa;
    private int numero;
    private String estadoMesa;
    private int capacidad;

    public Mesa() {
    }

    public Mesa(int idMesa, int numero, String estadoMesa, int capacidad) {
        this.idMesa = idMesa;
        this.numero = numero;
        this.estadoMesa = estadoMesa;
        this.capacidad = capacidad;
    }

    public Mesa(int numero, String estadoMesa, int capacidad) {
        this.numero = numero;
        this.estadoMesa = estadoMesa;
        this.capacidad = capacidad;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEstadoMesa() {
        return estadoMesa;
    }

    public void setEstadoMesa(String estadoMesa) {
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
        return "Mesa{" + "idMesa=" + idMesa + ", numero=" + numero + ", estadoMesa=" + estadoMesa + ", capacidad=" + capacidad + '}';
    }

}