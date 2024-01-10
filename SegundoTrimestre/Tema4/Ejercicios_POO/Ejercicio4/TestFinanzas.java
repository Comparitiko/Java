package SegundoTrimestre.Tema4.Ejercicios_POO.Ejercicio4;

public class TestFinanzas {
    public static void main(String[] args) {
        Finanzas f1 = new Finanzas(1.40);
        Finanzas f2 = new Finanzas();

        System.out.println(f1.getDollarEuro());
        System.out.println(f2.getDollarEuro());
        f1.setDollarEuro(1.6);
        System.out.println(f1.dollarsToEuros(5.4));
        System.out.println(f2.eurosToDollars(6.9));
    }

}
