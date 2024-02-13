/**
 * TO2 Ejercicio 05: Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
 * convertir deberá estar almacenada en una variable
 * 
 * @author Antonio Bravo
 */

public class T02Ejercicio05 {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        double pesetas = 23;
        int euros = (int) (pesetas * 166.386);

        System.out.println(euros);
        
    }
    
}
