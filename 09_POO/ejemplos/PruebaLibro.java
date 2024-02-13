/**
 * La clase que mantendra el metodo principal o main
 */
public class PruebaLibro {
  public static void main(String[] args) {
    Libro lib = new Libro();
    Libro miLibrito = new Libro();
    Libro quijote = new Libro();

    lib.titulo = "Atomka";
    lib.autor = "Franck Thilliez";
    lib.numPaginas = 490;
    System.out.println("Titulo: " + lib.titulo);
    System.out.println("Autor:" + lib.autor);
    System.out.println("Numero Paginas:"+ lib.numPaginas);
    System.out.println("Edicion: " + lib.edicion);
  }
}
