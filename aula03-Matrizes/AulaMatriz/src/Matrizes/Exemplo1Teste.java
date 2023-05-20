package Matrizes;
import java.util.Scanner;
public class Exemplo1Teste {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Exemplo1 teste = new Exemplo1();
		
		double matriz[][] = new double[2][2];
		
		for(int i = 0; i < matriz[0].length; i++) {
			for(int j = 0; j < matriz[1].length; j++) {
				System.out.printf("Digite o valor da linha %d coluna %d: ", i, j);
				matriz[i][j] = input.nextDouble();
			}
		}
		
		System.out.println("******Imprimindo a matriz******");
		for(int i = 0; i < matriz[0].length; i++) {
			for(int j = 0; j < matriz[1].length; j++) {
				System.out.printf("%f", matriz[i][j]);
			}
			
			System.out.println("");
		}
		
		matriz = teste.atualizar(matriz, 0, 1);
		
		System.out.println("******Imprimindo a matriz atualizada******");
		for(int i = 0; i < matriz[0].length; i++) {
			for(int j = 0; j < matriz[1].length; j++) {
				System.out.printf("%f", matriz[i][j]);
			}
			System.out.println("");
		}
	}	

}
