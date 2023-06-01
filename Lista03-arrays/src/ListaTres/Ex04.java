package ListaTres;

import java.util.Scanner;

public class Ex04 {
    /* 4- Leia um vetor de 10 posições. Contar e escrever quantos valores pares ele
possui.
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

    public void valorPar(int[] vet) {
        int par = 0;

        for (int i = 1; i < vet.length; i++) {
            if (vet[i] % 2 == 0) {
                par = par + 1;
            }
        }

        this.imprimir(vet);
        System.out.println();
        System.out.printf("Possui: %d valor(s) pares", par);
    }

    public void imprimir(int[] vet) {
        System.out.println("Imprimindo array:");
        for (int i = 1; i < vet.length; i++) {
            System.out.printf("%d ", vet[i]);
        }
    }
}
