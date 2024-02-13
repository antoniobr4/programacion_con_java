import java.util.Scanner;

/**
 * Lectura de datos desde teclado usando la clase Scanner
 * 
 * @author Antonio Bravo
 */

public class Ejemplo05 {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.print("Introduce 3 números (pueden contener decimales) separados por espacio: ");
       
        double x1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double x3 = sc.nextDouble();

        double media = (x1 + x2 + x3) / 3;

        System.out.println("La media de esos tres números es " + media);

        sc.close();

        
    }
    
}
