public class PruebaGato {
  public static void main(String[] args) {
    // Gato garfield = new Gato("Garfield");
    // System.out.println(garfield.nombre);
    // Gato botas = new Gato("Botas", "Negro", "Egipcio", "Macho", 5, 4.2);
    // System.out.println(botas.nombre);
    // System.out.println(botas.color);
    // System.out.println(botas.raza);
    // System.out.println(botas.sexo);
    // System.out.println(botas.edad);
    // System.out.println(botas.edad);


    //   garfield.sexo = "macho";
    //   Gato kitty = new Gato();
    //   kitty.sexo = "hembra";
    //   Gato botas = new Gato();
    //   botas.sexo = "macho";

    //   garfield.come("carne");
    //   garfield.maulla();
    //   garfield.ronronea();
    //   garfield.peleaCon(kitty);
    //   botas.peleaCon(garfield);

    System.out.println("Cuántos gatos quieres crear: ");
    int num = Integer.parseInt(System.console().readLine());

    Gato[] gaticos = new Gato[num];
    String[] nombres = {"Gargield", "Botas", "Willy", "Pancho", "Misifú"};
    String[] colores = {"Marrón", "Negro", "Pardo"};


    for (int i = 0; i < num; i++) {
      int nombreAleatorio = (int)(Math.random()*5);
      int colorAleatorio = (int)(Math.random()*3);
      System.out.print("Que raza es");
      String raza = System.console().readLine();
      gaticos[i] = new Gato(nombres[nombreAleatorio], colores[colorAleatorio], raza, "Macho", 0, 0 );
    }

    for (int i = 0; i < gaticos.length; i++) {
      System.out.println(gaticos[i].nombre);
      System.out.println(gaticos[i].color);
    }

    

  }


}
