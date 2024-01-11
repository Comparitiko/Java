package SegundoTrimestre.Tema4.Ejercicios_POO.Ejercicio7;

public class TestIncidencia {
  public static void main(String[] args) {
    Incidencia i1 = new Incidencia(1, Incidencia.estadoIncidencia.enProceso, "problema 1");
    Incidencia i2 = new Incidencia(2, Incidencia.estadoIncidencia.abierta, "problema 2");
    Incidencia i3 = new Incidencia(3, Incidencia.estadoIncidencia.abierta, "problema 3");
    Incidencia i4 = new Incidencia(4, Incidencia.estadoIncidencia.abierta, "problema 4");
    Incidencia i5 = new Incidencia(5, Incidencia.estadoIncidencia.abierta, "problema 5");
    System.out.println("Las incidencias pendientes son: " + Incidencia.getPendientes());
    i1.setEstado(Incidencia.estadoIncidencia.resuelta);
    i2.setEstado(Incidencia.estadoIncidencia.resuelta);
    i3.setEstado(Incidencia.estadoIncidencia.enProceso);
    System.out.println("Las incidencias pendientes son: " + Incidencia.getPendientes());
  }
}
