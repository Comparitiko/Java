package SegundoTrimestre.Tema6.EjerciciosPracticar.Ejercicio8;

public class CuentaJoven extends CuentaBancaria {

  // Constructors
  public CuentaJoven(int saldo, TarjetaCredito tarjetaCredito, TarjetaDebito tarjetaDebito) {
    super(saldo, tarjetaCredito, tarjetaDebito, 0.25);
  }

  public CuentaJoven(CuentaBancaria cuentaBancaria) {
    super(cuentaBancaria);
  }
}
