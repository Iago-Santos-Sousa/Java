package Array02;
import java.util.Scanner;

public class Ex2 {
	/*
	 * 2- Crie um programa que lê 6 valores inteiros e, em seguida, mostre na tela
	 * os valores lidos.
	 */
	
	public int [] atribuiValor() {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[6];
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Informe o " + i + " valor: ");
			numbers[i] = input.nextInt();
		}
		
		return numbers;
	}
	
	public void imprimir(int vet[]) {
		System.out.println("Imprimindo array");
		for(int i = 0; i < vet.length; i++) {
			System.out.printf("%d ",vet[i]);
		}
	}
	
	public static void main(String[] args) {
		Ex2 obj = new Ex2();
		obj.imprimir(obj.atribuiValor());
	}
	
}
