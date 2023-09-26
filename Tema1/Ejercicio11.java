/* 
  11. Realiza un programa que calcule el área y el perímetro de un círculo de radio 3,6 metros.
*/
public class Ejercicio11 {
  
  public static void main(String[] args) {

    // Asignacion de variables
    double radio = 3.6, area, perimetro;

    // Calcular area dado el radio
    area = Math.PI * Math.pow(radio, 2);

    // Calcular perimetro dado el radio
    perimetro = Math.PI * 2 * radio;

    // Devolver resultados en la terminal
    System.out.println("El area del circulo con radio " + radio + " es: " + area);
    System.out.println("El perimetro del circulo con radio " + radio + " es: " + perimetro);
  }

}
