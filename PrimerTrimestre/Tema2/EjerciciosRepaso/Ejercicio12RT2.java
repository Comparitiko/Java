/*
  12. Genera y muestra las tiradas de tres dados (seis caras) hasta que los tres dados saquen el mismo valor.
  Muestra las tiradas y el número de tiradas necesario hasta que han salido iguales.
*/

public class Ejercicio12RT2 {

  // Funcion que devuelve un numero entre el 1 y el 6
  public static int tirarDado () {

    return (int) Math.ceil(Math.random() * 6);

  }
  
  public static void main(String[] args) {

    int dado1, dado2, dado3, intentos = 0;

    // Bucle que cuenta los intentos y cambia el valor de los dados llamando a tirarDado
    do {

      System.out.println();

      dado1 = tirarDado();
      dado2 = tirarDado();
      dado3 = tirarDado();

      System.out.println("Intento " + (intentos + 1));
      System.out.println("Dado 1: " + dado1);
      System.out.println("Dado 2: " + dado2);
      System.out.println("Dado 3: " + dado3);

      intentos++;

    } while (dado1 != dado2 || dado1 != dado3);

    System.out.println();
    
    System.out.println("El numero de intentos hasta coincidir los 3 dados ha sido: " + intentos);

  }

}