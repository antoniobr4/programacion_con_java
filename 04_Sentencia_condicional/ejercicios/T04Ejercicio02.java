/**
 * T04 Ejercicio 02: Realiza un programa que pida una hora por teclado y que muestre luego buenos
 * días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
 * 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
 * horas, los minutos no se deben introducir por teclado.
 * 
 * @author Antonio Bravo 
 */

public class T04Ejercici02 {
  public static void main(String[] args) {
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
