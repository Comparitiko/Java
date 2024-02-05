package SegundoTrimestre.Tema6.EjerciciosPracticar.Ejercicio8;

public class CuentaAhorro extends CuentaBancaria {
  // Props
  private double tipoInteres;

  // Constructors
  public CuentaAhorro(int saldo, TarjetaCredito tarjetaCredito, TarjetaDebito tarjetaDebito, double tipoInteres) {
    super(saldo, tarjetaCredito, tarjetaDebito, 0.5);
    this.tipoInteres = tipoInteres;
  }

  public CuentaAhorro(CuentaBancaria cuentaBancaria, double tipoInteres) {
    super(cuentaBancaria);
    this.tipoInteres = tipoInteres;
  }

}
