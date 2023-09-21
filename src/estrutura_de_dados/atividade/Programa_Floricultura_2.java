package estrutura_de_dados.atividade;

import java.util.Scanner;

public class Programa_Floricultura_2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Flor primeiro = null;
        Flor ultimo = null;
        String opcao = "";
        String escolherOpcoes = "S";

        while (escolherOpcoes.equalsIgnoreCase("S")) {
            System.out.println("Escolha uma das opções abaixo para realizar uma ação: \n" +
                    "1 - Adicionar Flor a fila \n" +
                    "2 - Visualizar Fila \n" +
                    "3 - Remover flor da fila");
            int escolha = scan.nextInt();

            scan.nextLine();

            switch (escolha) {
                case 1: {
                    do {
                        System.out.println("Adicionando nova flor à lista...");

                        Flor flor = new Flor();

                        System.out.print("Informe o tipo da Flor: ");
                        String tipo = scan.nextLine();
                        flor.setTipo(tipo);

                        System.out.print("Informe o código da Flor: ");
                        int codigo = scan.nextInt();
                        flor.setCodigo(codigo);

                        System.out.print("Informe o valor da Flor: ");
                        double valor = scan.nextDouble();
                        flor.setValor(valor);

                        if (primeiro == null) {
                            primeiro = flor;
                        } else if (ultimo == null) {
                            ultimo = flor;
                            primeiro.setProximo(ultimo);
                        } else {
                            ultimo.setProximo(flor);
                            ultimo = flor;
                        }

                        scan.nextLine();

                        System.out.println();
                        System.out.println();
                        System.out.println("Você deseja continuar e inserir uma nova flor à lista? \n" +
                                "S - Sim, desejo adicionar uma flor à lista \n" +
                                "N - Desejo encerrar a lista");
                        opcao = scan.nextLine();

                    } while (opcao.equalsIgnoreCase("S"));

                    System.out.println("Você encerrou a lista.");
                    break;
                }
                case 2: {
                    if (primeiro == null) {
                        System.out.println("A lista de flores está vazia!");
                    } else {
                        Flor florAtual = primeiro;

                        while (florAtual != null) {
                            System.out.println("Nome: " + florAtual.getTipo() +
                                    ", Código: " + florAtual.getCodigo() +
                                    ", Valor: " + florAtual.getValor());
                            florAtual = florAtual.getProximo();
                        }
                    }
                    break;
                }
                case 3: {
                    if (primeiro != null) {
                        primeiro = primeiro.getProximo();
                    } else {
                        System.out.println("A lista de flores está vazia!");
                    }
                    break;
                }
                default: {
                    System.out.println("Esta opção não existe!");
                }
            }

            System.out.println();
            System.out.println("Você deseja voltar o programa para o começo? \n" +
                    "S - Sim, desejo voltar para o começo \n" +
                    "N - Não, desejo finalizar por aqui");
            escolherOpcoes = scan.nextLine();
        }

        if (escolherOpcoes.equalsIgnoreCase("N")) {
            System.out.println("O programa está sendo finalizado...");
        }
    }
}
