package provabimestre;

import java.util.Scanner;

public class IntArray {

	public void arrayTeste() {
		final int Array_Tamanho = 10;

		int array[] = new int[Array_Tamanho];

		for (int contador = 0; contador < array.length; contador++) {
			array[contador] = 2 + 2 * contador;

			System.out.printf("%s%s\n", "Indice ", " Valor");

		}

		for (int contador = 0; contador < array.length; contador++) {
			System.out.printf("%d%10d\n", contador, array[contador]);
		}
	}

	public void mais() {
		double array[] = { 30.0, 10.0, 90.2, 11.3, 23.1 };
		double total = 0;

		for (int contador = 0; contador < array.length; contador++) {
			total += array[contador];

		}

		System.out.println("Teste " + total);
	}

	public static void main(String[] args) {

		int array[] = { 10, 20, 30, 40, 50, 60 };

		System.out.printf("%s%s\n", "indice ", " Valor");

		for (int contador = 0; contador < array.length; contador++) {
			System.out.printf("%d%10d\n", contador, array[contador]);
		}

	}
}
