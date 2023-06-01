package ListaTres;

import java.util.Scanner;

public class Ex02 {
    /*
     * 2- Crie um programa que lê 6 valores inteiros e, em seguida, mostre na tela
     * os valores lidos.
     */

    public int [] atribuiValor() {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Informe o " + i + " valor: ");
            numbers[i] = input.nextInt();
        }
        return numbers;
    }

    public void imprimir(int[] vet) {
        System.out.println("Imprimindo array");
        for(int i = 0; i < vet.length; i++) {
            System.out.printf("%d ",vet[i]);
        }
    }

}
