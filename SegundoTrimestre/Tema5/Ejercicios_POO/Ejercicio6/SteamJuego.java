package SegundoTrimestre.Tema5.Ejercicios_POO.Ejercicio6;

/*
Crea la clase SteamJuego, la cual servirá para abstraer la información de estadísticas de los juegos jugados en la
plataforma Steam. Las propiedades de esa clase serán: nombre, descripcionCorta), mediaJugadoresDiarios, int
diasDesdeSalida, precio (0 si es FreeToPlay), puestoMasVendidos. Debes crear el constructor parametrizado,
getters y setters. Añade un método que añada cuántos jugadores han jugado en otro día:
- void jugadoresDia(int jugadoresHoy): deberá actualizar la media de jugadores diarios con la siguiente
fórmula 
((mediaJugadoresDiarios * diasDesdeSalida) + jugadoresHoy) / (diasDesdeSalida + 1)
Crea tres juegos diferentes y píntalos ordenados por el puesto en las ventas. Después llama a jugadoresDia para
los tres juegos indicando el número de jugadores que han jugado ese día, y muestra la nueva media de jugadores
diarios de cada juego.
 */
public class SteamJuego {
    // Props
    private String nombre;
    private String descripcionCorta;
    private double mediaJugadoresDiarios;
    private int diasDesdeSalida;
    private double precio;
    private int puestoMasVendidos;

    // Constructor
    public SteamJuego(String nombre, String descripcionCorta, double mediaJugadoresDiarios, int diasDesdeSalida, double precio, int puestoMasVendidos) {
        this.nombre = nombre;
        this.descripcionCorta = descripcionCorta;
        this.mediaJugadoresDiarios = mediaJugadoresDiarios;
        this.diasDesdeSalida = diasDesdeSalida;
        this.precio = precio;
        this.puestoMasVendidos = puestoMasVendidos;
    }

    // Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcionCorta() {
        return descripcionCorta;
    }

    public void setDescripcionCorta(String descripcionCorta) {
        this.descripcionCorta = descripcionCorta;
    }

    public double getMediaJugadoresDiarios() {
        return mediaJugadoresDiarios;
    }

    public void setMediaJugadoresDiarios(double mediaJugadoresDiarios) {
        this.mediaJugadoresDiarios = mediaJugadoresDiarios;
    }

    public int getDiasDesdeSalida() {
        return diasDesdeSalida;
    }

    public void setDiasDesdeSalida(int diasDesdeSalida) {
        this.diasDesdeSalida = diasDesdeSalida;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getPuestoMasVendidos() {
        return puestoMasVendidos;
    }

    public void setPuestoMasVendidos(int puestoMasVendidos) {
        this.puestoMasVendidos = puestoMasVendidos;
    }

    // Methods
    public  void jugadoresDia (int jugadoresHoy) {
        this.mediaJugadoresDiarios = (this.mediaJugadoresDiarios * this.diasDesdeSalida + jugadoresHoy) / (this.diasDesdeSalida + 1);
    }
}
