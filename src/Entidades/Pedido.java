
package Entidades;

import java.time.*;

public class Pedido {
    private int idPedido;
    private Mesa mesa;
    private Mozo mozo;
    private LocalDateTime fechaHora;
    private boolean cobrada;
    private double Importe;
    private String estado;

    public Pedido() {
    }

    public Pedido(Mesa mesa, Mozo mozo) {
        this.mesa = mesa;
        this.mozo = mozo;
    }

    public Pedido(Mesa mesa, Mozo mozo, boolean cobrada, double Importe, String estado) {
        this.mesa = mesa;
        this.mozo = mozo;
        this.cobrada = cobrada;
        this.Importe = Importe;
        this.estado = estado;
    }

    public Pedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Pedido(Mesa mesa, Mozo mozo, LocalDateTime fechaHora, boolean cobrada, double Importe, String estado) {
        this.mesa = mesa;
        this.mozo = mozo;
        this.fechaHora = fechaHora;
        this.cobrada = cobrada;
        this.Importe = Importe;
        this.estado = estado;
    }

    public Pedido(int idPedido, Mesa mesa, Mozo mozo, LocalDateTime fechaHora, boolean cobrada, double Importe, String estado) {
        this.idPedido = idPedido;
        this.mesa = mesa;
        this.mozo = mozo;
        this.fechaHora = fechaHora;
        this.cobrada = cobrada;
        this.Importe = Importe;
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

    public Mozo getMozo() {
        return mozo;
    }

    public void setMozo(Mozo mozo) {
        this.mozo = mozo;
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

    public double getImporte() {
        return Importe;
    }

    public void setImporte(double Importe) {
        this.Importe = Importe;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idPedido=" + idPedido + ", mesa=" + mesa + ", nombreMesero=" + mozo + ", fechaHora=" + fechaHora + ", cobrada=" + cobrada + ", Importe=" + Importe + ", estado=" + estado + '}';
    }

}