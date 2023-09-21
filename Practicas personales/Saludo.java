public class Saludo {
  public static void main(String[] args) {
    // Declaracion de variable nombre
    String nombre;

    // Pedir el nombre por terminal
    System.out.println("Ingresa tu nombre:");
    nombre = System.console().readLine();

    // Saludar al nombre introducido por consola
    System.out.println("Hola, " + nombre);
  }
}
