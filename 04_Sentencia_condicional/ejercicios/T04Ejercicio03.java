import java.util.Scanner;

/**
 * T04 Ejercicio 03: Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.
 * 
 * @author Antonio Bravo
 */
public class T04Ejercicio03 {
  
  /** 
   * @param args
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Dime un número del 1 al 7 y te diré que día de la semana es: ");
    int num = sc.nextInt();


    switch (num) {
      case 1:
      System.out.println("Lunes");
      break;

      case 2:
      System.out.println("Martes");
      break;

      case 3:
      System.out.println("Miércoles");
      break;

      case 4:
      System.out.println("Jueves");
      break;

      case 5:
      System.out.println("Viernes");
      break;

      case 6:
      System.out.println("Sábado");
      break;

      case 7:
      System.out.println("Domingo");

    
      default:
       System.out.println("Debe introducir un número del 1 al 7");
      break;
    }
    sc.close();
  }
}
