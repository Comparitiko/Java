package SegundoTrimestre.Tema7.ejemplos.examen23.services;

import SegundoTrimestre.Tema7.ejemplos.examen23.entities.Compra;
import SegundoTrimestre.Tema7.ejemplos.examen23.entities.LineaCompra;
import SegundoTrimestre.Tema7.ejemplos.examen23.entities.Producto;

import java.time.LocalDate;
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
   * Metodo para mostrar las compras de un mes
   * @param mes mes a mostrar
   * @return compras
   * @throws Exception si el mes no esta entre 1 y 12
   */
  public String mostrarCompras (int mes) throws Exception{
    if (mes < 1 || mes > 12) throw new Exception("El mes tiene que ser entre 1 y 12");
    final StringBuffer sb = new StringBuffer();
    for (Compra compra : this.compras) {
      if (compra.getFecha().getMonthValue() == mes) {
        sb.append(compra).append(", Precio = ");
        sb.append(compra.getPrecioTotal());
      }
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
   * Metodo para realizar una compra
   * @param compra compra a realizar
   * @throws Exception No hay suficiente stock
   */
  public void addCompra (Compra compra) throws Exception{
    for (LineaCompra lc : compra.getLineasCompra()) {
      int index = this.productos.indexOf(lc.getProducto());
      Producto p = this.productos.get(index);
      if ( p.getUnidadesStock() - lc.getCantidad() < 0) {
        throw new Exception("No se puede realizar la compra");
      }
    }
    for (LineaCompra lc : compra.getLineasCompra()) {
      int index = this.productos.indexOf(lc.getProducto());
      Producto p = this.productos.get(index);
      p.setUnidadesStock(p.getUnidadesStock() - lc.getCantidad());
    }
    this.compras.add(compra);
    this.numeroCompras++;
  }

  public ArrayList<Producto> buscarProducto (String texto) {
    ArrayList<Producto> productosEncontrados = new ArrayList<>();
    for (Producto producto : productos) {
      if (producto.getNombre().toLowerCase().contains(texto.toLowerCase())) {
        productosEncontrados.add(producto);
      }
    }
    return productosEncontrados;
  }


}
