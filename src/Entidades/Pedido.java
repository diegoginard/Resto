
package Entidades;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;


public class Pedido {
    private int idPedido;
    private Mesa mesa;
    private String nombreMesero;
    private LocalDate fechaHora;
    private double importe;
    private boolean cobrada;

    public Pedido() {
    }

    public Pedido(Mesa mesa, String nombreMesero, LocalDate fechaHora, double importe, boolean cobrada) {
        this.mesa = mesa;
        this.nombreMesero = nombreMesero;
        this.fechaHora = fechaHora;
        this.importe = importe;
        this.cobrada = cobrada;
    }

    public Pedido(int idPedido, Mesa mesa, String nombreMesero, LocalDate fechaHora, double importe, boolean cobrada) {
        this.idPedido = idPedido;
        this.mesa = mesa;
        this.nombreMesero = nombreMesero;
        this.fechaHora = fechaHora;
        this.importe = importe;
        this.cobrada = cobrada;
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

    public LocalDate getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDate fechaHora) {
        this.fechaHora = fechaHora;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public boolean isCobrada() {
        return cobrada;
    }

    public void setCobrada(boolean cobrada) {
        this.cobrada = cobrada;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idPedido=" + idPedido + ", mesa=" + mesa + ", nombreMesero=" + nombreMesero + ", fechaHora=" + fechaHora + ", importe=" + importe + ", cobrada=" + cobrada + '}';
    }

    
}
