public class Ahorcado {

  // Imprimir menu segun el turno de juego que sea
  public static int menu (int numPartida) {
    
    System.out.println();

        System.out.println("---- Menu ----");
        if (numPartida == 0) System.out.println("1. Empezar partida");
        else System.out.println("1. Jugar de nuevo");
        System.out.println("2. Salir");
      
        return Integer.parseInt(System.console().readLine());

  }

  // Funcion que devuelve un numero aleatorio entre 0 y la cantidad de palabras - 1
  public static String generarPalabra () {

    // Palabras del juego
    String[] palabras = { "Atlántico", "Murciélago", "Tortuga", "Gaviota", "Elefante", "Guitarra", "Bicicleta",
      "Hamburguesa", "Fútbol", "Computadora", "Abecedario", "Camiseta", "Maestro", "Avión", "Girasol", "Helicóptero",
      "Chocolate", "Biblioteca", "Teléfono", "Paraguas", "Mariposa", "Calabaza", "Refrigerador", "Serpiente",
      "Arcoiris", "Dinosaurio", "Universidad", "Pirámide", "Sandía", "Flamenco", "Piano", "Buceo", "Estrella",
      "Cascada", "Cohete", "Lápiz", "Bufanda", "Espejo", "Tomate", "Pingüino", "Sirena", "Molino", "Delfín",
      "Telescopio", "Sombrero", "Perro", "Gato", "León", "Persona" };

    return palabras[(int) Math.ceil(Math.random() * palabras.length) - 1];
  }

  public static void juego(String palabra) {

    String[] palabraArray = palabra.split("");

    System.out.println(palabra);

    // Bucle que pinta los _ para cada letra de la palabra
    for (int i = 0; i != palabra.length(); i++) {

      System.out.print("_");

    }

  }

  public static void main(String[] args) {

    // Declaracion de variables
    int opcionMenu = 0, numPartida = 0;

    do {

      try {

        opcionMenu = menu(numPartida);

        switch (opcionMenu) {
          case 1:
            String palabra = generarPalabra();
            juego(palabra);
          
            break;
          case 2:
            System.out.println("Saliendo...");

            break;
          default:
            System.out.println("Has introducido un numero que no esta disponible en el menu");

            break;
    }



      } catch (Exception e) {

        System.out.println("Error: " + e.getMessage());

      }

      numPartida++;
      
    } while (opcionMenu != 2);

  }

}