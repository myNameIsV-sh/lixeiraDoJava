import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner selecaoDoUsuario = new Scanner(System.in);

    Helicoptero a = new Helicoptero(false, 0, 5, 0);
    Helicoptero b = new Helicoptero(false, 0, 10, 0);

    System.out.println("Escolha alguma opção:");
    System.out.println("1. Adicionar pessoa");
    System.out.println("2. Remover pessoa");
    System.out.println("3. Levantar voo");
    System.out.println("4. Pousar helicóptero");
    System.out.println("5. Ligar helicóptero");
    System.out.println("6. Desligar helicóptero");
    System.out.println("7. Mostrar Status");
    System.out.println("0. Sair");

    int escolhaDoUsuario = -1;

    while (escolhaDoUsuario != 0) {
      escolhaDoUsuario = selecaoDoUsuario.nextInt();
      switch (escolhaDoUsuario) {
        case 1:
          a.adicionarPessoa();
          b.adicionarPessoa();
          break;
        case 2:
          a.removerPessoa();
          b.removerPessoa();
          break;
        case 3:
          a.levantarVoo();
          b.levantarVoo();
          break;
        case 4:
          a.pousarHelicoptero();
          b.pousarHelicoptero();
          break;
        case 5:
          a.ligarHelicoptero();
          b.ligarHelicoptero();
          break;
        case 6:
          a.desligarHelicoptero();
          b.desligarHelicoptero();
          break;
        case 7:
          System.out.println(a);
          System.out.println(b);
          break;
        case 0:
          System.out.println("Saindo...");
          break;
        default:
          System.out.println("Opção inválida! Tente novamente.");
      }
    }
    selecaoDoUsuario.close();
  }
}
