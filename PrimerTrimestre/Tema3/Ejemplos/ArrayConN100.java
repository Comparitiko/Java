import java.util.Arrays;

public class ArrayConN100 {
  
  public static void main(String[] args) {

    // Declarar Arrays
    int[] nums = new int[100], nPares = new int[50], nImpares = new int[50];

    // Ingresar valores del 1 al 100
    for (int i = 0; i < nums.length; i++) {
      
      nums[i] = i + 1;

    }

    // Rellenar el array de pares e impares segun el numero del array nums
    for (int i = 0; i < nums.length; i++) {
      
      if (nums[i] % 2 == 0) nPares[i / 2] = nums[i];
      else nImpares[i / 2] = nums[i];

    }
    
    // Imprimir por terminal
    System.out.println(Arrays.toString(nPares));
    System.out.println(Arrays.toString(nImpares));

  }

}