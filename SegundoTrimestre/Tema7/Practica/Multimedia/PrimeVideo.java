package SegundoTrimestre.Tema7.Practica.Multimedia;

import java.util.ArrayList;

public class PrimeVideo {

  // Props
  private ArrayList<Multimedia> catalogo;
  private ArrayList<Cliente> suscriptores;
  private double ganancias;

  // Constructors
  public PrimeVideo() {
    this.catalogo = new ArrayList<>();
    this.suscriptores = new ArrayList<>();
    this.ganancias = 0;
  }

  // Getters and Setters
  public ArrayList<Multimedia> getCatalogo() {
    return catalogo;
  }

  public ArrayList<Cliente> getSuscriptores() {
    return suscriptores;
  }

  // Methods
  public boolean addSuscriptor(Cliente cliente) {
    return this.suscriptores.add(cliente);
  }

  public boolean addMultimedia (Multimedia multimedia) {
    return this.catalogo.add(multimedia);
  }

  public void ver (Multimedia m, Cliente c) {
    if (!c.esPro()) this.ganancias += m.getPrecio()
  }

  public double getGanancias () {
    return this.ganancias;
  }


}
