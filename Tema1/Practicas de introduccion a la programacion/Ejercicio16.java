/*
  16. Escriba un programa para calcular el área y el volumen de un cilindro. Para ello declare una constante
  que guarde el valor de Pi. Declare, también, variables para el diámetro y la altura del cilindro. Suponga
  para el ejemplo que el cilindro tiene un diámetro de 15,5cm y una altura de 42,4cm
 */

public class Ejercicio16 {

  public static void main(String[] args) {
    
    // Declaracion de variables y constantes y asignacion de valores
    final double PI = Math.PI;
    double diametro = 15.5, altura = 42.4, area, volumen;

    // Calcular area del cilindro dado diametro y altura
    area = 2 * PI * ((diametro / 100) / 2) * (altura / 100) + 2 * PI * (diametro / 100);

    // Calcular altura del cilindro dado diametro y altura
    volumen = PI * (diametro / 100) * (altura / 100);

    // Imprimir en terminal el area y la altura
    System.out.println("El area del cilindro con altura " + altura + " cm y diametro " + diametro + " cm es: " + area + " m2");
    System.out.println("El volumen del cilindro con altura " + altura + " cm y diametro " + diametro + " cm es: " + volumen + " m3");

  }

}
