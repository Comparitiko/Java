package SegundoTrimestre.Tema7.Practica.multimedia;

public class ClientePrimePro extends Cliente{
  // Props
  private final static int precioMensual = 5;

  // Constructors
  public ClientePrimePro(String dni, String nombre, String email) {
    super(dni, nombre, email);
    this.setPrecioMensual(precioMensual);
  }

  // Methods
  @Override
  public boolean esPro() {
    return true;
  }

  @Override
  public double getPrecioMensual() {
    return precioMensual;
  }

}
