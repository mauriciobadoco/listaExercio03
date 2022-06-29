package lista03B.exercicio4;

import java.util.Scanner;

public class SomaPositivos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite quantos números você quer somar:");
        int tamanho = input.nextInt();
        int num[] = new int[tamanho];

        int i;
        for (i = 0; i < tamanho; i++) {
            System.out.println("Informe os números:");
            num[i] = input.nextInt();
        }
        int soma = 0;
        for (i=0; i<tamanho; i++){
            if (num[i]> 0){
                soma = soma + num[i];
            }
        }
        System.out.println("A soma dos números posititos declarados é:" +soma);
    }
}
