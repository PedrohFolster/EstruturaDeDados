package estrutura_de_dados.exercicio;

import java.util.LinkedList;

public class EstruturaDeDados {

    public static void main(String[] args) {

        LinkedList li = new LinkedList();

        li.push("A");
        li.push("B");
        li.push("C");
        li.push("D");

        System.out.println("=== Acessando como Pilha ===");
        while (li.size() > 0) {
            String val = (String) li.pop();
            System.out.println(val);
        }

    }
}
