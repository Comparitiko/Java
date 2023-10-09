import java.util.Scanner;

class Factoriales {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Declaracion de variable numero y darle el numero 1
    int numero = 1;
    long resultado = 1;
    
    System.out.println("Ingrese el numero al que le quiere calcular su factroial: ");
    int repeticiones = sc.nextInt();



    // Bucle para sacar el factorial de numero indicado
    while (numero <= repeticiones) {
      resultado = numero * resultado;
      numero ++;
    }
    
    // Imprimir por consola el resultado
    System.out.println(repeticiones + "! = " + resultado);

    sc.close();
  }
}