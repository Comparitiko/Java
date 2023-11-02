/*
  Realiza un programa que vaya pidiendo números enteros mientras no introduzcas el -1. Como resultado
  debe devolver la cantidad de números introducidos y la suma de esos números.
*/

public class Ejercicio1RT2 {

  public static int sumaDigitos (int n) {

    int suma = 0;

    while (n != 0) {
      
      suma += n % 10;
      n /= 10;

    }

    return suma;

  }

  public static int digitos (int n) {
    int digitos = 0;

    while (n != 0) {
      
      n /= 10;
      digitos++;

    }

    return digitos;

  }
  
  public static void main(String[] args) {

    int num = 0;
    
    do {
      
      try {
       
        System.out.println("Inserte un numero mayor o igual que 0, si quiere salir ingrese el valor (-1)");
        num = Integer.parseInt(System.console().readLine());

        if (num < -1) throw new Exception("El numero tiene que ser mayor o igual que (-1)");

        switch (num) {
          case -1:
            System.out.println("Saliendo...");
            break;
          default:
            System.out.println("El numero " + num + " tine " + digitos(num) + " digitos");
            System.out.println("La suma de los digitos del numero " + num + " es " + sumaDigitos(num));
            System.out.println();
            break;
        }

      } catch (Exception e) {
        
        System.out.println("Error: " + e);

      }

    } while (num != -1);

  }

}