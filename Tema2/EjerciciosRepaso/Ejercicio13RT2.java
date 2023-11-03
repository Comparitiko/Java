/*
  13. Escribe un programa que lea un número N e imprima una pirámide de números con N filas como en la
  siguiente figura: 
    1
   121
  12321
 1234321
*/

public class Ejercicio13RT2 {
  
  public static void main(String[] args) {
    
    try {

      System.out.println("Ingrese el numero de filas a mostrar");
      int filas = Integer.parseInt(System.console().readLine());
      
      
    } catch (Exception e) {

      System.out.println("Error: " +  e);

    }

  }

}