import java.util.ArrayList;
import java.util.Collections;

/**
 * ArrayList de objetos:
 * ordenación de una lista de objetos de la clase Gato por el atributo nombre.
 * 
 * @author Antonio Bravo
 */

public class EjemploArrayList8_1 {
  public static void main(String[] args) {
     ArrayList<Gato> g = new ArrayList<Gato>();

    g.add(new Gato("Garfield", "naranja", "mestizo"));
    g.add(new Gato("Pepe", "gris", "angora"));
    g.add(new Gato("Mauri", "blanco", "manx"));
    g.add(new Gato("Ulises", "marrón", "persa"));
    g.add(new Gato("Adán", "negro", "angora"));

    Collections.sort(g);

    System.out.println("\nDatos de los gatos ordenados por nombre:");

    for (Gato gatoAux: g) {
      System.out.println(gatoAux+"\n");
    }
  }
}
