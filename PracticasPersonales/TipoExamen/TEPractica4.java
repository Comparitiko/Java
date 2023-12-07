/*
  1. [1.5 puntos] Función que resuelva el coseno de x. Como parámetro debe recibir el número
  n de términos que quieres probar para calcular el coseno y devolverá el número calculado
  aproximado. Deberás indicar por pantalla el porcentaje de precisión de tu algoritmo
  respecto a el valor obtenido con la función cos() de la clase Math. Por último, deberás
  probar valores de n hasta obtener una precisión por encima del 95%. 
*/



public class TEPractica4 {
    
    public static double factorial(int n) {
        int acumulador = 1;
        if (n==0) return 1;

        for(int i=n; i>1; i--) {
            acumulador *= i;
        }

        return acumulador;
    }

    public static void main(String[] args) {
        double x=0.25;
        double termino=0;
        //f(x) con x =3
        double total=0;

        System.out.println(Math.cos(x));

        for(int n=0; true; n++) {

            termino = Math.pow(-1, n) * ( Math.pow(x,2*n) / factorial(2*n) );
            
            total += termino;
            //System.out.println(total);

            if  ((Math.abs(Math.cos(x) - total)) < 0.0000005 ) {
                break;
            }

        }

        System.out.println(total);
    }
}