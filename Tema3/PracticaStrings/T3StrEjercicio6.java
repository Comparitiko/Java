/*
  6. Crea un método que determine si una cadena es un palíndromo, o sea, se lee igual en los dos sentidos.
*/

public class T3StrEjercicio6 {

  // Metodo que compara si la cadena ingresada es igual a cadena dada la vuelta
  public static boolean esPalindromo (StringBuffer cadena) {
    System.out.println(cadena);
    System.out.println(cadena.reverse());
    System.out.println(cadena == cadena.reverse());
    if (cadena == cadena.reverse()) return true;
    else return false;
  }
  
  public static void main(String[] args) {

    try {
      
      System.out.println("Ingresa una cadena y te dire si es palindromo:");
      StringBuffer cad = new StringBuffer(System.console().readLine());

      if (esPalindromo(cad)) System.out.println("La cadena ingresada es un palindromo");
      else System.out.println("La cadena ingresada no es un palindromo");

    } catch (Exception e) {
      
      System.out.println("Error: " + e);

    }

  }

}