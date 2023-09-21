package estrutura_de_dados.exercicio;

import java.util.Scanner;

class Node {
    String nome;
    int codigo;
    Node next;

    public Node(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
        this.next = null;
    }
}

class Fila {
    private Node inicio;
    private Node fim;

    public Fila() {
        inicio = null;
        fim = null;
    }

    public void enfileirar(String nome, int codigo) {
        Node novoNode = new Node(nome, codigo);

        if (estavazia()) {
            inicio = novoNode;
            fim = novoNode;
        } else {
            fim.next = novoNode;
            fim = novoNode;
        }
    }

    public void desenfileirar() {
        if (estavazia()) {
            System.out.println("A fila está vazia.");
        } else {
            System.out.println("Item removido: Nome - " + inicio.nome + ", Código - " + inicio.codigo);
            inicio = inicio.next;
            if (inicio == null) {
                fim = null;
            }
        }
    }

    public void mostrar() {
        if (estavazia()) {
            System.out.println("A fila está vazia.");
        } else {
            Node atual = inicio;
            System.out.println("\nDados da fila:");
            while (atual != null) {
                System.out.println("Nome: " + atual.nome + ", Código: " + atual.codigo);
                atual = atual.next;
            }
        }
    }

    public boolean estavazia() {
        return inicio == null;
    }
}

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Exibir dados da fila");
            System.out.println("2. Incluir novo item na fila");
            System.out.println("3. Remover item da fila");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após a leitura do número

            switch (opcao) {
                case 1:
                    fila.mostrar();
                    break;
                case 2:
                    System.out.println("Informe o nome do item:");
                    String nome = scanner.nextLine();
                    System.out.println("Informe o código do item:");
                    int codigo = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha após a leitura do número
                    fila.enfileirar(nome, codigo);
                    System.out.println("Item adicionado à fila.");
                    break;
                case 3:
                    fila.desenfileirar();
                    break;
                case 4:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
