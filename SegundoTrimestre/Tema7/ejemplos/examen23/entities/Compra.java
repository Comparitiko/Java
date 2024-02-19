package SegundoTrimestre.Tema7.ejemplos.examen23.entities;

import java.time.LocalDate;
import java.util.ArrayList;

public class Compra implements Enviable{
  // Props
  private ArrayList<LineaCompra> lineasCompra;
  private LocalDate fecha;
  private double precioTotal;

  //Constructor

  public Compra() {
    this.fecha = LocalDate.now();
    this.lineasCompra = new ArrayList<>();
  }

  // Getters and Setters
  public ArrayList<LineaCompra> getLineasCompra() {
    return lineasCompra;
  }

  public LocalDate getFecha() {
    return fecha;
  }

  public double getPrecioTotal() {
    return precioTotal;
  }

  public void setFecha(LocalDate fecha) {
    this.fecha = fecha;
  }

  // Methods
  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Compra{");
    sb.append("lineasCompra=").append(lineasCompra);
    sb.append(", fecha=").append(fecha);
    sb.append(", precioTotal=").append(precioTotal);
    sb.append('}');
    return sb.toString();
  }

  /**
   * Metodo para comprobar si una línea de compra a traves
   * del producto está en la coleccion o no, si esta, incrementa
   * el número de productos de la ya existente, si no esta
   * añade una nueva línea y calcula el total del precio de
   * la compra
   * @param lc LineaCompra a añadir
   */
  public void addLinea (LineaCompra lc) {
    if (this.lineasCompra.contains(lc)) {
      LineaCompra lc2 = this.lineasCompra.get(this.lineasCompra.indexOf(lc));
      lc2.setCantidad(lc2.getCantidad() + lc.getCantidad());
    } else this.lineasCompra.add(lc);
    calcularTotalCompra();
  }

  /**
   * Borrar una línea de compra de la coleccion
   * y calcular el precio total
   * @param lc Línea de compra a eliminar
   */
  public void delLinea (LineaCompra lc) {
    this.lineasCompra.remove(lc);
    calcularTotalCompra();
  }

  /**
   * Calcular el total de la compra recorriendo todas las
   * líneas y aumentando el precio de precioTotal, poniendo
   * al comienzo del metodo el precioTotal a 0
   */
  private void calcularTotalCompra () {
    this.precioTotal = 0;
    for (LineaCompra linea : lineasCompra) {
      this.precioTotal += linea.subTotal();
    }
  }

  @Override
  public String crearEmail() {
    final StringBuffer sb = new StringBuffer();
    for (LineaCompra linea : lineasCompra) {
      sb.append(linea.getProducto().getNombre() + " " + linea.getCantidad() + " " + linea.getProducto().getPrecio() + "\n");
    }
    sb.append("Fecha: ").append(this.fecha).append("\n");
    sb.append("Precio Total: ").append(this.precioTotal);

    return sb.toString();
  }
}
