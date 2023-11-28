import java.util.Scanner;

/**
 * T05 Ejercicio 13 Escribe un programa que lea una lista de diez números y determine cuántos
 * son positivos, y cuántos son negativos.
 * 
 * @author Antonio Bravo
 */
public class T05Ejercicio13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

   int positivos = 0;
   int negativos = 0;

   System.out.println("Introduce 10 números entero(positivos o negativos): ");
   for (int i = 0; i < 10; i++) {
    int numeroIntroducido = sc.nextInt();
    if (numeroIntroducido > 0) {
      positivos++;
    } else if (numeroIntroducido < 0) {
      negativos--;
    } else {
      continue;
    }
    
   }
   sc.close();
   System.out.println("Ha introducido " + positivos + " positivos y " + negativos + "");

  }
  
}
