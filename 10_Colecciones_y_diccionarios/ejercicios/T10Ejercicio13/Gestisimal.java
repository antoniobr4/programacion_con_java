package T10Ejercicio13;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Modifica el programa Gestisimal realizado anteriormente añadiendo las siguientes mejoras:
 * • Utiliza una lista en lugar de un array para el almacenamiento de los datos.
 * • Comprueba la existencia del código en el alta, la baja y la modificación de
 * artículos para evitar errores.
 * • Cambia la opción “Salida de stock” por “Venta”. Esta nueva opción permitirá hacer una venta de varios artículos y emitir la factura correspondiente.
 * Se debe preguntar por los códigos y las cantidades de cada artículo que
 * se quiere comprar. Aplica un 21% de IVA.
 * 
 * @author Antonio Bravo
 */

 public class Gestisimal {
  static ArrayList<Articulo> almacen = new ArrayList<Articulo>();

  public static boolean codigoExiste(String codigo) {
    for (Articulo articulo : almacen) {
        if (articulo.getCodigo().equals(codigo)) {
            return true;
        }
      }
      return false;
  }


  public static void altaArticulo() {
    System.out.print("Código: ");
    String codigo = System.console().readLine();
    if (codigoExiste(codigo)) {
      System.out.println("El código introducido ya existe.");
      return;
    }
    System.out.print("Descripción: ");
    String descripcion = System.console().readLine();
    System.out.print("Precio de compra: ");
    double precioCompra = System.console().readLine();
    System.out.print("Precio de venta: ");
    double precioVenta = System.console().readLine(),
    System.out.print("Stock: ");
    int stock =
    almacen.add(new Articulo(codigo, descripcion, precioCompra, precioVenta, stock));
  }

  public static void bajaArticulo() {
    System.out.print("Introduzca el código del artículo a eliminar: ");
    String codigo = scanner.nextLine();
    if (!codigoExiste(codigo)) {
      System.out.println("El código introducido no existe.");
      return;
    }
    almacen.removeIf(articulo -> articulo.getCodigo().equals(codigo));
  }

  public static void modificacionArticulo() {
    System.out.print("Introduzca el código del artículo a modificar: ");
    String codigo = scanner.nextLine();
    if (!codigoExiste(codigo)) {
      System.out.println("El código introducido no existe.");
      return;
    }
    System.out.print("Nuevo código: ");
    String nuevoCodigo = scanner.nextLine();
    if (codigoExiste(nuevoCodigo) && !nuevoCodigo.equals(codigo)) {
      System.out.println("El nuevo código ya existe.");
      return;
    }
    System.out.print("Nueva descripción: ");
    String nuevaDescripcion = scanner.nextLine();
    System.out.print("Nuevo precio de compra: ");
    double nuevoPrecioCompra = scanner.nextDouble();
    System.out.print("Nuevo precio de venta: ");
    double nuevoPrecioVenta = scanner.nextDouble();
    System.out.print("Nuevo stock: ");
    int nuevoStock = scanner.nextInt();

    for (Articulo articulo : almacen) {
      if (articulo.getCodigo().equals(codigo)) {
        articulo.setCodigo(nuevoCodigo);
        articulo.setDescripcion(nuevaDescripcion);
        articulo.setPrecioDeCompra(nuevoPrecioCompra);
        articulo.setPrecioDeVenta(nuevoPrecioVenta);
        articulo.setStock(nuevoStock);
        System.out.println("Artículo modificado correctamente.");
        return;
      }
    }
  }

  public static void ventaArticulos() {
    double total = 0.0;
    double totalConIVA = 0.0;
    System.out.println("Introduce los códigos de los artículos a vender y la cantidad (código cantidad), o escribe 'fin' para finalizar:");
    String input;
    while (true) {
       input = scanner.nextLine();
        if (input.equals("fin")) {
          break;
        }
        String[] parts = input.split(" ");
        if (parts.length != 2) {
          System.out.println("Entrada no válida.");
          continue;
        }
        String codigo = parts[0];
        int cantidad = Integer.parseInt(parts[1]);
        for (Articulo articulo : almacen) {
          if (articulo.getCodigo().equals(codigo)) {
            if (articulo.getStock() < cantidad) {
              System.out.println("No hay suficiente stock para el artículo con código " + codigo);
              continue;
            }
            articulo.setStock(articulo.getStock() - cantidad);
            total += articulo.getPrecioDeVenta() * cantidad;
            break;
          }
        }
      }
    totalConIVA = total * 1.21; // Aplicando el 21% de IVA
    System.out.println("Total sin IVA: " + total);
    System.out.println("Total con IVA (21%): " + totalConIVA);
    System.out.println("Venta realizada correctamente.");
  }

  public static void main(String[] args) {
    int opcion;
    do {
      System.out.println("**** G E S T I S I M A L ****");
      System.out.println("1. Alta");
      System.out.println("2. Baja");
      System.out.println("3. Modificación");
      System.out.println("4. Venta");
      System.out.println("5. Salir");
      System.out.print("Introduzca una opción: ");
      opcion = scanner.nextInt();
        switch (opcion) {
          case 1:
            altaArticulo();
            break;
              
          case 2:
            bajaArticulo();
            break;
              
          case 3:
            modificacionArticulo();
            break;
              
          case 4:
            ventaArticulos();
            break;
              
          case 5:
            System.out.println("Adiós.");
            break;
              
          default:
            System.out.println("Opción no válida.");
            break;
          }
    } while (opcion != 5);
  }

}
