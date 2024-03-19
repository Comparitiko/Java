package TercerTrimestre.Tema8.Practica1.expedientesAlumnos.entities;

import java.util.HashMap;
import java.util.Objects;
import java.util.TreeMap;

public class NotasCurso {
  // Props
  private EtapaEducativa etapaEducativa;
  private String nombreCiclo;
  private Integer curso;
  private HashMap<String, Double> notas;
  private String year;

  // Constructor

  public NotasCurso(EtapaEducativa etapaEducativa, String nombreCiclo, Integer curso, String year) {
    this.etapaEducativa = etapaEducativa;
    this.nombreCiclo = nombreCiclo;
    this.curso = curso;
    this.notas = new HashMap<String, Double>();
    this.year = year;
  }

  // Getters and Setters
  public EtapaEducativa getEtapaEducativa() {
    return etapaEducativa;
  }

  public void setEtapaEducativa(EtapaEducativa etapaEducativa) {
    this.etapaEducativa = etapaEducativa;
  }

  public String getNombreCiclo() {
    return nombreCiclo;
  }

  public void setNombreCiclo(String nombreCiclo) {
    this.nombreCiclo = nombreCiclo;
  }

  public Integer getCurso() {
    return curso;
  }

  public void setCurso(Integer curso) {
    this.curso = curso;
  }

  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public HashMap<String, Double> getNotas() {
    return notas;
  }

  // Methods
  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("NotasCurso{");
    sb.append("etapaEducativa=").append(etapaEducativa);
    sb.append(", nombreCiclo='").append(nombreCiclo).append('\'');
    sb.append(", curso=").append(curso);
    sb.append(", notas=").append(notas);
    sb.append(", year='").append(year).append('\'');
    sb.append('}');
    return sb.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NotasCurso that = (NotasCurso) o;
    return etapaEducativa == that.etapaEducativa && Objects.equals(nombreCiclo, that.nombreCiclo) && Objects.equals(curso, that.curso) && Objects.equals(year, that.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etapaEducativa, nombreCiclo, curso, year);
  }

  /**
   * Metodo para añadir notas
   * @param asignatura asignatura de la que se pone la nota
   * @param nota nota de la asignatura
   */
  public void addNota (String asignatura, Double nota) {
    notas.put(asignatura, nota);
  }

  /**
   * Metodo para borrar nota
   * @param asignatura asignatura que se va a borrar junto a su nota
   */
  public void delNota (String asignatura) {
    notas.remove(asignatura);
  }

  /**
   * Metodo para buscar la nota de una asignatura
   * @param asignatura asignatura a buscar
   * @return nota de la asignatura
   */
  public Double buscar (String asignatura) {
    return notas.get(asignatura);
  }

  /**
   * Pintar Asignaturas pintadas por orden
   * @return String con todas las notas ordenadas por asignatura
   */
  public String pintar () {
    StringBuffer sb = new StringBuffer();
    TreeMap<String, Double> treeMapNotas = new TreeMap<String, Double>(this.notas);
   treeMapNotas.forEach((asignatura, nota) -> {
     sb.append("Asignatura ").append(asignatura).append(": ").append(nota).append("\n");
   });
   return sb.toString();
  }
}
