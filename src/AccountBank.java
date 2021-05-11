public class AccountBank {
  String name;
  int accountNumber;
  long cpf;
  String city;
  float money = 0.0f;

  public void createNewAccount() {
    System.out.println("Conta criada com sucesso !!");
    System.out.println("Nome: " + this.name);
    System.out.println("Cpf : " + this.cpf);
    System.out.println("Cidade: " + this.city);
  }

  public void addMoney() {
    System.out.println(this.money);
  }

  public void showMoney() {
    System.out.println(this.money);
  }
}
