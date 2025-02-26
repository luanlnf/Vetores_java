package VetoresSoma;

public class SomaVetor {
    public static void main(String[] args){
        int[] numeros = {5, 10, 15, 20, 25};
        int soma = 0;

        for(int num : numeros){
            soma += num;
        }

        System.out.println("Asoma dos elemntos do vetor é: " + soma);
    }
}
