package Polimorfismo;

public class EmpregadoAssalariado extends Empregado {
    private double salarioSemanal;

    public EmpregadoAssalariado(double salario, String PrimeiroNome, String UltimoNome,
                                String cpf) {
        super(PrimeiroNome, UltimoNome, cpf);
        setSalarioSemanal(salario);
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

    @Override
    public String toString() {
        return String.format("Empregado assalariado: %s\n%s: $%.2f", super.toString(),
                "Salario semanal", getSalarioSemanal());
    }
}
