import java.io.File;

/**
 * Ejemplo de uso de la clase File
 * 
 * @author Antonio Bravo
 */

public class Ejemplo06 {
  public static void main(String[] args) {
    // se inicia  la ruta entre comillas (el . respresenta el directorio actual)
    File f = new File(".");

    // recuperamos el contendio del directorio
    String[] listaArchivos = f.list();

    // mostramos el listado
    for (String nombreArchivo : listaArchivos) {
      System.out.println(nombreArchivo);
    }

  }

}
