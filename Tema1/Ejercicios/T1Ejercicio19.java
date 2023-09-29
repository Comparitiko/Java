/*
  Ejercicio 6
  La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual
  se clasifica en tipos A y B, y además en tamaños 1 y 2. Cuando se realiza la venta del
  producto, ésta es de un solo tipo y tamaño, se requiere determinar cuánto recibirá un
  productor por la uva que entrega en un embarque, considerando lo siguiente: si es de tipo
  A,se le cargan 20 céntimos al precio inicial cuando es de tamaño 1; y 30 céntimos si es de
  tamaño 2. Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos
  cuando es de tamaño 2. Realice un algoritmo para determinar la ganancia obtenida.
*/
import java.util.Scanner;

public class T1Ejercicio19 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Declaracion de variables
    double ganancia;

    // Pedir datos por terminal
    System.out.println("¿Cuantos vale el kilo de uva inicialmente?");
    double precioKgInicial = sc.nextDouble();

    System.out.println("Cuantos kilos de uva de tipo A y tamaño 1:");
    double uvaA1 = sc.nextDouble();

    System.out.println("Cuantos kilos de uva de tipo A y tamaño 2:");
    double uvaA2 = sc.nextDouble();

    System.out.println("Cuantos kilos de uva de tipo B y tamaño 1:");
    double uvaB1 = sc.nextDouble();

    System.out.println("Cuantos kilos de uva de tipo B y tamaño 2:");
    double uvaB2 = sc.nextDouble();

    // Calcular ganancia
    double kgTotales = uvaA1 + uvaA2 + uvaB1 + uvaB2;
    double totalPrecioInicial = kgTotales * precioKgInicial;
    double precioUvaA1 = uvaA1 * 0.20;
    double precioUvaA2 = uvaA2 * 0.30;
    double precioUvaB1 = uvaB1 * (-0.30);
    double precioUvaB2 = uvaB2 * (-0.50);

    double totalprecioUva = precioUvaA1 + precioUvaA2 + precioUvaB1 + precioUvaB2;

    ganancia = totalPrecioInicial + totalprecioUva;

    // Imprimir datos por terminal
    System.out.println("Las ganancias de la uva han sido de: " + ganancia);

    sc.close();

  }

}