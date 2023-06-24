package Interface;

public class Gerente extends Funcionario implements Autenticavel {
    private String senha;

    public Gerente(String senhaGerente, String pNome, String uNome, String cpf){
        super(pNome, uNome, cpf);
        senha = senhaGerente;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(String Senha) {
        return senha.equals(senha);
    }

    @Override
    public String toString() {
        return String.format("*****Dados do Gerente******\n %s\n Autenticou?%b\n", super.toString(),
                this.autentica(this.getSenha()));
    } // fim do toString


}
