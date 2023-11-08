/*
  3. Crea un array de números de un tamaño pasado por teclado, el array contendrá números aleatorios entre 1 y 300
  y mostrar aquellos números que acaben en un dígito que nosotros le indiquemos por teclado (debes controlar
  que se introduce un numero correcto), estos deben guardarse en un nuevo array. Por ejemplo, en un array de 10
  posiciones e indicamos mostrar los números acabados en 5, podría salir 155, 25, etc. Cuando llene el segundo
  array finalizamos
*/

import java.util.Arrays;

public class T3ArrEjercicio3 {

  public static int genNum () {

    return (int) Math.ceil(Math.random() * 300);

  }
  
  public static void main(String[] args) {

    try {
      
      // Pedir numero de longitud del array
      System.out.println("Ingrese el numero de valores que se generaran:");
      int lenghtArray = Integer.parseInt(System.console().readLine());
      if (lenghtArray < 1) throw new Exception("Ingresa una longitud del array correcto");

      int[] nums = new int[lenghtArray];

      // Rellenar de valores el array
      for (int i = 0; i < nums.length; i++) {
        
        nums[i] = genNum();

      }

      // Pedir digito a encontrar
      System.out.println("Ingrese el digito y te mostrare varios numeros que terminen en ese numero:");
      int digito = Integer.parseInt(System.console().readLine());
      if (digito < 0 || digito > 9) throw new Exception("Ingrese un digito correcto");

      int[] numsConDigito = new int[5];
      int numsConDigitoContador = 0;

      // Bucle que busca si tienen el digito en la ultima cifra
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] % 10 == digito) {
          numsConDigito[numsConDigitoContador] = nums[i];
          numsConDigitoContador++;
          if (numsConDigitoContador == 5) break;
        }
      }
      
      // Imprimir los resultados
      System.out.println("Los numeros que tienen el digito introducido son: " + Arrays.toString(numsConDigito));


    } catch (Exception e) {
      
      System.out.println("Error: " + e);
      
    }

  }

}