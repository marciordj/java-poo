public class Pencil {
  String model;
  String color;
  float ponta;
  int charge;
  boolean tampada;

  public void status() {
    System.out.println("Uma caneta " + this.color);

    if(this.tampada) {
      System.out.println("Está tampada ? Sim");
    } else {
      System.out.println(" Está tampada ? Não ");
    }
  }

  void rabiscar(String arg) {
    System.out.println("Rabiscando " + arg);
  }

  void tampar() {

  }

  void destampar() {

  }
}
