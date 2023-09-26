class ParImparWhile {
  public static void main(String[] args) {
    // Declaracion de variables necesarias
    int numero = 1;

    // Bucle while para sacar los numeros impares hasta que lleguemos a 30
    while (numero<= 30) {

      // Imprimir en consola si es par o impar el numero 
      if (numero % 2 == 0) {
        System.out.println("El numero " + numero + " es par");
      } else {
        System.out.println("El numero " + numero + " es impar");
      }
      numero++;
    }
  }
}
