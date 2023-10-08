/*
  Ejercicio 4
  Queremos guardar la temperatura mínima y máxima de 5 días. realiza un programa que de
  la siguiente información:
    - La temperatura media de cada día
    - Los días con menos temperatura
    - Se lee una temperatura por teclado y se muestran los días cuya temperatura
    máxima coincide con ella. si no existe ningún día se muestra un mensaje de
    información.
*/

import java.util.Scanner;

public class T1Ejercicio46 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Declaracion de variables
    double[] tempMin = new double[5];
    double[] tempMax = new double[5];
    double temMasBaja = 99;
    boolean coincide = false;

    // Bucle para pedir todos los valores
    for (int i = 0; i != tempMax.length; i++) {
      System.out.println("Ingrese la temperatura minima del dia " + (i + 1));
      tempMin[i] = sc.nextDouble();

      System.out.println("Ingrese la temperatura maxima del dia " + (i + 1));
      tempMax[i] = sc.nextDouble();

    }

    // Bucle para sacar los resultados pedidos
    for (int i = 0; i != tempMax.length; i++) {
      System.out.println("La temperatura media del dia " + (i + 1) + " es: " + ((tempMin[i] + tempMax[i]) /2));
      if (tempMin[i] < temMasBaja) temMasBaja = tempMin[i];
    }

    // Imprimir por pantalla resultado temperatura mas baja registrada
    System.out.println("La temperatura mas baja registrada es de " + temMasBaja);
    
    System.out.println("Ingrese una temperatura para ver si se repite en alguna de las registradas");
    double comTemp = sc.nextDouble();

    // Bucle para comparar la temperatura pedida con el array
    for (int i = 0; i != tempMax.length; i++) {
      if (tempMin[i] == comTemp || tempMax[i] == comTemp) {
        coincide = true;
        if (tempMin[i] == comTemp) {
          System.out.println("La temperatura minima del dia " + (i + 1) + " es igual que le temperatura ingresada anteriormente");
        } else {
          System.out.println("La temperatura maxima del dia " + (i + 1) + " es igual que le temperatura ingresada anteriormente");
        }
      }
    }

    if (!coincide) System.out.println("No existe una temperatura registrada igual a " + comTemp);

    sc.close();

  }

}