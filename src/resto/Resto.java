
package resto;

import BaseDatos.ProductoData;
import Entidades.Producto;


public class Resto {

    public static void main(String[] args) {
       ProductoData pd = new ProductoData();
       
       Producto pro = new Producto("milanesa a caballo" , 2800.000 ,5, true);
       
       pd.guardarProducto(pro);
//       pd.ModificarProducto(pro);
    }
    
}
