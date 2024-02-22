import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap02 {
  public static void main(String[] args) {
    
    HashMap<Integer, String> m = new HashMap<>();
    

    m.put(924, "Amalia Nuñez");
    m.put(921, "Cindy Nero");
    m.put(700, "César Vázquez");
    m.put(537, "Alan Brito");
    m.put(605, "Esteban Quito");

    System.out.println("Los elemento de m utilizando entrySet son: \n" + m.entrySet());
    System.out.println("\nEntradA del diccionario extraídas una a una:");

    // for (Map.Entry pareja : m.entrySet()) {
    //   System.out.println(pareja);
    // }

      for (int key : m.keySet()) {
        System.out.println(key + " = " + m.get(key));
      }


  }
}
