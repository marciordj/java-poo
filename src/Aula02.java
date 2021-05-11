import java.util.Scanner;

public class Aula02 {
  public static void main(String args[]) {
//    Pencil pencil1 = new Pencil();
//
//    pencil1.color = "Azul";
//    pencil1.ponta = 0.5f;
//    pencil1.tampada = false;
//
//
//    pencil1.status();
    Scanner input = new Scanner(System.in);
    AccountBank client = new AccountBank();

    System.out.println("Digite seu nome: ");
    client.name = input.next();

    System.out.println("Digite seu cpf: ");
    client.cpf = input.nextLong();

    System.out.println("Digite sua cidade: ");
    client.city = input.next();

    System.out.println("Quando você deseja colocar de dinheiro? ");
    client.money = input.nextFloat();

    client.createNewAccount();

    client.addMoney();


  }
}
