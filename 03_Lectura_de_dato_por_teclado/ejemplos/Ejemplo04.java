import java.util.Scanner;

/**
 * Lectura de datos por teclado usando
 * 
 * @author Antonio Bravo
 */

public class Ejemplo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    //Creamos un objeto de la clase Scanner, llamada sc

        System.out.println("Introduzca tu nombre y tu edad (sepaarados por un espacio):");
        String nombre = sc.next();
        String apellido1 = sc.next();
        String apellido2 = sc.next();
        int edad = sc.nextInt();

        System.out.println("Tu nombre es " + nombre);
        System.out.println("Apellido 1: " + apellido1);
        System.out.println("Apellido2: " + apellido2);
        System.err.println("Edad: " + edad);

        sc.close();    //Para evitar el warning, cerramos el sc



        
    }
    
}
