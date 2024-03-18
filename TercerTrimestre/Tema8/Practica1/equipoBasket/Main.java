package TercerTrimestre.Tema8.Practica1.equipoBasket;

import TercerTrimestre.Tema8.Practica1.equipoBasket.entities.EquipoBasket;
import TercerTrimestre.Tema8.Practica1.equipoBasket.entities.JugadorBasket;
import TercerTrimestre.Tema8.Practica1.equipoBasket.entities.Posicion;
import TercerTrimestre.Tema8.Practica1.equipoBasket.services.NBALeague;

public class Main {

  /**
   * Metodo para sacar las victorias aleatoriamente sobre 100 y las derrotas
   * @return victorias y derrotas
   */
  public static Integer[] caclularVD () {
    int victorias = (int) (Math.ceil(Math.random() * 100));
    int derrotas = 100 - victorias;
    return new Integer[] {victorias, derrotas};
  }
  public static void main(String[] args) {

    NBALeague l1 = new NBALeague();

    // Crear equipos con victorias y derrotas y jugador
    for (int i = 1; i <= 7; i++) {
      Integer[] vD = caclularVD();
      EquipoBasket equipo = new EquipoBasket("Equipo " + i, vD[0], vD[1]);

      // Crear los jugadores con toda su informacion
      for (int j = 1; j <= 7; j++) {
        Double altura = Math.random() * 2;
        Double puntosPorPartido = Math.random() * 40;
        Double rebotesPorPartido = Math.random() * 20;
        Double taponesPorPartido = Math.random() * 15;
        Double asistenciasPorPartido = Math.random() * 15;
        Double robosPorPartido = Math.random() * 15;

        // Añadir los jugadores al equipo
        equipo.addJugador(new JugadorBasket("Nombre " + i + j, j, altura, Posicion.ESCOLTA, puntosPorPartido, rebotesPorPartido,
                taponesPorPartido, asistenciasPorPartido, robosPorPartido));
      }
      // Añadir el equipo a la liga
      l1.addEquipo(equipo);
    }

    System.out.println("Equipos sin ordenar");
    System.out.println(l1.mostrarEquipos());

    System.out.println("Equipos ordenados");
    System.out.println(l1.mostrarEquiposOrdenados());

    System.out.println("Equipo con mas victorias: " + l1.getEquipoConMasWins().getNombre());

    System.out.println("El jugador con mas altura de la liga es: " + l1.buscarJugadorMasAlto().getNombre() + "");

    System.out.println("El jugador con dorsal 6 del Equipo 5 es: " + l1.getEquiposOrdenados().get("Equipo 5")
            .buscarJugador(6).getNombre());

    System.out.println("La informacion del jugador con nombre Nombre 14 es: ");
    System.out.println(l1.getEquipos().get("Equipo 1").buscarJugador("Nombre 14"));
  }
}
