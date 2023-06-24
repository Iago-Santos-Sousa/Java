package Polimorfismo;

public class EmpregadoAssalariado extends Empregado {
    private double salarioSemanal;

    public EmpregadoAssalariado(double s, String PrimeiroNome, String UltimoNome, String cpf) {
        super(PrimeiroNome, UltimoNome, cpf);
        setSalarioSemanal(s);
    }

    public void setSalarioSemanal(double salario) {
        salarioSemanal = salario;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public double vencimento() {
        return getSalarioSemanal();
    }

    public String toString() {
        return String.format("Empregado assalariado: %s\n%s: $%.2f", super.toString(),
                "Salario semanal", getSalarioSemanal());
    }
}
