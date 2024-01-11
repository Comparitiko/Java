package SegundoTrimestre.Tema4.Ejercicios_POO.Ejercicio7;

/*
7. Implementa una clase Incidencia. Queremos resolver el problema de una comunidad de propietarios que quiere
gestionar las incidencias que se producen en la comunidad. Tendremos como propiedades: código, estado
(abierta, en proceso, resuelta), problema (la descripción de la incidencia), solución (la descripción de la solución),
pendientes (será una propiedad estática, cada vez que se crea un objeto se incrementa y cada vez que se
resuelve una se decrementa). Los métodos a implementar son:
- resuelve(): método estático que decrementa el contador de pendientes
- toString(): pasa un objeto a string, código, estado, problema y solución.
- getters y setters
- getPendientes(): método estático que devuelva el número de incidencias pendientes de resolver.
Realiza una clase TestIncidencia en la que crees 5 incidencias, resuelvas algunas y veas las que quedan
pendientes.
 */

public class Incidencia {
    // Enums
    public enum estadoIncidencia {
        abierta, enProceso, resuelta;
    }

    // Props
    private int codigo;
    private estadoIncidencia estado;
    private String problema;
    private String solucion;
    private static int pendientes;

    // Constructor
    public Incidencia(int codigo, estadoIncidencia estado, String problema) {
        this.codigo = codigo;
        this.estado = estado;
        this.problema = problema;
        pendientes++;
    }

    // Getters and Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public estadoIncidencia getEstado() {
        return estado;
    }

    public void setEstado(estadoIncidencia estado) {
        this.estado = estado;
        if (estado == estadoIncidencia.resuelta) {
            pendientes--;
        }
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getSolucion() {
        return solucion;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }

    // Methods
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Incidencia{");
        sb.append("codigo=").append(codigo);
        sb.append(", estado=").append(estado);
        sb.append(", problema='").append(problema).append('\'');
        sb.append(", solucion='").append(solucion).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void resuelve () {
        pendientes--;
    }

    public static int getPendientes() {
        return pendientes;
    }
}
