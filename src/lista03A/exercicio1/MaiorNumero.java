package lista03A.exercicio1;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número:");
        double num1 = input.nextDouble();
        System.out.print("Informe o outro número:");
        double num2 = input.nextDouble();
        input.close();

        if (num1 > num2){
            System.out.println("O maior número é:"  +num1);
        } else  {
            System.out.println("O maior número é:" +num2);

        }
    }
}
