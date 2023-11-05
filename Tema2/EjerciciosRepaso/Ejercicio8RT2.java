/*
  8. Realiza un programa que pinte los 20 primeros términos de esta serie: 1, -2, 3, -4, 5, -6, …
*/

public class Ejercicio8RT2 {
  
  public static void main(String[] args) {

    // Bucle que si la i es par la reste dos veces por su valor y saldra el numero negativo
    for (int i = 1; i <= 20; i++) {

      if (i == 20) System.out.print(i - i - i);
      else if (i % 2 == 0) System.out.print(i - i - i + ", ");
      else System.out.print(i + ", ");

    }

    System.out.println();

  }

}