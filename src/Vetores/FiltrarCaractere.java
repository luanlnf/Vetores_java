package Vetores;

import java.util.ArrayList;

public class FiltrarCaractere {
    public static void main(String[] args) {
        // Criando uma ArrayList de Strings
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Apple");
        lista.add("Banana");
        lista.add("Avocado");
        lista.add("Berry");
        lista.add("Apricot");

        // Chamando a função para filtrar palavras que começam com 'A'
        ArrayList<String> resultado = filtrarPorCaractere(lista, 'A');

        // Exibindo o resultado
        System.out.println("Palavras que começam com 'A': " + resultado);
    }

    public static ArrayList<String> filtrarPorCaractere(ArrayList<String> lista, char caractere) {
        // Criando uma nova lista para armazenar os elementos filtrados
        ArrayList<String> filtrados = new ArrayList<>();

        // Percorrendo a lista original
        for (String palavra : lista) {
            // Verificando se a palavra começa com o caractere fornecido
            if (!palavra.isEmpty() && palavra.charAt(0) == caractere) {
                filtrados.add(palavra);
            }
        }

        return filtrados; // Retorna a nova lista com as palavras filtradas
    }
}
