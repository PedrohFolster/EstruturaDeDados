package estrutura_de_dados.atividade_pilha;

import estrutura_de_dados.exercicio.Produto;

import java.util.LinkedList;
import java.util.Scanner;

public class Programa_Estrutura {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String escolherOpcoes = "S";

        LinkedList veiculoSubaquatico = new LinkedList();

        Veiculo veiculo = new Veiculo(480, 6);

        while (escolherOpcoes.equalsIgnoreCase("S")) {
            System.out.println("Escolha uma das opções abaixo: \n" +
                    "1 - Adicionar novo Passageiro \n" +
                    "2 - Desembarcar passageiro \n" +
                    "3 - Exibir lista de passageiros");

            int escolha = scan.nextInt();

            scan.nextLine();

            switch (escolha) {
                case 1: {
                    System.out.println("Adicionando nova pessoa...");

                    System.out.println("Informe o nome do passageiro: ");
                    String nome = scan.nextLine();

                    System.out.println("Informe o peso do passageiro: ");
                    double peso = scan.nextDouble();

                    veiculo.adicionarPassageiro(nome, peso);
                    break;
                }
                case 2: {
                    veiculo.desembarcarPassageiros();
                    break;
                }
                case 3: {
                    System.out.println("Exibindo a lista de passageiros...");
                    veiculo.exibirListaDePassageiros();
                    break;
                }
                default: {
                    System.out.println("Opção inválida!");
                }
            }

            scan.nextLine();

            System.out.println();
            System.out.println("Você deseja voltar o programa para o começo? \n" +
                    "S - Sim, desejo voltar para o começo \n" +
                    "N - Não, desejo finalizar por aqui");
            escolherOpcoes = scan.nextLine();
        }
    }
}
