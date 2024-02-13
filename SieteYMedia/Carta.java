
public class Carta {
  
  ////Atributos
  private String numero;
  private String palos;
  private double valor;

  
  ////Constructor
  public Carta(String palos, String numero, double valor) {
    this.valor = valor;
    this.palos = palos;
    this.numero = numero;
  }

  
  ////Getters
  public String getPalos() {
    return this.palos;
  }

  public String getNumero() {
    return this.numero;
  }

  public double getValor() {
    return this.valor;
  }

  
  public String toString() {
    return String.format("%s de %s  \tPUNTUACIÓN: %.f", this.numero, this.palos, this.valor);
  }

  
  // public double obtenerPuntuacion() {
  //   // Valor de la carta sota, caballo o rey = 0.5
  //   if (this.numero.equals("Sota") ||  this.numero.equals("Caballo") || this.numero.equals("Rey")) {
  //       return 0.5;
  //   } else if ((Integer.parseInt(this.numero) >= 1) && (Integer.parseInt(this.numero) <= 7)) {
  //       // Si es un número válido entre 1 y 7, se convierte a double y se devuelve
  //       return Double.parseDouble(this.numero);
  //   } else {
  //       // En caso de otras cartas
  //       throw new IllegalStateException("Número de carta inválido: " + this.numero);
  //   }
  // }

}
