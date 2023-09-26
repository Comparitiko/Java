/*
  Ejercicio 1 
  Escribir un programa que pregunte al usuario su nombre, y luego lo salude.
 */

import java.util.Scanner;

class Ejercicio1 {

  public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);

    System.out.println("¿Como es tu nombre?");

    String nombre = sc.nextLine();

    System.out.println("Hola " + nombre);

    sc.close();

  }

 }