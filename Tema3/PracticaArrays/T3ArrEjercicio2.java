/*
  2. Crea una función que reciba como parámetro un array de 10 enteros, debe devolver el mismo array donde se
  hayan intercambiado el primer elemento y el último elemento.
*/

import java.util.Arrays;

public class T3ArrEjercicio2 {
  
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

    // Intercambiar los valores de primera y ultima posicion
    int temp = nums[0];
    nums[0] = nums[nums.length - 1];
    nums[nums.length - 1] = temp;

    System.out.println("El array despues de cambiar primer y ultimo valor es: " + Arrays.toString(nums));

  }

}