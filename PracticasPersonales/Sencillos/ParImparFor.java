class ParImparFor {
  public static void main(String[] args) {
    
    // Bucle for para sacar los numeros impares hasta que lleguemos a 30
    for (int numero = 1; numero<= 30; numero++) {
      
      // Imprimir en consola si es par o impar el numero 
      if (numero % 2 == 0) {
        System.out.println("El numero " + numero + " es par");
      } else {
        System.out.println("El numero " + numero + " es impar");
      }
    }
  }
}