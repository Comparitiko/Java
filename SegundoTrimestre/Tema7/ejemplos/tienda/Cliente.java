package SegundoTrimestre.Tema7.ejemplos.tienda;

import java.util.ArrayList;

public class Cliente {
  private int id;
  private String nombre;
  private ArrayList<Pedido> pedidos;
  private Direccion direccion;

  public Cliente(int id, String nombre, ArrayList<Pedido> pedidos, Direccion direccion) {
    this.id = id;
    this.nombre = nombre;
    this.pedidos = pedidos;
    this.direccion = direccion;
  }
}
