/**
 * Modifica el programa anterior de tal forma que los números que se introducen
  *en el array se generen de forma aleatoria (valores entre 100 y 999).
 */
public class T07Ejercicio03_bidim {
  
  public static void main(String[] args) {
    int[][] tabla = new int[4][5];
    int fila;
    int columna;

    //Rellenar el array
    for (fila = 0; fila < tabla.length; fila++) {
      for (columna = 0; columna < tabla[fila].length; columna++){
        tabla[fila][columna] = (int)(Math.random()*900 + 100);

      }
    }

    //Mostramos el array
    for (fila = 0; fila < tabla.length; fila++) {
      for (columna = 0; columna < tabla[fila].length; columna++){
        System.out.printf("%8d", tabla[fila][columna]);

      }
    }
  }
}
