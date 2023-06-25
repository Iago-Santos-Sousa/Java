package Atividade;

public class Aluno {
    private final String nome;
    private final String dtNasc;
    private final String endereco;

    public Aluno(String nome, String dtNasc, String endereco) {
        this.nome = nome;
        this.dtNasc = dtNasc;
        this.endereco = endereco;
    }

    public void setNome(String nome) {
        nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDtNasc(String dtNasc) {
        dtNasc = dtNasc;
    }

    public String getDtNasc() {
        return dtNasc;
    }

    public void setEndereco(String endereco) {
        endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

}
