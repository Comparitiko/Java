class Factoriales {
  public static void main(String[] args) {

    // Declaracion de variable numero y darle el numero 1
    int numero = 1;
    int resultado = 1;

    // Bucle para sacar el factorial de 7
    while (numero <= 8) {
      resultado = numero * resultado;
      numero ++;
    }
    
    // Imprimir por consola el resultado
    System.out.println(numero + "! = " + resultado);
  }
}