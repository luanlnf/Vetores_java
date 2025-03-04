package Vetores;

import java.util.Random;

public class Matriz3 {
    public static void main(String[] args) {
        // Criando uma matriz 3x3
        int[][] matriz = new int[3][3];

        // Criando um objeto Random para gerar números aleatórios
        Random random = new Random();

        // Preenchendo a matriz com números aleatórios entre 1 e 100
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = random.nextInt(100) + 1;  // Gera números de 1 a 100
            }
        }

        // Exibindo a matriz gerada
        System.out.println("Matriz gerada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Encontrando o maior valor da matriz
        int maiorValor = matriz[0][0]; // Começa com o primeiro elemento da matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j]; // Atualiza o maior valor
                }
            }
        }

        // Exibindo o maior valor encontrado
        System.out.println("\nMaior valor da matriz: " + maiorValor);
    }

}
