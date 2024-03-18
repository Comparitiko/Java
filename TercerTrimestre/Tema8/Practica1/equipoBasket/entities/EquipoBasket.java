package TercerTrimestre.Tema8.Practica1.equipoBasket.entities;

import java.util.*;

public class EquipoBasket implements Comparable<EquipoBasket> {
  // Props
  private String nombre;
  private Integer partidosGanados;
  private Integer partidosPerdidos;
  private HashSet<JugadorBasket> jugadores;

  // Constructor
  public EquipoBasket(String nombre, Integer partidosGanados, Integer partidosPerdidos) {
    this.nombre = nombre;
    this.partidosGanados = partidosGanados;
    this.partidosPerdidos = partidosPerdidos;
    this.jugadores = new HashSet<>();
  }

  // Getters y Setters
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Integer getPartidosGanados() {
    return partidosGanados;
  }

  public void setPartidosGanados(Integer partidosGanados) {
    this.partidosGanados = partidosGanados;
  }

  public Integer getPartidosPerdidos() {
    return partidosPerdidos;
  }

  public void setPartidosPerdidos(Integer partidosPerdidos) {
    this.partidosPerdidos = partidosPerdidos;
  }

  public HashSet<JugadorBasket> getJugadores() {
    return jugadores;
  }

  // Methods
  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("EquipoBasket{");
    sb.append("nombre='").append(nombre).append('\'');
    sb.append(", partidosGanados=").append(partidosGanados);
    sb.append(", partidosPerdidos=").append(partidosPerdidos);
    sb.append(", jugadores=").append(jugadores);
    sb.append('}');
    return sb.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EquipoBasket that = (EquipoBasket) o;
    return Objects.equals(nombre, that.nombre);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombre);
  }

  /**
   * Metodo para buscar un jugador de basket
   * @param nombre nombre del jugador a buscar
   * @return Jugador de basket con ese nombre
   */
  public JugadorBasket buscarJugador (String nombre) {
    List<JugadorBasket> listaJugadoresOrdenados = new TreeSet<>(this.jugadores).stream().toList();
    int index = Collections.binarySearch(listaJugadoresOrdenados, new JugadorBasket(nombre));
    return listaJugadoresOrdenados.get(index);
  }

  /**
   * Metodo para buscar un jugador de basket
   * @param dorsal dorsal del jugador a buscar
   * @return Jugador de basket con ese dorsal
   */
  public JugadorBasket buscarJugador (Integer dorsal) {
    for (JugadorBasket jugador : this.jugadores) {
      if (jugador.getDorsal() == dorsal) return jugador;
    }
    return null;
  }

  /**
   * Metodo para mostrar los nombres de los jugadores del equipo
   * @return nombre de los jugadores
   */
  public String mostrarEquipo () {
    StringBuffer sb = new StringBuffer();
    this.jugadores.forEach(jugador -> sb.append("Jugador: ")
            .append(jugador.getNombre())
            .append(", \n"));
    return sb.toString();
  }

  /**
   * Metodo para añadir un jugador
   * @param jugador jugador a añadir
   */
  public void addJugador (JugadorBasket jugador) {
    this.jugadores.add(jugador);
  }

  /**
   * Metodo para eliminar un jugador
   * @param jugador jugador a eliminar
   */
  public void removeJugador (JugadorBasket jugador) {
    this.jugadores.remove(jugador);
  }

  @Override
  public int compareTo(EquipoBasket o) {
    return this.nombre.compareTo(o.nombre);
  }
}
