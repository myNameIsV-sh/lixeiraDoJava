import java.util.Scanner;

public class Helicoptero {
  private boolean funcionamentoDoHelicoptero;
  private double altitude;
  final private int capacidadeTotalDePessoas;
  private int quantidadeDePessoasPresentes;

  Helicoptero (boolean funcionamentoDoHelicoptero, double altitude, int capacidadeTotalDePessoas, int quantidadeDePessoasPresentes) {
    this.funcionamentoDoHelicoptero = funcionamentoDoHelicoptero;
    this.altitude = altitude;
    this.capacidadeTotalDePessoas = capacidadeTotalDePessoas;
    this.quantidadeDePessoasPresentes = quantidadeDePessoasPresentes;
  }

  public void ligarHelicoptero() {
    if (!funcionamentoDoHelicoptero && altitude == 0) {
      setFuncionamentoDoHelicoptero(true);
      System.out.println("Agora o helicóptero está ligado...");
    } else {
      System.out.println("O helicóptero já está ligado ou em voo.");
    }
  }

  public void desligarHelicoptero () {
    if (getAltitude() > 0) {
      System.out.println("Pouse o helicóptero primeiro...");
    }
    else if (!getFuncionamentoDoHelicoptero()) {
      System.out.println("O helicóptero já está desligado...");
    }
    else {
      setFuncionamentoDoHelicoptero(false);
      System.out.println("O helicóptero foi desligado...");
    }
  }

  public void levantarVoo () {
    if (getFuncionamentoDoHelicoptero() && getAltitude() == 0) {
      Scanner escolherAlturaDoVoo = new Scanner(System.in);
      double alturaDesejada = 0;
      while (alturaDesejada <= 0) {
        System.out.println("Qual altura deseja alcançar?");
        alturaDesejada = escolherAlturaDoVoo.nextDouble();

        if (alturaDesejada > 0) {
          setAltitude(alturaDesejada);
          System.out.println("O helicóptero decolou para " + alturaDesejada + " metros.");
        } else {
          System.out.println("A altura deve ser maior que zero.");
        }
      }
    } else {
      System.out.println("O helicóptero precisa estar ligado para levantar voo.");
    }
  }

  public void pousarHelicoptero () {
    if (getAltitude() == 0) System.out.println("O helicóptero já está no chão");

    if (altitude > 0 && getFuncionamentoDoHelicoptero()) {
      setAltitude(0);
      System.out.println("O helicóptero pousou...");
    }
  }

  public void adicionarPessoa () {
    if (getQuantidadeDePessoasPresentes() < getCapacidadeTotalDePessoas()) {
      setQuantidadeDePessoasPresentes(getQuantidadeDePessoasPresentes() + 1);
      System.out.println("Pessoa adicionada ao helicóptero.");
    } else {
      System.out.println("Não há espaço para mais pessoas...");
    }
  }

  public void removerPessoa () {
    if (getQuantidadeDePessoasPresentes() > 0) {
      setQuantidadeDePessoasPresentes(getQuantidadeDePessoasPresentes() - 1);
      System.out.println("Pessoa removida do helicóptero.");
    } else {
      System.out.println("Não há pessoas para remover.");
    }
  }

  public String toString() {
    return "Helicoptero {" +
            "funcionamentoDoHelicoptero=" + funcionamentoDoHelicoptero +
            ", altitude=" + altitude +
            ", capacidadeTotalDePessoas=" + capacidadeTotalDePessoas +
            ", quantidadeDePessoasPresentes=" + quantidadeDePessoasPresentes +
            '}';
  }

  public int getCapacidadeTotalDePessoas() {
    return capacidadeTotalDePessoas;
  }

  /* Função inútil, tendo em vista que não vamos alterar a capacidade total que o helicóptero é capaz de suportar
  *  public void setCapacidadeTotalDePessoas(int capacidadeTotalDePessoas) {
  *    this.capacidadeTotalDePessoas = capacidadeTotalDePessoas;
  *  }
  */

  public boolean getFuncionamentoDoHelicoptero () {
    return funcionamentoDoHelicoptero;
  }

  public void setFuncionamentoDoHelicoptero(boolean funcionamentoDoHelicoptero) {
    this.funcionamentoDoHelicoptero = funcionamentoDoHelicoptero;
  }

  public double getAltitude () {
    return altitude;
  }

  public void setAltitude(double altitude) {
    this.altitude = altitude;
  }

  public int getQuantidadeDePessoasPresentes() {
    return quantidadeDePessoasPresentes;
  }

  public void setQuantidadeDePessoasPresentes(int quantidadeDePessoasPresentes) {
    this.quantidadeDePessoasPresentes = quantidadeDePessoasPresentes;
  }
}
