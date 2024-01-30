package SegundoTrimestre.Tema5.EjerciciosPracticar.Ejercicio8;

public class CuentaCorriente extends CuentaBancaria {
  // Constructors
  public CuentaCorriente(int saldo, TarjetaDebito tarjetaDebito, TarjetaCredito tarjetaCredito) {
    super(saldo, tarjetaCredito, tarjetaDebito, 0.4);
  }

  public CuentaCorriente(CuentaBancaria cuentaBancaria) {
    super(cuentaBancaria);
  }
}
