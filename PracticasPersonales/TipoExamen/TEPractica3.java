package PracticasPersonales.TipoExamen;

import java.util.Arrays;

public class TEPractica3 {

  // Funcion para generar un numero aleatorio dado un numMax y un numMin
  public static int genNum (int min, int max) {
    return (int) (Math.random() * (max - min + 1)) + min;
  }

  // Funcion para pintar el laberinto
  public static void pintarLaberinto (String[][] laberinto) {
    for (int i = 0; i < laberinto.length; i++) {
      System.out.println(Arrays.toString(laberinto[i]));
    }
  }

  // Funcion para generar la posicion de la bomba
  public static int[] genBomba (int[] salida) {
    int[] bomba = new int[2];

    do {
      
      bomba[0] = genNum(0, 19);
      bomba[1] = genNum(0, 19);

    } while (bomba[0] == salida[0] && bomba[1] == bomba[1] || bomba[0] == 0 && bomba[1] == 0);

    return bomba;

  }

  // Funcion que devuelve si el jugador ha llegado a la salida o no
  public static boolean haGanado (int[] posicion, int[] salida) {
    if (posicion[0] == salida[0] && posicion[1] == salida[1]) return true;
    else return false;
  }

  // Funcion que devuelve si el jugador ha llegado a la bomba o no
  public static boolean haPisadoBomba (int[] posicion, int[] bomba) {
    if (posicion[0] == bomba[0] && posicion[1] == bomba[1]) return true;
    else return false;
  }

  // Funcion para generar la salida del tablero
  public static int[] genSalida () {
    int[] salida = new int[2];

    salida[0] = genNum(0, 19);
    
    if (salida[0] == 0) salida[1] = genNum(1, 19);
    else if (salida[0] == 19) salida[1] = genNum(0, 19);
    else {
      int numAleatorio = genNum(1, 2);

      if (numAleatorio == 1) salida[1] = 0;
      else salida[1] = 19;
    }

    return salida;
  }

  // Funcion para rellenar el array con lo pasado por parametros mas lo que lleva de normal
  public static void rellenarLaberinto (String[][] laberinto, int[] salida, int[] posicion) throws IndexOutOfBoundsException {
    for (int i = 0; i < laberinto.length; i++) {
      if (posicion[0] < 0 || posicion[0] > 19 || posicion[1] < 0 || posicion[1] > 19) throw new IndexOutOfBoundsException();
      for (int j = 0; j < laberinto[i].length; j++) {
        if ((i <= 18 && i >= 1) && (j <= 18 && j >= 1)) laberinto[i][j] = ".";
        if ((j == 0 || j == 19) && (i <= 19 && i >= 0)) laberinto[i][j] = "|";
        if ((i == 0 && j != 0 && j != 19) || (i == 19 && j != 0 && j != 19)) laberinto[i][j] = "-";
        if (i == posicion[0] && j == posicion[1]) laberinto[i][j] = "@";
        if (i == salida[0] && j == salida[1]) laberinto[i][j] = "#";
      }
    }
  }

  // Funcion que pinta un menu y devuelve la seleccion
  public static int menu () throws Exception{
    System.out.println();
    return genNum(1, 4);
  }
  
  public static void main(String[] args) {

    String[][] laberinto = new String[20][20];
    int pasos = 0;
    int[] salida = genSalida() , bomba = genBomba(salida), posicion = {0, 0};

    rellenarLaberinto(laberinto, salida, posicion);
    pintarLaberinto(laberinto);

    // Bucle que mientras que no llegues a la meta o a la bomba o te salgas del tablero seguiras pudiendo jugar
    do {
      try {
      
        int seleccion = menu();
        switch (seleccion) {
          case 1:
            if (posicion[1] + 1 < 0 || posicion[1] + 1 > laberinto.length) break;
            posicion[1] += 1;
            break;
          case 2:
          if (posicion[1] - 1 < 0 || posicion[1] - 1 > laberinto.length) break;
            posicion[1] -= 1;
            break;
          case 3:
          if (posicion[0] + 1 < 0 || posicion[0] + 1 > laberinto.length) break;
            posicion[0] += 1;
            break;
          case 4:
          if (posicion[0] - 1 < 0 || posicion[1] - 1 > laberinto.length) break;
            posicion[0] -= 1;
            break;
        }
        
        rellenarLaberinto(laberinto, salida, posicion);
        pintarLaberinto(laberinto);

        if (haGanado(posicion, salida)) {
          System.out.println("¡¡¡Felicidades!!!");
          System.out.println("Has tardado en llegar a la linea de meta en " + pasos + " pasos.");
          break;
        } else if (haPisadoBomba(posicion, bomba)) {
          System.out.println("!!!BUMM¡¡¡");
          System.out.println("Has pisado la bomba en " + pasos + " pasos.");
          break;
        }

        pasos++;
      
      } catch (IndexOutOfBoundsException e) {

        System.out.println("Te has salido del tablero y has perdido en " + pasos + " pasos.");
        
      } catch (Exception e) {
      
          System.out.println("Error: " + e.getMessage());
      
      }
    } while (!haGanado(posicion, salida) && !haPisadoBomba(posicion, bomba));

  }

}