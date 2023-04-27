package Lista1;

import java.util.Scanner;

public class Ex2 {
    // 2) Faça um programa que leia o nome, o sexo e o estado civil de
    //uma pessoa. Caso sexo seja “F” e estado civil seja “CASADA”,
    //solicitar o tempo de casada (anos).


    public static void main(String[] args) {

        String nome;
        String sexo;
        String estadoCivil;
        String sexoDefinido = "F";
        String estadoCivilDefinido = "CASADA";
        int tempoCasada;

        Scanner input = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        nome = input.nextLine();

        System.out.println("Qual o seu sexo?");
        sexo = input.nextLine();

        System.out.println("Qual o seu estado civil?");
        estadoCivil = input.nextLine();

        if (sexo.equals(sexoDefinido) && estadoCivil.equals(estadoCivilDefinido)) {
            System.out.println("Informe o seu tempo de casado(a) em anos:");
            tempoCasada = input.nextInt();

            System.out.println("Seu nome é: " + nome);
            System.out.println("Seu sexo é: " + sexo);
            System.out.println("Seu estao civil é: " + estadoCivil);
            System.out.println("Seu tempo de casado(a) e: " + tempoCasada);

        } else {
            System.out.println("Seu nome é: " + nome);
            System.out.println("Seu sexo é: " + sexo);
            System.out.println("Seu estao civil é: " + estadoCivil);
        }

    }
}

