package SegundoTrimestre.Tema7.ejemplos.tienda;

import java.util.ArrayList;

public class Proveedor {
  private String nombre;
  private int numero;
  private ArrayList<Producto> productos;
  private Direccion direccion;

  public Proveedor(String nombre, int numeros, Direccion direccion) {
    this.nombre = nombre;
    this.numero = numero;
    this.productos = new ArrayList<>();
    this.direccion = direccion;
  }
}
