package SegundoTrimestre.examenSegundoTrimestre.src;

import entities.Pasajero;
import entities.TipoAsiento;
import entities.TipoTarifa;
import services.Atrapame;
import services.ReservaVuelo;
import services.Vuelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Atrapame atrapame = new Atrapame();
    for (int i = 0; i < 1000; i++) {
      Vuelo vuelo = new Vuelo(("Cod" + i), ("origen " + i), ("destino " + i), LocalDate.of(2025, 05, 22),
              LocalTime.now(), (1.0 + i), (10 + i));
      atrapame.addVuelo(vuelo);
      ArrayList<Pasajero> pasajeros = new ArrayList<>();
      for (int j = 0; j < 5; j++) {
        pasajeros.add(new Pasajero((long) i, "Nombre " + i, "apellido " + i, "DNI" + i + j, i + "@gmail.com", "Direccion " + i, "Ciudad " + i, "pais", ("T" + i + j), "Sin preferencias", "sin restricciones"));
      }
      atrapame.crearReserva(vuelo, pasajeros, TipoTarifa.FLEXIBLE, TipoAsiento.TURISTA);
      System.out.println("El vuelo " + i + " es");
      System.out.println(vuelo);
    }
    System.out.println("Las reservas son:");
    for (ReservaVuelo reseva : atrapame.getReservas()) {
      System.out.println(reseva);
    }

    System.out.println("Las reservas del dni DNI1002 son:");
    System.out.println(atrapame.buscarReservas("DNI1002"));

    System.out.println("Los vuelos del destino destino 5 con fecha 22-05-2025 son: ");
    System.out.println(atrapame.buscarVuelos(LocalDate.of(2025, 05, 22), "destino 5"));
  }
}