package estrutura_de_dados.exercicio;

import java.util.LinkedList;

public class Exemplo {

    public static void main(String[] args) {

        LinkedList cestinha = new LinkedList();

        cestinha.push(new Produto("Agua", 4));
        Produto p = new Produto("Maça 1kg", 8);
        cestinha.push(p);
        Object o = new Produto("Macarrão 500g", 6.5);
        cestinha.push(o);
        cestinha.push(new Produto("Leite 1l", 4.5));

        System.out.println("=== Acessando como Pilha ===");

        double valorTotal = 0;

        while (cestinha.size() > 0) {
            Produto val = (Produto) cestinha.pop();
            valorTotal += val.getPreco();
        }

        System.out.println("O valor total da cestinha de compras foi de: " + valorTotal);

    }
}
