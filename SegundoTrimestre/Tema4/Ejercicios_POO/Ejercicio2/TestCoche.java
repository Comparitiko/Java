package SegundoTrimestre.Tema4.Ejercicios_POO.Ejercicio2;

public class TestCoche {
    public static void main(String[] args) {
        Coche co1 = new Coche();

        System.out.println("El coche 1 va a: " + co1.getVelocidad() + " km/h");
        co1.acelera(100);
        System.out.println("El coche 1 va a: " + co1.getVelocidad() + " km/h");
        co1.frena(50);
        System.out.println("El coche 1 va a: " + co1.getVelocidad() + " km/h");
        co1.frena(200);
        System.out.println("El coche 1 va a: " + co1.getVelocidad() + " km/h");
    }
}
