package estrutura_de_dados.atividade_pilha;

import java.util.LinkedList;

public class Passageiro {

    private String nome;
    private double peso;

    public Passageiro(String nome, double peso) {
        super();
        this.nome = nome;
        this.peso = peso;
    }

    public Passageiro() {
        super();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
