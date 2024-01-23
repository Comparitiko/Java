package SegundoTrimestre.Tema5.ejemplos.arrayList;
import java.util.ArrayList;
public class Palabras {
  public static void main(String[] args) {
    ArrayList<String> palabras = new ArrayList<>();
    palabras.add("hola");
    palabras.add("mundo");
    palabras.add("java");
    palabras.add("c++");
    palabras.add("c#");
    palabras.add("javascript");
    palabras.add("php");
    palabras.add("python");
    palabras.add("ruby");
    palabras.add("scala");
    palabras.add("go");
    palabras.add("scala");
    System.out.println(palabras);
    System.out.println(palabras.contains("scala"));
    palabras.remove("scala");
    System.out.println(palabras);
    palabras.remove("scala");
    System.out.println(palabras);
    palabras.remove("scala");
    System.out.println(palabras);
    palabras.remove("scala");
    System.out.println(palabras);
    palabras.remove("scala");
    System.out.println(palabras.size());
    System.out.println(palabras.contains("scala"));
  }
}
