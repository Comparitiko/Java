class Factoriales {
  public static void main(String[] args) {

    // Declaracion de variable numero y darle el numero 1
    int numero = 1;
    int resultado = 1;
    int repeticiones = 8;
    // Bucle para sacar el factorial de 7
    while (numero <= repeticiones) {
      resultado = numero * resultado;
      numero ++;
    }
    
    // Imprimir por consola el resultado
    System.out.println(repeticiones + "! = " + resultado);
  }
}