import colors.ConsoleColors;

/**
 * T01 Ejercicio 10: Mejora el ejercicio anterior añadiéndole colores. 
 * 
 * @author Antonio Bravo
 */

public class T01Ejercicio10 {
    public static void main(String[] args) {
        System.out.println("░░░░░░░░░░"+ConsoleColors.WHITE + "█" +ConsoleColors.RESET+"");  
        System.out.println("░░░░░░░░"+ConsoleColors.CYAN + "▄▄█▄▄"+ConsoleColors.RESET+"");
        System.out.println("░░░░"+ConsoleColors.CYAN + "▀▀▀██▀▀▀██▀▀▀"+ConsoleColors.RESET+"");
        System.out.println(""+ConsoleColors.CYAN + "▄▄▄▄▄▄▄███████▄▄▄▄▄▄▄"+ConsoleColors.RESET+"");
        System.out.println("░░"+ConsoleColors.YELLOW+"█▄█"+ConsoleColors.RESET+"░░"+ConsoleColors.WHITE+"▀██▄██▀"+ConsoleColors.RESET+"░░"+ConsoleColors.YELLOW+"█▄█"+ConsoleColors.RESET+"");
    }
    
}
