/*
  11. Realiza un programa que pida por teclado un número que será la base. Luego debe pedir otro número
  que indique hasta qué exponente lo quieres elevar y muestra todas esas potencias. Ej. Introduces el 3 y
  el 7, y debe mostrar 3¹, 3², 3³, 3⁴, etc
*/

public class Ejercicio11RT2 {
  
  public static void main(String[] args) {

    try {
      // Pedir valores
      System.out.println("Ingrese la base de la potencia");
      int base = Integer.parseInt(System.console().readLine());

      System.out.println("Ingrese la base de la potencia");
      int exponente = Integer.parseInt(System.console().readLine());

      // Bucle que calcule todas las potencias anteriores hasta llegar a la que introducimos
      for (int i = 1; i <= exponente; i++) {

        if (i == exponente) System.out.print( (int) Math.pow(base, i));
        else System.out.print( (int) Math.pow(base, i) + ", ");

      }

      System.out.println();
      
    } catch (Exception e) {
      
      System.out.println("Error: " + e);

    }

  }

}