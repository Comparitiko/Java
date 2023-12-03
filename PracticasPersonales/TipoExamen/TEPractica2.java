package PracticasPersonales.TipoExamen;

import java.util.Arrays;

public class TEPractica2 {

  // Funcion para pintar el laberinto
  public static void pintarLaberinto (String[][] laberinto) {
    for (int i = 0; i < laberinto.length; i++) {
      System.out.println(Arrays.toString(laberinto[i]));
    }
  }
  // Funcion para inicizializar el array con lo pedido
  public static void rellenarLaberinto (String[][] laberinto) {
    for (int i = 0; i < laberinto.length; i++) {
      for (int j = 0; j < laberinto[i].length; j++) {
        if ((i <= 18 && i >= 1) && (j <= 18 && j >= 1)) laberinto[i][j] = ".";
        if ((j == 0 || j == 19) && (i <= 19 && i >= 0)) laberinto[i][j] = "|";
        //if (i == 0 || i == 19 && j != 0 || j != 19) laberinto[i][j] = "-";
      }
    }
  }
  
  public static void main(String[] args) {

    String[][] laberinto = new String[20][20];
    rellenarLaberinto(laberinto);
    pintarLaberinto(laberinto);

  }

}