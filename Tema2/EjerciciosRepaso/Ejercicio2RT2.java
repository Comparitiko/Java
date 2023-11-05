/*
  Realiza un programa que genere 20 números aleatorios entre 1 y 200, que diga cuántos números pares
  han salido y cuántos impares.
*/

public class Ejercicio2RT2 {
  
  // Generar num aleatorio
  public static int generarNum () {
    
    return (int) Math.ceil(Math.random() * 200);

  }

  public static void main(String[] args) {

    int numPares = 0;

    for (int i = 0; i != 20; i++) {

      int num = generarNum();

      System.out.println((i + 1) + ". El numero generado es: " + num);

      if (num % 2 == 0) numPares++;

    }

    System.out.println("Los numeros pares han sido " + numPares + " numeros");
    System.out.println("Los numeros impares han sido " + (20 - numPares) + " numeros");

  }

}