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

  /**
   * Metodo para añadir un cliente al arrayList
   * @param cliente cliente a añadir
   * @return true si se ha añadidio
   */
  public boolean addSuscriptor(Cliente cliente) {
    return this.suscriptores.add(cliente);
  }

  /**
   * Metodo para añadir una multimedia
   * @param multimedia Multimedia a añadir
   * @return true si se ha añadido, false si no
   */
  public boolean addMultimedia (Multimedia multimedia) {
    return this.catalogo.add(multimedia);
  }

  /**
   * Metodo para ver una multimedia por un cliente
   * @param m multimedia a ver
   * @param c cliente que ve la multimedia
   */
  public void ver (Multimedia m, Cliente c) {
    if (!c.esPro()) this.ganancias += m.getPrecio();
  }

  /**
   * Metodo para ver las ganacias
   * @return ganancias
   */
  public double getGanancias () {
    for (Cliente cliente : this.suscriptores) {
      this.ganancias += cliente.getPrecioMensual() * 12;
    }
    return  this.ganancias;
  }


}
