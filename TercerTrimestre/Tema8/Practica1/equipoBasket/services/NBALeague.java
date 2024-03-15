package TercerTrimestre.Tema8.Practica1.equipoBasket.services;

import TercerTrimestre.Tema8.Practica1.equipoBasket.entities.EquipoBasket;

import java.util.HashMap;
import java.util.TreeMap;

public class NBALeague {
  // Props
  private HashMap<String, EquipoBasket> equipos;
  private TreeMap<String, EquipoBasket> equiposOrdenados;

  // Constructor
  public NBALeague() {
    this.equipos = new HashMap<>();
    this.equiposOrdenados = new TreeMap<>();
  }

  // Getters
  public HashMap<String, EquipoBasket> getEquipos() {
    return equipos;
  }

  public TreeMap<String, EquipoBasket> getEquiposOrdenados() {
    return equiposOrdenados;
  }

  // Methods

  /**
   * Metodo para añadir un equipo a la NBALeague
   * @param equipo equipos a añadir
   */
  public void addEquipo(EquipoBasket equipo) {
    this.equipos.put(equipo.getNombre(), equipo);
    this.equiposOrdenados.put(equipo.getNombre(), equipo);
  }

  /**
   * Metodo para buscar un equipo por nombre
   * @param nombre nombre del equipo a buscar
   * @return Equipo con ese nombre
   */
  public EquipoBasket buscarEquipo (String nombre) {
    return this.equipos.get(nombre);
  }

  /**
   * Eliminar un equipo de la NBALeague
   * @param nombre nombre del equipo que desea eliminar
   */
  public void eliminarEquipo (String nombre) {
    this.equipos.remove(nombre);
    this.equiposOrdenados.remove(nombre);
  }

  /**
   * Eliminar un equipo de la NBALeague
   * @param equipo equipo que se desea eliminar
   */
  public void eliminarEquipo (EquipoBasket equipo) {
    this.equipos.remove(equipo.getNombre());
    this.equiposOrdenados.remove(equipo.getNombre());
  }

  public String mostrarEquipos () {
    StringBuffer sb = new StringBuffer();
    this.equipos.forEach((nombre, equipo) -> {
      sb.append("Equipo: ").append(nombre);
      sb.append("Partidos ganados: ").append(equipo.getPartidosGanados());
      sb.append("Partidos perdidos: ").append(equipo.getPartidosPerdidos());
    });
    return sb.toString();
  }

  public String mostrarEquiposOrdenados () {
    StringBuffer sb = new StringBuffer();
    this.equiposOrdenados.forEach((nombre, equipo) -> {
      sb.append("Equipo: ").append(nombre);
      sb.append("Partidos ganados: ").append(equipo.getPartidosGanados());
      sb.append("Partidos perdidos: ").append(equipo.getPartidosPerdidos());
    });
    return sb.toString();
  }


}
