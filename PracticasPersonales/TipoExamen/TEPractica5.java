/*
  2. [1.5 puntos] Cifrado y descifrado Riel-César. Implementa las siguientes funciones y
  pruébalas:
  String cifradoRielCesar(String mensaje, int clave)
  Aplica al mensaje primero el cifrado por transposición de Riel. El mensaje se cifra
  alternando las letras en dos cadenas separadas, y concatenando estas dos cadenas. Una
  vez cifrado con Riel lo cifrará con César, sumando la clave al valor ASCII de la letra (a con
  clave 3 es la d). Recibe como parámetro el mensaje a cifrar, y devuelve el texto al que se ha
  aplicado el cifrado.
  String descifradoRielCesar(String mensaje, int clave)
  Descifra un mensaje que ha sido previamente cifrado siguiendo el algoritmo transposición
  de Riel y luego César. Primero restará la clave a cada letra del mensaje descifrando por
  César. Luego descompondrá el mensaje en dos cadenas y cogiendo un carácter de cada
  cadena recompondrá el mensaje original. Recibe como parámetro un mensaje
  (supuestamente cifrado) y la clave de cifrado usada, y devuelve el texto al que se ha
  aplicado el descifrado.Pista: al descomponer en dos cadenas tened en cuenta el tamaño del
  mensaje, número par o impar de caracteres. 
*/



public class TEPractica5 {

  public static String cifradoRielCesar(String mensaje, int clave) {

    StringBuilder cad1 = new StringBuilder(), cad2 = new StringBuilder();

    for (int i = 0; i < mensaje.length(); i++) {
      if (i % 2 == 0) cad1.append(mensaje.charAt(i));
      else cad2.append(mensaje.charAt(i));
    }

    StringBuilder resRiel = new StringBuilder(cad1.length() + cad2.length()), res = new StringBuilder(resRiel.length());

    resRiel.append(cad1);
    resRiel.append(cad2);

    for (int i = 0; i < resRiel.length(); i++) {
      res.append( (char) (resRiel.charAt(i) + clave));
    }

    return res.toString();

  }
  
  public static String descifradoRielCesar(String mensajeCifrado, int clave) {

    StringBuilder mensajeCifradoConRiel = new StringBuilder(mensajeCifrado.length());

    for (int i = 0; i < mensajeCifrado.length(); i++) {
      mensajeCifradoConRiel.append( (char) (mensajeCifrado.charAt(i) - clave));
    }

    StringBuilder cad1 = new StringBuilder(), cad2 = new StringBuilder();

    for (int i = 0; i < mensajeCifradoConRiel.length(); i++) {
      if (mensajeCifradoConRiel.length() % 2 == 0) {
        if (i < mensajeCifradoConRiel.length() / 2) cad1.append(mensajeCifradoConRiel.charAt(i));
        else cad2.append(mensajeCifradoConRiel.charAt(i));
      } else {
        if (i < mensajeCifradoConRiel.length() / 2 + 1) cad1.append(mensajeCifradoConRiel.charAt(i));
        else cad2.append(mensajeCifradoConRiel.charAt(i));
      }
    }

    StringBuilder res = new StringBuilder(mensajeCifrado.length());

    for (int i = 0; i < cad1.length(); i++) {
      res.append(cad1.charAt(i));
      if (i <= cad2.length()) res.append(cad2.charAt(i));
    }

    return res.toString();

  }
  
  public static void main(String[] args) {
    
    try {
      
      System.out.println("Ingresa la cadena a cifrar:");
      String cad = System.console().readLine();

      System.out.println("Ingrese el numero de clave con el que se cifrara");
      int clave = Integer.parseInt(System.console().readLine());

      System.out.println("La clave cifrada es: " + cifradoRielCesar(cad, clave));
      System.out.println("La clave al ser descifrada es: " + descifradoRielCesar(cifradoRielCesar(cad, clave), clave));
    
    } catch (Exception e) {
    
        System.out.println("Error: " + e);
    
    }

  }

}
