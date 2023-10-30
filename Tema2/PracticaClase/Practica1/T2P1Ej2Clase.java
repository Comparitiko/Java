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
    int puntosCubitus = 0, puntosHumerus = 0, turnos;

    try {
      // Pedir turnos envuelto en un try catch
      System.out.println("Inserte los turnos a jugar:");
      turnos = Integer.parseInt(System.console().readLine());

      for (int i = 0; i != turnos; i++) {

        int cubitusTurno = tirarDados(), humerusTurno = tirarDados();

        System.out.println("En el turno " + (i + 1) + " han sacado:");
        System.out.println("Cubitus: " + cubitusTurno + " puntos.");
        System.out.println("Humerus: " + humerusTurno + " puntos.");

        if (cubitusTurno < humerusTurno) {

          System.out.println("La partida " + (i + 1) + " la ha ganado Humerus");
          puntosHumerus++;

        } else if (cubitusTurno > humerusTurno) {
          
          System.out.println("La partida " + (i + 1) + " la ha ganado Cubitus");
          puntosCubitus++;

        } else {
          System.out.println("La partida " + (i + 1) + " ha quedado empate");
        }

        

      }

      if (puntosHumerus > puntosCubitus) System.out.println("El ganador del juego ha sido Humerus con " + puntosHumerus + " partidas ganadas frente a " + puntosCubitus + " puntos de Cubitus");
      else if (puntosHumerus < puntosCubitus) System.out.println("El ganador del juego ha sido Cubitus con " + puntosCubitus + " partidas ganadas frente a " + puntosHumerus + " puntos de Cubitus");
      else System.out.println("En el juego han empatado a " + puntosCubitus + " partidas ganadas cada uno");

    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }

  }

}