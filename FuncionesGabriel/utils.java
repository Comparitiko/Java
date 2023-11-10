package FuncionesGabriel;

public class utils {

  // Funcion que genera un numero del 1 al 6
  public static int tirarDado (int caras) {
    return (int) Math.ceil(Math.random() * caras);
  } 

  // Generar un numero aleatorio entre un min y un max
  public static int genNum(int min, int max) {
    return (int) ((Math.random() * (max - min + 2) + min - 1));
  }
  
}
