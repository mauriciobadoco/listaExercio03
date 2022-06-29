package lista03B.exercicio8;

import java.util.Scanner;

public class SomaNum {
    public static void main(String[] args) {
       int num = 0;
       int i;

       for (i=1; i <=100; i++) {
           if (i % 2 == 1) {
               num = i + num;
           }
       }
        System.out.println("A soma dos 50 primeiros número é: " + num);
    }
}