/*
  Ejercicio 7
  Una persona se encuentra en el kilómetro 70 de una carretera, otra se encuentra en el km
  150, los coches tienen sentido opuesto y tienen la misma velocidad. Realizar un programa
  para determinar en qué kilómetro de esa carretera se encontrarán.
*/

public class T1Ejercicio30 {
  
  public static void main(String[] args) {

    // Declaracion de variables
    double persona1 = 70, persona2 = 150, res;

    // Calcular el kilometro en el que se encontraran
    res = (persona1 + persona2) / 2;

    // Imprimir datos por terminal
    System.out.println("En el kilometro en el que se encontraran sera: " + res);

  }

}
