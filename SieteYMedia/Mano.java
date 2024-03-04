public class Mano {

    ////Atributos
    Carta[] cartas;
    int numeroCarta;

    ////Constructor
    public Mano() {
        cartas = new Carta[10];
        numeroCarta = 0;
    }

    ////Métodos

    /*
     * Método para crear la mano de cartas
     */
    public void crearMano(Carta carta) {
        if (numeroCarta < cartas.length) { 
            cartas[numeroCarta] = carta; 
            numeroCarta++;
        } else {
            System.out.println("¡La mano está llena! No se pueden agregar más cartas.");
        }
    }
    
    
    /** 
     * Método para calcular la puntuación total de la mano.
     * @return double con la puntuación total
     */
    public double calcularPuntuacionTotal() {
        double puntuacionTotal = 0.0;

        for (Carta cartaActual : this.cartas) {
            if (cartaActual != null) {  
                puntuacionTotal += cartaActual.getPuntos();
            }
        }
        return puntuacionTotal;
    }

    /*
     * Método para limpiar la mano cuando se empieza una nueva ronda.
     */
    public void limpiarMano() {
        for (int i = 0; i < cartas.length; i++) {
            cartas[i] = null;
        }
        numeroCarta = 0;
    }
}
