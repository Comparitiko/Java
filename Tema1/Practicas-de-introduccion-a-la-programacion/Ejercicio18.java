/*
  18. ¿Qué resultados se obtienen al realizar las operaciones siguientes? Si hay errores en la compilación,
  corríjalos y dé una explicación de por qué suceden.

  int a = 10, b = 3 , e = 1, d, e;
  float x, y;
  x= a / b;
  c = a < b && c;
  d = a + b++;
  e = ++a – b;
  y = (float)a / b;

  Se declaran dos variables llamadas e
  La variable c no ha sido declarada ni tiene un valor
  Al no tener valor no puede ser comparado
 */

public class Ejercicio18 {

  public static void main(String[] args) {
    
    int a = 10, b = 3 , e = 1, d;
    boolean c = true;
    float x, y;
    x = a / b;
    c = a < b && c;
    d = a + b++;
    e = ++a - b;
    y = (float)a / b;


    System.out.println(x + y + e + d);
  }
}
