/*
  26. Diseña un método que devuelva un String con un password adecuado generado aleatoriamente. Debe
  tener más de 8 caracteres, al menos una mayúscula y al menos un símbolo (#$%&/()=?¿!
*/

import java.util.Scanner;

public class P2Ejercicio26 {

  // Funcion para generar numero del 0 a la longitud del array - 1
  public static int generarNumero (int lenght) {

    int numRan = (int) (Math.random() * (lenght + 1));

    return numRan;

  }

  // Funcion que genera el password y lo controla si esta bien construido o no
  public static String generarPassword (int caracteres) {
    String[] minus = "abcdefghijklmnopqrstuvwxyz".split("");
    String[] mayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
    String[] simbolos = "(#$%&/()=?¿!".split("");
    String[][] tiposCaracteres = {minus, mayus, simbolos};
    boolean ok = false;
    int numMayus = 0, numSimbolos = 0;
    StringBuilder password = new StringBuilder();

    while (!ok) {

      // Generar un caracter
      int numTiposCaracteres = generarNumero(tiposCaracteres.length - 1);
      password.append(tiposCaracteres[numTiposCaracteres][generarNumero(tiposCaracteres[numTiposCaracteres].length - 1)]);

      if (numTiposCaracteres == 1) numMayus++;
      if (numTiposCaracteres == 2) numSimbolos++;
      if (password.length() == caracteres) {

        if (numMayus >= 1 && numSimbolos >= 1) {

          ok = true;

        } else {

          // Borra el contenido del array y la empieza de nuevo
          password.setLength(0);

        }

      }

    }

    return password.toString();

  }


  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Try-catch para capturar si el numero introducido es menor que 8
    try {

      System.out.println("De cuantos caracteres quieres la contraseña (tiene que ser mayor de 8):");
      int numCaracteres = sc.nextInt();
      sc.close();

      if (numCaracteres < 8) throw new IllegalArgumentException("Los caracteres minimo tienen que ser 8");

      System.out.println("La password generada es: " + generarPassword(numCaracteres));

    } catch (IllegalArgumentException err) {

      System.out.println(err.getMessage());

    }

  }

}
