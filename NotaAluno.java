package projetoAula;
import java.util.Scanner;

public class NotaAluno {
	
	public String Mencao(double nota) {
		
		String outPut;
		
		if (nota >= 9) {
			outPut = "A";
		} else if (nota >= 8 && nota < 9) {
			outPut = "B";
		} else if (nota >= 7 && nota < 8) {
			outPut = "C";
		} else if (nota >= 6 && nota < 7) {
			outPut = "D";
		} else {
			outPut = "F";
		}
		
		return outPut;
	}
	
	public static void main(String args[]) {
		NotaAluno obj = new NotaAluno();
		Scanner input = new Scanner(System.in);
		double notaAluno;
		System.out.print("Digite a nota do aluno: ");
		notaAluno = input.nextDouble();
		String mencao = obj.Mencao(notaAluno);
		System.out.println("A mencao do aluno é: " + mencao);
	}
}
