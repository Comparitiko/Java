/* 
  12. Realiza un programa en Java que, dadas dos variables a y b, intercambie los valores de a y b.
 */
public class Ejercicio12 {

  public static void main(String[] args) {
    
    // Declaración de variables
    int a = 5, b = 10, aTemp, bTemp;

    // Devolver resultados en terminal antes de ser modificados
    System.out.println("El valor de a antes de ser modificado es: " + a);
    System.out.println("El valor de b antes de ser modificado es: " + b);

    // Intercambiar valores
    bTemp = a;
    aTemp = b;
    b = bTemp;
    a = aTemp;

    // Devolver resultados en terminal
    System.out.println("El valor de a despues de ser modificado es: " + a);
    System.out.println("El valor de b despues de ser modificado es: " + b);

  }
  
}
