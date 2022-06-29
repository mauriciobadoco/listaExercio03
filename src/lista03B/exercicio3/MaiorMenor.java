package lista03B.exercicio3;

import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tamanho = 10;
        int num[] = new int[tamanho];

        int i;
        for (i = 0; i < tamanho; i++) {
            System.out.println("Informe 10  números:");
            num[i] = input.nextInt();
        }

        int menor = num[0];
        int maior = num[0];
        for(i=0; i<tamanho; i++) {

            if (num[i] < menor) {
                menor = num[i];
            }
            if (num[i] > maior) {
                maior = num[i];
            }
        }

        System.out.println(" O maior número é: " +maior);
        System.out.println("O menor número é: " +menor);


    }
}
