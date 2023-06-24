package AulaHeranca;

public class EmpregadoComissionado {
    private String primeironome;
    private String ultimonome;
    private String CPF;
    private double vendaBruta;
    private double porcentagemComissao;

    public EmpregadoComissionado(String primeironome, String ultimonome, String CPF, double vendaBruta, double taxa) {
        this.primeironome = primeironome;
        this.ultimonome = ultimonome;
        this.CPF = CPF;
        setVendaBruta(vendaBruta);
        setTaxaComissao(taxa);
    }

    public void setPrimeironome(String first) {
        primeironome = first;
    }

    public String getPrimeironome() {
        return primeironome;
    }

    public void setUltimonome(String last) {
        primeironome = last;
    }

    public String getUltimonome() {
        return ultimonome;
    }

    public void setCPF(String cpf) {
        CPF = cpf;
    }

    public String getCPF() {
        return CPF;
    }

    public void setVendaBruta(double vendas) {
        vendaBruta = (vendas < 0.0) ? 0.0 : vendas;
    }

    public double getVendaBruta() {
        return vendaBruta;
    }

    public void setTaxaComissao(double taxa) {
        porcentagemComissao = (taxa > 0.0 && taxa < 1.0) ? taxa : 0.0;
    }

    public double getTaxaComissao() {
        return porcentagemComissao;
    }

    public double salario() {
        return vendaBruta + porcentagemComissao;
    }

}
