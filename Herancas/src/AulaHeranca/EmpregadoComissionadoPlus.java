package AulaHeranca;

public class EmpregadoComissionadoPlus extends EmpregadoComissionado {

    private double salarioBase;

    public EmpregadoComissionadoPlus(double Salario, String primeironome, String ultimonome, String CPF, double vendaBruta, double taxa) {
        super(primeironome, ultimonome, CPF, vendaBruta, taxa);
        setSalarioBase(Salario);
    }

    public void setSalarioBase(double Salario) {
        salarioBase = (Salario < 0.0) ? 0.0 : Salario;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double salario() {
        return salarioBase + (super.getTaxaComissao() + super.getVendaBruta());
    }
}
