package SegundoTrimestre.Tema6.EjerciciosPracticar.Ejercicio7.Test;

import SegundoTrimestre.Tema6.EjerciciosPracticar.Ejercicio7.Clases.*;
import SegundoTrimestre.Tema6.EjerciciosPracticar.Ejercicio7.Clases.Operarios.Repartidor;

public class TestEmpleados {
  public static void main(String[] args) {
    Repartidor r1 = new Repartidor("Juan", 25, 10000, true, "Zona 1");
    Comercial c1 = new Comercial("ASd", 31, 1777, 201);

    System.out.println(r1);
    if (r1.plus()) System.out.println("El empleado " + r1.getNombre() + " ha recibido el plus");
    else System.out.println("El empleado " + r1.getNombre() + " no ha recibido el plus");

    if (c1.plus()) System.out.println("El empleado " + c1.getNombre() + " ha recibido el plus");
    else System.out.println("El empleado " + c1.getNombre() + " no ha recibido el plus");
  }
}
