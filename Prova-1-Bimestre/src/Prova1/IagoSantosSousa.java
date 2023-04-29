package Prova1;
import java.util.Scanner;
public class IagoSantosSousa {
    // Utilizei a métrica de centímetros para as alturas. Exemplo: 170 metros.

    int i;
    public double altura = 0;
    public double menor = 0;
    public double maior = 0;
    public String sexo = "";
    public String sexoMaior = "";
    public String sexoMenor = "";
    public int feminino = 0;

    public void calcularAltura() {

        for (i = 1; i < 5; i++) {
            Scanner input = new Scanner(System.in);
            Scanner inputSexo = new Scanner(System.in);

            System.out.print("Informe a sua altura pessoa " + i + ": ");
            altura = input.nextInt();

            System.out.print("Informe o seu sexo: Masculino (M) ou Feminino (F) ");
            sexo = inputSexo.nextLine();

            if (i == 1) {
                maior = altura;
                menor = altura;
                sexoMaior = sexo;
                sexoMenor = sexo;
            }

            if (altura > maior) {
                maior = altura;
                sexoMaior = sexo;
            }

            if (altura < menor) {
                menor = altura;
                sexoMenor = sexo;
            }

            if (sexo.equals("F")) {
                feminino = feminino + 1;
            } else if(!sexo.equals("F") && !sexo.equals("M")) {
                System.out.println("Opcao de sexo invalida, fim do programa! \nCertifique-se de " +
                        "informar o sexo apenas em M maisculo ou F maisculo.");
                break;
            }
        }

    }

    public void menorAltura() {
        System.out.println("a menor altura e: " + this.menor + " com sexo de: " + this.sexoMenor);
    }

    public void maiorAltura() {
        System.out.println("a maior altura e: " + this.maior + " com sexo de: " + this.sexoMaior);
    }

    public void numMulheres() {
        System.out.println("A quantidade de mulheres e: " + this.feminino);
    }

}
