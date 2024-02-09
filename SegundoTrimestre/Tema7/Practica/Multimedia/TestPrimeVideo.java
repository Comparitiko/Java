package SegundoTrimestre.Tema7.Practica.Multimedia;

public class TestPrimeVideo {
  public static void main(String[] args) {
    PrimeVideo p1 = new PrimeVideo();
    for (int i = 0; i < 200; i++) {
      if (i < 30) p1.addMultimedia(new Pelicula("Pelicula " + (i + 1), 10, true, 50 + i ));
      else p1.addMultimedia(new Pelicula("Pelicula " + (i + 1), 10, false, 50 + i ));
    }
    for (int i = 0; i < 1000000; i++) {
      if (i < 250000) p1.addSuscriptor(new ClientePrimePro(i + "F", "ClientePro " + i, "ClientePro" + i + "@clientePro.asd"));
      else p1.addSuscriptor(new ClientePrime(i + "F", "ClientePrime " + i, "ClientePrime" + i + "@clientePrime.asd"));
    }
    for (Cliente cliente : p1.getSuscriptores()) {
      for (Multimedia multimedia : p1.getCatalogo()) {
        p1.ver(multimedia, cliente);
      }
    }
    System.out.println("Las ganancias son: " + p1.getGanancias() + "€");
  }
}
