package ListaTres;

import java.util.Scanner;

public class Ex03 {
    /* 3- Ler um conjunto de números reais, armazenando-o em vetor e calcular o
quadrado dos componentes deste vetor, armazenando o resultado em outro vetor,
em seguida Imprimir ambos os vetores.
 */
    public int[] atribuiValor() {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Informe o " + i + " valor: ");
            numbers[i] = input.nextInt();
        }
        return numbers;
    }
    public void imprimirArray(int[] vetUm) {
        int[] vet2 = new int[vetUm.length];

        for (int i = 0; i < vetUm.length; i++) {
            vet2[i] = vetUm[i];
        }

        System.out.println("Imprimindo array:");
        for(int i = 0; i < vetUm.length; i++) {
            System.out.printf("%d ",vetUm[i]);
        }

        System.out.println();

        System.out.println("Imprimindo array multiplicado por 2:");
        for (int i = 0; i < vet2.length; i++) {
            vet2[i] = vet2[i] * 2;
            System.out.printf("%d ",vet2[i]);
        }
    }

}
