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
  ===Restar_fracciones: Función que resta dos fracciones: numerador=n1*d2-d1*n2 y
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
  
  // Leer una fraccion por terminal
  public static void leerFraccion () {

    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese el numerador de la fraccion:");
    int numerador = sc.nextInt();

    System.out.println("Ingrese el denominador de la fraccion:");
    int denominador = sc.nextInt();

    escribirFraccion(numerador, denominador);
    int mcd = calcularMcd(numerador, denominador);
    simplificarFraccion(mcd, numerador, denominador);


    sc.close();
    
  }

  // Mostrar por pantalla la fraccion
  public static void escribirFraccion (int numerador, int denominador) {
    if (denominador == 1) {
      System.out.println(numerador);
    } else {
      System.out.println(numerador);
      System.out.println("-");
      System.out.println(denominador);
    }
  }

  // Funcion que calcula el mcd del numerador y el denominador
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

  // Simplificar la funcion
  public static void simplificarFraccion (int mcd, int numerador, int denominador) {
    int newNumerador = numerador / mcd;
    int newDenominador = denominador / mcd;
    System.out.println("La fraccion simplificada es:");
    System.out.println(newNumerador);
    System.out.println("-");
    System.out.println(newDenominador);
  }

  // Sumar fracciones
  public static void sumarFracciones () {
    
    Scanner sc = new Scanner(System.in);
    
    int sumaNum = 0;
    int sumaDen = 0;

    System.out.println("Ingrese el numerador de la fraccion 1:");
    int num1 = sc.nextInt();

    System.out.println("Ingrese el denominador de la fraccion 1:");
    int den1 = sc.nextInt();

    System.out.println("Ingrese el numerador de la fraccion 2:");
    int num2 = sc.nextInt();

    System.out.println("Ingrese el denominador de la fraccion 2:");
    int den2 = sc.nextInt();

    if (den1 == den2) {
      sumaNum = num1 + num2;
      sumaDen = den1;
    } else {
      sumaNum = num1 * den2 + num2 * den1;
      sumaDen = den1 * den2;
    }

    System.out.println(sumaNum);
    System.out.println("-");
    System.out.println(sumaDen);

    sc.close();
  }

  // Restar fracciones
  public static void restarFracciones () {

    Scanner sc = new Scanner(System.in);
    
    int restaNum = 0;
    int restaDen = 0;

    System.out.println("Ingrese el numerador de la fraccion 1:");
    int num1 = sc.nextInt();

    System.out.println("Ingrese el denominador de la fraccion 1:");
    int den1 = sc.nextInt();

    System.out.println("Ingrese el numerador de la fraccion 2:");
    int num2 = sc.nextInt();

    System.out.println("Ingrese el denominador de la fraccion 2:");
    int den2 = sc.nextInt();

    restaNum = num1 * den2 - den1 * num2;
    restaDen = den1 * den2;

    System.out.println(restaNum);
    System.out.println("-");
    System.out.println(restaDen);

    int mcd = calcularMcd(restaNum, restaDen);

    simplificarFraccion(mcd, restaNum, restaDen);

    sc.close();

  }

  public static void multiplicarFracciones () {

    Scanner sc = new Scanner(System.in);

    int mulNum = 0;
    int mulDen = 0;

    System.out.println("Ingrese el numerador de la fraccion 1:");
    int num1 = sc.nextInt();

    System.out.println("Ingrese el denominador de la fraccion 1:");
    int den1 = sc.nextInt();

    System.out.println("Ingrese el numerador de la fraccion 2:");
    int num2 = sc.nextInt();

    System.out.println("Ingrese el denominador de la fraccion 2:");
    int den2 = sc.nextInt();

    mulNum = num1 * num2;
    mulDen = den1 * den2;

    int mcd = calcularMcd(mulNum, mulDen);

    simplificarFraccion(mcd, mulNum, mulDen);

    sc.close();

  }

  public static void dividirFracciones () {

    Scanner sc = new Scanner(System.in);

    int divNum = 0;
    int divDen = 0;

    System.out.println("Ingrese el numerador de la fraccion 1:");
    int num1 = sc.nextInt();

    System.out.println("Ingrese el denominador de la fraccion 1:");
    int den1 = sc.nextInt();

    System.out.println("Ingrese el numerador de la fraccion 2:");
    int num2 = sc.nextInt();

    System.out.println("Ingrese el denominador de la fraccion 2:");
    int den2 = sc.nextInt();

    divNum = num1 * den2;
    divDen = den1 * num2;


    int mcd = calcularMcd(divNum, divDen);

    simplificarFraccion(mcd, divNum, divDen);

    sc.close();

  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int opcionMenu;

    do {
      opcionMenu = sc.nextInt();
    } while (opcionMenu != 4);

    sc.close();

  }

}