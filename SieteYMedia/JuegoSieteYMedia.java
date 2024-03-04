public class JuegoSieteYMedia {

   public static void main(String[] args) {
      System.out.println("\033[1;37m¡BIENVENIDO AL JUEGO DE LA\033[0m \033[1;32mSIETE Y MEDIA!\033[0m\n");

      // Variable para salir del programa
      boolean salir = false;
      String opcion;

      //Imprimir el menú de juego
      do {
         System.out.println("\n\033[1;37mMenú de juego:\033[0m");
         System.out.print("1. Cómo jugar\n2. Comenzar el juego\n3. Muéstrame la baraja\n4. Salir");
         System.out.print("\nElija una opción: ");
         opcion = System.console().readLine();

         switch (opcion) {
            case "1":
               mostrarInstrucciones();
               break;

            case "2":
               System.out.print("\nLo primero es lo primero, ¿cómo te llamas?: ");
               String nombreJugador = System.console().readLine();

               double fondoJugador = 0;
               do {
                  System.out.print("¿Cuánto dinero tienes de fondo? (introduzca sólo la cantidad, sin símbolos): ");
                  fondoJugador = Double.parseDouble(System.console().readLine());
                  if (fondoJugador <= 0) {
                     System.out.println("¡No puedes empezar con esa cantidad! Tiene que ser mayor a 0.");
                  }
               } while (fondoJugador <= 0);

               System.out.println("\n¡Bienvenido al juego, \033[1;34m" + nombreJugador + "\033[0m! ¡Vamos a comenzar!");

               //Creación de los jugadores
               Jugador jugador = new Jugador(nombreJugador, fondoJugador);
               Jugador banca = new Jugador();
               
               jugarPartida(jugador, banca);
               
               break;

            case "3":
               Baraja barajaMuestra = new Baraja();
               barajaMuestra.inicializaBaraja();
               barajaMuestra.mostrarBaraja();
               break;
               
            case "4":
               salir = true;
               System.out.println("¡Muchas gracias por jugar! ¡Vuelve cuando quieras!");
               break;
               
            default:
               System.out.println("La opción elegida no existe. Vuelva a intentarlo.");
               break;
         }
      } while (!salir);
   } 

   /*
    * Función para mostar las instrucciones del juego
    */
   public static void mostrarInstrucciones() {
      System.out.println("La siete y media es un juego de cartas en el que el objetivo es acercarse lo máximo posible a una puntuación de 7.5.\n");
      System.out.println("Las cartas del 1 al 7 valen su propio valor numérico.");
      System.out.println("Las cartas Sota, Caballo y Rey valen 0.5 puntos cada una.\n");
      System.out.println("El jugador o la banca que se pase de 7.5 pierde la partida.");
      System.out.println("Si un jugador obtiene exactamente 7.5, se considera que ha alcanzado 'la siete y media' y gana automáticamente.\n");
      System.out.println("Primero, el jugador hará una apuesta y pedirá su primera carta (la banca siempre igualará la apuesta).");
      System.out.println("El jugador puede decidir si desea recibir más cartas (pedir) o si se planta (no pide más cartas).");
      System.out.println("Después de que el jugador se plante, la banca revela su carta y puede pedir más cartas según las reglas preestablecidas.");
      System.out.println("Finalmente, se comparan las puntuaciones entre el jugador y la banca para determinar al ganador, llevándose lo apostado.\n");
   }

   /*
    * Función para comenzar el juego
    * @param 
    */

   public static void jugarPartida(Jugador jugador, Jugador banca) {

      /* Algunas variables necesarioas para comenzar la partida */
      Baraja baraja = new Baraja();
      double apuesta;

      double fondoInicial = jugador.getFondos();  //Necesario para cálculos al final de la partida

      boolean terminarPartida = false; //La partida va a continuar hasta que pase a true
      boolean tieneFondos = true;      //Se establece que el jugador empieza teniendo fondos 
      String respuesta;                //Respuesta para preguntas de si o no
      

      while (!terminarPartida && tieneFondos) {

         /* Iniciar la baraja y limpia la mano*/
         baraja.inicializaBaraja();
         baraja.mezclarBaraja();
         jugador.getMano().limpiarMano();
         banca.getMano().limpiarMano();
         
         /* TURNO DEL JUGADOR */
         /* Comprobar cuánto va a apostar y si puede hacerlo */
         do {
               System.out.print("¿Cuánto quieres apostar? (introduzca sólo la cantidad, sin símbolos): ");
               apuesta = Double.parseDouble(System.console().readLine());
               if (apuesta > jugador.getFondos()) {
                  System.out.println("No tienes suficientes fondos, prueba otra cantidad (fondo actual: " + jugador.getFondos() + ")");
               }
         } while(apuesta > jugador.getFondos());

         /* Variables para la verificacion de los bucles */
         boolean sePaso = false;          //Se ha pasado de puntuación
         boolean seguirJugando = true;    //Quiere seguir jugando
         boolean esSieteYMedia = false;   //Ha conseguido 7.5 de puntuación

         System.out.println("\nAquí tienes tu primera carta: ");
         do {
            jugador.recibirCarta(baraja);

            /* Comprobar si se ha pasado de 7.5 al pedir la nueva carta */
            if (jugador.getMano().calcularPuntuacionTotal() > 7.5) {
               sePaso = true;
               seguirJugando = false;
               System.out.println("¡Vaya! ¡Te has pasado!");
            } else if (jugador.getMano().calcularPuntuacionTotal() == 7.5) {
               seguirJugando = false;
               esSieteYMedia = true;
            }

            /* Si no se ha pasado de puntuación: */
            if (!sePaso && !esSieteYMedia) {
               System.out.print("\n¿Quieres pedir otra carta? (s/n): ");
               respuesta = System.console().readLine().toLowerCase();

               switch (respuesta) {
                  case "s":
                     //No hacer nada
                     break;
                  
                  case "n":
                     seguirJugando = false;
                     break;
               
                  default:
                     System.out.println("Esa opción no es válida, pruebe de nuevo.");
                     break;
               }
            }
         } while (seguirJugando);

         /* Siete y media, se ha pasado de puntos o continuar con la jugada de la banca */
         if (esSieteYMedia) {
            System.out.println("¡LO CONSEGUISTE! ¡PUNTUACIÓN PERFECTA! Aquí tienes tus ganancias: " + apuesta);
            resultadoFondos(jugador, banca, apuesta);
            System.out.println("Actualmente tienes en tu fondo " + jugador.getFondos());

         } else if (sePaso) {
            System.out.println("Lo siento, perdiste esta ronda. Has perdido: " + apuesta);
            resultadoFondos(banca, jugador, apuesta);
            System.out.println("Actualmente tienes en tu fondo " + jugador.getFondos());

         } else {

            /* TURNO DE LA BANCA */
            System.out.println("\n¡Ahora es mi turno!");
            seguirJugando = true;

            /* Jugadas de la banca */
            do {
               banca.recibirCarta(baraja);

               /* La banca saca 7.5 o una puntuación superior a la del jugador pero inferior a 7.5 */
               if (banca.getMano().calcularPuntuacionTotal() == 7.5 || (banca.getMano().calcularPuntuacionTotal() > jugador.getMano().calcularPuntuacionTotal()) && (banca.getMano().calcularPuntuacionTotal() < 7.5)) {
                  System.out.println("¡Ahá! ¡He ganado esta ronda!");
                  resultadoFondos(banca, jugador, apuesta);
                  System.out.println("Actualmente tienes en tu fondo " + jugador.getFondos());
                  seguirJugando = false;

               /* La banca saca más de 7.5 */
               } else if ((banca.getMano().calcularPuntuacionTotal() > jugador.getMano().calcularPuntuacionTotal()) && (banca.getMano().calcularPuntuacionTotal() > 7.5)) {
                  System.out.println("¡Ups! Me he pasado, has ganado esta ronda.");
                  resultadoFondos(jugador, banca, apuesta);
                  System.out.println("Actualmente tienes en tu fondo " + jugador.getFondos());
                  seguirJugando = false;
               }
            } while (seguirJugando);
         }

         /* Si no quedan fondos por alguna de las dos partes, no se continúa con la partida */
         if (banca.getFondos() == 0) {
            System.out.println("¡Vaya! ¡Me quedé sin fondos! \033[1;37m¡\033[1;32mHAS GANADO ESTA PARTIDA\033[1;37m!\033[0m\n");
            tieneFondos = false;
         } else if (jugador.getFondos() == 0) {
            System.out.println("Ohhhh, te quedaste sin dinero. \033[1;37m¡\033[1;31mFIN DE LA PARTIDA\033[1;37m!\033[0m\n");
            tieneFondos = false;
         }

         /* Si hay fondos, preguntar si quiere seguir jugando la partida */   
         if (tieneFondos) {
            System.out.print("\n¿Quieres jugar otra ronda? (s/n): " );
            respuesta = System.console().readLine().toLowerCase();

            switch (respuesta) {
               case "s":
                  //No hacer nada
                  break;
               
               case "n":
                  terminarPartida = true;
                  System.out.println("¡Buena partida! Veamos los resultados finales:");
                  System.out.println("\t - Tu fondo final ha sido de: " + jugador.getFondos());
                  if (jugador.getFondos() > fondoInicial) {
                     System.out.println("\t - Tus ganancias han sido de " + (fondoInicial-jugador.getFondos()));
                  } else {
                     System.out.println("\t - Las pérdidas han sido de " + (fondoInicial-jugador.getFondos()));
                  }
                  break;
            
               default:
                  System.out.println("Esa opción no es válida, pruebe de nuevo.");
                  break;
            }
         }
      } 
   }

   public static void resultadoFondos(Jugador ganador, Jugador perdedor, double apuesta) {
      ganador.setFondos(ganador.getFondos() + apuesta);
      perdedor.setFondos(perdedor.getFondos() - apuesta);
   }
}
