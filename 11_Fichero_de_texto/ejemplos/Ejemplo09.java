import java.io.File;

/**
 * Clase File. Método que lista todos los archivos de una carpeta 
 * y sus subcarpetas
 * 
 * @author Antonio Bravo
 */

public class Ejemplo09 {

  public static void listarArchivos(String rutaCarpeta) {
    File carpeta = new File(rutaCarpeta);

    if (carpeta.isDirectory()) {
      File[] lista = carpeta.listFiles();
      for (File f : lista) {
        if (f.isFile()) System.out.println(f.getPath());
        else if(f.isDirectory()) listarArchivos(f.getName());   // recursividad: una funcion se llama a sí misma
      }
    }
  }


  public static void main(String[] args) {
    String ruta = ".";
    listarArchivos(ruta);
  }

}
