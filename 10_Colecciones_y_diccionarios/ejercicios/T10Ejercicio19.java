import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

/**
 * Realiza un buscador de sinónimos. Utiliza el diccionario español-inglés que se
 * proporciona a continuación. El programa preguntará una palabra y dará una
 * lista de sinónimos (palabras que tienen el mismo significado). Por ejemplo, si
 * se introduce la palabra “caliente”, el programa dará como resultado: ardiente,
 * candente, abrasador. ¿Cómo sabe el programa cuáles son los sinónimos de
 * “caliente”? Muy fácil, en el diccionario debe existir la entrada (“caliente”,
 * “hot”), por tanto solo tendrá que buscar las palabras en español que también
 * signifiquen “hot”; esta información estará en las entradas (“ardiente”, “hot”) y
 * (“abrasador”, “hot”). Cuando una palabra existe en el diccionario pero no tiene
 * sinónimos, debe mostrar el mensaje “No conozco sinónimos de esa palabra”.
 * Si una palabra no está en el diccionario se mostrará el mensaje “No conozco
 * esa palabra”. El usuario sale del programa escribiendo la palabra “salir”.
 * 
 * @author Antonio Bravo
 */

public class T10Ejercicio19 {

  public static boolean tieneSinonimos (String palabraIntorducida, HashMap<String, String> diccionario) {

    String sinonimo = diccionario.get(palabraIntorducida);

    for (Map.Entry pareja : diccionario.entrySet()) {
      if (pareja.getValue().equals(sinonimo) && !pareja.getKey().equals(palabraIntorducida))
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    
    HashMap<String, String> diccionario = new HashMap<String, String>();
    String palabraIntroducida;
    boolean continuar = true;

    diccionario.put("caliente", "hot");
    diccionario.put("rojo", "red");
    diccionario.put("ardiente", "hot");
    diccionario.put("verde", "green");
    diccionario.put("agujetas", "stiff");
    diccionario.put("abrasador", "hot");
    diccionario.put("hierro", "iron");
    diccionario.put("grande", "big");

    
    
   do {
      System.out.print("\nIntroduzca una palabra y le daré los sinónimos: ");
      palabraIntroducida = System.console().readLine();

      if (palabraIntroducida.equalsIgnoreCase("salir")) {
        continuar = false;
      } else {
        if (!diccionario.containsKey(palabraIntroducida)) {
          System.out.println("No conozco esa palabra");
        } else if (!tieneSinonimos(palabraIntroducida, diccionario))
          System.out.println("No conozco sinónimos de esa palabra");
        else {
          String valorIntroducida = diccionario.get(palabraIntroducida);
          System.out.println("Sinónimos de " + palabraIntroducida + ": ");

          ArrayList<String> sinonimo = new ArrayList<String>();

          for (Map.Entry pareja : diccionario.entrySet()) {
            if (pareja.getValue().equals(palabraIntroducida) && !pareja.getKey().equals(palabraIntroducida)) {
              sinonimo.add((String)pareja.getKey())
            }
          }

          for (int i = 0; i < sinonimo.size(); i++) {
            if (i == sinonimo.size() - 1) {
              System.out.print(sinonimo.get(i) + "\n");
            } else {
              System.out.print(sinonimo.get(i) + "\n");
            }
          }
        
        }

      } while (continuar);
    }

  }
}
