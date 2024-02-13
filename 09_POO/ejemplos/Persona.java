
/**
 * Clase Persona que nos permitira reutilizarla para ver el concepto de herencia en POO
 * 
 * @author Antonio Bravo
 */
public class Persona {

  ////AAtributos
  private String nombre;
  private int edad;
  private String dni;
  

  /////Contructor
  public Persona(String nombre, int edad, String dni) {
    this.nombre = nombre;
    this.edad = edad;
    this.dni = dni; 
  }


  public String getNombre() {
    return nombre;
  }


  public int getEdad() {
    return edad;
  }


  public String getDni() {
    return dni;
  }

  
  public void mostrarDatos() {
    System.out.println("Nombre: " + nombre + "\tEdad: " + edad + "\tdni" + dni);

  }


  @Override
  public String toString() {
    return "Nombre: " + nombre + "\tEdad: " + edad + "\tdni: " + dni;
  }

  
  
  
}
