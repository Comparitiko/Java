/*
  1. Programa Java que guarda en un array 20 números enteros que se generen aleatoriamente entre -100 y 100. A
  continuación, se recorre el array y calcula cuántos números son positivos y cuántos negativos.
*/

public class T3ArrEjercicio1 {

  public static int genNum (int max, int min) {

    return (int) Math.random() * max + min - min;

  }
  
  public static void main(String[] args) {

    int[] nums = new int[20];
    int numPositivos = 0, numNegativos = 0;

    for (int i = 0; i < nums.length; i++) {

      nums[i] = genNum(100, -100);

      if (nums[i] > 0) numPositivos++;
      if (nums[i] < 0) numNegativos++;

    }

    System.out.println("La cantidad de numeros positivos en el array es: " + numPositivos);
    System.out.println("La cantidad de numeros negativos en el array es: " + numNegativos);

  }

}