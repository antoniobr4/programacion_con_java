import java.util.HashMap;
import java.util.Map;

/**
 * Amplía el programa anterior de tal forma que sea capaz de aprender palabras y
sinónimos. Cuando una palabra no tiene sinónimos, es decir, cuando aparece la
palabra en español con su traducción y esa traducción no la tiene ninguna otra
palabra española, se le preguntará al usuario si quiere añadir uno (un sinónimo)
y, en caso afirmativo, se pedirá la palabra y se añadirá al diccionario. Se puede
dar la circunstancia de que el usuario introduzca una palabra en español que
no está en el diccionario; en tal caso, se mostrará el consiguiente mensaje y
se dará la posibilidad al usuario de añadir la entrada correspondiente en el
diccionario pidiendo, claro está, la palabra en inglés.

@author Antonio Bravo
 */


 public class T10Ejercicio20 {
  public static void main(String[] args) {
    
    HashMap<String, String> diccionario = new HashMap<String, String>();
    String palabraIntroducida;

    diccionario.put("caliente", "hot");
    diccionario.put("rojo", "red");
    diccionario.put("ardiente", "hot");
    diccionario.put("verde", "green");
    diccionario.put("agujetas", "stiff");
    diccionario.put("abrasador", "hot");
    diccionario.put("hierro", "iron");
    diccionario.put("grande", "big");

    do {
    System.out.print("Introduzca una palabra y le daré los sinónimos: ");
    palabraIntroducida = System.console().readLine();
    String valor = diccionario.get(palabraIntroducida);

    for (Map.Entry pareja : diccionario.entrySet() ) {
      if (pareja.getValue().equals(valor) && !pareja.getKey().equals(palabraIntroducida)) {  
        System.out.println("Los sinónimos de " + palabraIntroducida + " son: ");
        System.out.print(pareja.getKey() + ", ");
      } else {

        System.out.print("No conozco esa palabra");
      }

    }
  }
  
}
