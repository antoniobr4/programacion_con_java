/**
 * Salida formateada utilizando distintos flags
 * 
 * @author Antonio Bravo
 */
public class SalidaFormateada02 {
    
    /** 
     * @param args
     */
    public static void main (String[] args) {
        System.out.printf("%8d\n", 100);
        System.out.printf("%08d\n", 100);
        System.out.printf("%+d\n", 100);
        System.out.printf("%-8d\n", 100);
        
    }

    
}
