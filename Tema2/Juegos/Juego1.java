import java.util.Scanner;

public class Juego1 {

  // Metodo para lanzar dados
  public static int lanzarDado () {
    return (int) Math.ceil(Math.random() * 10);
  }
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Puntos jugadores
    int puntos1 = 0, puntos2 = 0, puntosSigTurno = 0;

    // Pedir turnos
    System.out.println("Cuantos turnos se jugara al juego:");
    int turnos = sc.nextInt();

    String jugador1 = "Cubitus", jugador2 = "Humerus";

    // Bucle que vaya calculando cada turno quien gana y cuantos puntos lleva en total
    for (int i = 0; i != turnos; i++) {

      int dado1 = lanzarDado();
      int dado2 = lanzarDado();

      int puntosTurno = dado1 + dado2;

      if (dado1 > dado2) {

        puntos1 += + puntosTurno + puntosSigTurno;

        System.out.println("En el turno " + (i + 1) + ", " + jugador1 + " ha ganado con un " + dado1 + " frente a un " + dado2 + " de " + jugador2);
        System.out.println(jugador1 + " ha ganado " + (puntosTurno + puntosSigTurno) + " puntos");
        puntosSigTurno = 0;

      } else if (dado1 < dado2) {

        puntos2 = puntos2 + puntosTurno + puntosSigTurno;
        System.out.println("En el turno " + (i + 1) + ", "+ jugador2 + " ha ganado con un " + dado2 + " frente a un " + dado1 + " de " + jugador1);
        System.out.println(jugador2 + " ha ganado " + (puntosTurno + puntosSigTurno) + " puntos");
        puntosSigTurno = 0;

      } else {

        System.out.println("En el turno " + (i + 1) + ", " + jugador1 + " y " + jugador2 + " han empatado, los puntos han sido:");
        System.out.println(jugador1 + ": " + dado1 + " puntos");
        System.out.println(jugador2 + ": " + dado2 + " puntos");
        puntosSigTurno += + puntosTurno;

      }

    } 

    // Ver quien ha sido el ganador
    if (puntos1 > puntos2) {

        System.out.println(jugador1 +  " ha ganado con un total de " + puntos1 + " frente a " + puntos2 + " puntos de " + jugador2);

      } else if (puntos1 < puntos2) {

        System.out.println(jugador2 + " ha ganado con un total de " + puntos2 + " frente a " + puntos1 + " puntos de " + jugador1);

      } else {

        System.out.println(jugador1 + " y " + jugador2 + " han empatado con un total de " + puntos1 + " puntos");

      }

    sc.close();

  }

}