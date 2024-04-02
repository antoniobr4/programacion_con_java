package T09Ejercicio05;

public class Gestisimal {
  static final int N = 10;
  static Articulo[] almacen = new Articulo[N];

  //Funcion para que diga si esta lleno o no el array
  public static int primeraLibre() {
    for (int i = 0; i < N; i++) {
      if (almacen[i].getCodigo() == null) {
        return i;
      }
    }
    return -1;
  }

  public static boolean codigoExiste(String codigo) {
    for (Articulo articulo : almacen) {
      if (articulo.getCodigo().equals(codigo)) {
        return true;
      }
    }
    return false;
  }

  public static int posicionArticulo(String codigo) {
    for (int i = 0; i < N; i++) {
      if (almacen[i].getCodigo().equals(codigo)) {
        return i;
      }
    }
    return -1;
  }


  public static void main(String[] args) {
    for (int i = 0; i < N; i++) {
     Gestisimal.almacen[i] = new Articulo(); 
    }

    int menu;
    String codigoIntroducido;
    String descripcionIntroducido;
    Double precioCompraIntroducido;
    Double precioVentaIntroducido;
    int stocklIntroducido;

    do {
      System.out.println("--- MENÚ GESTISIMAL --");
      System.out.println("1. Listado");
      System.out.println("2. Alta");
      System.out.println("3. Baja");
      System.out.println("4. Modificación");
      System.out.println("5. Entrada de mercancía");
      System.out.println("6. Slaida de mercancía");
      System.out.println("7. Salir");
      System.out.println("Introduzca una opción: ");
      menu = Integer.parseInt(System.console().readLine());

      switch (menu) {
        case 1:     //Listado
          for (Articulo articulo : almacen) {
            if (articulo.getCodigo() != null) {
              System.out.println(articulo);
            }
          }
          break;

        case 2:   //Alta
          if (primeraLibre() == -1) {
            System.out.println("Lo sentimos. No queda hueco para registrar los artículos.");
          } else {
            System.out.println("Código: ");
            codigoIntroducido = System.console().readLine();
            System.out.println("Descripcio: ");
            descripcionIntroducido = System.console().readLine();
            System.out.println("Precio de compra: ");
            precioCompraIntroducido = Double.parseDouble(System.console().readLine());
            System.out.println("Precio de venta: ");
            precioVentaIntroducido = Double.parseDouble(System.console().readLine());
            System.out.println("Stock: ");
            stocklIntroducido = Integer.parseInt(System.console().readLine());

            almacen[primeraLibre()] = new Articulo();
          }
          break;


        case 3:   //Baja
          System.out.println("Introduzac el código del artículo a eliminar: ");
          codigoIntroducido = System.console().readLine();
          if (!codigoExiste(codigoIntroducido)) {
            System.out.println("Lo siento el codigo introdudio no existe");
          } else {
            almacen[posicionArticulo(codigoIntroducido)].setCodigo(null);
          }
          break;
        default:
          break;
      }

    } while (menu != 7);
  }
}
