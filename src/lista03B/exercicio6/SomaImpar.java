package lista03B.exercicio6;

import java.util.Scanner;

public class SomaImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número que vai iniciar:");
        int inicio = input.nextInt();
        System.out.println("Digite o número que vai terminar:");
        int termino = input.nextInt();

        if ( termino < inicio){
            System.out.println("Intervalo de valores inválido");
            System.exit(inicio);
        }
        int soma = 0;
        int i ;
        for (i = inicio; i < termino; i++) {
            if(i%2 == 1){
                soma = soma + i;
            }
        }
            System.out.println("A soma dos números impares do intervalo é:" +soma);

    }
}

