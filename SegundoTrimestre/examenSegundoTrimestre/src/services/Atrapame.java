package services;

import entities.Asiento;
import entities.Pasajero;
import entities.TipoAsiento;
import entities.TipoTarifa;

import java.time.LocalDate;
import java.util.ArrayList;

public class Atrapame {
  // Props
  private ArrayList<Vuelo> vuelos;
  private ArrayList<ReservaVuelo> reservas;

  // Constructor
  public Atrapame() {
    this.reservas = new ArrayList<>();
    this.vuelos = new ArrayList<>();
  }

  // Getters
  public ArrayList<Vuelo> getVuelos() {
    return vuelos;
  }

  public ArrayList<ReservaVuelo> getReservas() {
    return reservas;
  }

  // Methods

  /**
   * Metodo para añadir un vuelo a los vuelos
   * @param vuelo
   */
  public void addVuelo (Vuelo vuelo) {
    this.vuelos.add(vuelo);
  }

  /**
   * Metodo para crear una reserva
   * @param vuelo vuelo a reservar
   * @param pasajeros pasajeros que reservan
   * @param tipoT tipo de tarifa
   * @param tipoA tipo asiento
   * @return true si se ha realizado, false si no
   */
  public Boolean crearReserva (Vuelo vuelo, ArrayList<Pasajero> pasajeros, TipoTarifa tipoT, TipoAsiento tipoA) {
    if (vuelo.getAsientosDisponibles() >= pasajeros.size()) {
      ReservaVuelo reserva = new ReservaVuelo(vuelo, pasajeros, tipoT, tipoA);
      this.reservas.add(reserva);
      return true;
    } else return false;
  }

  /**
   * Metodo para cancelar una reserva, dejando libre los asientos
   * @param id id de la reserva a buscar
   */
  public void cancelarReserva (Long id) {
    for (ReservaVuelo reserva : this.reservas) {
      if (reserva.getId() == id) {
        for (Asiento asiento : reserva.getAsientos()) {
          asiento.setPasajero(null);
        }
        for (Pasajero pasajero : reserva.getPasajeros()) {
          pasajero.setAsiento(null);
        }
        reserva.setVuelo(null);
      }
    }
  }

  /**
   * Metodo para buscar vuelos que coincidan con un destino
   * @param destino destino a buscar
   * @return vuelos
   */
  public ArrayList<Vuelo> buscarVuelos (String destino) {
    ArrayList<Vuelo> vuelosEncontrados = new ArrayList<>();
    for (Vuelo vuelo : this.vuelos) {
      if (vuelo.getDestino().equals(destino)) vuelosEncontrados.add(vuelo);
    }
    return vuelosEncontrados;
  }

  /**
   * Metodo para buscar vuelos que coincidan con una fecha
   * @param fecha fecha a buscar
   * @return vuelos
   */
  public ArrayList<Vuelo> buscarVuelos (LocalDate fecha) {
    ArrayList<Vuelo> vuelosEncontrados = new ArrayList<>();
    for (Vuelo vuelo : this.vuelos) {
      if (vuelo.getFecha().isEqual(fecha)) vuelosEncontrados.add(vuelo);
    }
    return vuelosEncontrados;
  }

  /**
   * Metodo para buscar vuelos que coincidan con un destino y una fecha
   * @param fecha fecha a buscar
   * @param destino destino a buscar
   * @return vuelos
   */
  public ArrayList<Vuelo> buscarVuelos (LocalDate fecha, String destino) {
    ArrayList<Vuelo> vuelosEncontrados = new ArrayList<>();
    for (Vuelo vuelo : this.vuelos) {
      if (vuelo.getDestino().equals(destino) && vuelo.getFecha().isEqual(fecha)) vuelosEncontrados.add(vuelo);
    }
    return vuelosEncontrados;
  }

  /**
   * Metodo para buscar reservas que contengan a un pasajero con
   * un dni pasado por parametro
   * @param dni dni a buscar
   * @return lista de reserva
   */
  public ArrayList<ReservaVuelo> buscarReservas (String dni) {
    ArrayList<ReservaVuelo> reservasEncontradas = new ArrayList<>();
    for (ReservaVuelo reserva : this.reservas) {
      for (Pasajero pasajero : reserva.getPasajeros()) {
        if (pasajero.getDniPasaporte().equals(dni)) reservasEncontradas.add(reserva);
      }
    }
    return reservasEncontradas;
  }
}
