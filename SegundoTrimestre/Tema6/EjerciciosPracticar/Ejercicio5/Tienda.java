package SegundoTrimestre.Tema6.EjerciciosPracticar.Ejercicio5;
import SegundoTrimestre.Tema6.EjerciciosPracticar.Ejercicio4.Producto;

import java.util.ArrayList;

public class Tienda {
  // Props
  private String nombre;
  private ArrayList<Producto> productos;
  private double ventas;

  // Constructors
  public Tienda(String nombre) {
    this.nombre = nombre;
    this.productos = new ArrayList<>();
  }

  // Getters y Setters

  public double getVentas() {
    return ventas;
  }

  public void setVentas(double ventas) {
    this.ventas = ventas;
  }

  // Methods


  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Tienda{");
    sb.append("productos=").append(productos);
    sb.append("} \n");
    return sb.toString();
  }

  /**
   * Metodo para adquirir un producto en la tienda
   * @param p Producto a adquirir
   */
  public void adquirirProd(Producto p) {
    this.productos.add(p);
  }

  /**
   * Metodo para vender un producto de la tienda
   * @param id id del producto a vender
   * @return true si se puede vender el producto, false en caso contrario
   */
  public boolean venderProd(int id) {
    for (Producto producto : this.productos) {
      if (producto.getId() == id) {
        if (producto.vender(1)) {
          this.ventas += producto.getPrecioUnitario() * (1 - producto.getDescuento());
          if (producto.getCantidad() == 0) this.productos.remove(producto);
          return true;
        } else {
          return false;
        }
      }
    }
    return false;
  }
}
