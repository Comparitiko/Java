/*
  Ejercicio 5
  Queremos crear un programa que trabaje con fracciones a/b. Para representar una fracción
  vamos a utilizar dos enteros: numerador y denominador.
  Vamos a crear las siguientes funciones para trabajar con funciones:
  Leer_fracción: La tarea de esta función es leer por teclado el numerador y el denominador.
  Cuando leas una fracción debes simplificarla.
  Escribir_fracción: Esta función escribe en pantalla la fracción. Si el dominador es 1, se
  muestra sólo el numerador.
  Calcular_mcd: Esta función recibe dos número y devuelve el máximo común divisor.
  Simplificar_fracción: Esta función simplifica la fracción, para ello hay que dividir numerador
  y dominador por el MCD del numerador y denominador.
  Sumar_fracciones: Función que recibe dos funciones n1/d1 y n2/d2, y calcula la suma de las
  dos fracciones. La suma de dos fracciones es otra fracción cuyo numerador=n1*d2+d1*n2 y
  denominador=d1*d2. Se debe simplificar la fracción resultado.
  Restar_fracciones: Función que resta dos fracciones: numerador=n1*d2-d1*n2 y
  denominador=d1*d2. Se debe simplificar la fracción resultado.
  Multiplicar_fracciones: Función que recibe dos fracciones y calcula el producto, para ello
  numerador=n1*n2 y denominador=d1*d2. Se debe simplificar la fracción resultado.
  Dividir_fracciones: Función que recibe dos fracciones y calcula el cociente, para ello
  numerador=n1*d2 y denominador=d1*n2. Se debe simplificar la fracción resultado.
  Crear un programa que utilizando las funciones anteriores muestre el siguiente menú:
  Sumar dos fracciones: En esta opción se piden dos fracciones y se muestra el resultado.
  Restar dos fracciones: En esta opción se piden dos fracciones y se muestra la resta.
  Multiplicar dos fracciones: En esta opción se piden dos fracciones y se muestra el producto.
  Dividir dos fracciones: En esta opción se piden dos fracciones y se muestra el cociente.
  Salir
*/

import java.util.Scanner;

public class T1Ejercicio53 {
  
  public static void leerFraccion () {

    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese el numerador de la fraccion:");
    int numerador = sc.nextInt();

    System.out.println("Ingrese el denominador de la fraccion:");
    int denominador = sc.nextInt();

    escribirFraccion(numerador, denominador);
    calcularMcd(numerador, denominador);

    sc.close();
    
  }

  public static void escribirFraccion (int numerador, int denominador) {
    if (denominador == 1) {
      System.out.println(numerador);
    } else {
      System.out.println(numerador);
      System.out.println("-");
      System.out.println(denominador);
    }
  }

  public static int calcularMcd (int numerador, int denominador) {
    
    int mcd = numerador;

    while (denominador != 0) {
      int temp = denominador;
      denominador = numerador % denominador;
      numerador = temp;
      mcd = numerador;
    }
  
    return mcd;
  }

  public static void main(String[] args) {

    leerFraccion();

  }

}