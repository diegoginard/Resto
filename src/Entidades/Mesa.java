
package Entidades;

import java.util.Objects;

public class Mesa {
    private int idMesa;
    private int numero;
    private String estadoMesa;
    private int capacidad;
    private Boolean activo;

    public Mesa() {
    }

    public Mesa(int idMesa) {
        this.idMesa = idMesa;
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

    public Mesa(int numero, String estadoMesa, int capacidad, Boolean activo) {
        this.numero = numero;
        this.estadoMesa = estadoMesa;
        this.capacidad = capacidad;
        this.activo = activo;
    }

    public Mesa(int idMesa, int numero, String estadoMesa, int capacidad, Boolean activo) {
        this.idMesa = idMesa;
        this.numero = numero;
        this.estadoMesa = estadoMesa;
        this.capacidad = capacidad;
        this.activo = activo;
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

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Mesa " + numero  + ", sillas " + capacidad ;
    }
    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mesa mesa = (Mesa) o;
        return idMesa == mesa.idMesa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMesa);
    }    
}