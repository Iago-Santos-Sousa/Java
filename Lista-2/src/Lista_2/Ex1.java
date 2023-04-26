package Lista_2;

public class Ex1 {
    // 1. Desenvolver um algoritmo que efetue a soma de todos os números ímpares que são
    //múltiplos de três e que se encontram no conjunto dos números de 1 até 500.

    public static void main(String[] args) {
        int i = 1;
        int soma = 0;
        while (i <= 500) {

            if (i % 2 != 0 && i % 3 == 0) {
                soma += i;
            }

            i++;
        }

        System.out.println("A soma é: " + soma);
    }
}
