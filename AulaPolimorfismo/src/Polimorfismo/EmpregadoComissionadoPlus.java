package Polimorfismo;

public class EmpregadoComissionadoPlus extends EmpregadoComissionado {
    private double salarioBase;

    public EmpregadoComissionadoPlus(double salario, double vendasBrutas, double porcentagemComissao, String PrimeiroNome,
                                 String UltimoNome, String cpf) {
        super(vendasBrutas, porcentagemComissao, PrimeiroNome, UltimoNome, cpf);
        setSalarioBase(salario);
    }

    public void setSalarioBase(double salario) {
        salarioBase = (salario < 0.0) ? 0.0 : salario;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double vencimento() {
        return getSalarioBase() + super.vencimento();
    }

    public String toString() {
        return String.format("%s %s: %s: $%.2f", "Base assalariada", super.toString(),
                "salario base", getSalarioBase());
    }
}
