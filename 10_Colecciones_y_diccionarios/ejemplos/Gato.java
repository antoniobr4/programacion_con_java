/**
 * Definición de la clase Gato
 * 
 * @author Antonio Bravo
 */

 public class Gato implements Comparable<Gato> {
  private String nombre;
  private String color;
  private String raza;
  private int edad;
    
  public Gato(String nombre, String color, String raza) {
    this.nombre = nombre;
    this.color = color;
    this.raza = raza;
  }
    
  public String getNombre() {
    return nombre;
  }

  public String getRaza() {
    return raza;
  }
  public void setEdad(int edad) {
    this.edad = edad;
  }

  @Override
  public String toString() {
    return "\nNombre: " + this.nombre + "\nColor: " + this.color + "\nRaza: " + this.raza;
  }
    
  public int compareTo(Gato g) {
    return (this.nombre).compareTo(g.getNombre());
 }


}
