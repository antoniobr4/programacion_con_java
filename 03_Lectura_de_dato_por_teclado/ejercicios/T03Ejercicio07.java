
import java.util.Scanner;

/**
 * TO3 Ejercicio 07: Escribe un programa que calcule el total de una factura a partir de la base
 * imponible.
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