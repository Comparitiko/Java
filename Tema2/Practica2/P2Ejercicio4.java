/*
  4. Crea una función que no devuelva nada (void) que, dado un importe en euros, nos indique el mínimo
  número de billetes y la cantidad sobrante que se pueden utilizar para obtener dicha cantidad. Ejemplo:
  362 euros  1 billete de 200, 1 billete de 100, 1 billete 50, un billete de 10, sobran 2 euros. Pista: hay
  que ir sacando la división entera, y el resto se lleva al siguiente billete.
*/

import java.util.Scanner;

public class P2Ejercicio4 {

  // Funcion que saca la cantidad de billetes necesarios para completar la cifra insertada
  public static void billetes (double euros) {

    if (euros > 500) {
      System.out.println("La cantidad de billetes de 500 que necesitas para obtener esa cantidad es: " + ((int) euros / 500));
      euros = euros % 500;
    }
    if (euros > 200) {
      System.out.println("La cantidad de billetes de 200 que necesitas para obtener esa cantidad es: " + ((int) euros / 200));
      euros = euros % 200;
    }
    if (euros > 100) {
      System.out.println("La cantidad de billetes de 100 que necesitas para obtener esa cantidad es: " + ((int) euros / 100));
      euros = euros % 100;
    }
    if (euros > 50) {
      System.out.println("La cantidad de billetes de 50 que necesitas para obtener esa cantidad es: " + ((int) euros / 50));
      euros = euros % 50;
    }
    if (euros > 20) {
      System.out.println("La cantidad de billetes de 20 que necesitas para obtener esa cantidad es: " + ((int) euros / 20));
      euros = euros % 20;
    }
    if (euros > 10) {
      System.out.println("La cantidad de billetes de 10 que necesitas para obtener esa cantidad es: " + ((int) euros / 10));
      euros = euros % 10;
    }
    if (euros > 5) {
      System.out.println("La cantidad de billetes de 5 que necesitas para obtener esa cantidad es: " + ((int) euros / 5));
      euros = euros % 5;
    }
    if (euros > 0) {
      System.out.println("Sobran " + euros + " euros");
    }

  }
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese la cantidad en euros:");
    double euros = sc.nextDouble();

    billetes(euros);

    sc.close();

  }

}