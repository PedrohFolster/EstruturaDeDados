package estrutura_de_dados.exercicio;

public class Produto {

    private String descricao;
    private double preco;

    public Produto(String descicao, double preco) {
        super();
        this.descricao = descicao;
        this.preco = preco;
    }

    public Produto() {
        super();
    }

    public String getDescicao() {
        return descricao;
    }

    public void setDescicao(String descicao) {
        this.descricao = descicao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
