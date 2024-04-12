import java.io.File;

/**
 * Uso de la clase File. Listar archivos de una carpeta, indicando el tamaño de bytes
 * Uso de las funciones isDirectory(), listFiles(), isFile(), getName(), length
 * 
 * @author Antonio Bravo
 */

public class Ejemplo08 {

  public static void listarArchivos(String rutaCarpeta) {
    File carpeta = new File(rutaCarpeta);

   if (carpeta.isFile()) {
    if (carpeta.isDirectory()) {
      File[] lista = carpeta.listFiles();
      for (File f : lista) {
        if (f.isFile()) {
          System.out.println(f.getName() + "\t Tamaño: " + f.length() + " B");
        }
      }
    } else {
      System.out.println("El fichero " + rutaCarpeta + " no es una carpeta.");
    }
   } else {
    System.out.println("La carpeta no existe.");
   }
  }

  public static void main(String[] args) {
    String ruta = "ficheros";   // aqui pongo el nombre del fichero que quiero ver
    listarArchivos(ruta);
  }

}
