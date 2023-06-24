package Interface;

public class Diretor extends Funcionario implements  Autenticavel {
    private String senhaDiretor;

    public Diretor(String senha, String pNome, String uNome, String cpf){
        super(pNome, uNome, cpf);
        senhaDiretor = senha;
    }

    public String getSenhaDiretor() {
        return senhaDiretor;
    }

    public void setSenhaDiretor(String senhaDiretor) {
        this.senhaDiretor = senhaDiretor;
    }

    @Override
    public boolean autentica(String Senha) {
        if (Senha.length() > 6 && Senha.charAt(2) == super.getPrimeiroNome().charAt(0) && Senha.equals(senhaDiretor)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("*******Diretor******\n%s\n Autenticou? %b\n", super.toString(),
                this.autentica(this.getSenhaDiretor()));
    } // fim do toString

}
