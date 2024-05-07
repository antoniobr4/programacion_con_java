import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

/**
 * Convertir un fichero a HasMap. Sacarlo por pantalla
 * 
 * @author Antonio Bravo
 */

public class EjercicioClase2 {
  public static void main(String[] args) {
    
    try {
      HashMap<String, String> diccionario = new HashMap<>();
      BufferedReader br = new BufferedReader(new FileReader("./ficheros/Lineas.txt"));
      String linea = br.readLine();
     
      while ((linea = br.readLine()) != null) {
        String [] palabras =  linea.split(" - ");
        diccionario.put(palabras[0], palabras[1]);
      }

      for (String pantalla : diccionario.keySet()) {
        String valor = diccionario.get(pantalla);
        System.out.println("Lave: " + pantalla + " - Valor: " + valor);
      }


      
      br.close();

    } catch (Exception e) {
      System.out.println("Error al leer el archivo. " + e.getMessage());
      
    }
  }

}
