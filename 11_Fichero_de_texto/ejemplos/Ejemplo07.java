import java.io.File;

public class Ejemplo07 {
  public static void main(String[] args) {
    System.out.println("Introduce el nombre del archivo que desea borrar: ");
    String nombreFichero = System.console().readLine();

    File fichero = new File(nombreFichero);

    if (fichero.exists()) {
      fichero.delete();
      System.out.println("El fichero se ha borrado correctamente.");
    } else {
      System.out.println("El fichero " + nombreFichero + " no existe");
    }
  }

}
