package Lista_2;

import java.util.Scanner;

public class Ex3 {
    // 3. Implemente um programa que leia um número não determinado de valores e calcule e
    //escreva a média aritmética dos valores lidos, a quantidade de valores positivos, a
    //quantidade de valores negativos e o percentual de valores negativos e positivos.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

       int positivos = 0;
       double soma = 0;
       int negativos = 0;
       double media = 0;
       double porNe = 0;
       double porPo = 0;
       int i = 1;

        System.out.print("Quantas vezes voçê quer calcular os valores? ");

        int num = input.nextInt();

        while (i <= num) {

            System.out.print("Digite valores: ");
            int valor = input2.nextInt();

            if (valor >= 0) {
                positivos = positivos + 1;

            } else {
                negativos = negativos + 1;
            }

            soma+= valor;

            porPo = positivos * 100 / (i);
            porNe = negativos * 100 / (i);

            i++;
        }

        media = soma / (positivos + negativos);

        System.out.println("Soma dos valores é: " + soma);
        System.out.println("A média aritimética dos valores é: " + media);
        System.out.printf("Positivos: %d\nnegativos: %d\n", positivos, negativos);
        System.out.println("Percentual de positivos è: " + porPo);
        System.out.println("Percentual de negativos è: " + porNe);

    }
}
