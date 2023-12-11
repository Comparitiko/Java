/*
  4. Programa Java para leer la altura de N personas y calcular la altura media. Calcular cuántas personas tienen una
  altura superior a la media y cuántas tienen una altura inferior a la media. El valor de N se pide por teclado y debe
  ser entero positivo
*/

public class T3ArrEjercicio4 {
  
  public static void main(String[] args) {

    try {
      
      // Pedir cantidad de numeros a leer
      System.out.println("Ingrese el numero de personas a las que se le lee la altura:");
      int arrayLenght = Integer.parseInt(System.console().readLine());

      double[] alturasPersonas = new double[arrayLenght];
      double sumaMedia = 0;

      // Rellenar alturas y sumar alturas para la media
      for (int i = 0; i < alturasPersonas.length; i++) {
        
        System.out.println("Ingrese la altura de la " + (i + 1) + "ª persona:");
        alturasPersonas[i] = Double.parseDouble(System.console().readLine());

        sumaMedia += alturasPersonas[i];

      }

      // Calcular media
      double media = sumaMedia / alturasPersonas.length;
      int mayorMedia = 0, menorMedia = 0;

      // Bucle para comprobar si la altura es mayor o menor que la media
      for (int i = 0; i < alturasPersonas.length; i++) {
        
        if (alturasPersonas[i] < media) menorMedia++;
        if (alturasPersonas[i] > media) mayorMedia++;

      }

      // Imprimir por terminal
      System.out.println("La media es: " + media);
      System.out.println("La cantidad de personas mas altas que la media es de: " + mayorMedia + " personas");
      System.out.println("La cantidad de personas mas bajas que la media es de: " + menorMedia + " personas");
    
    } catch (Exception e) {
    
        System.out.println("Error: " + e);
    
    }

  }

}