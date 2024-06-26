package T10Ejercicio18;

/**
 * Mejora el programa anterior (en otro proyecto diferente) de tal forma que al
 * intentar agregar un elemento al carrito, se compruebe si ya existe el producto
 * y, en tal caso, se incremente el número de unidades sin añadir un nuevo
 * elemento. Observa que en el programa anterior, se repetía el producto “Tarjeta
 * SD 64Gb” dos veces en el carrito. En esta nueva versión ya no sucede esto, si
 * no que se incrementa el número de unidades del producto que se agrega.
 * El contenido del main es idéntico al ejercicio anterior.
 * 
 * @author Antonio Bravo
 */

public class MainCarrito {
  public static void main(String[] args) {
    Carrito miCarrito = new Carrito();
    
    miCarrito.agrega(new Elemento("Tarjeta SD 64Gb", 19.95, 2));
    miCarrito.agrega(new Elemento("Canon EOS 2000D", 449, 1));
    
    System.out.println(miCarrito);
    System.out.print("Hay " + miCarrito.numeroElemento());
    System.out.println(" productos en la cesta.");
    System.out.println("El total asciende a " + String.format("%.2f", miCarrito.importeTotal()) + " euros");
    System.out.println("\nContinúa la compra...\n");
    
    miCarrito.agrega(new Elemento("Samsung Galaxy Tab", 199, 3));
    miCarrito.agrega(new Elemento("Tarjeta SD 64Gb", 19.95, 1));
    
    System.out.println(miCarrito);
    System.out.print("Ahora hay " + miCarrito.numeroElemento());
    System.out.println(" productos en la cesta.");
    System.out.println("El total asciende a " + String.format("%.2f", miCarrito.importeTotal()) + " euros");

  }
}
