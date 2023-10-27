/*
  Menú
  Realiza un programa que pida un número por teclado. Luego muestra un menú con las
  siguientes opciones:
  1. Muestra la suma de cada uno de sus dígitos
  2. Que diga si es primo o no
  3. La longitud de una circunferencia cuyo radio fuera ese número
  4. Salir
  Para cada una de las opciones deberás llamar a una función que calcule lo que se pide y
  devuelva el resultado.
*/

public class T2P1Ej1Clase {

  // Funcion que imprime el menu por pantalla
  public static void menu() {
    System.out.println("---- Menu ----");
    System.out.println("1. Muestra la suma de cada uno de sus digitos");
    System.out.println("2. Saber si es primo o no");
    System.out.println("3. Saber longitud de circunferencia cuyo radio es el numero introducido");
    System.out.println("4. Salir");
  }

  // Funcion que suma los digitos de un numero
  public static void sumDigitos(int num) {
    int sumaDigitos = 0;
    while (num != 0) {
      sumaDigitos += (num % 10);
      num /= 10;
    }

    System.out.println("La suma de los digitos del numero introducido es: " + sumaDigitos);
  }

  // Funcion que diga si es primo
  public static void esPrimo(int num) {
    int numDivisores = 0;

    for (int i = 2; i != num / 2 + 1; i++) {
      if (num % i == 0) {
        numDivisores++;
        break;
      }
    }

    if (numDivisores == 0) {
      System.out.println("El numero es un numero primo");
    } else {
      System.out.println("El numero no es un numero primo");
    }

  }

  // Funcion que diga la longitud de la circunferencia dado el radio
  public static void longitudCircunferencia(int num) {

    System.out.println("La longitud de la circunferencia con radio " + num + " es: " + (Math.PI * 2 * num));

  }

  public static void main(String[] args) {
    
    // Declaracion de variables
    int opcionMenu;

    // try-catch para manejar que sean numeros los introducidos
    try {
      do {
        System.out.println("Ingrese un numero:");
        int num = Integer.parseInt(System.console().readLine());

        System.out.println();

        menu();
        opcionMenu = Integer.parseInt(System.console().readLine());

        // switch para saber que opcion se ha elegido
        switch (opcionMenu) {
          case 1:
            sumDigitos(num);
            break;
          case 2:
            esPrimo(num);
            break;
          case 3:
            longitudCircunferencia(num);
            break;
          case 4:
            System.out.println("Saliendo...");
            break;
          default:
            System.out.println("Ingrese un valor de vuelta, el valor tiene que coincidir con alguno que este en el menu.");
            break;
        }
      } while (opcionMenu != 4);

    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }

  }

}