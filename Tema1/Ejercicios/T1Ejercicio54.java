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