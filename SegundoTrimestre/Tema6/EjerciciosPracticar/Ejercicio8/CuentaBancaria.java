package SegundoTrimestre.Tema6.EjerciciosPracticar.Ejercicio8;

import java.util.Objects;

public class CuentaBancaria {
  // Props
  private String numeroCuenta;
  private double saldo;
  private TarjetaCredito tarjetaCredito;
  private TarjetaDebito tarjetaDebito;
  private double comisionesAnual;

  // Constructors
  public CuentaBancaria (int saldo, TarjetaCredito tarjetaCredito, TarjetaDebito tarjetaDebito, double comisiones) {
    this.numeroCuenta = this.genNumeroCuenta();
    this.saldo = saldo;
    this.tarjetaCredito = tarjetaCredito;
    this.tarjetaDebito = tarjetaDebito;
    this.comisionesAnual = comisiones;
  }

  public CuentaBancaria (CuentaBancaria cuentaBancaria) {
    this.numeroCuenta = cuentaBancaria.numeroCuenta;
    this.saldo = cuentaBancaria.saldo;
    this.tarjetaCredito = cuentaBancaria.tarjetaCredito;
    this.tarjetaDebito = cuentaBancaria.tarjetaDebito;
    this.comisionesAnual = cuentaBancaria.comisionesAnual;
  }

  // Getters and Setters

  public String getNumeroCuenta() {
    return numeroCuenta;
  }

  public void setNumeroCuenta(String numeroCuenta) {
    this.numeroCuenta = numeroCuenta;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public TarjetaCredito getTarjetaCredito() {
    return tarjetaCredito;
  }

  public void setTarjetaCredito(TarjetaCredito tarjetaCredito) {
    this.tarjetaCredito = tarjetaCredito;
  }

  public TarjetaDebito getTarjetaDebito() {
    return tarjetaDebito;
  }

  public void setTarjetaDebito(TarjetaDebito tarjetaDebito) {
    this.tarjetaDebito = tarjetaDebito;
  }

  public double getComisionesAnual() {
    return comisionesAnual;
  }

  public void setComisionesAnual(double comisionesAnual) {
    this.comisionesAnual = comisionesAnual;
  }


  // Methods

  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("CuentaBancaria{");
    sb.append("numeroCuenta='").append(numeroCuenta).append('\'');
    sb.append(", saldo=").append(saldo);
    sb.append(", tieneTarjetaCredito=").append(tarjetaCredito);
    sb.append(", tieneTarjetaDebito=").append(tarjetaDebito);
    sb.append(", comisionesAnual=").append(comisionesAnual);
    sb.append('}');
    return sb.toString();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CuentaBancaria that = (CuentaBancaria) o;
    return Objects.equals(numeroCuenta, that.numeroCuenta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numeroCuenta);
  }

  /**
   * Metodo para generar un numero de 20 digitos aleatorio;
   * @return
   */
  private String genNumeroCuenta () {
    StringBuffer sb = new StringBuffer(20);
    for (int i = 0; i < 20; i++) {
      sb.append((char) (Math.random() * ((57 - 48) + 1)) + 48);
    }
    return sb.toString();
  }

  public void ingresar (int cantidad) {
    this.saldo += cantidad;
  }

  public boolean retirar (int cantidad) {
    if (this.saldo - cantidad < 0) {
      return false;
    }
    this.saldo -= cantidad;
    return true;
  }
}
