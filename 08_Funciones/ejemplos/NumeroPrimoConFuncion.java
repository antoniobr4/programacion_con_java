/**
 * @author Antonio Bravo
 */
public class NumeroPrimoConFuncion {

  
  /** 
   * @param x
   * @return boolean
   */
  ///Funciones definidas por el usuario
  public static boolean esPrimo(int x){
    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    System.out.println("Introduce un numero entero positivo: ");
    int n = Integer.parseInt(System.console().readLine());

    if (esPrimo(n)) {
      System.out.println("El numer " + n + " es primo");
    } else {
      System.out.println("El numero " + n + " no es primo");
    }
  }

}
