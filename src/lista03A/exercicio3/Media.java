package lista03A.exercicio3;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a primeira nota");
        Double nota1 = input.nextDouble();
        System.out.println("Informe a segunda nota");
        Double nota2 = input.nextDouble();
        input.close();

        Double media = (nota1 + nota2) /2;
        System.out.println(+media);

        if ((media >=7) && (media <= 9.5)){
            System.out.println("O aluno está Aprovado");
        }else if  (media < 7){
            System.out.println("O aluno está Reprovado");
        }else if ( media ==10){
            System.out.println("O aluno está aprovado com Distinção");
        }
    }
}
