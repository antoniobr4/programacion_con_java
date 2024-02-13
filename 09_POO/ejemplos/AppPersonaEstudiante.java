/**
 * Clase que contendra el metodo main para probar la herencia
 * 
 * @author Antoino Bravo
 */
public class AppPersonaEstudiante {
  public static void main(String[] args) {
    
    Persona p = new Persona("Pepe Rodriguez", 30, "123456789A");
    Estudiante e = new Estudiante("Paula Gomez", 21, "123789456S");
    Profesor prof = new Profesor("Sergio Sanchez", 34, "123789465P", "Informatica", 10000);

    System.out.println(p.toString());
    System.out.println(p);

    System.out.println(e.toString());
    System.out.println(e);

    System.out.println(prof.toString());
    System.out.println(prof);

    

  } 
}
