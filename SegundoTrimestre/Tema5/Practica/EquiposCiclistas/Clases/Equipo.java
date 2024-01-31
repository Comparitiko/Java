package SegundoTrimestre.Tema5.Practica.EquiposCiclistas.Clases;

import java.util.ArrayList;

public class Equipo {

  // Props
  private String nombre;
  private ArrayList<Ciclista> ciclistas;
  private String pais;
  private static double tiemposCarrera;

  // Constructors
  public Equipo(String nombre, String pais) {
    this.nombre = nombre;
    this.pais = pais;
    this.ciclistas = new ArrayList<>();
  }

  // Getters and setters
  protected String getNombre () {
    return this.nombre;
  }

  protected void setNombre (String nombre) {
    this.nombre = nombre;
  }

  protected String getPais () {
    return this.pais;
  }

  protected void setPais (String pais) {
    this.pais = pais;
  }

  protected ArrayList<Ciclista> getCiclistas () {
    return this.ciclistas;
  }

  protected void setCiclistas (ArrayList<Ciclista> ciclistas) {
    this.ciclistas = ciclistas;
  }

  // Methods
  @Override
  public String toString() {
    final  StringBuffer sb = new StringBuffer("Equipo: ");
    sb.append(this.nombre).append(", pais=").append(this.pais).append(", Ciclistas: ");
    sb.append("\n");
    for (Ciclista ciclista : this.ciclistas) {
      sb.append(ciclista.toString());
      sb.append("\n");
    }
    return sb.toString();
  }

  /**
   * Aniadir una ciclista al equipo.
   * @param ciclista ciclista a añadir al equipo
   */
  public void aniadirCiclista(Ciclista ciclista) {
    this.ciclistas.add(ciclista);
  }

  /**
   * Calcular el tiempo de carrera del equipo
   */
  public double calcularTiemposCarrera() {
    tiemposCarrera = 0;
    for (Ciclista ciclista : this.ciclistas) {
      tiemposCarrera += ciclista.getTiempoAcumuladoCarrera();
    }
    return tiemposCarrera;
  }

  /**
   * Listar todas las ciclistas del equipo
   * @return lista de ciclistas del equipo
   */
  public String listarCiclistas() {
    if (this.ciclistas.isEmpty()) return null;
    StringBuffer sb = new StringBuffer("Equipo { \n");
    for (Ciclista ciclista : this.ciclistas) {
      sb.append("Tipo ciclista: ").append(ciclista.imprimirTipo());
      sb.append(", Nombre: ").append(ciclista.getNombre());
      sb.append("\n");
    }
    sb.append(" }");
    return sb.toString();
  }

  /**
   * Buscar una ciclista por su identificador
   * @param identificador identificador a buscar
   * @return cliclista o null si no se encuentra
   */
  public String buscarCiclista(int identificador) {
    for (Ciclista ciclista : this.ciclistas) {
      if (ciclista.getIdentificador() == identificador) {
        return ciclista.toString();
      }
    }
    return null;
  }
}
