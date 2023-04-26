package revisao;

import java.util.Scanner;
public class Senac {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.print("informe o numero: ");
		num = input.nextInt();
	
		if (num % 2 == 0) {
			System.out.println("O numero " + num + " e par");
		} else {
			System.out.println("O numero " + num + " e impar");
		}
		
		
	}
}
