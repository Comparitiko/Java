/* 
  Marcus Cubitus y Julius Humerus, legionarios apasionados por los juegos de dados,
  aprovechan los días cada vez más largos del mes de Iunius para probar nuevos juegos. En
  este juego, en cada turno un jugador lanza cuatro dados y se anota la suma de los valores
  impares obtenidos, mientras que el otro jugador lanza tres dados y se anota la suma de
  los valores pares obtenidos. Gana el turno el jugador que obtenga más puntos y gana la
  partida el jugador que haya ganado más turnos
*/

public class T2P2Ej2Clase {
  
  // Funcion que devuelve la tirada
  public static int tirarDado () {

    return (int) Math.ceil(Math.random() * 6);

  }

  public static void main(String[] args) {

    // Declaracion de variables
    int puntosCubitus = 0, puntosHumerus = 0, turnos;

    try {
      // Pedir turnos envuelto en un try catch
      System.out.println("Inserte los turnos a jugar:");
      turnos = Integer.parseInt(System.console().readLine());

      for (int i = 0; i != turnos; i++) {

        int cubitusTurno = 0, humerusTurno = 0;

        // Bucle que tire los dados del j1 y si es impar se suma
        System.out.print("Cubitus: ");
        for (int j = 0; j != 4; j++) {

          int tiradaC = tirarDado();

          if (tiradaC % 10 != 0) cubitusTurno += tiradaC;

          System.out.print(tiradaC + ", ");

        }

        System.out.println();
        
        // Bucle que tire los dados del j2 y si es par se suma
        System.out.print("Humerus: ");
        for (int j = 0; j != 3; j++) {

          int tiradaH = tirarDado();

          if (tiradaH % 2 == 0) humerusTurno += tiradaH;

          System.out.print(tiradaH + ", ");

        }

        System.out.println();
        
        // Pintar el resultado del turno
        System.out.println("En el turno " + (i + 1) + " han sacado:");
        System.out.println("Cubitus: " + cubitusTurno + " puntos.");
        System.out.println("Humerus: " + humerusTurno + " puntos.");

        if (humerusTurno > cubitusTurno) puntosHumerus++;
        if (humerusTurno < cubitusTurno) puntosCubitus++;

      }

      // Pintar resultado de la partida
      if (puntosHumerus > puntosCubitus) System.out.println("El ganador del juego ha sido Humerus con " + puntosHumerus + " puntos");
      else System.out.println("El ganador del juego ha sido Cubitus con " + puntosCubitus + " puntos");

    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }

  }

}