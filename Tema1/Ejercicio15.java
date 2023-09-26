/*
  15. Escriba un programa que escriba en la pantalla cuánto le dará su banco después de seis meses si pone
  2000€ en una cuenta a plazo fijo al 2,75% anual. Recuerde que al pagarle los intereses el banco le
  retendrá el 18% para hacienda.
 */

public class Ejercicio15 {
  
  public static void main(String[] args) {
    
    // Declaración de variables
    int cantidad = 2000;
    double intereses = 2.75, retencion = 18, resultado, beneficioBruto, retenciones;

    // Calculo del beneficio sin descontar el 18 % de retencion
    beneficioBruto = cantidad + (cantidad * ((intereses / 100) / 2));

    // Calculo de la retencion a partir de los intereses que da el banco
    retenciones = (beneficioBruto - cantidad) * retencion / 100;

    // Quitamos al beneficio las retenciones para hacienda 
    resultado = beneficioBruto - retenciones;

    // Imprimir por terminal el resultado
    System.out.println("El banco nos devolvera: " + resultado);
  }

}
