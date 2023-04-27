package Lista1;

import java.util.Scanner;

public class Ex6 {
    /* 6) Escreva um programa que lê dois valores booleanos (lógicos) e
    então determina se ambos são VERDADEIROS ou FALSOS.
    */

    public static void main(String[] args) {

        boolean valorUm;
        boolean valorDois;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe um valor booleano:");
        valorUm = input.nextBoolean();

        System.out.println("Informe o segundo valor booleano:");
        valorDois = input.nextBoolean();

        if (valorUm || valorDois == true || valorUm || valorDois == false) {
            System.out.println("O primeiro valor booleano é: " + valorUm);
            System.out.println("O segundo valor booleano é: " + valorDois);
        }

    }

}
