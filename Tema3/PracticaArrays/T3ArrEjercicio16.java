/*
  16. Crea una matriz de 3x6 números enteros aleatorios no repetidos.
*/

import java.util.Arrays;

public class T3ArrEjercicio16 {

  public static int genNum () {
    return (int) Math.ceil(Math.random() * 1000);
  }
  
  public static void main(String[] args) {

    int[][] matriz = new int[3][6];

    // Rellenar el array de numeros aleatorios
    for (int i = 0; i < matriz.length; i++) {

      for (int j = 0; j < matriz[i].length; j++) {
        
        matriz[i][j] = genNum();

      }
      
    }
    // Hacer copia y ordenar el array
    int[][] copiaMatriz = matriz.clone();
    Arrays.sort(copiaMatriz);

    

  }

}