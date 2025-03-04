package Vetores;

public class mediaCalcula {
    // Função que calcula a média dos valores de um vetor
    public static double calculaMedia(double[] numeros) {
        double soma = 0;

        // Somando todos os elementos do vetor
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        // Calculando e retornando a média
        return soma / numeros.length;
    }

    public static void main(String[] args) {
        // Exemplo de uso da função calculaMedia
        double[] numeros = {10.5, 20.3, 30.7, 40.1, 50.8};  // Vetor de números reais

        // Calculando a média e exibindo o resultado
        double media = calculaMedia(numeros);
        System.out.println("A média dos valores é: " + media);
    }
}
