
package Array02;
import java.util.Random;

public class Ocorrencia {

	public static void main(String[] args) {
		
		Random objeto = new Random();
		int []frequencia = new int[2];
		
		for (int i = 0; i <= 6000; i++) 
			++frequencia[i + objeto.nextInt(6)];
		System.out.printf("%s%14s\n", "Face", "Frequencia");
		
		for(int face = 1; face < frequencia.length; face++)
			System.out.printf("%4d%10d\n", face, frequencia[face]);
	}

}