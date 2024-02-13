import matematicas.varias;
import matematicas.volumen;

public class PruebaFunciones {
  
  /** 
   * @param args
   */
  public static void main(String[] args) {
    int n;

    //Probamos la funcion esPrimo(), alojada en la clase varias denntro del paquete matematicas
    System.out.println("Introduce un numero entero positivo: ");
    n = Integer.parseInt(System.console().readLine());

    if ((varias.esPrimo(n))) {
      System.out.println("El numer " + n + " es primo");
    } else {
      System.out.println("El numero " + n + " no es primo");
    }



    //Prueba digitos(), alojada en la clase varias del paquete matematicas
    System.out.println("Introduce un numero entero positivo: ");
    n = Integer.parseInt(System.console().readLine());

    int numDigitos = varias.digitos(n);
    System.out.println(n + " tiene " + numDigitos + " digitos");

    double r;
    double h;
    System.out.println("Introduzca el radio del cilindro: ");
    r = Double.parseDouble(System.console().readLine());
    System.out.println("Introduzca el altura del cilindro: ");
    h = Double.parseDouble(System.console().readLine());

    System.out.println("El volumen del cilindro es "+ volumen.volumenCilindro(r, h) + "u^3");

    System.out.println("Introduzca un número para voltear: ");
    long x = Long.parseLong(System.console().readLine());
    System.out.println("El numero " + x + " volteado es: " + varias.voltea(x));
  }

}
