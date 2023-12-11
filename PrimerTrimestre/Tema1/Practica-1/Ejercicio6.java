/*
  
  6. ¿Qué muestra por pantalla el siguiente programa?
    public class Ejercicio5 {
      public static void main(String[] args) {
        System.out.println("Hola usuario."+" Bienvenido.");
        String dia = "Lunes";
        System.out.println("Hoy es " + dia);
        int hora = 12;
        System.out.println("Son las " + hora + " en punto.");
        System.out.println("Dentro de 2 horas serán las " + hora + 2 + " en punto");
        System.out.println("Dentro de 2 horas serán las " + (hora + 2) + " en punto");
      }
    }

    System.out.println("Hola usuario."+" Bienvenido."); => Hola usuario. Bienvenido.

    System.out.println("Hoy es " + dia); => Hoy es Lunes

    System.out.println("Son las " + hora + " en punto."); => Son las 12 en punto.

    System.out.println("Dentro de 2 horas serán las " + hora + 2 + " en punto"); => Dentro de 2 horas serán las 122 en punto

    System.out.println("Dentro de 2 horas serán las " + (hora + 2) + " en punto"); => Dentro de 2 horas serán las 14 en punto

 */