public class Jugador {

    private String nombre;
    private double fondos;
    private Mano manoJugador;

    ////Constructores
    public Jugador() {
        this.fondos = 100;
        this.nombre = "Banca";
        manoJugador = new Mano();
    }
    
    public Jugador(String nombre, double fondos) {
        this.nombre = nombre;
        this.fondos = fondos;
        manoJugador = new Mano();
    }

    ////Getters
    public double getFondos() {
        return this.fondos;
    }

    public Mano getMano() {
        return this.manoJugador;
    }

    ////Setters
    public void setFondos(double fondos) {
        this.fondos = fondos;
    }

    ////Métodos

    /** 
     * Método para pedir una carta y enseñarla por pantalla.
     */
    public void recibirCarta(Baraja baraja) {
        Carta cartaRecibida = baraja.extraerCarta();
        manoJugador.crearMano(cartaRecibida); 
        System.out.println(cartaRecibida.toString());
        System.out.println("Puntuación total: " + manoJugador.calcularPuntuacionTotal());
    }
}
