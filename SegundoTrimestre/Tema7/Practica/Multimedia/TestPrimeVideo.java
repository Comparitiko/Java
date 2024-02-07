package SegundoTrimestre.Tema7.Practica.Multimedia;

public class TestPrimeVideo {
  public static void main(String[] args) {
    PrimeVideo p1 = new PrimeVideo();
    for (int i = 0; i < 200; i++) {
      if (i < 30) p1.addMultimedia(new Pelicula("Pelicula " + (i + 1), 10, true, 50 + i ));
      else p1.addMultimedia(new Pelicula("Pelicula " + (i + 1), 10, false, 50 + i ));
    }
    for (int i = 0; i < 1000000; i++) {
      if (i < 250000) new ClientePrimePro(i, "ClientePro " + i, "ClientePro" + i + "@cliente.asd");
    }
  }
}
