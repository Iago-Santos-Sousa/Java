package Atividade;

public class AlunoPosGraduacao extends Aluno{
    private String graduacao;
    private String tipoPos;
    private String programa;

    public AlunoPosGraduacao(String nome, String dtNasc, String endereco,
                             String graduacao, String tipoPos, String programa){
        super(nome, dtNasc, endereco);
        this.setGraduacao(graduacao);
        this.setPrograma(programa);
        this.setTipoPos(tipoPos);
    }

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }

    public String getGraduacao() {
        return graduacao;
    }

    public void setTipoPos(String tipoPos) {
        this.tipoPos = tipoPos;
    }

    public String getTipoPos() {
        return tipoPos;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getPrograma() {
        return programa;
    }

}
