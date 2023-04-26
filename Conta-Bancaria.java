package projetoAula;

import java.util.Scanner;

public class Conta {

	private double balanco;

	public Conta(double balancoInicial) {
		if (balancoInicial > 0.0) {
			balanco = balancoInicial;
		}
	}

	public void Deposito(double acrescimo) {
		balanco = balanco + acrescimo;
	}

	public double getBalanco() {
		return balanco;
	}

	public static void main(String args[]) {

		Conta conta1 = new Conta(50.00);
		Conta conta2 = new Conta(-7.53);

		System.out.println("balanco da conta1: " + conta1.getBalanco());
		System.out.println("balanco da conta2: " + conta2.getBalanco());

		Scanner input = new Scanner(System.in);
		double saque;
		System.out.print("Digite o saque para a conta1: ");
		saque = input.nextDouble();

		conta1.Saque(saque);
	}

	public void Saque(double valorSaque) {
		if (balanco >= valorSaque) {
			balanco = balanco - valorSaque;
			System.out.println("****Saque feito com sucesso!!****");
		} else {
			System.out.println("****Saldo insuficiente! o valor de saque: " + valorSaque
					+ " e maior que o saldo em conta:" + this.getBalanco());
		}
	}

}
