/**
 * Clase de ejemplo coche
 * @author Antonio Bravo
*/

public class coche {

  //Atributos
  String matricula;
  String marca;
  String modelo;
  int puertas;
  String color;
  int potencia;

  public static void main(String[] args) {
    coche miCoche = new coche();    //Coche 1
    coche tuCoche = new coche();    //Coche 2


    miCoche.matricula = "1234ABC";
    System.out.println("Matrícula del coche 1: " + miCoche.matricula);
    System.out.println("Potencia del coche 1: " + miCoche.potencia);
    System.out.println("Matrícula del coche 2: " + tuCoche.matricula);
    System.out.println("Potencia del coche 2: " + tuCoche.potencia);
  }

}