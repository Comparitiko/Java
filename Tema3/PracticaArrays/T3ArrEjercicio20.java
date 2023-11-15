/*
  20. Vamos a realizar el típico juego del 3 en raya, donde habrá dos jugadores que tengan que hacer el 3 en raya, los
  signos serán el X y el O, cuando haya una posición vacía habrá un –
  El tablero de juego, será una matriz de 3×3 de char.
  El juego termina cuando uno de los jugadores hace 3 en raya o si no hay más posiciones que poner.
  Primero juega una posición un jugador y luego el otro.
  El juego debe pedir las posiciones donde el jugador actual quiera poner su marca ( [0,0], [0,1], [0,2], [1,0], [1,1],
  [1,2], [2,0], [2,1], [2,2] ), esta debe ser validada y por supuesto que no haya una marca ya puesta.
*/

import java.util.Arrays;

public class T3ArrEjercicio20 {

  // Funcion que me indica si esta marcada la casilla pasada
  public static boolean estaMarcada (char[][] array, int i, int j) {
    
    if (array[i][j] != 'X' || array[i][j] != 'O') return false;
    else return true;

  }

  // Funcion que comprueba despues de cada tirada si hay ganador
  public static boolean hayGanador (char[][] array) {
    
    return false;

  }

  
  
  public static void main(String[] args) {

    char[][] tablero = new char[3][3];

    for (int i = 0; i < tablero.length; i++) {
      System.out.println(Arrays.toString(tablero[i]));
    }


  }

}