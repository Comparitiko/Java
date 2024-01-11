package SegundoTrimestre.Tema4.Ejercicios_POO.Ejercicio6;

public class TestSteamJuego {
    public static void main(String[] args) {
        SteamJuego j1 = new SteamJuego("Rocket League", "Futbol con coche", 150000, 1024, 0, 3);
        SteamJuego j2 = new SteamJuego("Counter Strike", "FPS", 1200000, 2000, 0, 1);
        SteamJuego j3 = new SteamJuego("Terraria", "Supervivencia", 100000, 1400, 7.99, 2);

        j1.jugadoresDia(50000);
        j2.jugadoresDia(15000000);
        j3.jugadoresDia(80000);

        System.out.println("Media jugadores diarios de Rocket League: " + j1.getMediaJugadoresDiarios());
        System.out.println("Media jugadores diarios de Counter Strike: " + j2.getMediaJugadoresDiarios());
        System.out.println("Media jugadores diarios de Terraria: " + j3.getMediaJugadoresDiarios());

    }
}
