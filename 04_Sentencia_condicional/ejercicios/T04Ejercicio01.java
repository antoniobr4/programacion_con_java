import java.util.Scanner;
public class T04Ejercicio01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Dime un día de la semana (lunes a viernes) y te diré que asignatura tienes a primera hora: ");
    String dia = sc.nextLine();

    switch (dia) {
      case "lunes":
      System.out.println("FOL");
      break;
    
      case "martes":
      System.out.println("PROGR");
      break;
      
      case " miércoles":
      System.out.println("Entornos de desarrollo");
      break;
      
      case "jueves":
      System.out.println("Base de datos");
      break;
      case "viernes":
      System.out.println("PORGR");
      break;
    
      default:
        break;
    }


    sc.close();
  }
  
}
