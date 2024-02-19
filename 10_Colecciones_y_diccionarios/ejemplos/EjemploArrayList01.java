import java.util.ArrayList;

/**
 * Ejemplo de uso de la clase ArrayList de String: métodos size, add y get
 * 
 * @author Antonio Bravo
 */

public class EjemploArrayList01 {
  public static void main(String[] args) {
    ArrayList<String> a = new ArrayList<String>();

    System.out.println("Nº de elementos : " + a.size());     //Al principio, no tendra ningun elemento

    //Se añaden 3 elementos
    a.add("rojo");
    a.add("verde");
    a.add("azul");
    
    System.out.println("Nº de elementos: " + a.size());

    a.add("blanco");

    System.out.println("Nº de elementos: " + a.size());


  }
}
