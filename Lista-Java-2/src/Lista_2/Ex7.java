package Lista_2;

import java.util.Scanner;

public class Ex7 {
    // 7. Implemente um programa que leia um valor para uma variável N de 1 a 10 e calcule a
    //tabuada de N. Mostre a tabuada na forma: 0 ∗ N = 0, 1 ∗ N = 1N, 2 ∗ N = 2N, · · · , 10 ∗ N =
    //10N.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe um número de 1 a 10: ");
        int num = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            if (num > 10) {
                System.out.print("Voçê informou um número maior do que 10!");
                break;
            }
            System.out.println(num + " x " + i + " = " + num * i);

        }
    }
}
