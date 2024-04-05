package T10Ejercicio17;

import java.util.ArrayList;

public class Carrito {

  private ArrayList<Elemento> cesta = new ArrayList<Elemento>();

  public void agrega(Elemento e) {
    cesta.add(e);

  }

  public int numeroElemento() {
    return cesta.size();
  }

  public double importeTotal() {
    double total = 0;

    for (Elemento elemento : cesta) {
      total += elemento.getCantidad() * elemento.getPrecio();
    }

    return total;
  }

  @Override 
  public String toString() {
    String respuesta;
    respuesta = "Contenido del carrito\n"
               + "=====================\n";
    for (Elemento elemento : cesta) {
      respuesta += elemento + "\n";
    }
    return respuesta;
  }
}
