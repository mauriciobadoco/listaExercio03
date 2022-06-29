package lista03B.exercicio7;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num = input.nextInt();
        input.close();
        int primo = 0;
        int i;
        int j;
        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                primo++;
            }
        }

        if (primo == 2) {
            System.out.println("O número é primo");
        } else {
            System.out.println(" O número não é primo");
            }

    }
}

