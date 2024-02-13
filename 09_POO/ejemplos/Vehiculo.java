public class Vehiculo {
  // atributos de clase
  private static int VehiculoCreados = 0;
  private static int kmTotales = 0;

  // atributos de instancia(objeto)
  private int kmRecorridos;

  public  Vehiculo() {
    this.kmRecorridos = 0;
  }

  public int getkmRecorridos() {
    return this.kmRecorridos;
  }

  public void recorre(int km) {
    this.kmRecorridos += km;
    kmTotales += km;
  }


  //Metodos de clase
  public static int kmTotales() {
    return kmTotales;
  }
}
