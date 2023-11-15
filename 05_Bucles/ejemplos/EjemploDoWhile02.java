/**
 * Programa que lee numeros de teclado mientras el numero introducido sesa por 
 * 
 * @author Antonio Bravo
 */
public class EjemploDoWhile02 {
  public static void main(String[] args) {
    int numero = 0;
    do {
      System.out.print("Introduce un número par: ");
      numero = Integer.parseInt(System.console().readLine());
      if (numero % 2 == 0) {
      System.out.println("Ay qué bonit es el numero par " + numero);
    } else {
      System.out.println("No me gustan los impares. Adiós");
    }
    } while (numero % 2 == 0);
  }
  
}
