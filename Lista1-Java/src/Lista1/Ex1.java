package Lista1;

import java.util.Scanner;

public class Ex1 {
    // 1) Faça um programa que leia os valores A, B, C e imprima na tela
    //se a soma de A + B é menor que C.

    public static void main(String[] args) {

        int a;
        int b;
        int c;

        Scanner input = new Scanner(System.in);

        System.out.println("Insira um valor para A:");
        a = input.nextInt();

        System.out.println("Insira um valor para B:");
        b = input.nextInt();

        System.out.println("Insira um valor para C:");
        c = input.nextInt();

        int soma = a + b;

        if (soma < c) {
            System.out.println("A soma de A e B é menor que C: " + soma);
        } else {
            System.out.println("A soma de A e B não é menor que C: " + soma);
        }

    }
}
