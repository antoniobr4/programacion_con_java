/**
 * T05 Ejercicio 05 Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando
 * un bucle while.
 * 
 * @author Antonio Bravo
 */
public class T05Ejercicio05 {
  
  /** 
   * @param args
   */
  public static void main(String[] args) {
    int i = 320;

    while (i >= 160) {
      System.out.println(i);
      i -= 20;
    }
  }
  
}
