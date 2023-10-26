
package Entidades;

public class PedidoProducto {
    private int idPedidoProducto;
    private Pedido pedido;
    private Producto producto;
    private int cantidad;
    private Double importe;
    private Boolean estado;

    public PedidoProducto() {
    }

    public PedidoProducto(int idPedidoProducto, Pedido pedido, Producto producto, int cantidad, Double importe, Boolean estado) {
        this.idPedidoProducto = idPedidoProducto;
        this.pedido = pedido;
        this.producto = producto;
        this.cantidad = cantidad;
        this.importe = importe;
        this.estado = estado;
    }

    public PedidoProducto(Pedido pedido, Producto producto, int cantidad, Double importe, Boolean estado) {
        this.pedido = pedido;
        this.producto = producto;
        this.cantidad = cantidad;
        this.importe = importe;
        this.estado = estado;
    }

    public int getIdPedidoProducto() {
        return idPedidoProducto;
    }

    public void setIdPedidoProducto(int idPedidoProducto) {
        this.idPedidoProducto = idPedidoProducto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "PedidoProducto{" + "idPedidoProducto=" + idPedidoProducto + ", pedido=" + pedido + ", producto=" + producto + ", cantidad=" + cantidad + ", importe=" + importe + ", estado=" + estado + '}';
    }
}