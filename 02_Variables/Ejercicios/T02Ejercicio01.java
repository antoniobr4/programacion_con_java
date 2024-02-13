/**
 * T02 Ejercicio 01: Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
 * los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
 * el valor de cada variable, la suma, la resta, la división y la multiplicación.
 * 
 * @author Antonio Bravo
 */

public class T02Ejercicio01 {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        int x = 144;
        int y = 999;

        System.out.println("Los valores de la variable son x = " + x + " y = " + y);
        System.out.println("La suma de las variables " + x + " + " + y + " es = "+ x+y);
        System.out.println("La resta de las variables " + x + " - " + y + " es = " + (x-y));
        System.out.println("La múltiplicación de la variables " + x + " x " + y + " es = " + (x*y));
        System.out.println("la división de las variables " + x + " / " + y + " es = " + ((double) x / (double) y ));
    }
     
}
