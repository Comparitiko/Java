package SegundoTrimestre.Tema4.Ejercicios_POO.Ejercicio5;

public class TestSatelite {
    public static void main(String[] args) {
        Satelite s1 = new Satelite(1.5, 5.4, 1500.5);
        Satelite s2 = new Satelite(20, 5, 0);

        if (s1.enOrbita()) {
            System.out.println("El satelite 1 esta en orbita");
        } else {
            System.out.println("El satelite 1 esta en la tierra");
        }

        if (s2.enOrbita()) {
            System.out.println("El satelite 2 esta en orbita");
        } else {
            System.out.println("El satelite 2 esta en la tierra");
        }

        s1.variaAltura(-1500.5);

        if (s1.enOrbita()) {
            System.out.println("El satelite 1 esta en orbita");
        } else {
            System.out.println("El satelite 1 esta en la tierra");
        }

        s2.variaPosicion(2.6, -8);

        if (s2.enOrbita()) {
            System.out.println("El satelite 2 esta en orbita");
        } else {
            System.out.println("El satelite 2 esta en la tierra");
        }

    }
}
