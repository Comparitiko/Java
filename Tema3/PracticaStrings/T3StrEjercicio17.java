/*
  3. Realiza un método que tome como parámetros de entrada dos arrays de enteros y devuelva como
  salida un único array con los dos elementos de los anteriores arrays ordenados de forma ascendente.
*/

import java.util.Arrays;

public class T3StrEjercicio17 {

  // Funcion para devolver un numero entre 1 y 100
  public static int genNum () {
    return (int) Math.ceil(Math.random() * 100);
  }

  // Rellenar arrays pasado por parametro con numeros aleatorios
  public static void rellenarArray (int[] nums) {
    
    for (int i = 0; i < nums.length; i++) {
      
      nums[i] = genNum();

    }

  }

  // Funcion que ordena dos arrays pasadas por parametros en un solo array
  public static int[] unirOrdenadamente (int[] array1, int[] array2) {

    int[] arrayUnion = new int[array1.length + array2.length];
    
    

    return arrayUnion;
    
  }
  
  public static void main(String[] args) {

    int[] nums1 = new int[25], nums2 = new int[20];

    // Rellenar arrays llamando a la funcion rellenarArray
    rellenarArray(nums1);
    rellenarArray(nums2);

    System.out.println("El array 1 es: " + Arrays.toString(nums1));
    System.out.println("El array 2 es: " + Arrays.toString(nums2));

    System.out.println();

    System.out.println("El array que junta los dos arrays es: " + Arrays.toString(unirOrdenadamente(nums1, nums2)));

  }

}