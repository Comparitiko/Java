/*
  14. Realiza un programa en Java que genere números de forma aleatoria simulando la tirada de un dado.
*/

public class Ejercicio14 {
  
  public static void main(String[] args) {
    
    // Declaración de variables y asignacion con la libreria Math, le añadimos un numero random entre 1 y 6  con decimales
    double numRan = Math.random() * 6 ;

    // Asignamos de nuevo a numRan el numero mas aproximado a lo asignado a numRan con math.ceil
    numRan = Math.ceil(numRan);

    // Imprimimos en terminal la variable numRan
    System.out.println((int)numRan);
  }

}
