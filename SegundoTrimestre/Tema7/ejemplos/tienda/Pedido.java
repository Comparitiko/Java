package SegundoTrimestre.Tema7.ejemplos.tienda;

import java.util.ArrayList;
public class Pedido {
  private int numeroPedido;
  private Cliente cliente;
  private ArrayList<LineaDetalle> lineasDetalle;

  public Pedido(int numeroPedido, Cliente cliente) {
    this.numeroPedido = numeroPedido;
    this.cliente = cliente;
    this.lineasDetalle = new ArrayList<>();
  }
}
