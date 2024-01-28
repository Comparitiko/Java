package SegundoTrimestre.Tema5.EjerciciosPracticar.Ejercicio1;

import java.util.Scanner;

public class TestPersona {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese el nombre de  la persona");
    String nombre = sc.nextLine();

    System.out.println("Ingrese la edad de la persona");
    int edad = Integer.parseInt(sc.nextLine());

    System.out.println("Ingrese el DNI de la persona");
    String dni = sc.nextLine();

    System.out.println("Ingrse el sexo de la persona poniendo un numero de los de abajo, si pones un mal numero por defecto pondra Otro");
    System.out.println("1. Hombre");
    System.out.println("2. Mujer");
    System.out.println("3. Otro");
    int sexoNum = Integer.parseInt(sc.nextLine());

    Persona.Sexo sexo;

    switch (sexoNum) {
      case 1:
        sexo = Persona.Sexo.H;
        break;
      case 2:
        sexo = Persona.Sexo.M;
        break;
      default:
        sexo = Persona.Sexo.O;
        break;
    }
    System.out.println("Ingrese el peso de la persona");
    double peso = Double.parseDouble(sc.nextLine());

    System.out.println("Ingrese la altura de la persona");
    double altura = Double.parseDouble(sc.nextLine());

    sc.close();


    Persona p1 = new Persona(nombre, edad, dni, sexo, peso, altura);

    if (p1.esMayorDeEdad()) System.out.println("La persona ingresada es mayor de edad.");
    else System.out.println("La persona ingresada no es mayor de edad.");

    if (p1.calcularIMC() == -1) System.out.println("La persona ingresada tiene sobrepeso");
    else if (p1.calcularIMC() == 0) System.out.println("La persona ingresada tiene peso ideal");
    else System.out.println("La persona ingresada esta por debajo de su peso ideal");

    System.out.println(p1);

    Persona p2 = new Persona("Pedro", 19, dni, Persona.Sexo.H, 40.5, 1.4);

    if (p1.equals(p2)) System.out.println("La persona " + p1 + " tiene el mismo DNI que " + p2);
    else System.out.println("La persona " + p1 + " no tiene el mismo DNI que " + p2);
  }
}
