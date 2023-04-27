package Lista1;

import java.util.Scanner;

public class Ex9 {

    /* 9) O IMC – Índice de Massa Corporal é um critério da Organização
    Mundial de Saúde para dar uma indicação sobre a condição de
    peso de uma pessoa adulta. A fórmula é IMC = peso / ( altura *
    altura). Elabore um programa que leia o peso e a altura de um
    adulto e mostre sua condição de acordo com a tabela abaixo.

    IMC em adultos Condição:
    ● Abaixo de 18,5 Abaixo do peso
    ● Entre 18,5 e 25 Peso normal
    ● Entre 25 e 30 Acima do peso
    ● Acima de 30 obeso
    */

    public static void main(String[] args) {

        float peso;
        float altura;
        float result;

        Scanner input = new Scanner(System.in);

        System.out.println("Calculo IMC:");

        System.out.println("Informe seu peso: ");
        peso = input.nextFloat();

        System.out.println("Informe sua altura: ");
        altura = input.nextFloat();

        result = peso / (altura * altura);

        if (result <= 18.5) {
            System.out.println("Abaixo do peso! " + result);
        } else if (result > 18.5 && result < 24.9) {
            System.out.println("Peso normal! " + result);

        } else if (result > 25.0 && result < 30.0) {
            System.out.println("Acima do peso! " + result);

        } else {
            System.out.println("Obeso! " + result);

        }

    }

}
