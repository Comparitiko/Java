/*
  Ejercicio 7
  La política de cobro de una compañía telefónica es: cuando se realiza una llamada, el cobro
  es por el tiempo que ésta dura, de tal forma que los primeros cinco minutos cuestan 1 euro,
  los siguientes tres, 80 céntimos, los siguientes dos minutos, 70 céntimos, y a partir del
  décimo minuto, 50 céntimos.
  Además, se carga un impuesto de 3 % cuando es domingo, y si es otro día, en turno de
  mañana, 15 %, y en turno de tarde, 10 %. Realice un algoritmo para determinar cuánto debe
  pagar por cada concepto una persona que realiza una llamada.
*/

import java.util.Scanner;

public class T1Ejercicio20 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Pedir datos por terminal
    System.out.println("¿Que dia realizo la llamada?");
    String dia = sc.nextLine();

    System.out.println("¿En que horario se realizo la llamada (mañana o tarde)?");
    String turno = sc.nextLine();

    System.out.println("¿Cuantos minutos duro la llamada?");
    int mins = sc.nextInt();

    // Calcular precio por concepto
    if (dia == "domingo" || dia == "Domingo" ) {
      if (turno == "Tarde" || turno == "tarde") {
        if (mins <= 5) {
          
        } else if (mins <= 8) {
          
        } else if (mins <= 10) {

        } else {

        }
      } else {
        if (mins <= 5) {

        } else if (mins <= 8) {
          
        } else if (mins <= 10) {

        } else {

        }
      }

    } else {
      if (turno == "Tarde" || turno == "tarde") {
        if (mins <= 5) {

        } else if (mins <= 8) {
          
        } else if (mins <= 10) {

        } else {

        }
      } else {
        if (mins <= 5) {

        } else if (mins <= 8) {
          
        } else if (mins <= 10) {

        } else {

        }
      }
    }

    // Imprimir datos por terminal
    System.out.println();

    sc.close();

  }

}