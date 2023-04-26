package Lista_2;

import java.util.Scanner;

public class Ex8 {
    // 8. Implemente um programa que leia um valor inicial A e imprima a sequência de valores do
    //cálculo de A! e o seu resultado. Ex: 5! = 5 ∗ 4 ∗ 3 ∗ 2 ∗ 1 =120
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long fat = 1;
        String mult = "";

        System.out.print("Informe um número: ");
        int num = input.nextInt();

        for (int i = num; i > 1; i--) {
            fat*= i;
            mult+= i + " x ";
        }

        System.out.print("O fatorial do número " + num + " è: ");
        System.out.print(mult + "1 = " + fat);
    }
}