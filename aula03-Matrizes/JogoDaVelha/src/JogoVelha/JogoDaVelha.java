package JogoVelha;
import java.util.Scanner;

public class JogoDaVelha {
	
	public void cors() {
		int linha, coluna, i = 1;
		Scanner input = new Scanner(System.in);
		int matriz[][] = new int[3][3];
		inicializa(matriz);
		
		while (true) {
			System.out.println("\nJogador 1 na rodada " + i);
			imprimeMatriz(matriz);
			
			System.out.print("Digite a linha: ");
			linha = input.nextInt();
			
			System.out.print("Digite a coluna: ");
			coluna = input.nextInt();
			
			matriz[linha][coluna] = 0;
			i++;
			if(i == 9) {
				break;
			}
			
			// jogador 2
			System.out.println("\nJogador 2 na rodada " + i);
			imprimeMatriz(matriz);
			
			System.out.print("Digite a linha: ");
			linha = input.nextInt();
			
			System.out.print("Digite a coluna: ");
			coluna = input.nextInt();
			
			matriz[linha][coluna] = 1;
			i++;
			if(i == 9) {
				break;
			}
		}
		
		System.out.println("\n\n Jogo finalizado");
		imprimeMatriz(matriz);
	}
	
	
	public void inicializa(int mat[][]) {
		for(int i = 0; i < mat[0].length; i++) {
			for(int j = 0; j < mat[1].length; j++) {
				mat[i][j] = -1;
			}
		}
	}
	
	public void imprimeMatriz(int mat[][]) {
		for(int i = 0; i < mat[0].length; i++) {
			for(int j = 0; j < mat[1].length; j++) {
				System.out.printf("%d ", mat[i][j]);
			}
			System.out.println("");
		}
	}
	
	

}
