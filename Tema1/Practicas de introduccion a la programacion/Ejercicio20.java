/*
  20. Escriba usando variables las siguientes expresiones:
 */

public class Ejercicio20 {
  
  public static void main(String[] args) {
    
    // Declaracion de varriables y asignación de valores
    double a = 2, b = 9, d = 5, res1, res2, res3;

    // Hacer las expresiones usando variables
    res1 = 5 * Math.pow(a, 2) * Math.pow(b, 3) + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    res2 = Math.sqrt(4 * a * Math.pow(b, 2)) + Math.pow((a + b), 2);
    res3 = (Math.pow(a, 3) * b) / (2 * a * Math.pow(b, 2)) - Math.sqrt(12 * Math.pow(d, 4));

    // Imprimir en terminal resultados
    System.out.println("El resultado de la primera operación es: " + res1);
    System.out.println("El resultado de la segunda operación es: " + res2);
    System.out.println("El resultado de la tercera operación es: " + res3);
  }

}
