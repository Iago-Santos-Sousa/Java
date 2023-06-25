package HerancaEx2;

public class Heranca2Teste {

    public static void main(String[] args){

        // Animal
        Cachorro cachorro = new Cachorro("Rex", "Pastor Alemao");
        System.out.printf(" Nome: %s\n Raca: %s\n ele: %s\n e: %s\n", cachorro.getNome(),
                cachorro.getRaca(), cachorro.caminha(), cachorro.late());

        System.out.println();

        Gato gato = new Gato("Tigresa", "Siames");
        System.out.printf(" Nome: %s\n Raca: %s\n ele: %s\n e: %s\n", gato.getNome(),
                gato.getRaca(), gato.caminha(), gato.mia());

        System.out.println();

        // Pessoa
        Rica rica = new Rica(40000, "Marcia", 45);
        System.out.printf(" Pessoa rica: %s\n Com idade: %s\n %s\n", rica.getNome(),
                rica.getIdade(), rica.fazCompras());

        System.out.println();

        Pobre pobre = new Pobre("Jorge", 40);
        pobre.trabalha();

        System.out.println();

        Miseravel miseravel = new Miseravel("Matheus", 35);
        miseravel.mendiga();

    }
}
