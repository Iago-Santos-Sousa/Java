package HerancaEx2;

public class Rica extends Pessoa{
    double dinheiro;
    public Rica(double dinheiro, String nome, int idade){
        super(nome, idade);
        this.dinheiro = dinheiro;
    }

    public String fazCompras() {
        return "Faz compras com dinheiro: " + this.dinheiro;
    }
}
