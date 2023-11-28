import java.util.Scanner;

/**
 * T05 Ejercicio 08: Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.
 */
public class T05Ejercicio08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int numIntroducido;

    sc.close();

    System.out.print("Introduce un número para saber su tabla de multiplicar: ");
    numIntroducido = sc.nextInt();

    for (int i = 0; i <= 10; i++) {
     System.out.printf("%2d + %2d = %3d\n", numIntroducido, i, numIntroducido * i); 
    }

  }
  
}
