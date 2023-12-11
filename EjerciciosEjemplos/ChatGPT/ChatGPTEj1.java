/*
  Escribe un programa en Java que rote los elementos de un array hacia la derecha según un número dado de posiciones. Por ejemplo, para el array {1, 2, 3, 4, 5} y un número de rotaciones igual a 2, el resultado debería ser {4, 5, 1, 2, 3}. 
*/

package ChatGPT;

import java.util.Arrays;

public class ChatGPTEj1 {

  public static void pintarArray (int[] nums) {
    System.out.println(Arrays.toString(nums));
  }
  
  public static void main(String[] args) {
    
    int[] array = {1, 2, 3, 4, 5};
    int numeroRotaciones = 4, temp = 0;

    System.out.println("Array sin modificar:");
    pintarArray(array);

    for (int i = 0; i < numeroRotaciones; i++) {
      
      for (int j = array.length - 1; j > 0; j--) {
        
        if (j == array.length - 1) temp = array[j];
        array[j] = array[j - 1];
        
      }

      array[0] = temp;

    }

    System.out.println("Array modificado:");
    pintarArray(array);

  }

}
