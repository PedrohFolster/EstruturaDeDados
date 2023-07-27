package estrutura_de_dados;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("Estrutura de dados");

        int[] lista = new int[2000];

        lista = add(lista, 16);
        lista = add(lista, 1000);

        ArrayList lista2 = new ArrayList();
        lista2.add(15);
        lista2.add(1000);

    }

    private static int[] add(int[] lista, int novoValor) {
        int[] novaLista = new int[lista.length];

        for (int i = 0; i < lista.length; i++) {
            novaLista[i] = lista[i];
        }
        novaLista[lista.length] = novoValor;
        return novaLista;
    }
}
