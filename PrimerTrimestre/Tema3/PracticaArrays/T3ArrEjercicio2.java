/*
  2. Crea una función que reciba como parámetro un array de 10 enteros, debe devolver el mismo array donde se
  hayan intercambiado el primer elemento y el último elemento.
*/

import java.util.Arrays;

public class T3ArrEjercicio2 {

  public static int[] cambiarArray (int[] nums) {
    
    int[] newNums = new int[nums.length];

    for (int i = 0; i < nums.length; i++) { 
      
      if (i == 0) newNums[i] = nums[nums.length - 1];
      else if (i == newNums.length - 1) newNums[i] = nums[0];
      else newNums[i] = nums[i];

    }
    return newNums; 
  }
  
  public static void main(String[] args) {

    int[] nums = new int[10];

    // Rellenar el array con datos pedidos por pantalla
    for (int i = 0; i < nums.length; i++) {
      try {
        
        System.out.println("Ingresa el " + (i + 1) + "º numero");
        nums[i] = Integer.parseInt(System.console().readLine());

      } catch (Exception e) {
        
        System.out.println("Error: " + e);
      
      }

    }

    int[] nums2 = cambiarArray(nums);

    System.out.println("El array despues de cambiar primer y ultimo valor es: " + Arrays.toString(nums2));

  }

}