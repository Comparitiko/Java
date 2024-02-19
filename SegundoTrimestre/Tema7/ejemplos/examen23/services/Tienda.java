package SegundoTrimestre.Tema7.ejemplos.examen23.services;

import SegundoTrimestre.Tema7.ejemplos.examen23.entities.Compra;
import SegundoTrimestre.Tema7.ejemplos.examen23.entities.Producto;

import java.util.ArrayList;

public class Tienda {
  // Props
  private int numeroCompras = 0;
  private ArrayList<Producto> productos;
  private ArrayList<Compra> compras;

  // Constructor
  public Tienda() {
    this.productos = new ArrayList<>();
    this.compras = new ArrayList<>();
  }

  // Getters and Setters
  public int getNumeroCompras() {
    return numeroCompras;
  }

  public void setNumeroCompras(int numeroCompras) {
    this.numeroCompras = numeroCompras;
  }

  public ArrayList<Producto> getProductos() {
    return productos;
  }

  public ArrayList<Compra> getCompras() {
    return compras;
  }

  // Methods

  /**
   * Metodo para crear un String con todo el inventario
   * @return String
   */
  public String mostrarInventario () {
    final StringBuffer sb = new StringBuffer();
    for (Producto producto : productos) {
      sb.append(producto.toString() + "\n");
    }
    return sb.toString();
  }

  /**
   * Metodo para crear un string con todas las compras
   * y su respectivo precio
   * @return String
   */
  public String mostrarCompras () {
    final StringBuffer sb = new StringBuffer();
    for (Compra compra : compras) {
      sb.append(compra.toString()).append(", Precio = ");
      sb.append(compra.getPrecioTotal());
    }
    return sb.toString();
  }

  /**
   * Metodo para añadir un producto
   * @param producto producto a añadir
   */
  public void addProducto (Producto producto) {
    this.productos.add(producto);
  }

  /**
   * Metodo para borrar un producto
   * @param producto producto a borrar
   */
  public  void delProducto (Producto producto) {
    this.productos.remove(producto);
  }

  /**
   * Metodo para añadir una compra
   * @param compra compra a añadir
   */
  public void addCompra (Compra compra) {
    this.compras.add(compra);
    this.numeroCompras++;
  }

  /**
   * Metodo para eliminar una compra
   * @param compra compra a eliminar
   */
  public void delCompra (Compra compra) {
    this.compras.remove(compra);
    this.numeroCompras--;
  }


}
