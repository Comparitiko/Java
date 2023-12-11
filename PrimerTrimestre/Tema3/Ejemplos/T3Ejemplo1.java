public class T3Ejemplo1 {
  
  public static void main(String[] args) {

    int sumaSalarios = 0;
    int[] salario = new int[10];

    // Pedir que se introduzcan salarios por pantalla e ir calculando la media
    for (int i = 0; i != salario.length; i++) {

      try {
        
        System.out.println("Ingresa el salario del trabajador numero " + (i + 1));
        salario[i] = Integer.parseInt(System.console().readLine());
        sumaSalarios += salario[i];

      } catch (Exception e) {
        System.out.println("Error: " + e);
      }

    }
    
    // Mostrar el salario de cada trabajador
    for (int i = 0; i != salario.length; i++) {

      System.out.println("El salario del trabajador numero " + (i + 1) + " es de: " + salario[i] + " Euros.");

    } 

    // Mostrar la media del salario de los trabajadores
    System.out.println("La media salarial de los trabajadores es de: " + (sumaSalarios / salario.length) + " Euros");

  }

}