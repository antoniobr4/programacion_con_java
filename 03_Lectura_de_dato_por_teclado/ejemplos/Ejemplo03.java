import java.util.Scanner;

/**
 * Lectura de datos desde teclado usando la clase Scanner
 * 
 * @author Antonio Bravo
 */
public class Ejemplo03 {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1252");   //Creamos un objeto de la clase Scanner, llamada sc

        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();   //Guardamos en la variable nombre lo que introducimos por teclado

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();     //Guaradamos en la variable edad lo que introducimos por teclado

        System.out.println("Tu nombre es " + nombre + " y tienes " + edad + " años");
        sc.close();
    }
    
}
