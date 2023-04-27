package Lista1;

import java.util.Scanner;

public class Ex11 {
    /* 11) Escreva um algoritmo que leia o número de identificação, as 3
    notas obtidas por um aluno nas 3 verificações e a média dos
    exercícios que fazem parte da avaliação, e calcule a média de
    aproveitamento, usando a fórmula:
    MA := (nota1 + nota2 * 2 + nota 3 * 3 + ME)/7
    A atribuição dos conceitos obedece a tabela abaixo. O algoritmo
    deve escrever o número do aluno, suas notas, a média dos
    exercícios, a média de aproveitamento, o conceito correspondente
    e a mensagem 'Aprovado' se o conceito for A, B ou C, e
    'Reprovado' se o conceito for D ou E.
    
    Média de aproveitamento Conceito:
    ● >= 90 A
    ● >= 75 e < 90 B
    ● >= 60 e < 75 C
    ● >= 40 e < 60 D
    ● < 40 E */

    public static void main(String[] args) {

        int numVerificacao;
        int nota1;
        int nota2;
        int nota3;
        float mediaExercicios;
        float mA;

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o numero de identificacao: ");
        numVerificacao = input.nextInt();

        System.out.print("Informe a sua primeira nota: ");
        nota1 = input.nextInt();

        System.out.print("Informe a sua segunda nota: ");
        nota2 = input.nextInt();

        System.out.print("Informe a sua terceira nota: ");
        nota3 = input.nextInt();

        mediaExercicios = (nota1 + nota2 + nota3) / 3;
        mA = nota1 + nota2 * 2 + nota3 * 3 + mediaExercicios / 7;


        if (mA >= 90) {
            System.out.println("");
            System.out.println("Numero do aluno: " + numVerificacao);
            System.out.println("Nota um: " + nota1 + ", nota dois: " + nota2 + " e nota tres: " + nota3);
            System.out.println("Media dos exercicios: " + mediaExercicios);
            System.out.println("Media de aproveitamento: " + mA);
            System.out.println("Conceito correspondente: A.");
            System.out.println("Aprovado.");
        } else if (mA >= 75 && mA < 90) {
            System.out.println("");
            System.out.println("Numero do aluno: " + numVerificacao);
            System.out.println("Nota um: " + nota1 + ", nota dois: " + nota2 + " e nota tres: " + nota3);
            System.out.println("Media dos exercicios: " + mediaExercicios);
            System.out.println("Media de aproveitamento: " + mA);
            System.out.println("Conceito correspondente: B.");
            System.out.println("Aprovado.");

        } else if (mA >= 60 && mA < 75) {
            System.out.println("");
            System.out.println("Numero do aluno: " + numVerificacao);
            System.out.println("Nota um: " + nota1 + ", nota dois: " + nota2 + " e nota tres: " + nota3);
            System.out.println("Media dos exercicios: " + mediaExercicios);
            System.out.println("Media de aproveitamento: " + mA);
            System.out.println("Conceito correspondente: C.");
            System.out.println("Aprovado.");

        } else if (mA >= 40 && mA < 60) {
            System.out.println("");
            System.out.println("Numero do aluno: " + numVerificacao);
            System.out.println("Nota um: " + nota1 + ", nota dois: " + nota2 + " e nota tres: " + nota3);
            System.out.println("Media dos exercicios: " + mediaExercicios);
            System.out.println("Media de aproveitamento: " + mA);
            System.out.println("Conceito correspondente: D.");
            System.out.println("Reprovado.");

        } else {
            System.out.println("");
            System.out.println("Numero do aluno: " + numVerificacao);
            System.out.println("Nota um: " + nota1 + ", nota dois: " + nota2 + " e nota tres: " + nota3);
            System.out.println("Media dos exercicios: " + mediaExercicios);
            System.out.println("Media de aproveitamento: " + mA);
            System.out.println("Conceito correspondente: E.");
            System.out.println("Reprovado.");

        }


    }

}
