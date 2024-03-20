package TercerTrimestre.Tema8.Practica1.expedientesAlumnos.entities;

import java.util.HashSet;
import java.util.Objects;

public class Expediente implements Comparable<Expediente>{
  // Props
  private Estudiante estudiante;
  private HashSet<NotasCurso> notas;
  private Boolean isActivo;

  // Constructor

  public Expediente(Estudiante estudiante, Boolean isActivo) {
    this.estudiante = estudiante;
    this.notas = new HashSet<>();
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
    final StringBuffer sb = new StringBuffer("Expediente: ").append("\n");
    sb.append("estudiante=").append(estudiante.getNombre()).append("\n");
    this.notas.forEach(notaCurso -> {
      sb.append("Nombre ciclo: ").append(notaCurso.getNombreCiclo()).append("\n");
      sb.append("Curso: ").append(notaCurso.getCurso()).append("\n");
      sb.append("Etapa educativa: ").append(notaCurso.getEtapaEducativa()).append("\n");
      sb.append("Año: ").append(notaCurso.getYear()).append("\n");
      notaCurso.getNotas().forEach((asinatura, nota) -> {
        sb.append(asinatura).append(": ").append(nota);
        sb.append("\n");
      });
    });
    if (isActivo) sb.append("Alumno actualmente activo");
    else sb.append("Alumno actualmente inactivo");
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

  @Override
  public int compareTo(Expediente o) {
    return this.getEstudiante().getDni().compareTo(o.getEstudiante().getDni());
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
