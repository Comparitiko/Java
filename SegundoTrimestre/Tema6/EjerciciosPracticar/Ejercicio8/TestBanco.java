package SegundoTrimestre.Tema6.EjerciciosPracticar.Ejercicio8;

public class TestBanco {
  public static void main(String[] args) {
    Banco b1 = new Banco("Banco 1");
    CuentaAhorro ca1 = new CuentaAhorro(
            100,
            new TarjetaCredito("123", "Gabriel", 123),
            null,
            0.5
    );

    CuentaAhorro ca2 = new CuentaAhorro(
            1002,
            new TarjetaCredito("1234", "Gabriel2", 1231),
            new TarjetaDebito("1234", "Gabriel2"),
            0.5
    );
    b1.aniadirCuentaBancaria(ca1);
    b1.aniadirCuentaBancaria(ca2);
    System.out.println(b1);
  }
}
