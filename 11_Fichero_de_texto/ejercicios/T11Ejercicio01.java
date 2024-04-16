import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * Escribe un programa que guarde en un fichero con nombre primos.dat los
 * números primos que hay entre 1 y 500.
 * 
 * @author Antonio Bravo
 */

public class T11Ejercicio01 {

public static boolean esPrimo(int numero) {
  
  for (int i = 2; i < numero; i++) {
    if ((numero % i) == 0) {
      return false;
    }
  }
  return true;
}

  public static void main(String[] args) {
    
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter("ficheros/primos.dat"));

      for (int i = 1; i <= 500; i++) {
        if (esPrimo(i)) {
          bw.write(String.valueOf(i) + "\n");
        }
      }

      bw.close();

    } catch (Exception e) {
      System.out.println("No se ha podido hacer el fichero.");
      System.out.println(e.getMessage());
    }


  }
}
