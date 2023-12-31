/*
  17. Escriba expresiones que almacenen en variables lo siguiente:
    a. Crear un número entero positivo aleatorio entre 1 y 49.
    b. Generar un número aleatorio positivo par.
    c. Generar un número real aleatorio entre 1 y 10.
    d. Crear un número entero negativo entre -50 y -150.
    e. Crear un número entero entre -100 y 100.
    f. Generar un número aleatorio que sea uno de los siguientes: 5, 7, 33, 125 o 77
    g. Crea un generador aleatorio de uno de los meses del año
    Puedes usar la siguiente fórmula:
    int n = (int) (Math.random() * (<número_máximo + 1> - <número_mínimo>)) + <numero_mínimo>;
 */

public class Ejercicio17 {
  
  public static void main(String[] args) {
    
    // a. Crear un número entero positivo aleatorio entre 1 y 49.
    int a = (int) Math.ceil(Math.random() * ((49 - 1) + 1));
    System.out.println("El numero entero positivo entre 1 y 49 generado aleatoriamente es: " + a);
    
    // b. Generar un número aleatorio positivo par.
    int b = 1;
    while (b % 2 != 0) {
      b = (int) Math.ceil((Math.random() * 10000));
    }
    System.out.println("El numero entero positivo par generado aleatoriamente es: " + b);

    // c. Generar un número real aleatorio entre 1 y 10.
    double c = Math.random() * 10;
    System.out.println("El numero generado aleatoriamente entre 1 y 10 es: " + c);

    // d. Crear un número entero negativo entre -50 y -150.
    double d = (int) Math.ceil((Math.random() * 101) - 151);
    System.out.println("El numero generado aleatoriamente entre -50 y -150 es: " + d);

    // e. Crear un número entero entre -100 y 100.
    double e = (int) Math.ceil((Math.random() * 201) - 101);
    System.out.println("El numero generado aleatoriamente entre -100 y 100 es: " + e);

    // f. Generar un número aleatorio que sea uno de los siguientes: 5, 7, 33, 125 o 77
    int[] fNums = {5, 7, 33, 125, 77};
    int f = (int) Math.ceil(Math.random() * 5 - 1);
    System.out.println("El mes del año generado aleatoriamente es: " + (fNums[f]));
  
    // g. Crea un generador aleatorio de uno de los meses del año
    String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    int g = (int) Math.ceil(Math.random() * 12 - 1);
    System.out.println("El mes del año generado aleatoriamente es: " + (meses[g]));

  }
}
