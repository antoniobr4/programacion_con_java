/**
 * T05 Ejercicio 20 Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
 * 
 * @author Antonio Bravo
 */
public class T05Ejerciio20 {
  public static void main(String[] args) {
    System.out.println("Introduce el carácter para realizar una pirámide: ");
    String caracter = System.console().readLine();

    System.out.print("Introduce la altura de la pirámide: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());

    int nivel = 1;   // Variable que controla el nivel
    int espaciosPorDelante = alturaIntroducida - 1;
    int espaciosPorDentro = 0;

    //Pintamos toda la pirámide excepto la base
    while (nivel < alturaIntroducida) {

      //Pintamos los espacios por delante
      for (int i = 1; i <= espaciosPorDelante; i++) {
        System.out.print(" ");
      }

      //Pintamos el caracter
      System.out.print(caracter);

      //Pintamos los espacios por dentro
      for (int i = 1; i < espaciosPorDentro; i++) {
        System.out.print(" ");
      }

      //Pintamos el segundo caracter de relleno, excepto el nivel 1
      if (nivel > 1) {
        System.out.print(caracter);
      }

      nivel++;   //Aumentamos nivel
      espaciosPorDelante--;    //En cada nivel pintamos un espacio por delante menos
      espaciosPorDentro +=2;    //En cada nivel se pinta 2 huecos más
    }

    //Base de la pirámide
    for (int i = 1; i < alturaIntroducida * 2; i++) {
      System.out.print(caracter);
    }
  }
  
}
