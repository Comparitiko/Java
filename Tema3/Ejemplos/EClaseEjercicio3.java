import java.util.Arrays;

public class EClaseEjercicio3 {

  public static String traduccion (String[] palabrasEspaniol, String palabraEspaniol, String[] englishWords) {

    int pos = -1;
                                                                                                                                               
    for (int i = 0; i < palabrasEspaniol.length; i++) {
      if (palabraEspaniol.equals(palabrasEspaniol[i])) {
        pos = i;
      }
    }

    if (pos >= 0) return englishWords[pos];
    else return "-1";
  }
  
  public static void main(String[] args) {

    String[] palabrasEspaniol = {"Hola", "Adios", "Elefante", "Tigre", "Leon", "Animal", "Desayuno", "Tarde", "Buenos dias", "Buenas noches", "Ejemplo", "Ejercicio", "Siete", "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis"};
    String[] englishWords = {"Hello", "Bye", "Elephant", "Tiger", "Lion", "Animal", "Launch", "Afternoon", "Good morning", "Good afternoon", "Example", "Exercise", "Seven", "One", "Two", "Three", "Four", "Five", "Six"};

    System.out.println("Ingrese una palabra de las siguientes que quieres traducir (Es importante escribirlas tal y como estan escritas en pantalla):");
    System.out.println(Arrays.toString(palabrasEspaniol));
    String palabraEspaniol = System.console().readLine(); 

    String res = traduccion(palabrasEspaniol, palabraEspaniol, englishWords);

    if (res.equals("-1")) System.out.println("La palabra introducida no es correcta intentelo de nuevo");
    else System.out.println("La traduccion de " + palabraEspaniol + " es " + res);


  }

}