package Polimorfismo;

public abstract class Empregado {
    private String PrimeiroNome;
    private String UltimoNome;
    private String cpf;

    public Empregado(String PrimeiroNome, String UltimoNome, String cpf){
        this.PrimeiroNome = PrimeiroNome;
        this.UltimoNome = UltimoNome;
        this.cpf = cpf;
    }

    public void setPnome(String s) {
        PrimeiroNome = s;
    }

    public String getPnome() {
        return PrimeiroNome;
    }

    public void setUnome(String s) {
        UltimoNome = s;
    }

    public String getUnome() {
        return UltimoNome;
    }

    public void setCPF(String s) {
        cpf = s;
    }

    public String getCPF() {
        return cpf;
    }

    public String toString() {
        return String.format("%s %s\ncpf, %s", getPnome(), getUnome(), getCPF());
    }

    public abstract double vencimento();
}
