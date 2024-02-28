package SegundoTrimestre.Tema7.Practica.multimedia;

public class TestPrimeVideo {
  public static void main(String[] args) {
    PrimeVideo p1 = new PrimeVideo();
    // Ingresar en p1 varias multimedias
    for (int i = 0; i < 200; i++) {
      if (i < 30) p1.addMultimedia(new Pelicula("Pelicula " + (i + 1), 10, true, 50 + i ));
      else p1.addMultimedia(new Pelicula("Pelicula " + (i + 1), 10, false, 50 + i ));
    }
    // Ingresar en p1 varios clientes
    for (int i = 0; i < 1000000; i++) {
      if (i < 250000) p1.addSuscriptor(new ClientePrimePro(i + "F", "ClientePro " + i, "ClientePro" + i + "@clientePro.asd"));
      else p1.addSuscriptor(new ClientePrime(i + "F", "ClientePrime " + i, "ClientePrime" + i + "@clientePrime.asd"));
    }

    // Ver con todos los clientes las 40 primeras multimedias
    for (Cliente cliente : p1.getSuscriptores()) {
      for (int i = 0; i < 40; i++) {
        p1.ver(p1.getCatalogo().get(i), cliente);
      }
    }
    // Imprimir ganancias
    System.out.println("Las ganancias son: " + p1.getGanancias() + "€");
  }
}
