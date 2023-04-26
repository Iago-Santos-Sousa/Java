package revisao;
import java.util.Scanner;

public class Senac4 {
	
	public String nomeCurso;
	
	public Senac4(String a) {
		this.nomeCurso = a;
	}
	
	
	
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public String getNomeCurso() {
		return nomeCurso;
	}
	
	public void MostrarMensagem() {
		System.out.println("Bem vindo ao curso " + getNomeCurso());
	}
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Senac4 obj = new Senac4("");
		
		String nomecurso;
		
		System.out.print("Entre com o seu curso: ");
		
		nomecurso = input.nextLine();
		
		System.out.println();
		
		obj.setNomeCurso(nomecurso);
		
		System.out.println(obj.getNomeCurso());
		obj.setNomeCurso("GTI");
		System.out.println(obj.getNomeCurso());
		
		//obj.MostrarMensagem();
		
	
	}
}
