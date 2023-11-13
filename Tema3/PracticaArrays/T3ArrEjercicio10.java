/*
  10. Realiza una función que devuelva un array con una combinación de la Lotería Primitiva (6 números entre 1 y 49).
  La particularidad es que los números no deben estar repetidos
*/

public class T3ArrEjercicio10 {

  // Funcion para generar un numero del 1 al 9
  public static int genCifra () {
    return (int) Math.ceil(Math.random() * 9);
  }

  // Funcion que devuelve true si el numero esta repetido en el array
  public static boolean numRepetido (int[] nums, int numComparado) {
    for (int i = 0; i < nums.length; i++) {
      if (numComparado == nums[i]) return true;
    }
    return false;
  }

  // Funcion para generar el numero de loteria
  public static void genNumLoteria (int[] numLoteria) {

    int cifra;
    
    for (int i = 0; i != numLoteria.length; i++) {

      do {
        cifra = genCifra();
        if (!numRepetido(numLoteria, cifra)) {
          numLoteria[i] = cifra;
          break;
        }
      } while (true);

      numLoteria[i] = cifra;
    }

  }
  
  public static void main(String[] args) {

    int[] numLoteriaArray = new int[6];
    StringBuilder numLoteria = new StringBuilder();

    genNumLoteria(numLoteriaArray);

    // For para incluir en el StringBuilder los valores de numLoteriaArray
    for (int i = 0; i < numLoteriaArray.length; i++) {
      numLoteria.append(numLoteriaArray[i]);
    }

    System.out.println("El numero de loteria es: " + numLoteria);

  }

}