/*
  Ejercicio 12
  Dos vehículos viajan a diferentes velocidades (v1 y v2) y están distanciados por una distancia
  d. El que está detrás viaja a una velocidad mayor. Se pide hacer un algoritmo para ingresar
  la distancia entre los dos vehículos (km) y sus respectivas velocidades (km/h) y con esto
  determinar y mostrar en que tiempo (minutos) alcanzará el vehículo más rápido al otro.
*/

import java.util.Scanner;

public class T1Ejercicio12 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Declaracion de variables
    double d, v1, v2, tiempo;

    // Pedir valores por terminal
    System.out.println("Ingrese la distancia en kilometros entre los dos vehiculos:");
    d = sc.nextDouble();

    System.out.println("Ingrese la velocidad en km/h del vehiculo 1:");
    v1 = sc.nextDouble();

    System.out.println("Ingrese la velocidad en km/h del vehiculo 2:");
    v2 = sc.nextDouble();

    // Calcular el tiempo que tardan en ponerse a la par sabiendo que vehiculo va mas rapido para hacer bien el calculo
    if (v1 > v2) {
      tiempo = d / (v1 - v2) * 60;

      // Imprimir por terminal el resultado
      System.out.println("Los vehiculos tardaran en ponerse a la par: " + tiempo + " minutos");
    } else {
      tiempo = d / (v2 - v1) * 60;

      // Imprimir por terminal el resultado
      System.out.println("Los vehiculos tardaran en ponerse a la par: " + tiempo + " minutos");
    }




    sc.close();
  }

}