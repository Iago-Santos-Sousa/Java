package HerancaEx1;

public class Assistente extends Funcionario{
    private String matricula;

    public Assistente(String matricula, String nome, double salario){
        super(nome, salario);
        setMatricula(matricula);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    //public String exibeDados() {
        //return String.format("Aumento: %s\n Ganho anual: %s\n Matricula: %s",
                //super.ganhoAnual(), this.getMatricula());
   // }

    public String exibeDados() {
        return String.format("Assistente nome: %s\n Salario: %s\n Matricula: %s",super.nome,
                super.salario, this.getMatricula());
    }
}
