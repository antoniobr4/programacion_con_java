public class Cubo {
  public static void main(String[] args) {
    
  }

  ////Atributos 
  private int capacidad;      //Capacida máxima
  private int contenido;      //Contenido actuan en litros


  
  ////Constructor
  public Cubo (int cap){
    this.capacidad = cap;
  }

  
  ////Getters
  public int getCapacidad(){
    return this.capacidad;
  }

  public int getContenido(){
    return this.contenido;
  }

  
  ////Setters
  void setContenido(int litros){
    this.contenido = litros;
  }


  @Override
  public String toString() {
    return "Cubo [Capacidad=" + this.capacidad + " contenido= " + this.contenido + " ]";
  }

  
  ////Metodos
  void vacia(){
    this.contenido = 0;
  }

  void llena(){
    this.contenido = this.capacidad;
  }


  
  /**
   * Pinta el v¡cubo en la pantalla.
   * Se muestra los bordes del cubo con el caráter # y el agua qur contiene con el carácter 
   */
  void pinta() {
    for (int nivel = this.capacidad; nivel > 0; nivel--) {
      if (this.contenido >= nivel) {
        System.out.println("#~~~~#");
      } else {
        System.out.println("#    #");
      }
    }
    System.out.println("######");
  }

  
  /**
  * Vuelca el contenido de un cubo sobre otro.
  * Antes de echar el agua se comprueba cuánto le cabe al
  * cubo destino.
  */
  void vuelcaEn(Cubo destino) {
    int libres = destino.getCapacidad() - destino.getContenido();
      if (libres > 0) {
      if (this.contenido <= libres) {
        destino.setContenido(destino.getContenido() + this.contenido);
        this.vacia();
      } else {
        this.contenido -= libres;
        destino.llena();
      }
    }
  } 
}
