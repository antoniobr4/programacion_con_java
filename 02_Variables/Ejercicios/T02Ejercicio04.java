/**
 * T02 Ejercicio 04: Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
 * convertir deberá estar almacenada en una variable.
 * 
 * @author Antonio Bravo
 */

public class T02Ejercicio04 {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        double euros = 45;
        int pesetas = (int) (euros * 166.386);

        System.out.println(pesetas);

    }
    
}
