import java.util.Random;

public class Guerreiro {
    // a) os atributos são privativos
    private int codigo;
    private String nome;
    private int energia;

    // b) no construtor, o código e o nome são carregados por
    // parâmetro e a energia é inicializada com o valor 5.
    public Guerreiro(int codigo, String nome) {
        this.codigo = this.codigo;
        this.nome = nome;
        this.energia = 5;
    }

    // d) há um método chamado incremento, que aumenta a energia
    // em 1 ponto, mas esta não pode passar do máximo (5)
    public void incremento(){
        if (energia < 5) {
            energia++;
        } else {
            System.out.println(nome + ", está com energia máxima!!!");
        }
    }

    // e) há um método chamado decremento que reduz em 1 ponto a energia
    // do Guerreiro. Caso este chegue a zero, uma mensagem será emitida
    // dizendo que o mesmo está sem energia.
    public void decremento() {
        if (energia > 0) {
            energia--;
        } if (energia == 0) {
            System.out.println(nome + ", está sem energia...");
        }
    }

    // f) o método alimentar-se deve aumentar a energia em 1 ponto
    // (use o método de incremento do item d)
    public void alimentar() {
        incremento();
        System.out.println(nome + ", se alimentou! Energia atual: " + energia);
    }

    // g) o método atacar consiste na geração e retorno de um número
    // aleatório entre 0 e 1 (0 — sem sucesso, 1 — com sucesso). O método
    // atacar só deve ser chamado dentro do método lutar do item h.
    public int atacar() {
        Random random = new Random();
        return random.nextInt(2);
    }

    // h) o método lutar recebe por parâmetro o guerreiro oponente e deve
    // reduzir a energia do guerreiro a cada ataque com sucesso de seu oponente
    // (use o método decremento — e). O método lutar deve chamar o método atacar
    // de cada guerreiro e exibir o vencedor quando a energia de um dos guerreiros
    // chegar a zero


    // laço de repetição
    public void lutarIterativo(Guerreiro oponente) {
        System.out.println("Os guerreiros: " + nome + ", " + oponente.nome + "começaram a brigar!!!");

        while (this.energia > 0 && oponente.energia > 0) {
            if (this.atacar() == 1) {
                oponente.decremento();
                System.out.println(this.nome + ", atacou! Energia de " + oponente.nome + ": " + oponente.getEnergia());
            }

            if (oponente.atacar() == 1) {
                this.decremento();
                System.out.println(oponente.nome + "atacou! Energia de " + this.nome + ": " + this.getEnergia());
            }
        }

        if (this.energia == 0) {
            System.out.println(oponente.nome + "venceu...");
        } else {
            System.out.println(this.nome + "venceu...");
        }
    }

    public void lutarRecursivo(Guerreiro oponente) {
        if (this.energia == 0) {
            System.out.println(oponente.nome + ", ganhou!");
            return;
        }
        if (oponente.energia == 0) {
            System.out.println(this.nome + ", ganhou!");
            return;
        }
        if (this.atacar() == 1) {
            oponente.decremento();
            System.out.println(this.nome + ", acertou o ataque!!!" + "O " + oponente.nome + "está com: " + oponente.getEnergia());
        }
        if (oponente.atacar() == 1) {
            this.decremento();
            System.out.println(oponente.nome + ", acertou o ataque!!!" + "O " + this.nome + "está com: " + this.getEnergia());
        }

        lutarRecursivo(oponente);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // c) Há um método de acesso para a energia.
    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    @Override
    public String toString() {
        return "Guerreiro{" +
                "código=" + codigo +
                ", nome='" + nome + '\'' +
                ", energia=" + energia +
                '}';
    }
}
