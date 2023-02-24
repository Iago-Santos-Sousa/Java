package revisao;

import java.util.Scanner;

public class Senac2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Primeiro número: ");
		num1 = input.nextInt();
		System.out.print("Segundo número: ");
		num2 = input.nextInt();
		
		if (num1 == num2) {
			System.out.printf("%d==%d\n", num1, num2);
		}
		
		if (num1 != num2) {
			System.out.printf("%d!=%d\n", num1, num2);
		}
		
		if (num1 < num2) {
			System.out.printf("%d<%d\n", num1, num2);
		}
		
		if (num1 > num2 ) {
			System.out.printf("%d>%d\n", num1, num2);
		}
		
		if (num1 <= num2) {
			System.out.printf("%d<=%d\n", num1, num2);
		}
		
		
	}
}
