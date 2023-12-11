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

public class T1Ejercicio53 {
  
  // Leer una fraccion por terminal y devolver un array
  public static int[] leerFraccion () {

    int numerador = 0, denominador = 0;

    try {

      System.out.println("Ingrese el numerador de la fraccion:");
      numerador = Integer.parseInt(System.console().readLine());

      System.out.println("Ingrese el denominador de la fraccion:");
      denominador = Integer.parseInt(System.console().readLine());

    } catch (Exception err) {

      System.out.println("Error: " + err);

    }

    int mcd = calcularMcd(numerador, denominador);

    int[] fraccionSimplificada = simplificarFraccion(mcd, numerador, denominador);

    System.out.println("La fraccion simplicada es:");
    escribirFraccion(fraccionSimplificada[0], fraccionSimplificada[1]);
      
    return fraccionSimplificada;

    
  }

  // Mostrar por pantalla la fraccion
  public static void escribirFraccion (int numerador, int denominador) {
      System.out.println(numerador);
      System.out.println("-");
      System.out.println(denominador);
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
  public static int[] simplificarFraccion (int mcd, int numerador, int denominador) {
    int newNumerador = numerador / mcd;
    int newDenominador = denominador / mcd;
    
    int[] numDenSimplificado = {newNumerador, newDenominador};

    return numDenSimplificado;
  }

  // Sumar fracciones
  public static void sumarFracciones () {
    
    int sumaNum = 0;
    int sumaDen = 0;

    System.out.println("Ingresa la fraccion 1");
    int[] fraccion1 = leerFraccion();

    System.out.println("Ingresa la fraccion 2");
    int[] fraccion2 = leerFraccion();

    sumaNum = fraccion1[0] * fraccion2[1] + fraccion2[0] * fraccion1[1];
    sumaDen = fraccion1[1] * fraccion2[1];

    System.out.println("La suma de las fracciones simplificadas es: ");
    escribirFraccion(sumaNum, sumaDen);
  }

  // Restar fracciones
  public static void restarFracciones () {
    
    int restaNum = 0;
    int restaDen = 0;

    System.out.println("Ingresa la fraccion 1");
    int[] fraccion1 = leerFraccion();

    System.out.println("Ingresa la fraccion 2");
    int[] fraccion2 = leerFraccion();

    restaNum = fraccion1[0] * fraccion2[1] - fraccion1[1] * fraccion2[0];
    restaDen = fraccion1[1] * fraccion2[1];

    System.out.println("La resta de las fracciones simplificadas es: ");
    escribirFraccion(restaNum, restaDen);

  }

  // Funcion para dividir dos fracciones
  public static void multiplicarFracciones () {

    int mulNum = 0;
    int mulDen = 0;

    System.out.println("Ingresa la fraccion 1");
    int[] fraccion1 = leerFraccion();

    System.out.println("Ingresa la fraccion 2");
    int[] fraccion2 = leerFraccion();

    mulNum = fraccion1[0] * fraccion2[0];
    mulDen = fraccion1[1] * fraccion2[1];

    System.out.println("La multiplicacion de las fracciones simplificadas es: ");
    escribirFraccion(mulNum, mulDen);

  }

  // Funcion para dividir dos fracciones
  public static void dividirFracciones () {

    int divNum = 0;
    int divDen = 0;

    System.out.println("Ingresa la fraccion 1");
    int[] fraccion1 = leerFraccion();

    System.out.println("Ingresa la fraccion 2");
    int[] fraccion2 = leerFraccion();

    divNum = fraccion1[0] * fraccion2[1];
    divDen =fraccion1[1] * fraccion2[0];
    
    System.out.println("La division de las fracciones simplificadas es: ");
    escribirFraccion(divNum, divDen);

  }

  public static void main(String[] args) {

    int opcionMenu = 0;

    // Menu que pida un numero
    do {

      System.out.println("---- Menú ----");
      System.out.println("1. Sumar dos fracciones");
      System.out.println("2. Restar dos fracciones");
      System.out.println("3. Multiplicar dos fracciones");
      System.out.println("4. Dividir dos fracciones");
      System.out.println("5. Salir");
      try {
        
        opcionMenu = Integer.parseInt(System.console().readLine());

        switch (opcionMenu) {
        case 1:
          System.out.println("Opcion de sumar fracciones seleccionada...");
          sumarFracciones();
          break;
        case 2:
        System.out.println("Opcion de restar fracciones seleccionada...");
          restarFracciones();
          break;
        case 3:
        System.out.println("Opcion de multiplicar fracciones seleccionada...");
          multiplicarFracciones();
          break;
        case 4:
        System.out.println("Opcion de dividir fracciones seleccionada...");
          dividirFracciones();
          break;
        case 5:
          System.out.println("Saliendo...");
          break;
    
        default:
          System.out.println("Numero incorrecto por favor ingrese uno de los valores mostrados");
         
    }

      } catch (Exception e) {
        
        System.out.println("Error: " + e);

      }

    } while (opcionMenu != 5);

  }

}