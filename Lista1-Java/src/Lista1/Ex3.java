package Lista1;

import java.util.Scanner;

public class Ex3 {
    /* 3) Faça um programa para receber um número qualquer e informar
    na tela se é par ou ímpar.
    */

    public static void main(String[] args) {

        int num;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número:");
        num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número: " + num + " e par!");
        } else {
            System.out.println("O número: " + num + " nao e par!");
        }
    }
}

