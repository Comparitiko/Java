/*
  7. Piedra-papel-tijera. Realiza un programa que genere una tirada simulando piedra-papel-tijera. Haz otra
  tirada para otro jugador y di quién de los dos gana. Mejora el programa para que indique el número de
  partidas a jugar y al final indica cuántas partidas ha ganado cada uno.
*/

public class Ejercicio7RT2 {

  // Generar un numero entre 0 y la longitud del array
  public static int generarNum () {

    return (int) Math.ceil(Math.random() * 3) - 1;

  }
  
  public static void main(String[] args) {

    String[] elementos = {"Piedra", "Papel", "Tijera"};
    int turnos, vJug1 = 0, vJug2 = 0;
    String elementoTurnoJug2, elementoTurnoJug1;

    try {
      
      System.out.println("Ingrese los turnos a jugar:");
      turnos = Integer.parseInt(System.console().readLine());
      if (turnos < 1) throw new Exception("El numero de turnos tiene que ser mayor que 0");

      // Bucle para jugar los turnos pedidos
      for (int i = 0; i != turnos; i++) {

        int numElementoJug1 = generarNum();
        int numElementoJug2 = generarNum();

        elementoTurnoJug1 = elementos[numElementoJug1];
        elementoTurnoJug2 = elementos[numElementoJug2];

        // Pintar elementos sacados en cada turno
        System.out.println("El jugador 1 ha sacado " + elementoTurnoJug1);
        System.out.println("El jugador 2 ha sacado " + elementoTurnoJug2);

        // Ver quien es el ganador
        if (numElementoJug1 == 0 && numElementoJug2 == 2 || numElementoJug1 == 1 && numElementoJug2 == 0 || numElementoJug1 == 2 && numElementoJug2 == 1) {

          System.out.println("El ganador del turno " + (i + 1) + " es el jugador 1");
          vJug1++;

        } else if (numElementoJug1 == numElementoJug2) {

          System.out.println("En el turno " + (i + 1) + " ha habido un empate");

        } else {

          System.out.println("El ganador del turno " + (i + 1) + " es el jugador 2");
          vJug2++;

        }

        System.out.println();

      } 

      System.out.println("El numero de victorias del jugador 1 ha sido de: " + vJug1 + " victorias");
      System.out.println("El numero de victorias del jugador 1 ha sido de: " + vJug2 + " victorias");

    } catch (Exception e) {
      
      System.out.println("Error: " + e);

    }

  }

}