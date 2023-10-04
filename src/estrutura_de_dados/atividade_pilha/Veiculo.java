package estrutura_de_dados.atividade_pilha;

public class Veiculo {

    private int peso;
    private int lugares;

    public Veiculo(int peso, int lugares) {
        super();
        this.peso = peso;
        this.lugares = lugares;
    }

    public Veiculo() {
        super();
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
}
