import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 * Convertir un fichero en dos ArrayList y estos a fichero de salida: claves.txt/valores.txt
 * 
 * @author Antonio Bravo
 */

public class EjercicioClase3 {
  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new FileReader("ficheros/fruta.txt"));
      BufferedWriter bw1 = new BufferedWriter(new FileWriter("ficheros/clave.txt"));
      BufferedWriter bw2 = new BufferedWriter(new FileWriter("ficheros/valor.txt"));

      ArrayList<String> clave = new ArrayList<String>();
      ArrayList<String> valor = new ArrayList<String>();
      String linea;
      
      while ((linea = br.readLine()) != null) {
        String[] palabras = linea.split("-");
        clave.add(palabras[0]);
        valor.add(palabras[1]);
      }

      for (String string : clave) {
        bw1.write(string);
        bw1.newLine();
      }

      for (String string : valor) {
        bw2.write(string);
        bw2.newLine();
      }

      br.close();
      bw1.close();
      bw2.close();
    } catch (Exception e) {
      System.out.println("Error al leer el archivo: " + e.getMessage());
    }
    
  }

}
