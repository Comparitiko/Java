public class Ahorcado {

  // Funcion que imprime el ahorcado  en fase 0
  public static void fase0 () {

    System.out.println(" -----");
    System.out.println(" |   |");
    System.out.println("     |");
    System.out.println("     |");
    System.out.println("     |");
    System.out.println(" -----");

  }

  // Funcion que imprime el ahorcado  en fase 1
  public static void fase1 () {

    System.out.println(" -----");
    System.out.println(" |   |");
    System.out.println(" o   |");
    System.out.println("     |");
    System.out.println("     |");
    System.out.println(" -----");

  }

  // Funcion que imprime el ahorcado  en fase 2
  public static void fase2 () {

    System.out.println(" -----");
    System.out.println(" |   |");
    System.out.println(" o   |");
    System.out.println(" |   |");
    System.out.println("     |");
    System.out.println(" -----");

  }

  // Funcion que imprime el ahorcado  en fase 3
  public static void fase3 () {

    System.out.println(" -----");
    System.out.println(" |   |");
    System.out.println(" o   |");
    System.out.println("-|-  |");
    System.out.println("     |");
    System.out.println(" -----");

  }

  // Funcion que imprime el ahorcado  en fase 4
  public static void fase4 () {

    System.out.println(" -----");
    System.out.println(" |   |");
    System.out.println(" o   |");
    System.out.println("-|-  |");
    System.out.println("(    |");
    System.out.println(" -----");

  }
    
  // Funcion que imprime el ahorcado  en fase 5
  public static void fase5 () {

    System.out.println(" ----");
    System.out.println(" |   |");
    System.out.println(" o   |");
    System.out.println("-|-  |");
    System.out.println("( )  |");
    System.out.println(" -----");

  }

  // Lanzar funciones fase segun el turno recibido
  public static void turnos (int intentos) {

    if (intentos == 0) fase0();
    if (intentos == 1) fase1();
    if (intentos == 2) fase2();
    if (intentos == 3) fase3();
    if (intentos == 4) fase4();
    if (intentos == 5) fase5();

  }

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

  // Funcion que va imprimiendo el resultado dadas las letras escritas
  public static void resultado (String letra, String[] palabra) {

    String letraConAcento = letra;

    if (letra.equals("a")) letraConAcento = "á";
    if (letra.equals("e")) letraConAcento = "é";
    if (letra.equals("i")) letraConAcento = "í";
    if (letra.equals("o")) letraConAcento = "ó";
    if (letra.equals("u")) letraConAcento = "ú";



    for (int i = 0; i != palabra.length; i++) {

      

      if (letra.equals(palabra[i]) || letraConAcento.equals(palabra[i])) System.out.print(palabra[i]);
      else System.out.print("_");

    }

    System.out.println();

  }

  // Funcion que imprime el juego
  public static void juego(String palabra) throws Exception {

    int intentos = 0;

    String[] palabraArray = palabra.split("");

    // Bucle que pinta los _ para cada letra de la palabra
    for (int i = 0; i != palabra.length(); i++) {

      System.out.print("_");

    }

    System.out.println();

    while (intentos != 6) {

      turnos(intentos);
      if (intentos == 5) {
        System.out.println();
        System.out.println("Has perdido la partida.");
        System.out.println("La palabra era: " + palabra);
        System.out.println();
        break;
      }
      System.out.println("Ingrese una letra");
      String letra = System.console().readLine();

      if (letra.length() != 1) throw new Exception();

      resultado(letra, palabraArray);

      intentos++;

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