import java.util.ArrayList;
import java.util.HashMap;

import T10Ejercicio09.Carta;

/**
 * Escribe un programa que genere una secuencia de 5 cartas de la baraja
 * española y que sume los puntos según el juego de la brisca. El valor de las
 * cartas se debe guardar en una estructura HashMap que debe contener parejas
 * (figura, valor), por ejemplo (“caballo”, 3). La secuencia de cartas debe ser una
 * estructura de la clase ArrayList que contiene objetos de la clase Carta. El valor
 * de las cartas es el siguiente: as → 11, tres → 10, sota → 2, caballo → 3, rey → 4;
 * el resto de cartas no vale nada.
 * 
 * @author Antonio Bravo
 */

public class T10Ejercicio12 {
  public static void main(String[] args) {
    ArrayList<Carta> mano = new ArrayList<Carta>();
    HashMap<String, Integer> parejas = new HashMap<String, Integer>();
    int puntos = 0;

    parejas.put("AS", 11);
    parejas.put("3", 10);
    parejas.put("Rey", 4);
    parejas.put("Caballo", 3);
    parejas.put("Sota", 2);

    Carta c = new Carta();
    mano.add(c);

    for (int i = 0; i < 5; i++) {
      do {
        c = new Carta();
      } while (mano.contains(c));
      mano.add(c);
    }
    
    for (Carta carta : mano) {
      System.out.println(carta);
      if (parejas.containsKey(carta.getValor())) {
        puntos = puntos + parejas.get(carta.getValor());
      }
    }

    System.out.println("Puntos: " + puntos);
  }

}
