/*
  6. Programa que sume los 100 primeros números enteros impares.
*/

public class P2Ejercicio6 {
  
  public static void main(String[] args) {

    // Declaracion de variables
    int num = 1, suma = 0, numImpares = 0;

    // Bucle que suma los 100 primeros numeros impares
    while (numImpares < 100) {
      
      if (num % 2 != 0) {
        suma = suma + num;
        numImpares++;
      }

      num++;

    }

    System.out.println("La suma de los 100 primeros numero impares es: " + suma);

  }

}