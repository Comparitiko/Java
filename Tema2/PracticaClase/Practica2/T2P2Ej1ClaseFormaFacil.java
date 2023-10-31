public class T2P2Ej1ClaseFormaFacil {

  // Funcion que pasado el numero me devuelve los digitos que tiene
    public static int digitos (int num) {
      int digitos = 0;
      
      while (num > 0) {
        num /= 10;
        digitos++;

      }

      return digitos;

    }

    // Sacar digitos del String pasado por consola y ir pasandolo a la funcion de convertir en palotes
  public static void sacarDigito (int n) {

    System.out.println(n);

    while (n != 0) {
      
      convierteEnPalotes(n % 10);
      n /= 10;
      if (!(n < 10) || n % 10 != 0)System.out.print("- ");
      

    }
    
  }

  // Convertir los digitos en palotes y si es 0 poner un guion solo
  public static void convierteEnPalotes (int n) {

    for (int i = 0; i != n; i++) {

      System.out.print("| ");

    }
    
  }
  
  public static void main(String[] args) {

    // Declaracion de variables
    int newNum = 0, multiplicador;

    try {

      // Pedir numero por pantalla
      System.out.println("Ingrese un numero entero positivo");
      int num = Integer.parseInt(System.console().readLine());

      // Calcular el primer multiplicador segun los digitos que tenga el numero
      multiplicador = ((int) Math.pow(10, digitos(num))) / 10;

      // Bucle que vaya calculando el nuevo numero
      while (num > 0) {
        newNum += (num % 10) * multiplicador;
        multiplicador /= 10;
        num /= 10;
      }

      sacarDigito(newNum);

    } catch (Exception err) {

      System.out.println("Error: " + err.getMessage());

    }

  }

}