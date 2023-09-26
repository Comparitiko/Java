/*
  7. ¿Por qué no compila el siguiente programa? Modifícalo para hacer que funcione.
    class Suma {
      public static void main(String [] args) {
        int n1=50,n2=30,
        boolean suma=0;
        suma=n1+n2;
        System.out.println("LA SUMA ES: " + suma);
      }
    }

    El programa no compila porque suma es de tipo booleano y se le intenta asignar un entero.

 */

public class Ejercicio7 {
  public static void main(String[] args) {
    int n1 = 50, n2 = 30;
    int suma = 0;
    suma= n1 + n2;
    System.out.println("LA SUMA ES: " + suma);
  }
}
