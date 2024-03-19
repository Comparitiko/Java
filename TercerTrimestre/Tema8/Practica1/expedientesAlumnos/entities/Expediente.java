package TercerTrimestre.Tema8.Practica1.expedientesAlumnos.entities;

import java.util.HashSet;
import java.util.Objects;

public class Expediente {
  // Props
  private Estudiante estudiante;
  private HashSet<NotasCurso> notas;
  private Boolean isActivo;

  // Constructor

  public Expediente(Estudiante estudiante, HashSet<NotasCurso> notas, Boolean isActivo) {
    this.estudiante = estudiante;
    this.notas = notas;
    this.isActivo = isActivo;
  }

  // Getters and Setters
  public Estudiante getEstudiante() {
    return estudiante;
  }

  public void setEstudiante(Estudiante estudiante) {
    this.estudiante = estudiante;
  }

  public HashSet<NotasCurso> getNotas() {
    return notas;
  }

  public Boolean getActivo() {
    return isActivo;
  }

  public void setActivo(Boolean activo) {
    isActivo = activo;
  }

  // Methods
  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Expediente{");
    sb.append("estudiante=").append(estudiante);
    sb.append(", notas=").append(notas);
    sb.append(", isActivo=").append(isActivo);
    sb.append('}');
    return sb.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Expediente that = (Expediente) o;
    return Objects.equals(estudiante, that.estudiante);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estudiante);
  }

  /**
   * Metodo para añadir notas
   * @param nc notas a añadir
   */
  public void addNotas (NotasCurso nc) {
    notas.add(nc);
  }

  /**
   * Metodo para mostrar las notas de un curso y etapa especifica
   * @param curso curso a mostrar
   * @param etapa etapa a mostrar
   * @return notas de un curso y etapa especifico
   */
  public String mostrarNotas (int curso, EtapaEducativa etapa) {
    StringBuffer sb = new StringBuffer();
   this.notas.stream()
           .filter(nc -> nc.getCurso() == curso)
           .filter(nc -> nc.getEtapaEducativa().equals(etapa))
           .forEach(sb::append);
   return sb.toString();
  }
}
