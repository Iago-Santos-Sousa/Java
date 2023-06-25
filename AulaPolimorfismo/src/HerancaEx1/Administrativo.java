package HerancaEx1;

public class Administrativo extends Funcionario {
    public double bonus;

    public Administrativo(double bonus, String nome, double salario){
        super(nome, salario);
    }

    public String exibeDados() {
        return String.format("Administrativo nome: %s\n Salario: %s\n Ganho anual: %s",super.nome,
                super.salario, super.ganhoAnual() + this.bonus);
    }
}
