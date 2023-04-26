package Lista_2;

import java.util.Scanner;

public class Ex2 {
    // 2. Desenvolver um algoritmo que leia a altura de 15 pessoas. Este programa deverá
    //calcular e mostrar:
    //• A menor altura do grupo;
    //• A maior altura do grupo.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        double altura = 0;
        double maior = 0;
        double menor = 0;

        for (i = 0; i < 15; i++) {
            System.out.print("Informe a sua altura: ");

            altura = input.nextInt();

            if (i == 0) {
                maior = altura;
                menor = altura;
            }

            if (altura > maior) {
                maior = altura;
            }

            if (altura < menor) {
                menor = altura;
            }
        }

        System.out.println("a menor altura é: " + menor);
        System.out.println("a maior altura é: " + maior);

    }
}
