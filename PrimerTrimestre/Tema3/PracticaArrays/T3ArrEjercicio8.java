/*
  8. Genera aleatoriamente una tabla de 10 elementos numéricos enteros, guardalos en una array. Luego pide por
  teclado una posición (entre 0 y 9). Eliminar el elemento situado en la posición dada sin dejar huecos.
*/

import java.util.Arrays;

public class T3ArrEjercicio8 {

  public static int genNum(int min, int max) throws Exception {
    if (min > max) throw new Exception("El max tiene que ser un numero mayor que el minimo");
    return (int) ((Math.random() * (max - min + 2) + min - 1));
  }
  
  public static void main(String[] args) {

    int[] nums = new int[10], numsMods = new int[nums.length - 1];
    int pos;
    
    // Bucle para insertar numeros enteros aleatorios
    for (int i = 0; i < nums.length; i++) {

      try {
        nums[i] = genNum(1, 100);
      } catch (Exception e) {
        System.out.println("Error: " + e);
      }

    }

    System.out.println("El array sin modificar es este: " + Arrays.toString(nums));

    try {
    
      System.out.println("Ingrese el valor de la posicion del array que quiere quitar, tiene que estar entre 0 y " + (nums.length - 1));
      pos = Integer.parseInt(System.console().readLine());
      if (pos < 0 || pos >= nums.length) throw new Exception("Ingrse una posicion correcta la proxima vez");

      // Bucle para ir añadiendo numeros en la segunda array sin meter el valor de la posicion pasada por pantalla
      for (int i = 0; i < nums.length; i++) {

        if (i < pos) numsMods[i] = nums[i];
        else numsMods[i] = nums[i + 1];

        if (i == numsMods.length - 1) break;
      
      }

      System.out.println("El array modificado es este: " + Arrays.toString(numsMods));

    } catch (Exception e) {
    
        System.out.println("Error: " + e);
    
    }

  }

}