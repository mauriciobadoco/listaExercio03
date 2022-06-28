package lista03A.exercicio4;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Informe o salário do empregado:");
            Double salario = input.nextDouble();
            input.close();


        double salarioAtual = 0;
        int percentual = 0;
        double aumento = 0;

            if (salario <= 280){
                salarioAtual = salario * 1.2;
                percentual = 20;
                aumento = salario * 0.2;
            } else if  ((salario > 280) && (salario <= 700)){
                salarioAtual = salario * 1.15;
                percentual = 15;
                aumento = salario * 0.15;
            } else if ((salario > 700) && (salario <= 1500)){
                salarioAtual = salario * 1.1;
                percentual = 10;
                aumento = salario * 0.1;
            } else {
                salarioAtual = salario * 1.05;
                percentual = 5;
                aumento = salario * 0.05;
            }

            System.out.println("O salário anterior é " + salario);
            System.out.println("O percentual de aumento é de: " + percentual);
            System.out.println("O valor do aumento é de " + aumento);
            System.out.println("O novo salário é de: " + salarioAtual);

    }
}
