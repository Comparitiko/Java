/*
  Ejercicio 6
  Escribe un método que permita cifrar/descifrar una cadena usando el cifrado Cesar, es decir,
  a cada carácter de la cadena se le suma una cifra en el abecedario. Se pide por teclado la
  palabra a cifrar/descifrar, la clave (cifra) y lo que se desea hacer, cifrar o descifrar.
*/

import java.util.Scanner;

public class T1Ejercicio40 {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // Declaracion de variables
    String cifrarODescifrar = "";
    String[] alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ 1234567890".split("");
    int clave = 0, numCarsAlfabeto = alfabeto.length;
    
    // Pedir valores por terminal
    System.out.println("Ingrese una cadena");
    String[] cadena = sc.nextLine().toUpperCase().split("");
  
    while (clave <= 0) {
      System.out.println("Ingrese la clave para cifrar o descifrar");
      clave = sc.nextInt();
      if (clave <= 0) System.out.println("Error la clave insertada no puede ser menor o igual que 0");
    }

    while (true) {
      System.out.println("¿Que quiere hacer cifrar o descifrar?");
      cifrarODescifrar = sc.nextLine();
      if (cifrarODescifrar.equals("cifrar") || cifrarODescifrar.equals("descifrar")) break;
      System.out.println("Error: Ingrese una de las dos opciones");
    }

    if (cifrarODescifrar.equals("cifrar")) {
      for (int iCad = 0; iCad != cadena.length; iCad++) {
        
        for (int numCarAlfabeto = 0; numCarAlfabeto != (numCarsAlfabeto - 1); numCarAlfabeto++) {
          if(cadena[iCad].equals(alfabeto[numCarAlfabeto])) System.out.print(alfabeto[numCarAlfabeto + clave]);
        }

      }
    } else {
      for (int iCad = 0; iCad != cadena.length; iCad++) {
        
        for (int numCarAlfabeto = 0; numCarAlfabeto != (numCarsAlfabeto - 1); numCarAlfabeto++) {
          if(cadena[iCad].equals(alfabeto[numCarAlfabeto])) System.out.print(alfabeto[numCarAlfabeto - clave]);
        }

      }
    }

    sc.close();

  }

}