package Lista_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex {

    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

    public String a = "maçâ";
    public String b = "Banana";
    public String c = "Limão";
    public double num = 45.98898769;

    public String getA() {
        return this.a;
    }

    public String getB() {
        return this.b;
    }

    public String getC() {
        return this.c;
    }

    public void mostrarTodos() {
        //System.out.println(this.getA() + " " + this.getB() + " " + this.getC());
        System.out.printf("Fruta um: %s - Fruta dois: %s", this.a, this.b);
        System.out.printf("\nNúmero formatado: %.2f\n", this.num);
    }

    public void mostrarArray() {
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + ", ");
        }

        System.out.println();

        for (String i : cars) {
            // foreach
            // O exemplo acima pode ser lido assim: para cada String elemento (chamado i - como no índice ) em cars , imprima o valor de i .
            System.out.println(i);
        }
    }

    public void exLoop() {
        // Exemplo de loop while com string de interromper
        Scanner input = new Scanner(System.in);
        int i = 0;
        String opcao = "";

        while (!opcao.equals("S")) {
            System.out.println(i);
            System.out.println("Digite S maisúsculo para encerrar: ");
            opcao = input.next();
            i++;
        }
    }
    public static void main(String[] args) {
        Ex obj = new Ex();
        obj.mostrarTodos();
        obj.mostrarArray();
        obj.exLoop();
    }
}
