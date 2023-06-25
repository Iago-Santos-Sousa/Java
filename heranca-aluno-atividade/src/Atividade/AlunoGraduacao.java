package Atividade;

public class AlunoGraduacao extends Aluno {
    private String curso;
    private String ensinoMedio;
    public AlunoGraduacao(String nome, String dtNasc, String endereco, String curso, String ensinoMedio){
        super(nome, dtNasc, endereco);
        this.setCurso(curso);
        this.setEnsinoMedio(ensinoMedio);
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setEnsinoMedio(String ensinoMedio) {
        this.ensinoMedio = ensinoMedio;
    }

    public String getEnsinoMedio() {
        return ensinoMedio;
    }

}
