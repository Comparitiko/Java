package SegundoTrimestre.Tema5.Practica2.McBurguer.dominio;

import java.util.ArrayList;

public class Menu {

  // Props
  public static int numeroMenus;
  private int numeroIngredientes;
  private ArrayList<Ingrediente> listaIngredientes;


  // Constructor
  public Menu() {
    this.numeroIngredientes = 0;
    this.listaIngredientes = new ArrayList<Ingrediente>();
    numeroMenus++;
  }

  // Getters and Setters
  public int getNumeroIngredientes() {
    return numeroIngredientes;
  }

  public void setNumeroIngredientes(int numeroIngredientes) {
    this.numeroIngredientes = numeroIngredientes;
  }

  public ArrayList<Ingrediente> getListaIngredientes() {
    return listaIngredientes;
  }

  // Methods

  /**
   * Metodo para imprimir el menu por pantalla
   */
  public void imprimirMenu() {
    for (int i = 0; i < this.listaIngredientes.size(); i++) {
      System.out.println(this.listaIngredientes.get(i));
    }
  }

  /**
   * Metodo para añadir comida al menu, aumentar numeroIngredientes
   * @param comida Ingrediente a añadir en menu
   */
  public void addComida(Comida comida) {
    this.listaIngredientes.add(comida);
    this.numeroIngredientes++;
  }

  /**
   * Metodo para añadir comida al menu, aumentar numeroIngredientes
   * @param bebida Ingrediente a añadir en menu
   */
  public void  addBebida(Bebida bebida) {
    this.listaIngredientes.add(bebida);
    this.numeroIngredientes++;
  }

  /**
   * Calcular el precio del menu
   * @return precio del menu
   */
  public double obtenerPrecioMenu () {
    double precioMenu = 0;
    for (Ingrediente ingrediente: this.listaIngredientes) {
      precioMenu += ingrediente.obtenerPrecio();
    }
    return precioMenu;
  }

}
