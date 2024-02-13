/**
 * Explica tu codigo
 * 
 *@author Antonio Bravo
 */

public class Ejemplo02 {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        String línea;          //Variable que almacenará cada línea que introduzcamos por teclado

        System.out.println("Introduce un número entero: ");        //Pedimos primer número
        línea = System.console().readLine();

        int num1; 
        num1 = Integer.parseInt(línea);         //Convertimos de String a int

        System.out.println("Introduce un número entero: ");          //Pedimos un segundo número
        línea = System.console().readLine();

        int num2;
        num2 = Integer.parseInt(línea);         //Convertimos de String a int

        System.out.printf("El primer número es: %d\n", num1);
        System.out.printf("El segundo número es: %d\n", num2);

        System.out.println("El doble del número " + num1 + " es " + (num1*2));
        System.out.println(num1 + num2);

        //Parseamos float
        System.out.print("Introduce un número real: ");
        línea = System.console().readLine();
        float numReal = Float.parseFloat(línea);
        System.out.printf("El número real introducido es: %.2f", numReal);


    
        
        
    }
    
}
