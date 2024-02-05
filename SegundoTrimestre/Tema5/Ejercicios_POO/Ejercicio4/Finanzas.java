package SegundoTrimestre.Tema5.Ejercicios_POO.Ejercicio4;

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
    private double dollarEuro;

    // Constructor

    public Finanzas() {
        this.dollarEuro = 1.36;
    }

    public Finanzas(double dollarEuro) {
        this.dollarEuro = dollarEuro;
    }

    // Methods


    public double getDollarEuro() {
        return dollarEuro;
    }

    public void setDollarEuro(double dollarEuro) {
        this.dollarEuro = dollarEuro;
    }

    public double dollarsToEuros (double dollars) {
        return dollars * this.dollarEuro;
    }

    public double eurosToDollars (double euros) {
        return euros / this.dollarEuro;
    }
}