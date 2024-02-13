
/**
 * Clase Profesor, hereda de persona
 * 
 * @author Antonio Bravo
 */
public class Profesor extends Persona {
  
  ///Atributos
  private String departamento;
  private double sueldo;

  ////Constuctores
  public Profesor (String nombre, int edad, String dni, String departamento, double sueldo) {
    super(nombre, edad, dni);
    this.departamento = departamento;
    this.sueldo = sueldo;
  }

  public String getDepartamento() {
    return departamento;
  }

  public double getSueldo() {
    return sueldo;
  }

  @Override
  public String toString() {
    return super.toString() + "[Estudiante] Departamento: " + departamento;
  }


  

}
