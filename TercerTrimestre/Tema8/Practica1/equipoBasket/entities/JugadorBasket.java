package TercerTrimestre.Tema8.Practica1.equipoBasket.entities;

import java.util.Objects;

public class JugadorBasket {
  // Props
  private String nombre;
  private Integer dorsal;
  private Double altura;
  private Posicion posicion;
  private Double puntosPorPartido;
  private Double rebotesPorPartido;
  private Double taponesPorPartido;
  private Double asistenciasPorPartido;
  private Double robosPorPartido;

  // Constructor
  public JugadorBasket(String nombre, Integer dorsal, Double altura, Posicion posicion, Double puntosPorPartido, Double rebotesPorPartido, Double taponesPorPartido, Double asistenciasPorPartido, Double robosPorPartido) {
    this.nombre = nombre;
    this.dorsal = dorsal;
    this.altura = altura;
    this.posicion = posicion;
    this.puntosPorPartido = puntosPorPartido;
    this.rebotesPorPartido = rebotesPorPartido;
    this.taponesPorPartido = taponesPorPartido;
    this.asistenciasPorPartido = asistenciasPorPartido;
    this.robosPorPartido = robosPorPartido;
  }

  // Getters and Setters
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Integer getDorsal() {
    return dorsal;
  }

  public void setDorsal(Integer dorsal) {
    this.dorsal = dorsal;
  }

  public Double getAltura() {
    return altura;
  }

  public void setAltura(Double altura) {
    this.altura = altura;
  }

  public Posicion getPosicion() {
    return posicion;
  }

  public void setPosicion(Posicion posicion) {
    this.posicion = posicion;
  }

  public Double getPuntosPorPartido() {
    return puntosPorPartido;
  }

  public void setPuntosPorPartido(Double puntosPorPartido) {
    this.puntosPorPartido = puntosPorPartido;
  }

  public Double getRebotesPorPartido() {
    return rebotesPorPartido;
  }

  public void setRebotesPorPartido(Double rebotesPorPartido) {
    this.rebotesPorPartido = rebotesPorPartido;
  }

  public Double getTaponesPorPartido() {
    return taponesPorPartido;
  }

  public void setTaponesPorPartido(Double taponesPorPartido) {
    this.taponesPorPartido = taponesPorPartido;
  }

  public Double getAsistenciasPorPartido() {
    return asistenciasPorPartido;
  }

  public void setAsistenciasPorPartido(Double asistenciasPorPartido) {
    this.asistenciasPorPartido = asistenciasPorPartido;
  }

  public Double getRobosPorPartido() {
    return robosPorPartido;
  }

  public void setRobosPorPartido(Double robosPorPartido) {
    this.robosPorPartido = robosPorPartido;
  }

  // Methods
  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("JugadorBasket{");
    sb.append("nombre='").append(nombre).append('\'');
    sb.append("dorsal=").append(dorsal);
    sb.append(", altura=").append(altura);
    sb.append(", posicion=").append(posicion);
    sb.append(", puntosPorPartido=").append(puntosPorPartido);
    sb.append(", rebotesPorPartido=").append(rebotesPorPartido);
    sb.append(", taponesPorPartido=").append(taponesPorPartido);
    sb.append(", asistenciasPorPartido=").append(asistenciasPorPartido);
    sb.append(", robosPorPartido=").append(robosPorPartido);
    sb.append('}');
    return sb.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JugadorBasket that = (JugadorBasket) o;
    return Objects.equals(dorsal, that.dorsal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dorsal);
  }
}
