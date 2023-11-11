package FuncionesGabriel;

public class utils {

  // Funcion que genera un numero del 1 al numero de caras que quieras
  public static int tirarDado (int caras) throws Exception {
    if (caras < 1) throw new Exception("El numero de caras tiene que ser mayor que 0");
    return (int) Math.ceil(Math.random() * caras);
  } 

  // Generar un numero aleatorio entre un min y un max
  public static int genNum(int min, int max) throws Exception {
    if (min > max) throw new Exception("El max tiene que ser un numero mayor que el minimo");
    return (int) ((Math.random() * (max - min + 2) + min - 1));
  }
  
}
