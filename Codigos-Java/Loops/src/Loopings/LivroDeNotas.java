package Loopings;

import java.util.Scanner;

public class LivroDeNotas {
    private int total;
    private int contadorNotas;
    private int contaA;
    private int contaB;
    private int contaC;
    private int contaD;
    private int contaF;
    private int nota;
    private int recebeNota;
    private String nomeCurso;


    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getContadorNotas() {
        return contadorNotas;
    }

    public void setContadorNotas(int contadorNotas) {
        this.contadorNotas = contadorNotas;
    }

    public int getContaA() {
        return contaA;
    }

    public void setContaA(int contaA) {
        this.contaA = contaA;
    }

    public int getContaB() {
        return contaB;
    }

    public void setContaB(int contaB) {
        this.contaB = contaB;
    }

    public int getContaC() {
        return contaC;
    }

    public void setContaC(int contaC) {
        this.contaC = contaC;
    }

    public int getContaD() {
        return contaD;
    }

    public void setContaD(int contaD) {
        this.contaD = contaD;
    }

    public int getContaF() {
        return contaF;
    }

    public void setContaF(int contaF) {
        this.contaF = contaF;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }


    public void incrementaContadorNota(int nota) {

        switch (nota / 10) {
            case 9:
            case 10:
                contaA++;
                break;
            case 8:
                contaB++;
                break;
            case 7:
                contaC++;
                break;
            case 6:
                contaD++;
                break;
            default:
                contaF++;
                break;

        }
    }

    public void inputNota(int limite) {
        Scanner input = new Scanner(System.in);
        int cont;
        nota = input.nextInt();
        for (cont = 1; cont <= limite; cont++) {
            System.out.printf("Digite a nota [%d]:", cont);
            recebeNota = input.nextInt();
            this.incrementaContadorNota(recebeNota);
        }
    }

    public void mostrarNota() {
        System.out.println("Nome do curso: " + this.getNomeCurso());

    }



}
