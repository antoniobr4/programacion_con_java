import java.util.Scanner;

/**
 * T05 Ejercicio 07 Realiza el control de acceso a una caja fuerte. La combinación será un
 * número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
 * y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 * 
 * @author Antonio Bravo
 */
public class T05Ejercicio07 {
  
  /** 
   * @param args
   */
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int numeroIntroducido ;
    int combinacion = 3333;
    int intentos = 4;
    boolean acertado = false;
    
    sc.close();


    do {
      System.out.println("Introduce 4 números para intentar abrit la caja fuerte: ");
      numeroIntroducido = sc.nextInt();
      intentos --; 

      if (numeroIntroducido == combinacion) {
        acertado = true;
      } else {
        System.out.println("Incorrecta. Tienes " + intentos + " intentos.");
      }
    } while ((intentos > 0) && (!acertado));
    
  }
  
}
