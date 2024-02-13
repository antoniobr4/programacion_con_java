 
public class Baraja {

  ////Atributos
  private  String[] palos = new String[]{"Oros", "Copas", "Espadas", "Bastos"};
  private String[] numero = new String[]{"1", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};
  private Carta[] cartas = new Carta[40];
  private int numCartas = 40;

  ////Constructor
  public Baraja() {
   numCartas = palos.length * numero.length;     //4 * 10 = 40
   cartas = new Carta[numCartas];
  }

  
  ////Constructor
  public void inicializaBaraja() {
    int contador = 0;

    while(contador < numCartas) {
      for(int i = 0; i < palos.length; ++i) {
        for (int j = 0; j < numero.length; j++) {
          cartas [contador] = new Carta(numero[j], palos[i], puntuacionCarta(j));
          contador++;
        }
      }

    }
  }


  public double puntuacionCarta(int j) {
    // if (j<7) {
    //   return j+1;
    // } else {
    //   return 0.5;
    // }

    return j<7 ? j+1 : 0.5;
  }


  public void mostrarBaraja() {
    for (int i = 0; i < numCartas; i++) {
      System.out.println(cartas[i].toString());
    }
  }

  


  public static void main(String[] args) {
    Baraja barajaEsp = new Baraja();
    barajaEsp.mostrarBaraja();
    barajaEsp.mostrarBaraja();
  }
  
  // //Barajar las cartas
  // public void mezclarBaraja() {
  //   for (int i = this.cartas.length - 1; i > 0; i--) {
  //     int j = (int) (Math.random() * (i+1));
      
  //     //Intercambiar las posiciones de las cartas i - j
  //     Carta auxiliar = this.cartas[i];
  //     this.cartas[i] = this.cartas[j];
  //     this.cartas[j] = auxiliar;
  //   }
  // }    
  
}

  

