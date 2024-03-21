package TercerTrimestre.Tema8.Practica1.equipoBasket.services;

import TercerTrimestre.Tema8.Practica1.equipoBasket.entities.EquipoBasket;
import TercerTrimestre.Tema8.Practica1.equipoBasket.entities.JugadorBasket;

import java.util.ArrayList;
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

  /**
   * Mostrar equipos sin ordenar
   * @return String con los equipos sin ordenar
   */
  public String mostrarEquipos () {
    StringBuffer sb = new StringBuffer();
    this.equipos.forEach((nombre, equipo) -> {
      sb.append("Equipo: ").append(nombre);
      sb.append(" Partidos ganados: ").append(equipo.getPartidosGanados());
      sb.append(" Partidos perdidos: ").append(equipo.getPartidosPerdidos());
      sb.append("\n");
    });
    return sb.toString();
  }

  /**
   * Mostrar todos los equipos de forma ordenada
   * @return String con los equipos ordenados
   */
  public String mostrarEquiposOrdenados () {
    StringBuffer sb = new StringBuffer();
    this.equiposOrdenados.forEach((n, e) -> {
      sb.append("Equipo: ").append(n);
      sb.append(" Partidos ganados: ").append(e.getPartidosGanados());
      sb.append("  perdidos: ").append(e.getPartidosPerdidos());
      sb.append("\n");
    });
    return sb.toString();
  }

  /**
   * Metodo para buscar el jugador mas alto de la liga
   * @return Jugador mas alto
   */
  public JugadorBasket buscarJugadorMasAlto () {
    ArrayList<EquipoBasket> equipos = new ArrayList<>(this.equiposOrdenados.values());
    return equipos.stream()
            .flatMap(equipo -> equipo.getJugadores().stream())
            .max((j1, j2) -> j1.getAltura().compareTo(j2.getAltura()))
            .get();
  }

  /**
   * Metodo para ver que equipo tiene mas victorias de la liga
   * @return Equipo con mas victorias
   */
  public EquipoBasket getEquipoConMasWins () {
    ArrayList<EquipoBasket> equipos = new ArrayList<>(this.equiposOrdenados.values());
    return equipos.stream()
          .max((eq1, eq2) -> eq1.getPartidosGanados().compareTo(eq2.getPartidosGanados()))
          .get();
  }
}
