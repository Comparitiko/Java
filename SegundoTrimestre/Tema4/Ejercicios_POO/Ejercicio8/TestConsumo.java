package SegundoTrimestre.Tema4.Ejercicios_POO.Ejercicio8;

public class TestConsumo {
  public static void main(String[] args) {
    Consumo c1 = new Consumo(105, 40, 100, 200.68);
    System.out.println("El precio por cada 100 km son: " + c1.consumoEuros() + " euros");
    System.out.println("El consumo medio por cada 100 km son: " + c1.consumoMedio() + " litros");
    System.out.println("El tiempo en horas es: " + c1.getTiempo());
  }
}
