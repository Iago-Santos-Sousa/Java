package Lista1;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        /* 8) Escreva um programa que leia três valores inteiros e diferentes e
        mostre-os em ordem decrescente.
        */
       
        // O objetivo é fazer com o que o valor armazenado em valorUm seja o maior, valorDois o valor do meio e
        // valorTres o menor. Assim, exibirá: valorUm - valorDois - valorTres em ordem decrescente.

        /*
            vamos fazer com que valorUm seja o maior.
            comparamos ele com valorDois. Se o valor de valorDois for maior:
            if(num2 > num1)

            Fazemos com que valorUm e valorDois invertam seus valores. Para isso, usamos a variável auxiliar aux.

            Agora, vamos comparar valorUm com valorTres.
            Se valorTres for maior, invertemos o valor.
            Pronto, agora valorUm tem o maior valor de todos, pois comparamos com os outros dois números.

            Por fim, comparamos o valor entre valorDois e valorTres.
            Se valorTres for maior, invertemos o valor no IF, senão, já temos os números em ordem crescente.
         */

        int valorUm;
        int valorDois;
        int valorTres;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro valor:");
        valorUm = input.nextInt();

        System.out.println("Informe o segundo valor:");
        valorDois = input.nextInt();

        System.out.println("Informe o terceiro valor:");
        valorTres = input.nextInt();

        int aux = valorUm;

       if (valorUm == valorDois) {
           System.out.println("Insira valores diferentes para um melhor resultado!");
       } else if (valorDois == valorTres) {
            System.out.println("Insira valores diferentes para um melhor resultado!");
        } else if (valorTres == valorUm) {
            System.out.println("Insira valores diferentes para um melhor resultado!");
        } else if (valorTres == valorDois) {
            System.out.println("Insira valores diferentes para um melhor resultado!");
        } if (valorDois > valorUm) {
           aux = valorDois;
           valorDois = valorUm;
           valorUm = aux;
        } if (valorTres > valorUm) {
           aux = valorTres;
           valorTres = valorUm;
           valorUm = aux;
        } if (valorTres > valorDois) {
           aux = valorTres;
           valorTres = valorDois;
           valorDois = aux;
        }

        System.out.println(valorUm + " " + valorDois + " " + " " + valorTres);

    }

}
