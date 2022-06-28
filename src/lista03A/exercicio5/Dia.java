package lista03A.exercicio5;

import java.util.Scanner;

public class Dia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número para saber o dia da semana");
        int dia = input.nextInt();
        input.close();

        String diaSemana = null;

        if (dia == 1){
            diaSemana = "DOMINGO";
            System.out.println("O dia da semana referente ao número digitado é DOMINGO");
        }else if (dia == 2) {
            diaSemana = "SEGUNDA";
            System.out.println("O dia da semana referente ao número digitado é SEGUNDA");
        }else if (dia == 3) {
            diaSemana = "TERÇA";
            System.out.println("O dia da semana referente ao número digitado é TERÇA");
        }else if (dia == 4) {
            diaSemana = "QUARTA";
            System.out.println("O dia da semana referente ao número digitado é QUARTA");
        }else if (dia == 5) {
            diaSemana = "QUINTA";
            System.out.println("O dia da semana referente ao número digitado é QUINTA");
        }else if (dia == 6) {
            diaSemana = "SEXTA";
            System.out.println("O dia da semana referente ao número digitado é SEXTA");
        }else if (dia == 7) {
            System.out.println("O dia da semana referente ao número digitado é SÁBADO");
        }
        else {
            System.out.println( "VALOR INVÁLIDO");
        }


    }
}
