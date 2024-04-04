import java.util.ArrayList;
import java.util.HashMap;

/**
 * Realiza una nueva versión del ejercicio anterior con las siguientes mejoras: Si
 * algún producto se repite en diferentes líneas, se deben agrupar en una sola.
 * Por ejemplo, si se pide primero 1 bote de tomate y luego 3 botes de tomate, en
 * el extracto se debe mostrar que se han pedido 4 botes de tomate. Después de
 * teclear “fin”, el programa pide un código de descuento. Si el usuario introduce
 * el código “ECODTO”, se aplica un 10% de descuento en la compra.
 * 
 * @author Antonio Bravo
 */

public class T10Ejercicio15 {
  public static void main(String[] args) {
    HashMap<String, Double> productos = new HashMap<String, Double>();
    productos.put("avena", 2.21);
    productos.put("garbanzos", 2.39);
    productos.put("tomate", 1.59);
    productos.put("jenginre", 3.13);
    productos.put("quinoa", 4.50);
    productos.put("guisantes", 1.60);

    ArrayList<String> listadoProductos = new ArrayList<String>();
    ArrayList<Integer> listadoCantidades = new ArrayList<Integer>();
    boolean continuar = true;
    String productoIntroducido;
    int cantidadIntroducida;
    double total = 0;
    boolean hayDescuento = false;
    double descuento = 0;
    
    do {
      System.out.print("Producto: ");
      productoIntroducido = System.console().readLine();
      if (!productoIntroducido.equalsIgnoreCase("fin")) {
        System.out.print("Cantidad: ");
        cantidadIntroducida = Integer.parseInt(System.console().readLine());

        //Compruebo si el producto ya está entre el pedido
       if (listadoProductos.contains(productoIntroducido)) {
        int posicionProducto = listadoProductos.indexOf(productoIntroducido);
        listadoCantidades.set(posicionProducto, listadoCantidades.get(posicionProducto) + cantidadIntroducida );
       } else {
        listadoProductos.add(productoIntroducido);
        listadoCantidades.add(cantidadIntroducida);
       }

      } else {
        continuar = false;
        System.out.print("Introduzca código de descuento (INTRO si no tiene ninguno): ");
        String respuesta = System.console().readLine();
        if (respuesta.equals("ECODTO")) {
          hayDescuento = true;
        }
      }
    } while (continuar);
    
    System.out.println("Producto Precio Cantidad Subtotal");
    System.out.println("---------------------------------");

    for (int i = 0; i < listadoProductos.size(); i++) {
      String producto = listadoProductos.get(i);
      double precio = productos.get(producto);
      int cantidad = listadoCantidades.get(i);
      double subtotal = precio * cantidad;
      total += subtotal;
      System.out.printf("%-8s %5.2f %5d %10.2f\n", producto, precio, cantidad, subtotal);
    }

    if (hayDescuento) {
      descuento = total / 10.0;
      total *= 0.9;
    }

    System.out.println("---------------------------------");
    System.out.println("Descuento: %7.2f€\n " + descuento);
    System.out.println("---------------------------------");
    System.out.printf("TOTAL: %7.2f€" , total);
  }

}