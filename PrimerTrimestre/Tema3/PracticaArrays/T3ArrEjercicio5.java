/*
  5. Leer 10 números enteros y a continuación mostrar la media de los números introducidos, el mayor valor y el
  menor valor. Usar un array para almacenar los valores y sacar toda la información en una sola iteración del array.
  Si puedes mejóralo implementando una función para cada tarea (media, mayor, menor), pasando el array.
*/

public class T3ArrEjercicio5 {

  // Funcion para calcular la media del array
  public static double sacarMedia (int[] nums) {

    double media = 0;

    for (int i = 0; i < nums.length; i++) {
      
      media += nums[i];

    }

    return media / nums.length;

  }

  // Funcion para sacar el numero mas grande
  public static int sacarMax (int[] nums) {

    int numMax = nums[0];

    for (int i = 0; i < nums.length; i++) {
      
      if (nums[i] > numMax) numMax = nums[i];

    }

    return numMax;

  }

  // Funcion para sacar el numero mas pequeño
  public static int sacarMin (int[] nums) {

    int numMin = nums[0];

    for (int i = 0; i < nums.length; i++) {
      
      if (nums[i] < numMin) numMin = nums[i];

    }

    return numMin;

  }
  
  public static void main(String[] args) {

    try {
    
      int[] nums = new int[10];

      // Bucle para insertar datos
      for (int i = 0; i < nums.length; i++) {
        
        System.out.println("Ingrese el valor numero " + (i + 1) + " del array:");
        nums[i] = Integer.parseInt(System.console().readLine());

      }

      // Imprimir por terminal el resultado
      System.out.println("La media de los numeros introducidos es: " + sacarMedia(nums));
      System.out.println("El numero mas grande insertado es " + sacarMax(nums));
      System.out.println("El numero mas pequeño insertado es " + sacarMin(nums));
    
    } catch (Exception e) {
    
        System.out.println("Error: " + e);
    
    }

  }

}