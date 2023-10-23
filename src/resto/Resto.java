
package resto;

import BaseDatos.MesaData;
import BaseDatos.PedidoData;
import BaseDatos.ProductoData;
import Entidades.Mesa;
import Entidades.Pedido;
import Entidades.Producto;
import java.time.LocalDateTime;


public class Resto {

    public static void main(String[] args) {

//       ProductoData pd = new ProductoData();
//       Producto pro = new Producto(5,"empanadas salteñas" , 4000.000 ,5, true);
//       System.out.println(pd.listarProductos()); //Funciona
//       pd.guardarProducto(pro);  //Funciona
//       pd.ModificarProducto(pro); //Funciona
//       pd.eliminarProducto(5);  //Funciona
//       MesaData md = new MesaData();
//       System.out.println(md.listarMesas()); //Funciona
//       Mesa mesa= new Mesa(2,2,"LIBRE",6,true);
//       md.crearMesa(mesa);  //Funciona
//       md.eliminarMesa(4);  //Funciona
//       Mesa mesa = new Mesa(1, "Ocupado", 6);
//       md.modificarMesa(mesa);  //Funciona
//       Pedido p1 = new Pedido(mesa, "Carlos",
//            LocalDateTime.of(2023, 10, 10, 11, 00),
//            5000, true, "entregado");
       PedidoData ped = new PedidoData();
//       ped.guardarPedido(p1); //Funciona
//       pd.eliminarPedido(4);
//       System.out.println(pd.BuscarProductos("H")); //Funciona
//        System.out.println(pd.listarProdCateg(1)); //Funciona
        System.out.println(ped.listarPedidos());
    }
}
