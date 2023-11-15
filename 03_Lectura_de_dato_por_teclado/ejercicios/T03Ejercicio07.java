import java.util.Scanner;

/**
 * 
 * 
 * @author Antonio Bravo
 */

public class T03Ejercicio07 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    double baseImponible = sc.nextDouble();

    System.out.print("Por favor introduzca la base imponible (precio del astículo sin IVA): ");

    System.out.printf("\nBase imponible %8.2f €\n", baseImponible);

    sc.close();
  }
  
}
