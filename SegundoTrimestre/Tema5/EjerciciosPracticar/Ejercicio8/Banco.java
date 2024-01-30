package SegundoTrimestre.Tema5.EjerciciosPracticar.Ejercicio8;

import java.util.ArrayList;

public class Banco {
  // Props
  private String nombre;
  private ArrayList<CuentaBancaria> cuentasBancarias;

  // Constructors
  public Banco(String nombre) {
    this.nombre = nombre;
    this.cuentasBancarias = new ArrayList<CuentaBancaria>();
  }

  // Getters and Setters
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  // Methods
  @Override
  public String toString() {
    final StringBuffer sb = new StringBuffer("Banco {");
    for (CuentaBancaria cuentaBancaria : cuentasBancarias) {
      sb.append(cuentaBancaria);
    }
    return sb.append('}').toString();
  }

  // Methods
  public CuentaBancaria getCuenta (String numeroCuenta) {
    for (CuentaBancaria cuentaBancaria : cuentasBancarias) {
      if (cuentaBancaria.getNumeroCuenta().equals(numeroCuenta)) {
        return cuentaBancaria;
      }
    }
    return null;
  }

  public void aniadirCuentaBancaria (CuentaBancaria cuentaBancaria) {
    cuentasBancarias.add(cuentaBancaria);
  }
}
