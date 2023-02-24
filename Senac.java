package revisao;

import java.util.Scanner;
public class Senac {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a, b, soma;
		System.out.print("Primeiro número: ");
		a = input.nextDouble();
		System.out.print("Segundo número: ");
		b = input.nextDouble();
		soma = a + b;
		System.out.println("Resultado da soma é: " + soma);
		
	}
}
