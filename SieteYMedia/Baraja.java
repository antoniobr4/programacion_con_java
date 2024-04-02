public class Baraja {
     
    //// Atributos
    private String[] palos = {"Oros", "Bastos", "Espadas", "Copas"};
    private String[] valores = {"1", "2", "3", "4", "5", "6", "7", "Sota", "Caballo", "Rey"};
    private Carta[] cartas; //Es un array del objeto carta, en su interior lo que hay es una "carta", el objeto, con su palo, numero y puntos.
    private int numeroCartas;
    
    //// Constructor
    public Baraja() {
        numeroCartas = palos.length * valores.length; // 4 * 10 = 40 cartas
        cartas = new Carta[numeroCartas];             // Con esto creamos las 40 cartas con valores "null"
    }

    //// Métodos

    /** 
     * Método para inicializar la baraja.
     */
    public void inicializaBaraja() {
        int indice = 0;
        while (indice < numeroCartas) { //Este while no es necesario, pero se puede poner por control
            for (int i = 0; i < palos.length; i++) {
                for (int j = 0; j < valores.length; j++) {
                    cartas[indice] = new Carta(palos[i], valores[j], puntuacionCarta(j));
                    indice++;
                }
            }
        }
    }
    
    /** 
     * Método para dar la puntuación a una carta.
     * @param j es la posición en el array del valor de la carta.
     * @return double con dos opciones: j+1 si el valor es menor a 7 y 0.5 para mayor a 7.
     */
    public double puntuacionCarta(int j) {
        return j < 7 ? j + 1 : 0.5; 
    }
    
    /** 
     * Método para mostrar la baraja por pantalla.
     */
    public void mostrarBaraja() {
        System.out.println("Baraja de Cartas:");

    // Itera sobre los palos de las cartas
    for (String palo : palos) {
        System.out.println("\n" + palo.toUpperCase() + ":");

        // Itera sobre las cartas de este palo
        for (int i = 0; i < numeroCartas; i++) {
            Carta carta = cartas[i];
            if (carta.getPalo().equals(palo)) {
                System.out.println(carta.toString());
            }
        }
    }
    }

    /** 
     * Método para mezclar la baraja.
     */
    public void mezclarBaraja() {
        for (int i = this.cartas.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));

            //Intercambiar las posiciones de las cartas i - j
            Carta auxiliar = this.cartas[i];
            this.cartas[i] = this.cartas[j];
            this.cartas[j] = auxiliar;
        }
    }

    /** 
     * Método para extraer una carta.
     * @return carta en la posición última del array o null si no quedan cartas.
     */
     public Carta extraerCarta() {
        if (numeroCartas > 0) {
           return cartas[--numeroCartas]; //Si se ponen los menos delante, lo que hace es restar 1 a numeroCartas (39 la primera vez) y enseñas la carta en esa posición
       } else {
           return null; // En caso de que no haya más cartas en el mazo
       }  
   }
}
