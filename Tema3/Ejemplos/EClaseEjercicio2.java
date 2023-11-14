public class EClaseEjercicio2 {

  // Funcion que genera un numero del 1 al numero de caras que quieras
  public static int tirarDado (int caras) throws Exception {
    if (caras < 1) throw new Exception("El numero de caras tiene que ser mayor que 0");
    return (int) Math.ceil(Math.random() * caras);
  } 

  public static void main(String[] args) {

    String[] dadosPoker = new String[5];

    int contadorPoker = 0;

    for (int i = 0; i < dadosPoker.length; i++) {

      int dado = 0;

      try {
      
        dado = tirarDado(6);
      
      } catch (Exception e) {
        
          System.out.println("Error: " + e);
      
      }

      switch (dado) {
        case 1:
          dadosPoker[i] = ".";
          break;
        case 2:
          dadosPoker[i] = "J";
          break;
        case 3:
          dadosPoker[i] = "Q";
          break;
        case 4:
          dadosPoker[i] = "K";
          break;
        case 5:
          dadosPoker[i] = "negro";
          break;
        default:
          dadosPoker[i] = "rojo";
          break;
      }

      System.out.println("La tirada " + (i + 1) + " es: " + dadosPoker[i]);

      if (i != 0 && dadosPoker[i].equals(dadosPoker[i - 1])) contadorPoker++;

    }

    if (contadorPoker >= 3) System.out.println("Has sacado poker");
    else System.out.println("No has sacado poker");

  }

}