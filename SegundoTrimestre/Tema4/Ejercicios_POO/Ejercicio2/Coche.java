package SegundoTrimestre.Tema4.Ejercicios_POO.Ejercicio2;

/*
    Tenemos la siguiente clase Coche:
    public class Coche {
    private int velocidad; //Atributo
    Coche() { velocidad = 0;} //Constructor
    }
    Añade a la clase coche los siguientes métodos:
     int getVelocidad(). Este método devuelve la velocidad actual.
     void acelera(int mas). Este método actualiza la velocidad a mas kilómetros más (suma).
     void frena(int menos). Este método actualiza la velocidad a menos kilómetros menos (resta).
*/

public class Coche {
    // Props
    private int velocidad;

    // Constructor
    public Coche() {
        this.velocidad = 0;
    }

    // Methods
    public int getVelocidad() {
        return velocidad;
    }
    public void acelera (int mas) {
        this.velocidad += mas;
    }
    public  void frena (int menos) {
        this.velocidad -= menos;
        if (this.velocidad < 0) this.velocidad = 0;
    }
}
