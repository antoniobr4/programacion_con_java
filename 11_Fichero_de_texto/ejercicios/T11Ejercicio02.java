import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Realiza un programa que lea el fichero creado en el ejercicio anterior 
 * y que muestre los números por pantalla.
 * 
 * @author Antonio Bravo
 */

public class T11Ejercicio02 {
  public static void main(String[] args) {

    try {
      BufferedReader br = new BufferedReader(new FileReader("ficheros/primos.dat"));
      String linea = "";

      while ((linea = br.readLine()) != null) {
        System.out.println(linea);
      }

      br.close();
      
    } catch (Exception e) {
      System.out.println("No se ha podido escribir ");
      System.out.println(e.getMessage());
      
    }
  }
}
