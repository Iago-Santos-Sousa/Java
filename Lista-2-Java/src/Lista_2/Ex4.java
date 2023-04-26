package Lista_2;

import java.util.Scanner;

public class Ex4 {
    // 4. Implemente um programa que leia uma quantidade desconhecida de números e conte
    //quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada
    //de dados deve terminar quando for lido um número negativo.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 1;
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;

        while (i != 0) {
            System.out.print("Insira um número: ");
            int numero = input.nextInt();

            if (numero < 0) {
                System.out.println("Voçê digitou um número negativo, fim do programa!");
                break;
            }

            if (numero >= 0 && numero <= 25) {
                c1 = c1 + 1;
            } else if (numero >= 26 && numero <= 50) {
                c2 = c2 + 1;
            } else if (numero >= 51 && numero <= 75) {
                c3 = c3 + 1;
            } else if (numero >= 76 && numero <= 100) {
                c4 = c4 + 1;
            }

            i++;
        }

        System.out.println("A quantidade de números entre 0 e 25 é: " + c1);
        System.out.println("A quantidade de números entre 26 e 50 é: " + c2);
        System.out.println("A quantidade de números entre 51 e 75 é: " + c3);
        System.out.println("A quantidade de números entre 76 e 100 é: " + c4);
    }
}

