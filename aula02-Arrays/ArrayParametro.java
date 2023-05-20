package Array02;

import java.util.Random;

public class ArrayParametro {

	public int[] modificar(int array[], int indice) {
		array[indice] = 0;
		return array;
	}

	public static void main(String[] args) {

		ArrayParametro objeto = new ArrayParametro();
		int vetor[] = { 1, 2, 3, 4, 5, 6 };
		System.out.println("Array inicial");

		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%d", vetor[i]);
		}

		vetor = objeto.modificar(vetor, 2);

		System.out.println("\nArray Alteracao");

		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%d ", vetor[i]);
		}

	}
}
