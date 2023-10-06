package estrutura_de_dados.atividade_pilha;

import java.util.LinkedList;

public class Veiculo {

    private LinkedList<Passageiro> passageiros;
    private int peso;
    private int lugares;

    public Veiculo(int peso, int lugares) {
        super();
        this.passageiros = new LinkedList<>();
        this.peso = peso;
        this.lugares = lugares;
    }

    public Veiculo() {
        super();
    }

    public LinkedList getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(LinkedList passageiros) {
        this.passageiros = passageiros;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getLugares() {
        return lugares;
    }

    public void setLugares(int lugares) {
        this.lugares = lugares;
    }

    public void adicionarPassageiro(String nome, double peso) {
        if (passageiros.size() < lugares && calcularPesoAtual() + peso <= this.peso) {
            Passageiro passageiro = new Passageiro(nome, peso);
            passageiros.push(passageiro);
            System.out.println("Passageiro adicionado com sucesso!");
        } else {
            System.out.println("Não foi possível adicionar o passageiro, o veículo pode estar com sua capacidade máxima permitida ou peso máximo permitido!");
        }
    }

    public void desembarcarPassageiros() {
        System.out.println("Quantidade de passageiros: " + passageiros.size());
        if (passageiros.size() > 0) {
            System.out.println("Desembarcando todos os passageiros a bordo...");

            for (Passageiro passageiro : passageiros) {
                System.out.println(passageiro.getNome() + " desembarcando...");
            }

            passageiros.clear();
        } else {
            System.out.println("Não há passageiros no veículo!");
        }
    }

    public void exibirListaDePassageiros() {
        if (passageiros.isEmpty()) {
            System.out.println("Não há passageiros a bordo.");
        } else {
            System.out.println();
            System.out.println("Lista de passageiros: " + "Há " + passageiros.size() + " passageiros a bordo.");
            for (Passageiro passageiro : passageiros) {
                System.out.println("Nome: " + passageiro.getNome() + ", Peso: " + passageiro.getPeso() + " kg");
            }
            System.out.println("Peso Total Atual: " + calcularPesoAtual() + " kg");
        }
    }


    public double calcularPesoAtual() {
        double pesoAtual = 0;

        for (Object obj : passageiros) {
            Passageiro passageiro = (Passageiro) obj;
            pesoAtual += passageiro.getPeso();
        }
        return pesoAtual;
    }
}
