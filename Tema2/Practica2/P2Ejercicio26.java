/*
  26. Diseña un método que devuelva un String con un password adecuado generado aleatoriamente. Debe
  tener más de 8 caracteres, al menos una mayúscula y al menos un símbolo (#$%&/()=?¿!
*/

public class P2Ejercicio26 {

  public static String generarPassword () {
    String[] minus = "abcdefghijklmnopqrstuvwxyz".split("");
    String[] mayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
    String[] simbolos = "(#$%&/()=?¿!".split("");


    return "Hola";
  }
  
  public static void main(String[] args) {

    System.out.println(generarPassword());

  }

}
