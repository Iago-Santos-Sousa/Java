package Polimorfismo;

public class EmpregadoComissionado extends Empregado {
    private double vendasBrutas;
    private double porcentagemComissao;

    public EmpregadoComissionado(double vendasBrutas, double porcentagemComissao, String PrimeiroNome,
                                 String UltimoNome, String cpf) {
        super(PrimeiroNome, UltimoNome, cpf);
        setVendasBrutas(vendasBrutas);
        setTaxaComissao(porcentagemComissao);
    }

    public void setVendasBrutas(double vendas) {
        vendasBrutas = (vendas < 0.0) ? 0.0 : vendas;
    }

    public double getVendasBrutas() {
        return vendasBrutas;
    }

    public void setTaxaComissao(double taxa) {
        porcentagemComissao = (taxa > 0.0 && taxa < 1.0) ? taxa : 0.0;
    }

    public double getPorcentagemComissao() {
        return porcentagemComissao;
    }

    public String toString() {
        return String.format("%s: %s\n%s: $%.2f: %s: %.2f", "Empregado Comissionado", super.toString(),
                "Vendas brutas", getVendasBrutas(), "Porcentagem comissao", getPorcentagemComissao());
    }

    // teste abaixo
    @Override
    public double vencimento() {
        return 0;
    }
}
