/**
 * Ejemplo primera lectura de datos por teclado
 * 
 * @author Antonio Bravo
 */

 public class Ejemplo01 {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        String nombre;
        System.out.println("Dime como te llamas: ");
        nombre = System.console().readLine();

        System.out.println("¡Hola " + nombre + " ¡Bienvenid@ a progamación");

        
    }
 }