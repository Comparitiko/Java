/*
  10. Realiza un programa que genere una apuesta de la quiniela de forma aleatoria, son 14 filas donde debe
  aparecer 1 X o 2. Intenta que los unos salgan en una columna, las equis en otra y los doses en otra.
*/
  
public class Ejercicio10RT2 {

  // Generar un numero aleatorio entre 1 y 3
  public static int generarNum () {

    return (int) Math.ceil(Math.random() * 3);

  }
  public static void main(String[] args) {

    System.out.println();

    // Bucle que vaya mostrando 1, X o 2 dependiendo del numero aleatorio que se genera
    for (int i = 1; i <= 14; i++) {

      int n = generarNum();

      switch (n) {
        case 1:
          System.out.print("1");
          break;
        case 2:
          System.out.print("  X");
          break;
        default:
          System.out.print("    2");
          break;
      }

      System.out.println();

    }

  }

}