package SegundoTrimestre.Tema7.ejemplos.tienda;

import java.util.ArrayList;

public class Producto {
  protected int numero;
  protected String descripcion;
  protected double precioUnitario;
  protected ArrayList<Proveedor> proveedores;

  public Producto(int numero, String descripcion, double precioUnitario) {
    this.numero = numero;
    this.descripcion = descripcion;
    this.precioUnitario = precioUnitario;
    this.proveedores = new ArrayList<>();
  }
}
