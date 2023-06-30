package testando;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {

        // definindo a classe Scanner
        Scanner input = new Scanner(System.in);

        // definindo o array com 6 posições do tipo inteiro
        int[] myArray = new int[6];

        System.out.println("Digite os valores da matriz:");

        for (int i = 1; i < myArray.length; i++) {
            // mensagem para digitar o valor
            System.out.print(i + " " + "valor: ");

            // populando o array com o Scanner
            myArray[i] = input.nextInt();
        }

        for (int i = 1; i < myArray.length; i++) {

            // printando o array populado
            System.out.print(myArray[i] + " ");

        }

        //System.out.println();

        //System.out.printf("Nome:\t%s\n", a.getNome());
        //System.out.printf("%.2f", a.getNum());
    }

}
