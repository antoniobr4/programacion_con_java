package T09Ejercicio05;

public class Articulo {
  private String codigo;
  private String descripcion;
  private double precioCompra;
  private double preicoVenta;
  private int stock;
  
  
  
  
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public double getPrecioCompra() {
    return precioCompra;
  }

  public void setPrecioCompra(double precioCompra) {
    this.precioCompra = precioCompra;
  }

  public double getPreicoVenta() {
    return preicoVenta;
  }

  public void setPreicoVenta(double preicoVenta) {
    this.preicoVenta = preicoVenta;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }


  @Override
  public String toString() {
    return "---------------" + 
          "\nCódigo: " + this.codigo +
          "\nDescripción: " + this.descripcion +
          "\nPrecio de compta: " + this.precioCompra +
          "\nPrecio de venta: " + this.preicoVenta +
          "\nStock: " + this.stock;
  }
  

}
