

class Articuloo {
    String codigo;
    String descripcion;
    double precioCompra;
    double precioVenta;
    int stock;

    public Articuloo(String codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }

    public String toString() {
        return "Código: " + codigo + ", Descripción: " + descripcion + ", Precio Compra: " + precioCompra
                + ", Precio Venta: " + precioVenta + ", Stock: " + stock;
    }
}





