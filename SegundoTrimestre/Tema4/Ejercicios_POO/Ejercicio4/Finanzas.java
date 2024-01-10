package SegundoTrimestre.Tema4.Ejercicios_POO.Ejercicio4;

/*
    4. Realiza una clase Finanzas que convierta dólares a euros y viceversa. Como propiedad se almacena únicamente el
    cambio dólar-euro, no se almacena una cantidad sino el tipo de cambio. Codifica los métodos
    dolaresToEuros(double dolares) y eurosToDolares(double euros). Prueba que dicha clase funciona
    correctamente haciendo conversiones entre euros y dólares. La clase debe tener:
        - Un constructor Finanzas() por defecto el cual establecerá el cambio dólar-euro en 1.36.
        - Un constructor Finanzas(double), el cual permitirá configurar el cambio dólar-euro.
        - Getters y setters
    Prueba la clase en otra clase TestFinanzas.
 */

class Finanzas {
    // Props
    private double dolar-euro

    // Constructor
    public Finanzas() {
        this.dolar = 1.36;
    }

    public Finanzas(double dolar) {
        this.dolar = dolar;
    }

    // Methods
    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }
}