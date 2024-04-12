import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Ejemplo de lectura de ficheros con numeros
 * Calcula la media de los numeros que se encuentran en un fichero de texto
 * 
 * @author Antonio Bravo
 */

 public class Argumentos03 {
  public static void main(String[] args) {

    if (args.length != 1) {
      System.out.println("Este programa calcula la media de los numeros contenidos en un fichero.");
      System.out.println("Uso del programa: java Argumentos03 FICHERO");
      System.exit(0);
    }

    try {
      FileReader archivo = new FileReader(args[0]);
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
