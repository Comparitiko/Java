import java.lang.reflect.Array;
import java.util.Arrays;

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
    System.out.println("( )  |");
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
  public static void turnos (int turno) {

    if (turno == 0) fase0();
    if (turno == 1) fase1();
    if (turno == 2) fase2();
    if (turno == 3) fase3();
    if (turno == 4) fase4();
    if (turno == 5) fase5();

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
  public static String[] resultado (String letra, String[] palabraConGuiones, String[] palabra) {
    String[] palabraNueva = new String[palabra.length];
    String letraConAcento = letra;
    System.out.println(Arrays.toString(palabraConGuiones));
    System.out.println(Arrays.toString(palabra));

    if (letra.equals("a")) letraConAcento = "á";
    if (letra.equals("e")) letraConAcento = "é";
    if (letra.equals("i")) letraConAcento = "í";
    if (letra.equals("o")) letraConAcento = "ó";
    if (letra.equals("u")) letraConAcento = "ú";



    for (int i = 0; i != palabra.length; i++) {

      if (palabraConGuiones[i].equals("_")) {
        if (i == 0 && letra.toUpperCase().equals(palabra[i])) {
          palabraNueva[i] = palabra[i];
          System.out.print(palabra[i]);
        } else if (letra.equals(palabra[i]) || letraConAcento.equals(palabra[i])) {
          palabraNueva[i] = palabra[i];
          System.out.print(palabra[i]);
        } else {
          palabraNueva[i] = "_";
          System.out.print("_");
        }
      }

      else palabraNueva[i] = palabra[i];

    }

    System.out.println();

    return palabraNueva;

  }

  // Funcion que imprime el juego
  public static void juego(String palabra) throws Exception {

    int turno = 0, intentos = 0;
    System.out.println(palabra);

    String[] palabraArrayOriginal = palabra.split("");
    String[] palabraArrayConGuiones = new String[palabra.length()];

    // Bucle que pinta los _ para cada letra de la palabra
    for (int i = 0; i != palabra.length(); i++) {

      System.out.print("_");
      palabraArrayConGuiones[i] = "_";

    }

    System.out.println();

    while (turno != 6) {

      turnos(turno);
      if (turno == 5) break;

      System.out.println("Ingrese una letra:");
      String letra = System.console().readLine();

      if (letra.length() != 1) throw new Exception("Tienes que añadir solo un caracter");

      String[] palabraArrayAnterior = palabraArrayConGuiones;

      palabraArrayConGuiones = resultado(letra, palabraArrayConGuiones, palabraArrayOriginal);

      if (palabraArrayAnterior.equals(palabraArrayConGuiones)) {
        turno++;
        intentos++;
        System.out.println(turno);
      }
      if (palabraArrayConGuiones.equals(palabraArrayOriginal)) {
        System.out.println("Has acertado la palabra en " + intentos + " intentos");
      }

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