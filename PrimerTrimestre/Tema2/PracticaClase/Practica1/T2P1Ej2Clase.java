/*
  Marcus Cubitus y Julius Humerus son dos legionarios que se entretienen en sus ratos
  libres jugando a juegos de dados, el pasatiempo favorito de los antiguos romanos. Un
  juego que pudieron haber jugado estos amigos consiste en tirar cada jugador cinco dados.
  La puntuación es la suma total de puntos, sin contar los valores que coincidan con el
  mínimo o el máximo obtenido. El jugador que saca más puntos gana la partida. Escriba un
  programa que simule varias partidas seguidas de este juego de dados.
*/

public class T2P1Ej2Clase {
  
  // Funcion que devuelve los puntos que se ha obtenido al tirar los dados 5 veces sin contar el max y el min
  public static int tirarDados () {
    int sumaDados = 0;
    int quitarMax = 0, quitarMin = 7;

    for (int i = 0; i != 5; i++) {

      int dado = (int) Math.ceil(Math.random() * 6);
      sumaDados += dado;
      if (dado < quitarMin) quitarMin = dado;
      if (dado > quitarMax) quitarMax = dado;
      
    }
    
    return sumaDados - quitarMax - quitarMin;

  }

  public static void main(String[] args) {

    // Declaracion de variables
    int partidasCubitus = 0, partidasHumerus = 0, turnos;

    try {
      // Pedir turnos envuelto en un try catch
      System.out.println("Inserte los turnos a jugar:");
      turnos = Integer.parseInt(System.console().readLine());

      for (int i = 0; i != turnos; i++) {

        int cubitusTurno = tirarDados(), humerusTurno = tirarDados();

        System.out.println("En el turno " + (i + 1) + " han sacado:");
        System.out.println("Cubitus: " + cubitusTurno + " puntos.");
        System.out.println("Humerus: " + humerusTurno + " puntos.");

        //Mirar quien ha ganado la partida
        if (cubitusTurno < humerusTurno) {

          System.out.println("La partida " + (i + 1) + " la ha ganado Humerus");
          partidasHumerus++;

        } else if (cubitusTurno > humerusTurno) {
          
          System.out.println("La partida " + (i + 1) + " la ha ganado Cubitus");
          partidasCubitus++;

        } else {
          System.out.println("La partida " + (i + 1) + " ha quedado empate");
        }

        System.out.println();

      }

      // Imprimir por terminal resultados del juego
      if (partidasHumerus > partidasCubitus) System.out.println("El ganador del juego ha sido Humerus con " + partidasHumerus + " partidas ganadas frente a " + partidasCubitus + " puntos de Cubitus");
      else if (partidasHumerus < partidasCubitus) System.out.println("El ganador del juego ha sido Cubitus con " + partidasCubitus + " partidas ganadas frente a " + partidasHumerus + " puntos de Cubitus");
      else System.out.println("En el juego han empatado a " + partidasCubitus + " partidas ganadas cada uno");

    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }

  }

}