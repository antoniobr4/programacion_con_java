import java.util.Scanner;

/**
 * T05 Ejercicio 10 Escribe un programa que calcule la media de un conjunto de números positivos
 * introducidos por teclado. A priori, el programa no sabe cuántos números se
 * introducirán. El usuario indicará que ha terminado de introducir los datos
 * cuando meta un número negativo.
 * 
 * @author Antonio Bravo
 */
public class T05Ejercicio10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double numeroIntroducido = 0;
    int cantidadPositivos = 0;
    double media = 0;
    double suma = 0;

    sc.close();

    System.out.println("Este programa calcula la media de los numeors positivos introducidos.");
    System.out.println("Para parar, introduzca un numero negativo.");
    System.out.println("Introduce numeros y pulse INTRO: ");

    while (numeroIntroducido >= 0) {
      numeroIntroducido = Double.parseDouble(System.console().readLine());
      if (numeroIntroducido > 0) {
        suma += numeroIntroducido;
        cantidadPositivos++;
        
      }
      
    }
    media = suma / cantidadPositivos;
    System.out.printf("La media de los %d numeros positivos introducido es: %.2f", cantidadPositivos,media);

    

  }
  
}
