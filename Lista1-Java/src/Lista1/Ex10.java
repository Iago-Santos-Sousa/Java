package Lista1;

import java.util.Scanner;

public class Ex10 {
    /* 10) Elabore um algoritmo que calcule o que deve ser pago por um
    produto, considerando o preço normal de etiqueta e a escolha da
    condição de pagamento. Utilize os códigos da tabela a seguir para
    ler qual a condição de pagamento escolhida e efetuar o cálculo
    adequado.
    Código Condição de pagamento
    1 À vista em dinheiro ou cheque, recebe 10% de desconto
    2 À vista no cartão de crédito, recebe 15% de desconto
    3 Em duas vezes, preço normal de etiqueta sem juros
    4 Em duas vezes, preço normal de etiqueta mais juros de 10%.
    */

    public static void main(String[] args) {

        String produto;
        float preco;

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o nome do produto: ");
        produto = input.nextLine();

        System.out.print("Informe o preco do produto: ");
        preco = input.nextFloat();

        System.out.println("Como voce quer pagar? Escolha uma das opcoes abaixo: ");

        System.out.println("À vista em dinheiro ou cheque, recebe 10% de desconto. Digite 1: ");

        System.out.println("À vista no cartão de crédito, recebe 15% de desconto. Digite 2: ");

        System.out.println("Em duas vezes, preço normal de etiqueta sem juros. Digite 3: ");

        System.out.println("Em duas vezes, preço normal de etiqueta mais juros de 10%. Digite 4: ");

        int escolha;

        switch (escolha = input.nextInt()) {
            case 1:
                float desconto = (preco * 10) / 100;
                float result = preco - desconto;
                System.out.printf("Valor a pagar: %.2f R$%n ", (result));
                break;

            case 2:
                float desconto2 = (preco * 15) / 100;
                float result2 = preco - desconto2;
                System.out.printf("Valor a pagar: %.2f R$%n ", (result2));
                break;

            case 3:
                float duasVezes = preco / 2;
                float result3 = duasVezes;
                System.out.printf("Valor a pagar: %.2f R$%n ", (result3));
               break;

            case 4:
                float duasVezesJuros = preco * 10/100 * 2;
                float result4 = duasVezesJuros;
                //System.out.println("Valor a pagar: " + result4 + " R$");
                System.out.printf("Valor a pagar: %.2f R$%n ", (result4));
                break;
            default:
                System.out.println("Opcao invalida!");
            break;
        }

    }

}
