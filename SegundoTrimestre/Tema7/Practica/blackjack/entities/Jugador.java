package SegundoTrimestre.Tema7.Practica.blackjack.entities;

import java.util.ArrayList;

public abstract class Jugador {
  // Props
  protected ArrayList<Carta> mano;
  protected boolean estaPlantado;
  protected String nombre;

  // Constructor
  public Jugador (String nombre) {
    this.mano = new ArrayList<Carta>(5);
    this.estaPlantado = false;
    this.nombre = nombre;
  }

  // Getter
  public ArrayList<Carta> getMano() {
    return mano;
  }

  public boolean isEstaPlantado() {
    return estaPlantado;
  }

  public void setEstaPlantado(boolean estaPlantado) {
    this.estaPlantado = estaPlantado;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  // Methods
  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Mano: ");
    for (Carta carta : this.mano) {
      sb.append(carta.getNombreCortoCarta()).append(", ");
    }
    return sb.toString();
  }

  /**
   * Añadir carta a la mano
   * @param carta carta a añadir
   */
  public void nuevaCarta (Carta carta) {
    this.mano.add(carta);
  }

  /**
   * Calcular valor de la mano, contando con que el as vale 10, si se pasa de 21, reinicia el valor y hace el
   * cálculo con el as valiendo 1
   * @return valor de la mano
   */
  public int valorMano () {
    if (this.mano.isEmpty()) return 0;
    int valor = 0;
    for (Carta carta : this.mano) {
      if (carta.getValor() == 1) valor+= 10;
      else valor += carta.getValor();
    }

    if (valor > 21) {
      valor = 0;
      for (Carta carta : this.mano) {
        valor += carta.getValor();
      }
    }
    return valor;
  }

  /**
   * Metodo para que el jugador se plante
   */
  public abstract void plantarse();

}
