import java.util.Locale;

public class Carta {

    //// Atributo
    private String palo;    // Palo de la carta
    private String numero;  // Número de la carta
    private double puntos;  // Puntuación de la carta

    //// Constructor
    public Carta(String palo, String numero, double puntos) {
        this.palo = palo;
        this.numero = numero;
        this.puntos = puntos;
    }   

    ////Getter
    public String getPalo() {
        return this.palo;
    }
  
    public String getNumero() {
        return this.numero;
    }
  
    public double getPuntos() {
        return this.puntos;
    }

    
    @Override
    public String toString() {
        return String.format(Locale.US,"%-20s\tValor: %.1f", this.numero + " de " + this.palo, this.puntos);
    }
}