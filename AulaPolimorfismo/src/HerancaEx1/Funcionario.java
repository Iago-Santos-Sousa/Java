package HerancaEx1;

public class Funcionario {
    public String nome;
    public double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void addAumento(double valor){
        this.salario = valor;
    }

    public double ganhoAnual(){
        return salario * 12;
    }

    public String exibeDados() {
        return String.format("Nome: %s\n Salario: %s\n Ganho anual: %s",
                this.nome, this.salario, this.ganhoAnual());
    }
}
