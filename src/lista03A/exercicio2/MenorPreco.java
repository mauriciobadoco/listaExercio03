package lista03A.exercicio2;

import java.util.Scanner;

public class MenorPreco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o preço do óleo de soja: ");
        double soja = input.nextDouble();
        System.out.println("Informe o preço do óleo de milho");
        double milho = input.nextDouble();
        System.out.println("Informe o preço do óleo de girassol");
        double girassol = input.nextDouble();
        input.close();

        if ((soja < milho) && (soja < girassol)){
            System.out.println(" O óleo que deve ser comprado é o de soja");
        } else if ((milho < soja) && (milho < girassol)){
            System.out.println("O óleo que deve ser comprado é o de milho");
        } else {
            System.out.println(" O óleo que deve ser comprado é o de girassol");

        }
    }
}
