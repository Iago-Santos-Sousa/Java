package Interface;

public class FuncionarioTest {

    public static void main(String args[]){
        Gerente gerente = new Gerente("123@mudar", "Paulo", "Afonso", "8224556-54");
        Diretor diretor = new Diretor("83M6784", "Roberto", "Alonso", "87373737-98");

        System.out.println(gerente.toString());
        System.out.println(diretor.toString());

        diretor.setSenhaDiretor("43M6784");
        System.out.println("Autenticou? " + diretor.autentica(diretor.getSenhaDiretor()));


    }
}
