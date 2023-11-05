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
      // Pedir numero de filas
      System.out.println("Ingrese el numero de filas a mostrar:");
      int filas = Integer.parseInt(System.console().readLine());

      int espacios = (filas - 1) * 2, nums = 1, num = 1;

      for (int i = 1; i <= filas; i++) {
      
        // Bucle para poner espacios y y num dependiendo de la posicion en la que se encuentre el numero
        for (int j = 1; j <= espacios + nums; j++) {
  
          if (j <= espacios / 2) {
            System.out.print(" ");
          } else if (j <= espacios / 2 + nums) {
            if (j > filas) num--;
            System.out.print(num);
            if (j < filas) num++;
          } else {
            System.out.print(" ");
          }
  
        }
        // Resetear num para que empiece a contar de nuevo
        num = 1;
  
        System.out.println();
        espacios -= 2;
        nums += 2;
  
      }
      
      
    } catch (Exception e) {

      System.out.println("Error: " +  e);

    }

  }

}