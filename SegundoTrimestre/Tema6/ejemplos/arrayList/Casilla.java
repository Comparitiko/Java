package SegundoTrimestre.Tema6.ejemplos.arrayList;

public class Casilla {
  private int numero;
  private String texto;

  // Constructor
  public Casilla(int numero, String texto) {
    this.numero = numero;
    this.texto = texto;
  }

  // Getters and Setters
  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public String getTexto() {
    return texto;
  }

  public void setTexto(String texto) {
    this.texto = texto;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Casilla casilla = (Casilla) o;
    return numero == casilla.numero;
  }

}
