package TercerTrimestre.Tema8.Practica2.entities;

import java.time.LocalDateTime;
import java.util.Objects;

public class Registro {
  // Props
  LocalDateTime fechaHora;
  Double temperatura;
  Double humedad;

  // Constructor
  public Registro(LocalDateTime fechaHora, Double temperatura, Double humedad) {
    this.fechaHora = fechaHora;
    this.temperatura = temperatura;
    this.humedad = humedad;
  }

  // Getters and Setters
  public LocalDateTime getFechaHora() {
    return fechaHora;
  }

  public void setFechaHora(LocalDateTime fechaHora) {
    this.fechaHora = fechaHora;
  }

  public Double getTemperatura() {
    return temperatura;
  }

  public void setTemperatura(Double temperatura) {
    this.temperatura = temperatura;
  }

  public Double getHumedad() {
    return humedad;
  }

  public void setHumedad(Double humedad) {
    this.humedad = humedad;
  }

  // Methods
  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Registro{");
    sb.append("fechaHora=").append(fechaHora);
    sb.append(", temperatura=").append(temperatura);
    sb.append(", humedad=").append(humedad);
    sb.append('}');
    return sb.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Registro registro = (Registro) o;
    return Objects.equals(fechaHora, registro.fechaHora);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fechaHora);
  }
}
