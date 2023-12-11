import java.util.Arrays;

public class TableroDamas {
  
  public static void main(String[] args) {

    String[][] tablero = new String[8][8];

    for (int i = 0; i < tablero.length; i++) {
      
      for (int j = 0; j < tablero[i].length; j++) {
        
        if (((i == 0 || i == 2) && j % 2 != 0) || (i == 1 && j % 2 == 0)) tablero[i][j] = "N";
        else if (((i == tablero.length - 1 || i == tablero.length - 3) && j % 2 == 0) || (i == tablero.length - 2 && j % 2 != 0)) tablero[i][j] = "B";
        else tablero[i][j] = "-";


      }

    }

    for (int i = 0; i < tablero.length; i++) {
      
      System.out.println(Arrays.toString(tablero[i]));

    }

  }

}