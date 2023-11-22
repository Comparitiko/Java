/*
  3. Diseña un programa en Java que solicite al usuario una cadena en la que buscará y otra que será la
  cadena buscada. El programa indicará cuántas veces aparece la segunda cadena en la primera.
*/

public class T3StrEjercicio3 {
  
  public static void main(String[] args) {

    try {
    
      System.out.println("Ingrese la cadena:");
      String frase = System.console().readLine();

      System.out.println("Ingrese la cadena a buscar");
      String fraseABuscar = System.console().readLine();

      int contadorVeces = 0;
    
    } catch (Exception e) {
    
        System.out.println("Error: " + e);
    
    }

  }

}