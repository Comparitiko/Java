package SegundoTrimestre.Tema7.Practica.Multimedia;

public class ClientePrime extends Cliente{
  // Props
  private final static int precioMensual = 3;

  // Constructors
  public ClientePrime(String dni, String nombre, String email) {
    super(dni, nombre, email);
    this.setPrecioMensual(precioMensual);
  }

  // Methods
  @Override
  public boolean esPro() {
    return false;
  }

  @Override
  public double getPrecioMensual() {
    return precioMensual;
  }

}