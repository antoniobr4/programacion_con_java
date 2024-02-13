/**
 * Clase de ejemplo coche
 * @author Antonio Bravo
*/

public class coche {

 //Atributos 
  private String matricula;
  private String marca;
  private String modelo;
  
  
  //Constructor
  public coche(String matricula, String marca, String modelo) {
    super();
    this.matricula = matricula;
    this.marca = marca;
    this.modelo = modelo;
  }
  
  public void quemaRueda(){
    System.out.println("🛞💨 ñiaaaaa");
  }
   
}

