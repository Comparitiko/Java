package TercerTrimestre.Tema8.Practica1.expedientesAlumnos.services;

import TercerTrimestre.Tema8.Practica1.expedientesAlumnos.entities.Expediente;

import java.util.Objects;
import java.util.TreeSet;

public class CentroEducativo {
  // Props
  private TreeSet<Expediente> expedientes;
  private String nombreCentro;
  private String direccion;
  private String localidad;
  private String telefono;
  private String email;

  // Constructor
  public CentroEducativo(String nombreCentro, String direccion, String localidad, String telefono, String email) {
    this.expedientes = new TreeSet<>();
    this.nombreCentro = nombreCentro;
    this.direccion = direccion;
    this.localidad = localidad;
    this.telefono = telefono;
    this.email = email;
  }

  // Getters and Setters
  public TreeSet<Expediente> getExpedientes() {
    return expedientes;
  }

  public String getNombreCentro() {
    return nombreCentro;
  }

  public void setNombreCentro(String nombreCentro) {
    this.nombreCentro = nombreCentro;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getLocalidad() {
    return localidad;
  }

  public void setLocalidad(String localidad) {
    this.localidad = localidad;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  // Methods
  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("CentroEducativo{");
    sb.append("expedientes=").append(expedientes);
    sb.append(", nombreCentro='").append(nombreCentro).append('\'');
    sb.append(", direccion='").append(direccion).append('\'');
    sb.append(", localidad='").append(localidad).append('\'');
    sb.append(", telefono='").append(telefono).append('\'');
    sb.append(", email='").append(email).append('\'');
    sb.append('}');
    return sb.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CentroEducativo that = (CentroEducativo) o;
    return Objects.equals(nombreCentro, that.nombreCentro);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nombreCentro);
  }

  public void addExpediente(Expediente e) {
    this.expedientes.add(e);
  }

  public Expediente buscarExpediente(String dni) {
    final Expediente[] expediente = {null};
    this.expedientes.stream()
            .filter(e -> e.getEstudiante().getDni().equals(dni))
            .forEach(e -> expediente[0] = e);
    return expediente[0];
  }
}
