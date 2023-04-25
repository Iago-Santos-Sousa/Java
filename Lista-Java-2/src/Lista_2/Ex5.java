package Lista_2;
import java.util.Scanner;

public class Ex5 {
    // 5. Implemente um programa que leia uma quantidade não determinada de números
    //positivos. Calcule a quantidade de números pares e ímpares, a média de valores pares e a
    //média geral dos números lidos. O número que encerrará a leitura será zero.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        int parQuant = 0;
        int imparQuant = 0;
        int mediaPar = 0;
        int somaPar = 0;
        double somaGeral = 0;
        double mediaGeral = 0;

        while (i != 0) {
            System.out.print("Insira um número: ");
            int numero = input.nextInt();

            if (numero == 0) {
                System.out.println("Voçê digitou 0, fim do programa!");
                break;
            }

            if (numero % 2 == 0) {
                parQuant+= 1;
                somaPar += numero;
                mediaPar = somaPar / parQuant;
            }

            if (numero % 2 != 0) {
                imparQuant+= 1;
            }

            somaGeral+= numero;

            mediaGeral = somaGeral / i;

            i++;
        }

        System.out.println("A quantidade de números pares é: " + parQuant);
        //System.out.println("A soma dos pares é: " + somaPar);
        System.out.println("A quantidade de números impares é: " + imparQuant);
        System.out.println("A média dos números pares é: " + mediaPar);
        System.out.println("A média geral dos números é: " + mediaGeral);
    }
}
