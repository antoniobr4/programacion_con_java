/**
 * Clase Estudiante que hereda de la clase Persoma
 * 
 * @author Antonio Bravo
 */
public class Estudiante extends Persona {

  ////Atributos
  private int creditos;


  ////Contructores
  public Estudiante(String nombre, int edad, String dni) {
    super(nombre, edad, dni);
    this.creditos = 60;
  }

  public Estudiante(String nombre, int edad, String dni, int creditos) {
    super(nombre, edad, dni);
    this.creditos = creditos; 
  }

  public int getCreditos() {
    return creditos;
  }

  public void mostrarDatos() {
    super.mostrarDatos();     //LLamo al metodo mostratDatos de la superlase
    System.out.println("Estudiante matriculado de " + creditos + " créditos.");  
  }

  @Override
  public String toString() {
    return super.toString() + "[Estudiante] Creditos: " + creditos;
  }

  

}
