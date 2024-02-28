package SegundoTrimestre.Tema7.Practica.multimedia;

public class TestPrimeVideo2 {

  // Funcion para crear las series
  public static void agregarSerie (PrimeVideo pv, String titulo, double precio, boolean esPlus, Genero.GeneroPelicula genero, int temporadas, int episodiosPorTemporada) {
    Serie serie = new Serie(titulo, precio, esPlus, genero);
    for(int i=0; i<temporadas; i++) {
      Temporada t = new Temporada(i);
      for(int j=0; j<episodiosPorTemporada; j++) {
        t.addEpisodio(new Episodio("Episodio " +j, 50));
      }
      serie.addTemporada(t);
    }
    pv.addMultimedia(serie);
  }

  // Funcion para devolver un numero random entre 0 y la cantidad de multimedias que haya
  public static int numRandom (PrimeVideo pv) {
    return (int) Math.ceil(Math.random() * pv.getCatalogo().size() - 1);
  }

  public static void main(String[] args) {
    PrimeVideo pv1 = new PrimeVideo();

    // Crear 10 series
    agregarSerie(pv1, "Serie 1", 10, true, Genero.GeneroPelicula.DRAMA, 2, 8);
    agregarSerie(pv1, "Serie 2", 20, false, Genero.GeneroPelicula.ROMANTICA, 5, 8);
    agregarSerie(pv1, "Serie 3", 30, true, Genero.GeneroPelicula.AVENTURAS, 6, 10);
    agregarSerie(pv1, "Serie 4", 40, false, Genero.GeneroPelicula.SCIFI, 8, 10);
    agregarSerie(pv1, "Serie 5", 50, true, Genero.GeneroPelicula.THRILLER, 7, 10);
    agregarSerie(pv1, "Serie 6", 60, false, Genero.GeneroPelicula.ACCION, 1, 8);
    agregarSerie(pv1, "Serie 7", 70, true, Genero.GeneroPelicula.COMEDIA, 6, 8);
    agregarSerie(pv1, "Serie 8", 80, false, Genero.GeneroPelicula.INFANTIL, 8, 8);
    agregarSerie(pv1, "Serie 9", 90, true, Genero.GeneroPelicula.ORIENTAL, 9, 8);
    agregarSerie(pv1, "Serie 10", 100, false, Genero.GeneroPelicula.COMEDIA, 20, 8);

    // Ingresar en pv1 varios clientes
    for (int i = 0; i < 1000000; i++) {
      if (i < 250000) pv1.addSuscriptor(new ClientePrimePro(i + "F", "ClientePro " + i, "ClientePro" + i + "@clientePro.asd"));
      else pv1.addSuscriptor(new ClientePrime(i + "F", "ClientePrime " + i, "ClientePrime" + i + "@clientePrime.asd"));
    }

    // Ver 5 series aleatorias del arrayList con todos los clientes
    for (Cliente cliente : pv1.getSuscriptores()) {
      for (int i = 0; i < 5; i++) {
        pv1.ver(pv1.getCatalogo().get(numRandom(pv1)), cliente);
      }
    }

    System.out.println(pv1.getCatalogo());

    // Imprimir ganancias
    System.out.println("Las ganancias son: " + pv1.getGanancias() + "€");
  }
}
