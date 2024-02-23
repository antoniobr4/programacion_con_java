import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 * @author Antonio Bravo
 */
public class ProblemaArrayListHashMap {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    HashMap<String, String> p = new HashMap<String, String>();
    
    p.put("Alemmania", "Berlín");
    p.put("Bélgica", "Bruselas");
    p.put("España", "Madrid");
    p.put("Francia", "París");
    p.put("Italia", "Roma");
    p.put("Grecia", "Atenas");
    p.put("Mónaco", "Mónaco");
    p.put("Países Bajos", "Ámsterdam");
    p.put("Portugal", "Lisboa");
    p.put("Reino Unido", "Londres");


    ArrayList<String> respuestaIncorrecta = new ArrayList<String>();
    respuestaIncorrecta.add("Bakú");
    respuestaIncorrecta.add("Zagreb");
    respuestaIncorrecta.add("Tallín");
    respuestaIncorrecta.add("Budapest");
    respuestaIncorrecta.add("Liubliana");
    respuestaIncorrecta.add("Eslovania"); 
    respuestaIncorrecta.add("Chipre");
    respuestaIncorrecta.add("Helsinki");
    respuestaIncorrecta.add("Georgia");
    respuestaIncorrecta.add("Tirana");
    respuestaIncorrecta.add("Estonia");
    respuestaIncorrecta.add("Irlanda");
    respuestaIncorrecta.add("Croacia");
    respuestaIncorrecta.add("Ereván");
    respuestaIncorrecta.add("Sofía");
    respuestaIncorrecta.add("Serbia");
    respuestaIncorrecta.add("Kiev");
    respuestaIncorrecta.add("Berna");
    respuestaIncorrecta.add("Suiza");
    respuestaIncorrecta.add("Rusia");
    respuestaIncorrecta.add("Montenegro");


    Collections.shuffle(respuestaIncorrecta);


    
    for (int i = 0; i < 10; i++) {

      String pais = p.get(i);
      String capitalCorrecta = p.get(i);
      String capitalIncorrecta1 = respuestaIncorrecta.get(i * 2);
      String capitalIncorrecta2 = respuestaIncorrecta.get(i * 2 + 1);

      System.out.println("¿Cuál es la capital de " + pais + "?");
      System.out.println("1. " + capitalCorrecta);
      System.out.println("2. " + capitalIncorrecta1);
      System.out.println("3. " + capitalIncorrecta2);

      int respuesta;
      System.out.println("Respuesta: ");
      respuesta = sc.nextInt();


    }

    int puntos = 0;
    if (puntos >= 5) {
      System.out.println("¡Enhorabuena! ¡Has aprobado! Puntuación: " + puntos);
    } else {
      System.out.println("Lo siento, has suspendido. Puntuación: " + puntos);
    }

    sc.close();
  }
}
