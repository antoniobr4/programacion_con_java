import java.util.HashMap;

public class EjemploHashMap01 {
  public static void main(String[] args) {
    
    HashMap<Integer, String> m = new HashMap<>();
    int clave;

    m.put(924, "Amalia Nuñez");
    m.put(921, "Cindy Nero");
    m.put(700, "César Vázquez");
    m.put(537, "Alan Brito");
    m.put(605, "Esteban Quito");
    
    System.out.println("Introduce la clave: ");
    clave = Integer.parseInt(System.console().readLine());
    System.out.println("Su valor es: " + m.get(clave));
  }
} 
