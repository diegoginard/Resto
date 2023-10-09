
package resto;

import BaseDatos.MesaData;
import BaseDatos.PedidoData;
import BaseDatos.ProductoData;
import Entidades.Mesa;
import Entidades.Pedido;
import Entidades.Producto;
import java.sql.Date;


public class Resto {

    public static void main(String[] args) {
//       ProductoData pd = new ProductoData();
       
//       Producto pro = new Producto("tacos" , 2800.000 ,5, true);
//       System.out.println(pd.listarProductos()); //Funciona
//       pd.guardarProducto(pro);  //Funciona
//       pd.ModificarProducto(pro); //Funciona
//       pd.eliminarProducto(5);  //Funciona
//       MesaData md = new MesaData();
//       System.out.println(md.listarMesas());
//       Mesa mesa= new Mesa(1,"",4);
//       md.crearMesa(mesa);  //Funciona
//       md.eliminarMesa(4);  //Funciona
//       Mesa mesa= new Mesa(1,1,"Ocupado",6);
//       md.modificarMesa(mesa);  //Funciona
PedidoData pd = new PedidoData();
Pedido pedido = new Pedido(1,"Carlos",new Date(),5000.00,true);
pd.guardarPedido(pedido);

        }

    }

