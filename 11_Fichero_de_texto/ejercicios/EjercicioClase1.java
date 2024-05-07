import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 1. Convertir de un fichero a ArrayList y sacarlo por pantalla.
 * 
 * @author Antonio Bravo
 */

public class EjercicioClase1 {
  public static void main(String[] args) {
    

    try {
      BufferedReader br = new BufferedReader(new FileReader("ficheros/fruta.txt"));
      ArrayList<String> mostrar = new ArrayList<String>();

      String linea = br.readLine();

      while (linea != null) {
        mostrar.add(linea);
        linea = br.readLine();
      }

      for (String string : mostrar) {
        System.out.println(string);
      }


      br.close();
        
    } catch (IOException e) {
      e.printStackTrace();
    }

  
  }
}


