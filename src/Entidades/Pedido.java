
package Entidades;

import java.time.*;

public class Pedido {
    private int idPedido;
    private Mesa mesa;
    private String nombreMesero;
    private LocalDateTime fechaHora;
    private boolean cobrada;
    private String estado;

    public Pedido() {
    }

    public Pedido(Mesa mesa) {
        this.mesa = mesa;
    }

    public Pedido(int idPedido, Mesa mesa, String nombreMesero, LocalDateTime fechaHora, boolean cobrada, String estado) {
        this.idPedido = idPedido;
        this.mesa = mesa;
        this.nombreMesero = nombreMesero;
        this.fechaHora = fechaHora;
        this.cobrada = cobrada;
        
        this.estado = estado;
    }

    public Pedido(Mesa mesa, String nombreMesero, LocalDateTime fechaHora, boolean cobrada, String estado) {
        this.mesa = mesa;
        this.nombreMesero = nombreMesero;
        this.fechaHora = fechaHora;
        this.cobrada = cobrada;
        this.estado = estado;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public String getNombreMesero() {
        return nombreMesero;
    }

    public void setNombreMesero(String nombreMesero) {
        this.nombreMesero = nombreMesero;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public boolean isCobrada() {
        return cobrada;
    }

    public void setCobrada(boolean cobrada) {
        this.cobrada = cobrada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idPedido=" + idPedido + ", mesa=" + mesa + ", nombreMesero=" + nombreMesero + ", fechaHora=" + fechaHora + ", cobrada=" + cobrada + ", estado=" + estado + '}';
    }
}
