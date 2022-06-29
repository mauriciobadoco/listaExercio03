package lista03B.exercicio2;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite quantos números você quer digitar:");
        int tamanho = input.nextInt();
        int num[] = new int[tamanho];

        int i;
        for (i = 0; i < tamanho; i++) {
            System.out.println("Informe os números:");
            num[i] = input.nextInt();
        }

        int soma = 0;
        for (i = 0; i < tamanho; i++) {
            soma = soma + num[i];
        }
        System.out.println("A média dos números é:" + soma / tamanho);
    }
}
