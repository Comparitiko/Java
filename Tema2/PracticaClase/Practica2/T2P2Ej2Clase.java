/* 
  Marcus Cubitus y Julius Humerus, legionarios apasionados por los juegos de dados,
  aprovechan los días cada vez más largos del mes de Iunius para probar nuevos juegos. En
  este juego, en cada turno un jugador lanza cuatro dados y se anota la suma de los valores
  impares obtenidos, mientras que el otro jugador lanza tres dados y se anota la suma de
  los valores pares obtenidos. Gana el turno el jugador que obtenga más puntos y gana la
  partida el jugador que haya ganado más turnos
*/

public class T2P2Ej2Clase {
  
  // Funcion que devuelve los puntos que se ha obtenido al tirar los dados 5 veces sin contar los numeros impares
  public static int tirarDados () {
    int sumaDados = 0;

    for (int i = 0; i != 5; i++) {
      int dado = (int) Math.ceil(Math.random() * 6);
      if (dado % 2 == 0 ) sumaDados += dado;
      
    }
    
    return sumaDados;

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

        puntosCubitus += cubitusTurno;
        puntosHumerus += humerusTurno;

      }

      if (puntosHumerus > puntosCubitus) System.out.println("El ganador del juego ha sido Humerus con " + puntosHumerus + " puntos");
      else System.out.println("El ganador del juego ha sido Cubitus con " + puntosCubitus + " puntos");

    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }

  }

}