package Lista1;

import java.util.Scanner;

public class Ex5 {
    /* 5) Encontrar o dobro de um número caso ele seja positivo e o seu
    triplo caso seja negativo, imprimindo o resultado.
    */
    public static void main(String[] args) {

        int num;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe um numero:");
        num = input.nextInt();

        if (num > 0) {
            int dobro = num * 2;
            System.out.println("Numero: " + num + " e positivo!");
            System.out.println("Esse e o seu dobro: " + dobro);
        } else {
            int triplo = num * 3;
            System.out.println("Número: " + num + " e negativo!");
            System.out.println("Esse e o seu triplo: " + triplo);
        }
    }

}


