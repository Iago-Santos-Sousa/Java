package HerancaEx1;

public class Tecnico extends Funcionario {
    public double bonus;

    public Tecnico(double bonus, String nome, double salario){
        super(nome, salario);
    }

    public String exibeDados() {
        return String.format("Tecnico nome: %s\n Salario: %s\n Ganho anual: %s",super.nome,
                super.salario, super.ganhoAnual() + this.bonus);
    }
}
