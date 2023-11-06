public class Arrays2 {
  
  public static void main(String[] args) {

    // Inicializar un array si conozco los valores
    String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

    for (int i = 0; i != diasSemana.length; i++) {

      System.out.println(diasSemana[i]);

    }

    // Clonar un array
    String[] diasSemana2 = diasSemana.clone();

    // Mostrar en terminal el array clonada
    for (int i = 0; i != diasSemana2.length; i++) {

      System.out.println(diasSemana2[i]);

    }

  }

}