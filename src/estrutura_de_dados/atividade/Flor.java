package estrutura_de_dados.atividade;

class Flor {
    private String tipo;
    private int codigo;
    private double valor;
    private Flor proximo;

    public Flor(String tipo, int codigo, double valor, Flor proximo) {
        this.tipo = tipo;
        this.codigo = codigo;
        this.valor = valor;
        this.proximo = proximo;
    }

    public Flor() {
        super();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Flor getProximo() {
        return proximo;
    }

    public void setProximo(Flor proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "Flor{" +
                "Tipo='" + tipo + '\'' +
                ", codigo=" + codigo +
                ", valor=" + valor +
                ", proximo=" + proximo +
                '}';
    }
}