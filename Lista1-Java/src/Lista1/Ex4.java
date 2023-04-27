package Lista1;

import java.util.Scanner;

public class Ex4 {

    /* 4) Faça um programa que leia dois valores inteiros A e B se os
    valores forem iguais deverá se somar os dois, caso contrário
    multiplique A por B. Ao final de qualquer um dos cálculos deve-se
    atribuir o resultado para uma variável C e mostrar seu conteúdo na
    tela.
    */

    public static void main(String[] args) {

        int numA;
        int numB;
        int numC;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número para A:");
        numA = input.nextInt();

        System.out.println("Informe um número para B:");
        numB = input.nextInt();

        if (numA == numB) {
            int soma = numA + numB;
            numC = soma;
            System.out.println("Os valores sao iguais, esta e a soma: " + numC);
        } else {
            int multiply = numA * numB;
            numC = multiply;
            System.out.println("Os valores são diferentes.");
            System.out.println("Aqui esta a multiplicacao: " + numC);
        }
    }
}

