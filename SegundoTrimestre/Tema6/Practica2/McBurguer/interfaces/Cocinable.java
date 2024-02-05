package SegundoTrimestre.Tema6.Practica2.McBurguer.interfaces;

public interface Cocinable {
  public final int CRUDA = 0;
  public final int FRITA = 1;
  public final int COCIDA = 2;
  public final int ASADA = 3;
  public void freir();
  public void cocer();
  public void asar();
}
