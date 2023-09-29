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
    
    // Declaracion de variables
    double pTurnoDia, pMins;

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
          pMins = 1;
          pTurnoDia = pMins * 0.03;
          System.out.println("El precio de los minutos es: " + pMins);
          System.out.println("El precio del turno de domingo es: " + pTurnoDia);
        
        } else if (mins <= 8) {
          pMins = 1 + 0.80;
          pTurnoDia = pMins * 0.03;
          System.out.println("El precio de los minutos es: " + pMins);
          System.out.println("El precio del turno de domingo es: " + pTurnoDia);

        } else if (mins <= 10) {
          pMins = 1 + 0.80 + 0.70;
          pTurnoDia = pMins * 0.03;
          System.out.println("El precio de los minutos es: " + pMins);
          System.out.println("El precio del turno de domingo es: " + pTurnoDia);

        } else {
          pMins = 1 + 0.80 + 0.70 + 0.50;
          pTurnoDia = pMins * 0.03;
          System.out.println("El precio de los minutos es: " + pMins);
          System.out.println("El precio del turno de domingo es: " + pTurnoDia);

        }
      } else {
        if (mins <= 5) {
          pMins = 1;
          pTurnoDia = pMins * 0.03;
          System.out.println("El precio de los minutos es: " + pMins);
          System.out.println("El precio del turno de domingo es: " + pTurnoDia);
        
        } else if (mins <= 8) {
          pMins = 1 + 0.80;
          pTurnoDia = pMins * 0.03;
          System.out.println("El precio de los minutos es: " + pMins);
          System.out.println("El precio del turno de domingo es: " + pTurnoDia);

        } else if (mins <= 10) {
          pMins = 1 + 0.80 + 0.70;
          pTurnoDia = pMins * 0.03;
          System.out.println("El precio de los minutos es: " + pMins);
          System.out.println("El precio del turno de domingo es: " + pTurnoDia);

        } else {
          pMins = 1 + 0.80 + 0.70 + 0.50;
          pTurnoDia = pMins * 0.03;
          System.out.println("El precio de los minutos es: " + pMins);
          System.out.println("El precio del turno de domingo es: " + pTurnoDia);

        }
      }
    } else {
      if (turno == "Tarde" || turno == "tarde") {
        if (mins <= 5) {
          pMins = 1;
          pTurnoDia = pMins * 0.10;
          System.out.println("El precio de los minutos es: " + pMins);
          System.out.println("El precio del turno del dia " + dia + " por la tarde es: " + pTurnoDia);

        } else if (mins <= 8) {
          pMins = 1 * 0.80;
          pTurnoDia = pMins * 0.10;
          System.out.println("El precio de los minutos es: " + pMins);
          System.out.println("El precio del turno del dia " + dia + " por la tarde es: " + pTurnoDia);

        } else if (mins <= 10) {
          pMins = 1 * 0.80 * 0.70;
          pTurnoDia = pMins * 0.10;
          System.out.println("El precio de los minutos es: " + pMins);
          System.out.println("El precio del turno del dia " + dia + " por la tarde es: " + pTurnoDia);

        } else {
          pMins = 1 * 0.80 * 0.70 * 0.50;
          pTurnoDia = pMins * 0.10;
          System.out.println("El precio de los minutos es: " + pMins);
          System.out.println("El precio del turno del dia " + dia + " por la tarde es: " + pTurnoDia);

        }
      } else {
        if (mins <= 5) {
          pMins = 1;
          pTurnoDia = pMins * 0.15;
          System.out.println("El precio de los minutos es: " + pMins);
          System.out.println("El precio del turno del dia " + dia + " por la mañana es: " + pTurnoDia);

        } else if (mins <= 8) {
          pMins = 1 * 0.80;
          pTurnoDia = pMins * 0.15;
          System.out.println("El precio de los minutos es: " + pMins);
          System.out.println("El precio del turno del dia " + dia + " por la mañana es: " + pTurnoDia);
          
        } else if (mins <= 10) {
          pMins = 1 * 0.80 * 0.70;
          pTurnoDia = pMins * 0.15;
          System.out.println("El precio de los minutos es: " + pMins);
          System.out.println("El precio del turno del dia " + dia + " por la mañana es: " + pTurnoDia);

        } else {
          pMins = 1 * 0.80 * 0.70 * 0.50;
          pTurnoDia = pMins * 0.15;
          System.out.println("El precio de los minutos es: " + pMins);
          System.out.println("El precio del turno del dia " + dia + " por la mañana es: " + pTurnoDia);

        }
      }
    }

    sc.close();

  }

}