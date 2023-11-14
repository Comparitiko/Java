/*
  16. Crea una matriz de 3x6 números enteros aleatorios no repetidos.
*/

import java.util.Arrays;

public class T3ArrEjercicio16 {

  public static int genNum () {
    return (int) Math.ceil(Math.random() * 1000);
  }
  
  public static void main(String[] args) {

    int[][] matriz = new int[3][6], copiaMatriz = matriz.clone();

    // Rellenar el array de numeros aleatorios
    for (int i = 0; i < matriz.length; i++) {

      for (int j = 0; j < matriz[i].length; j++) {

        // Cada vez que se agrega un numero se ordena de nuevo
        int numeroGen;
        Arrays.sort(copiaMatriz);
        
        while (true) {
          numeroGen = genNum();
          if (Arrays.binarySearch(copiaMatriz, numeroGen) <= -1) {
            matriz[i][j] = numeroGen;
            copiaMatriz[i][j] = numeroGen;
            break;
          }
        }

      }
      
    }
    
    for (int i = 0; i < matriz.length; i++) {
      
      System.out.println(Arrays.toString(matriz[i]));

    }

  }

}