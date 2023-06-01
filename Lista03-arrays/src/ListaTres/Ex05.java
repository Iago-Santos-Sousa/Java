package ListaTres;

import java.util.Scanner;

public class Ex05 {
    /* 5- Escreva um programa que leia 10 números inteiros e os armazene em um vetor.
Imprima o vetor, o maior elemento e a posição que ele se encontra.
 */

    public int[] atribuiValor() {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[4]; // vetor de 4 posições como exemplo.

        for (int i = 1; i < numbers.length; i++) {
            System.out.print("Informe o " + i + " valor: ");
            numbers[i] = input.nextInt();
        }
        return numbers;
    }

    public void maiorValor(int[] vet) {
        int maior = vet[0];
        int posicao = 0;
        int[] resultado = new int[2];

        for (int i = 1; i < vet.length; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
                //posicao = vet.length;
                resultado[0] = maior;
                posicao = i;
                resultado[1] = posicao;
            }
        }

        this.imprimir(vet);
        System.out.println();
        System.out.println("O maior valor no array é: " + resultado[0] + " na posicao " + resultado[1]);
    }

    public void imprimir(int[] vet) {
        System.out.println("Imprimindo array:");
        for (int i = 1; i < vet.length; i++) {
            System.out.printf("%d ", vet[i]);
        }

    }
}
