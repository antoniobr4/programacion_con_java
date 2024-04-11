import java.io.BufferedWriter;
import java.io.FileWriter;

public class Ejemplo03 {
  public static void main(String[] args) {
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter("ficheros/fruta.txt"));
      
      bw.write("naranja");
      bw.newLine();
      bw.write("mango");
      bw.newLine();
      bw.write("níspero\n");

      bw.close();

    } catch (Exception e) {
      System.out.println("No se ha podido escrbir en el fichero. " + e.getMessage());

    }
  }

}
