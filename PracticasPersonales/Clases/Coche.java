package PracticasPersonales.Clases;

public class Coche {
  private String marca;
  private String color;
  private String modelo;

  public Coche(String marca, String color, String modelo) {
    this.marca = marca;
    this.color = color;
    this.modelo = modelo;
  }

  public String getMarca() {
    return marca;
  }

  public String getColor() {
    return color;
  }

  public String getModelo() {
    return modelo;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  @Override
  public String toString() {
    return "Coche [marca=" + marca + ", color=" + color + ", modelo=" + modelo + "]";
  }

  

}
