/*
  Ejercicio 6
  Vamos a crear un programa para trabajar con una pila. Una pila es una estructura de datos
  que nos permite guardar un conjunto de variables. La característica fundamental es que el
  último elemento que se añade al conjunto es el primero que se puede sacar.
  Para representar una pila vamos a utilizar un arreglo (vector) de cadena de caracteres con
  tamaño 10, por lo tanto, la pila no podrá tener más de 10 elementos.
  Vamos a crear varias funciones para trabajar con la pila:
  IncializarPila: Como tenemos un arreglo de 10 elementos de cadenas tenemos que
  inicializarlo e introducir un carácter (por ejemplo, un * que indique que ese elemento del
  arreglo no corresponde con un dato de la pila. Esta función inicializa el vector con ese
  carácter.
  LongitudPila: Función que recibe una pila y devuelve el número de elementos que tiene.
  EstaVaciaPila: Función que recibe una pila y que devuelve si la pila está vacía, no tiene
  elementos.
  EstaLlenaPila: Función que recibe una pila y que devuelve si la pila está llena.
  AddPila: función que recibe una cadena de caracteres y una pila, y añade la cadena a la pila,
  si no está llena. si está llena muestra un mensaje de error.
  SacarDeLaPila: Función que recibe una pila y devuelve el último elemento añadido y lo borra
  de la pila. Si la pila está vacía muestra un mensaje de error.
  EscribirPila: Función que recibe una pila y muestra en pantalla los elementos de la pila.
  Realiza un programa principal que nos permita usar las funciones anteriores, que nos
  muestre un menú, con las siguientes opciones:
  Añadir elemento a la pila
  Sacar elemento de la pila
  Longitud de la pila
  Mostrar pila
  Salir
*/

import java.util.Arrays;

public class T1Ejercicio54 {

  // Funcion que inicializa la pila con *
  public static String[] inicializarPila(String[] array) {

    for (int i = 0; i < array.length; i++) {

      array[i] = "*";

    }

    return array;

  }

  // Funcion que muestra la longitud de la pila
  public static int longitudPila(String[] array) {

    int elementos = 0;

    for (int i = 0; i < array.length; i++) {

      if (array[i] != "*")
        elementos++;

    }

    return elementos;

  }

  // Funcion que devuelve true si esta vacia y false si no
  public static boolean estaVaciaPila(String[] array) {

    int elementos = longitudPila(array);

    if (elementos != 0)
      return false;
    else
      return true;

  }

  // Funciona que devuelve true si la pila esta lleno y false si no
  public static boolean estaLlenaPila(String[] array) {

    int elementos = longitudPila(array);

    if (elementos != 10)
      return false;
    else
      return true;

  }

  // Funcion que añade a la pila en la primera posicion el valor del string pasado
  // por parametros
  public static String[] addPila(String[] array, String cadCar) throws Exception {

    if (estaLlenaPila(array))
      throw new Exception("La pila esta llena");

    for (int i = array.length - 1; i > 0; i--) {

      array[i] = array[i - 1];

    }

    array[0] = cadCar;

    return array;

  }

  // Sacar el ultimo valor añadido de la pila y devolverlo, ademas se pone un
  // asterisco para mostrar que ese valor esta vacio
  public static String sacarDeLaPila(String[] array) throws Exception {

    if (estaVaciaPila(array))
      throw new Exception("La pila esta vacia");

    String elOut = array[0];

    array[0] = "*";

    return elOut;

  }

  // Funcion que muestra todos los elementos de la pila
  public static void escribirPila(String[] array) {

    System.out.println("Los elementos de la pila son:");
    System.out.println(Arrays.toString(array));

  }

  public static void main(String[] args) {

    // Declaracion de variables
    int opcionMenu = 0;
    String cadCar = "", elOut;
    String[] vector = new String[10];
    vector = inicializarPila(vector);

    // Menu que pida un numero
    do {

      System.out.println("---- Menú ----");
      System.out.println("1. Añadir elemento a la pila");
      System.out.println("2. Sacar elemento de la pila");
      System.out.println("3. Longitud de la pila");
      System.out.println("4. Mostrar pila");
      System.out.println("5. Salir");
      try {

        opcionMenu = Integer.parseInt(System.console().readLine());

        switch (opcionMenu) {
          case 1:
            System.out.println("Opcion de añadir elemento a la pila seleccionada...");

            System.out.println();

            System.out.println("Ingrese el elemento que quiere añadir a la pila:");
            cadCar = System.console().readLine();

            addPila(vector, cadCar);
            break;
          case 2:
            System.out.println("Opcion de sacar elemento de la pila seleccionada...");
            elOut = sacarDeLaPila(vector);

            System.out.println();

            System.out.println("El elemento extraido de la pila es: " + elOut);
            break;
          case 3:
            System.out.println("Opcion de mostrar longitud de la pila seleccionada...");
            System.out.println(longitudPila(vector));
            break;
          case 4:
            System.out.println("Opcion de mostrar elementos de la pila seleccionada...");
            escribirPila(vector);
            break;
          case 5:
            System.out.println("Saliendo...");
            break;

          default:
            System.out.println("Numero incorrecto por favor ingrese uno de los valores mostrados");

        }

      } catch (Exception err) {

        System.out.println("Error: " + err.getMessage());

      }

    } while (opcionMenu != 5);

  }

}