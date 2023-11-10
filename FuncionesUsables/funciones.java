package FuncionesUsables;

public class funciones {

  // Funcion que genera un numero del 1 al 6
  public static int tirarDado6 () {
    return (int) Math.ceil(Math.random() * 6);
  } 

  // Generar un numero aleatorio entre un min y un max
  public static int genNum(int min, int max) {

    return (int) ((Math.random() * (max - min + 2) + min - 1));

  }
  
}
