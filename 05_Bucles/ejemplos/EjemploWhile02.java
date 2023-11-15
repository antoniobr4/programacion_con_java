import java.util.Scanner;

/**
 * Contador de numeros positivos introducidos por teclado
 *
 * @author Antonio Bravo
 */
public class EjemploWhile02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numeorIntroducido = 0;   // Variable que controla la salida del bucle
    int cuentaNumeros = 0;    // Variable contadora de numeros positivos introducidos
    int suma = 0;            // Variable acumuladora dem los numeros positivos introducidos

    System.out.println("Por favor, introduce numeros positivos");
    System.out.print("El programa finalizará cuando se introduzca un número negativo. ");

    while (numeorIntroducido >= 0) {
      System.out.println("Número: ");
      numeorIntroducido = sc.nextInt();
      if (numeorIntroducido > 0) {
        cuentaNumeros++;
        suma += numeorIntroducido;            // suma = suma + numeroIntroducido
      }
    }
    
    System.out.println("La cantidad de números positivos introducidos es " + cuentaNumeros);
    System.out.println("La suma total de ellos es " + (suma));
    sc.close();

  }
  
}
