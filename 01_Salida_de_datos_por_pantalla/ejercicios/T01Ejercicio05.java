import colors.ConsoleColors;

/**
 * T01 Ejercicio 05: Modifica el programa anterior añadiendo colores. Puedes mostrar cada asignatura de un color diferente.
 * 
 * @author Antonio Bravo
 */

public class T01Ejercicio05 {
    
    /** 
     * @param String[]args
     */
    public static void main(String[]args) {
        System.out.println("┌────────────────┬─────────┬──────────┬─────────────┬──────────┬───────────┐");
        System.out.println("│     Hora       │  Lunes  │  Martes  │  Miércoles  │  Jueves  │  Viernes  │");
        System.out.println("│────────────────┼─────────┼──────────┼─────────────┼──────────┼───────────│");
        System.out.println("│  15:15 - 16:15 │   "+ ConsoleColors.BLUE + "FOL" + ConsoleColors.RESET +"   │  "+ConsoleColors.RED + "PROGR" + ConsoleColors.RESET +"   │    "+ConsoleColors.GREEN+ "ENDES" +ConsoleColors.RESET+"    │   " + ConsoleColors.YELLOW + "BADAT" +ConsoleColors.RESET +"  │   "+ConsoleColors.RED + "PROGR" + ConsoleColors.RESET +"   │");
        System.out.println("│────────────────┼─────────┼──────────┼─────────────┼──────────┼───────────│");
        System.out.println("│  16:15 - 17:15 │   "+ ConsoleColors.BLUE + "FOL" + ConsoleColors.RESET +"   │  "+ConsoleColors.RED + "PROGR" + ConsoleColors.RESET +"   │    "+ConsoleColors.GREEN+ "ENDES" +ConsoleColors.RESET+"    │   " + ConsoleColors.YELLOW + "BADAT" +ConsoleColors.RESET +"  │   "+ConsoleColors.RED + "PROGR" + ConsoleColors.RESET +"   │");
        System.out.println("│────────────────┼─────────┼──────────┼─────────────┼──────────┼───────────│");
        System.out.println("│  17:15 - 18:15 │   "+ ConsoleColors.BLUE + "FOL" + ConsoleColors.RESET +"   │  " + ConsoleColors.YELLOW + "BADAT" +ConsoleColors.RESET +"   │    " + ConsoleColors.YELLOW + "BADAT" +ConsoleColors.RESET +"    │  " + ConsoleColors.CYAN + "LMSGI" +ConsoleColors.RESET+"   │   "+ConsoleColors.GREEN+ "ENDES" +ConsoleColors.RESET+"   │");
        System.out.println("│────────────────┼─────────┼──────────┼─────────────┼──────────┼───────────│");
        System.out.println("│  18:30 - 19:30 │  "+ ConsoleColors.PURPLE + "SIINF" +ConsoleColors.RESET +"  │  " + ConsoleColors.YELLOW + "BADAT" +ConsoleColors.RESET +"   │    " + ConsoleColors.YELLOW + "BADAT" +ConsoleColors.RESET +"    │   " + ConsoleColors.CYAN + "LMSGI" +ConsoleColors.RESET+"  │   "+ ConsoleColors.PURPLE + "SIINF" +ConsoleColors.RESET +"   │");
        System.out.println("│────────────────┼─────────┼──────────┼─────────────┼──────────┼───────────│");
        System.out.println("│  19:30 - 20:30 │  "+ ConsoleColors.PURPLE + "SIINF" +ConsoleColors.RESET +"  │  " + ConsoleColors.CYAN + "LMSGI" +ConsoleColors.RESET+"   │    "+ConsoleColors.RED + "PROGR" + ConsoleColors.RESET +"    │   "+ConsoleColors.RED + "PROGR" + ConsoleColors.RESET +"  │   "+ ConsoleColors.PURPLE + "SIINF" +ConsoleColors.RESET +"   │");
        System.out.println("│────────────────┼─────────┼──────────┼─────────────┼──────────┼───────────│"); 
        System.out.println("│  20:30 - 21:30 │  "+ ConsoleColors.PURPLE + "SIINF" +ConsoleColors.RESET +"  │  " + ConsoleColors.CYAN + "LMSGI" +ConsoleColors.RESET+"   │    "+ConsoleColors.RED + "PROGR" + ConsoleColors.RESET +"    │   "+ConsoleColors.RED + "PROGR" + ConsoleColors.RESET +"  │   "+ ConsoleColors.PURPLE + "SIINF" +ConsoleColors.RESET +"   │");
        System.out.println("└────────────────┴─────────┴──────────┴─────────────┴──────────┴───────────┘");

    

    }
    
}

