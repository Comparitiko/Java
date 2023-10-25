// Tablas de multiplicar del 1 al 10
public class TablasMultiplicar {
  public static void main(String[] args) {

    // Declaracion de variables
    int resultado;

    // Bucle for para cada tabla
    for (int tabla = 1; tabla <= 10; tabla++) {
      
      // Imprimir en terminal el numero de la tabla
      System.out.println("Tabla del " + tabla);

      // Bucle for para cada multiplicador
      for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {

        resultado = tabla * multiplicador;
        // Imprimir en terminal la multiplicación y el resultado
        System.out.println(tabla + " x " + multiplicador + " = " + resultado);
      }
    }
  }
}
