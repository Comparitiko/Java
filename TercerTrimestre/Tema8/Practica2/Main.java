package TercerTrimestre.Tema8.Practica2;

import TercerTrimestre.Tema8.Practica2.entities.Registro;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  /**
   * Generar un double aleatorio entre min y max
   * @param min numero minimo
   * @param max numero maximo
   * @return double aleatorio entre min y max
   */
  public static Double genNumAleatorioDouble(Integer min, Integer max) {
    return Math.random() * (max - min) + min;
  }

  /**
   * Generar un entero aleatorio entre min y max
   * @param min numero minimo
   * @param max numero maximo
   * @return entero aleatorio entre min y max
   */
  public static Integer genNumAleatorio(Integer min, Integer max) {
    return (int) (Math.random() * (max - min)) + min;
  }

  public static void main(String[] args) {
    ArrayList<Registro> registros = new ArrayList<>();

    // Generar 100 registros de forma aleatoria
    for (int i = 0; i < 100; i++) {
      genNumAleatorio(1, 12);
      registros.add(
              new Registro(LocalDateTime.of(genNumAleatorio(2020, 2028), genNumAleatorio(1, 12), genNumAleatorio(1, 20),
                      genNumAleatorio(1, 24), genNumAleatorio(1, 60), genNumAleatorio(1, 60)),
                      genNumAleatorioDouble(-10, 50), genNumAleatorioDouble(0, 90))
      );
    }
    // Añadimos un registro para con la fecha de hoy para probar mas tarde
    registros.add(new Registro(LocalDateTime.now(), 31d, 91d));

    // a. Filtrar los registros de temperatura que sean mayores a 25 grados, la humedad sea menor a
    // 70 y la fecha sea anterior a la fecha actual, y mostrarlos.
    System.out.println("Registros con temperatura mayor a 25 grados, humedad menor a 70 y fecha anterior a la fecha actual");
    registros.stream()
            .filter(registro -> registro.getFechaHora().isBefore(LocalDateTime.now()))
            .filter(registro -> registro.getTemperatura() > 25)
            .filter(registro -> registro.getHumedad() < 70)
            .forEach(System.out::println);
    System.out.println();

    // b. Encontrar el registro con la temperatura más alta y mostrar el registro completo
    System.out.println("Registro con la temperatura más alta");
    System.out.println(
            registros.stream()
                    .max((reg1, reg2) -> reg1.getTemperatura().compareTo(reg2.getTemperatura()))
                    .get()
    );
    System.out.println();

    // c. Obtener una lista con las fechas/horas de todas las tomas de datos.
    System.out.println("Lista con las fechas/horas de todos los datos");
    List<LocalDateTime> fechasHoras = registros.stream()
            .map(registro -> registro.getFechaHora())
            .toList();

    fechasHoras.forEach(System.out::println);

    System.out.println();

    // d. Incrementar en 5 unidades la humedad de todos los registros y mostrar las temperaturas,
    // humedades y fechas/horas actualizadas.
    System.out.println("Incrementar en 5 unidades la humedad de todos los registros");
    registros.stream()
            .peek(registro -> registro.setHumedad(registro.getHumedad() + 5))
            .forEach(System.out::println);

    System.out.println();

    // e. Encontrar el registro con la temperatura más baja que tenga una humedad mayor a 80 y
    // mostrar la temperatura, humedad y fecha
    System.out.println("Registro con la temperatura más baja que tenga una humedad mayor que 80");
    System.out.println(
            registros.stream()
                    .filter(registro -> registro.getHumedad() > 80)
                    .min((reg1, reg2) -> reg1.getTemperatura().compareTo(reg2.getTemperatura()))
                    .get()
    );

    System.out.println();

    // f. Verificar si algún registro tiene una temperatura mayor a 30 grados, humedad mayor a 90 y
    // la fecha es de hoy. Mostrar un mensaje indicando si hay algún registro que cumple esta
    // condición o no.
    System.out.println("Comprobar si hay un registro con temperatura mayor a 30 grados, humedad mayor a 90 y la fecha es de hoy");
    System.out.println(
            registros.stream()
                    .anyMatch(reg -> reg.getTemperatura() > 30 && reg.getHumedad() > 90
                            && reg.getFechaHora().toLocalDate().equals(LocalDate.now()))
    );

    System.out.println();

    // g. Muestra 10 registros saltándote los 5 primeros.
    System.out.println("Mostrar 10 registros saltando los 5 primeros");
    registros.stream()
            .skip(5)
            .limit(10)
            .forEach(System.out::println);

    System.out.println();

    // h. Muestra los registros ordenados por fecha (sorted(Comparator))
    System.out.println("Mostrar los registros ordenados por fecha");
    registros.stream()
            .sorted((reg1, reg2) -> reg1.getFechaHora().compareTo(reg2.getFechaHora()))
            .forEach(System.out::println);

    System.out.println();

    // i. Cuenta los registros que tengan temperatura mayor a 35 grados (count())
    System.out.println("Cuenta de los registros que tengan temperatura mayor a 35 grados");
    System.out.println(
            registros.stream()
                    .filter(registro -> registro.getTemperatura() > 35)
                    .count()
    );

    System.out.println();

    // j. Calcular la temperatura promedio de todos los registros (transformarlo en Stream<Double>
    // y llamar a average()).
    System.out.println("Calcular temperatura media de todos los registros");
    System.out.println("La media es: " +
            registros.stream()
                    .mapToDouble(Registro::getTemperatura)
                    .average().getAsDouble()
    );
  }
}
