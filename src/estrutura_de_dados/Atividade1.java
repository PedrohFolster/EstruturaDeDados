package estrutura_de_dados;

import java.io.File;
import java.io.FileInputStream;

public class Atividade1 {


    public static void main(String[] args) {
        String textoDoArquivo = lerArquivo();
        System.out.println(textoDoArquivo);
        String[] linhas = textoDoArquivo.split("\n");


        for (int i = 0; i < linhas.length; i++) {
            String linha = linhas[i];
            String[] colunas = linha.split(";");
            int cols = colunas.length;
        }
        /*
        int x = 10;
        String s = "Rafael";
        try {
            x = x + Integer.valueOf(s);
        }catch(Exception e) {
            System.err.println("Ocorreu um erro ao tenta converter: "+ s + " para int.");
        }
        System.out.println(x);
        */
    }

    public static String lerArquivo() {
        String conteudo = new String("");
        File f = new File("C:\\Users\\pedro.santos13\\Documents\\cars.csv");
        try {
            FileInputStream fis = new FileInputStream(f);
            byte[] conteudoArquivo = new byte[fis.available()];
            fis.read(conteudoArquivo);
            conteudo = new String(conteudoArquivo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conteudo;
    }
}