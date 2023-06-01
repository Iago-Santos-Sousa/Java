package ListaTres;

public class Ex01 {
	/*1- Faça um programa que possua um vetor denominado A que armazene 6
	números inteiros. O programa deve executar os seguintes passos:
		A. Implemente um método que atribua os seguintes valores a esse vetor: 1, 0, 5,
		-2, -5, 7.
		B. Implemente um método que armazene em uma variável inteira (simples) a
		soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela
		esta soma.
		C. Implemente um método que modifique o vetor na posição 4, atribuindo a esta
		posição o valor 100 e imprima o array.
		D. Implemente uma classe de teste para testar os itens A, B e C.*/

    public int [] atribui() {
        int a[] = {1, 0, 5, -2, -5, 7};
        return a;
    }

    public void posicoes() {
        int vet[] = this.atribui();
        int soma = vet[0] + vet[1] + vet[5];
        System.out.println("O resultado da soma e: " + soma);
    }

    public void modifica() {
        int vet[] = atribui();
        vet[4] = 100;
        imprimiArray(vet);

        //for(int i = 0; i <vet.length; i++) {
        //System.out.println(vet[i]);
        //}
    }

    public void imprimiArray(int vet[]) {
        System.out.println("Imprimindo array");
        for(int i = 0; i < vet.length; i++) {
            System.out.printf("%d ",vet[i]);
        }
    }

}
