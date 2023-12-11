/*
  6. Generar 10 números enteros aleatorios. Debemos mostrarlos en el siguiente orden: el primero, el último, el
  segundo, el penúltimo, el tercero, etc… Pista: primero los guardas en un array y luego lo recorres como indica.
*/

import java.util.Arrays;

public class T3ArrEjercicio6 {

  // Funcion para generar numeros del 1 al 50
  public static int genNum () {

    return (int) Math.ceil(Math.random() * 50);

  }
  
  public static void main(String[] args) {

    int[] nums = new int[10];

    // Generar numeros e insertarlos en el array
    for (int i = 0; i < nums.length; i++) {
      
      nums[i] = genNum();

    }

    System.out.println("El array original es: " + Arrays.toString(nums));

    int[] numsMods = new int[nums.length];

    // Agregar los numeros intercalados al nuevo array
    int contador1 = 0, contador2 = nums.length - 1;

    for (int i = 0; i < nums.length; i += 2) {

      numsMods[i] = nums[contador1];
      numsMods[i + 1] = nums[contador2];
      contador1++;
      contador2--;

    }

    System.out.println("El array modificado es: " + Arrays.toString(numsMods));

  }

}