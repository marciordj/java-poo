public class Pencil {
  String model;
  String color;
  float ponta;
  int charge;
  boolean tampada;

  public void status() {
    System.out.println("Uma caneta " + this.color);
  }

  void rabiscar(String arg) {
    System.out.println("Rabiscando " + arg);
  }

  void tampar() {

  }

  void destampar() {

  }
}
