/**
 * T05 Ejercicio 02 Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
 * 
 * @author Antonio Bravo
 */
public class T05Ejercicio02 {
  
  /** 
   * @param args
   */
  public static void main(String[] args) {
    int i = 0;
    
   while (i <= 100) {
      System.out.println(i);
      i += 5;     //La formula de i += 5 es igual a i = i + 5
    }
  }
  
}
