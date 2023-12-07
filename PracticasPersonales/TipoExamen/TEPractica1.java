

import java.util.Arrays;

/*
  3. [2 puntos] En Java existe una clase estática llamada Arrays que nos permite hacer varias
  cosas con arrays:
  a. Arrays.fill(array, valor): llena un array con un valor pasado como parámetro
  b. Arrays.sort(array): el array que se le pasa como parámetro queda ordenado
  c. Arrays.toString(array): pasa un array a String con sus elementos
  d. Arrays.copyOf(array): devuelve un array nuevo igual que el que se le pasa
  (1 punto) Realiza las siguientes tareas usando los métodos anteriores:
  a. Crear un array de 50 elementos de tipo int, declarar el array
  b. Rellena el array con el valor 100. Arrays.fill
  c. Pinta el vector con Arrays.toString
  d. Ordena el vector. Arrays.sort
  e. Pinta el vector con Arrays.toString
  f. Crea una copia del vector usando Arrays.copyOf.
  g. Pinta el vector copiado con Arrays.toString
  (1 punto) Por último, crea tres métodos que hagan lo mismo que fill, sort, toString:
  a. public static void rellenar(int array[], int valor)
  b. public static void ordenar(int array[])  Usa el método de la burbuja visto en clase.
  c. public static String pintar(int array[])  Devuelve un String así “[ele1, ele2, … ]”
*/

public class TEPractica1 {
  
  // Funcion para rellenar un array con un numero pasado por parametro
  public static void rellenar (int[] array, int valor) {

    for (int i = 0; i < array.length; i++) {
      array[i] = valor;
    }

  }

  // Funcion que ordena un array usando el metodo burbuja
  public static void ordenar (int[] array) {
    for (int i = 0; i < array.length; i++) {
      int movs = 0;
      for (int j = 0; j < array.length; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          movs++;
        }
      }
      if (movs == 0) break;
    }
  }

  public static String pintar(int array[]) {
    StringBuilder res = new StringBuilder(array.length);

    for (int i = 0; i < array.length; i++) {
      
      if (i == 0) res.append('[');
      res.append(array[i] + ", ");
      if (i == array.length - 1) res.append(']');

    }

    return res.toString();
  }

  public static void main(String[] args) {

    // 1. a)
    int[] nums = new int[50];
    // 1. b)
    Arrays.fill(nums, 100);
    // 1. c)
    System.out.println(Arrays.toString(nums));
    // 1. d)
    Arrays.sort(nums);
    // 1. e)
    System.out.println(Arrays.toString(nums));
    // 1. f)
    int[] numsC = Arrays.copyOf(nums, nums.length);
    // 1. g)
    System.out.println(Arrays.toString(numsC));

    int[] newNums = new int[50]; 
    // 2. a)
    rellenar(newNums, 200);
    // 2. b)
    ordenar(newNums);
    // 2. c)


  }

}
