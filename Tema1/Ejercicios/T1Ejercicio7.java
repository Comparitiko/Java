/*
  Ejercicio 7
  Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea saber
  cuánto deberá pagar finalmente por su compra.
 */

import java.util.Scanner;

public class T1Ejercicio7 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Declaracion de variables
    double precio, precioConDescuento;

    // Pedir valores
    System.out.println("¿Cuanto vale el articulo?");
    precio = sc.nextDouble();
    
    // Operacion para sacar el descuento
    precioConDescuento = precio * 0.85;

    // Imprimir por terminal el precio con descuento
    System.out.println("El precio al aplicar el descuento del 15% es: " + precioConDescuento);

    sc.close();
  }

}