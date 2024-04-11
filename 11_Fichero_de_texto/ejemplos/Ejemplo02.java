import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Ejemplo 02 de lectura de ficheros
 * 
 * @author Antonio Bravo
 */

 public class Ejemplo02 {
  public static void main(String[] args) {
    try {
      FileReader archivo = new FileReader("numeros.txt");
      BufferedReader br = new BufferedReader(archivo);
      String linea = "0";
      int numLineas = -1;   //Empezamos en -1 porque va a contar la ultima fila (null)
      double suma = 0;

      do {

        suma = suma + Double.parseDouble(linea);    //suma += Double....
        linea = br.readLine();
        System.out.println(linea);
        numLineas++;

      } while (linea != null);
      System.out.println("SUMA: " + suma);
      System.out.printf("MEDIA: %.2f " + (suma /numLineas));

      br.close();

    } catch (FileNotFoundException fnfe) {
      System.out.println("No se ha podido encontrar el fichero numeros.txt");
      System.out.println(fnfe.getMessage());
      // fnfe.printStackTrace();
    } catch (IOException ioe) {
      System.out.println("Error en la lectura");
      System.out.println(ioe.getMessage());
      // ioe.printStackTrace();
    }
    
  }

}
