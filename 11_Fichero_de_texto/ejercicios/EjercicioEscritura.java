import java.io.BufferedWriter;
import java.io.FileWriter;

/*
 * Crea un método que reciba el nombre de un archivo y un entero. 
 * El método deberá crear el archivo y escribir tanta líneas 
 * como indique el entero pasado por parámetro. Cada línea deberá tener escrito 
 * "Esta es la línea número n", sustituyendo n por el número de la línea, 
 * empezando por 1. Utiliza un buffer para realizar la escritura de forma 
 * más eficiente. Prueba la función dentro del método main en el mismo archivo.
 * 
 * 
 * 
 */

public class EjercicioEscritura {

  public static void  crearLineas (String nombreArchivo, int n) {
    
   try {
    
    BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo));

    for (int i = 1; i <= n; i++) {
      bw.write("Esta es la línea " + i);
      bw.newLine();
      
    }
    bw.close();

   } catch (Exception e) {
    System.out.println("No se ha podido escribir en el fichero. " + e.getMessage());
   }
  }


  public static void main(String[] args) {
    
    System.out.println("Introduzca el nombre del archivo: ");
    String nombreArchivo = System.console().readLine();

    System.out.println("Introduzca el numero de lineas que contendra el fichero: ");
    int numLineas = Integer.parseInt(System.console().readLine()); 

    crearLineas(nombreArchivo, numLineas);
    
   
  }
}
