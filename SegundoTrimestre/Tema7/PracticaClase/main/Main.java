package SegundoTrimestre.Tema7.PracticaClase.main;

import SegundoTrimestre.Tema7.PracticaClase.services.Envio;
import SegundoTrimestre.Tema7.PracticaClase.entities.ProductoFragil;
import SegundoTrimestre.Tema7.PracticaClase.entities.ProductoRefrigerado;
import SegundoTrimestre.Tema7.PracticaClase.services.ServicioEnvio;

import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    // Crear productos
    ProductoRefrigerado p1 = new ProductoRefrigerado("Coca Cola", 0.30, 1);
    ProductoRefrigerado p2 = new ProductoRefrigerado("Fanta", 0.35, 2);
    ProductoRefrigerado p3 = new ProductoRefrigerado("Botella agua", 1, 2);
    ProductoFragil p4 = new ProductoFragil("Espejo", 20, 2);
    ProductoFragil p5 = new ProductoFragil("PC", 15, 1);
    ProductoFragil p6 = new ProductoFragil("Lampara", 3, 1);

    // Crear envios
    Envio envio1 = new Envio(true);
    Envio envio2 = new Envio(false);

    // Añadir productos y añadir fechas de llegada
    envio1.agregarTransportable(p1);
    envio1.agregarTransportable(p3);
    envio1.agregarTransportable(p5);
    envio1.setFechaLlegada(LocalDate.now().plusDays(4));

    envio2.agregarTransportable(p2);
    envio2.agregarTransportable(p4);
    envio2.agregarTransportable(p6);
    envio2.setFechaLlegada(LocalDate.now().plusDays(3));

    // Agregar envios a servicio
    ServicioEnvio sv1 = new ServicioEnvio();
    sv1.agregarEnvio(envio1);
    sv1.agregarEnvio(envio2);

    // Informe de envios
    System.out.println("----- Informe de envios -----");
    System.out.println(sv1.generarInformeEnvios());
  }
}
