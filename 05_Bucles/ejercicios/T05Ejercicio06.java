/**
 * T05 Ejercicio 06 Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle
 * do-while.
 * 
 * @author Antonio Bravo
 */
public class T05Ejercicio06 {
  
  /** 
   * @param args
   */
  public static void main(String[] args) {
    int i = 320;

    do {
      System.out.println(i);
      i -= 20;

    } while (i >= 160);
  }
  
}
