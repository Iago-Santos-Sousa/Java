package Lista1;

import java.util.Scanner;

public class Ex7 {
    /* 7) Faça um programa que leia uma variável e some 5 caso seja par
    ou some 8 caso seja ímpar, imprimir o resultado desta operação.
    */
    public static void main(String[] args) {

        int valor;

        Scanner input = new Scanner(System.in);

        System.out.print("Informe um número:");
        valor = input.nextInt();

        if (valor % 2 == 0) {
            valor+= 5;
            System.out.println("Seu número é par, incrementado com mais 5: " + valor);
        } else {
            valor+= 8;
            System.out.println("Seu número é ímpar, incrementado com mais 8: " + valor);

        }

    }

}
