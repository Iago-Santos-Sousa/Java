package HerancaEx2;

public class Miseravel extends Pessoa{

    public Miseravel(String nome, int idade){
        super(nome, idade);
    }

    public void mendiga(){
        System.out.println(this.getNome() + " e miseravel " + "e Mendiga.");
    }

}
