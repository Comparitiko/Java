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
    private int codigo;
    private enum estado;
}
