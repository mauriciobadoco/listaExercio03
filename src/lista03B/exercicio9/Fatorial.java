package lista03B.exercicio9;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número para calcular o fatorial");
        int num = input.nextInt();
        input.close();
        int i = 1;
        int fatorial = 1;

        while (i<= num){
            fatorial = fatorial * i;
            i ++;
        }
        System.out.println(" O fatorial do número é:" +fatorial);
    }
}
