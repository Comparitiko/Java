// Calcular longitud y area dado el radio de la circunferencia
class Circunferencia {
  public static void main(String[] args) {
    // Declarar variables y asignar un numero a radio
    double radio, longitud, area;

    radio = 5;

    // Calcular area circunferencia

    area = Math.PI * Math.pow(radio, 2);

    // Calcular longitud circunferencia
 
    longitud = Math.PI * 2 * radio;

    // Imprimir resultados en consola
    System.out.println("La longitud de la circunferencia es: " + longitud);
    System.out.println("El area de la circunferencia es: " + area);
  }
}