import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Ejemplo 01 de lectura de ficheros
 * 
 * @author Antonio Bravo
 */

 public class Ejemplo01 {
  public static void main(String[] args) {
    try {
      FileReader archivo = new FileReader("C:\\Users\\ajbra\\Desktop\\champions.txt");
      BufferedReader br = new BufferedReader(archivo);
      String linea = "";

      do {

        linea = br.readLine();
        System.out.println(linea);

      } while (linea != null);

      br.close();

    } catch (FileNotFoundException fnfe) {
      System.out.println("No se ha podido encontrar el fichero champions.txt");
      // fnfe.printStackTrace();
    } catch (IOException ioe) {
      System.out.println("Error en la lectura");
      // ioe.printStackTrace();
    }
    
  }

}
