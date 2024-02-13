import java.util.Scanner;
public class T04Ejercici02 {
  
  /** 
   * @param args
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Dime que hora es: ");
    int hora = Integer.parseInt(System.console().readLine());

    if ((hora >= 6) && (hora <= 12)) {
      System.out.println("Buenos días!");
    }else if ((hora >= 13) && (hora <= 20)) {
      System.out.println("Buenas tardes!");
    }else if (((hora >= 21) && (hora < 24)) || ((hora >= 0) && (hora <= 5))) {
      System.out.println("Buenas noches!");
    }else {
      System.out.println("La hora introducida no es correcta.");
    }
    
    sc.close();
  }
  
}
