package revisao;

import java.util.Scanner;

public class Senac3 {
	
	public void MostraMesagem(String NomeCurso) {
		System.out.println("Bem vindo ao curso: " + NomeCurso);
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Senac3 obj = new Senac3();
		
		String nomecurso; //variável que recebe a string do input
		
		System.out.print("Entre com o curso: ");
		nomecurso = input.nextLine();
		System.out.println();
		obj.MostraMesagem(nomecurso);
	}
}
