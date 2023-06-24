package Interface;

public class Quadrado implements AreaCalculavel{
    private int lado;

    public Quadrado(int v){
        lado = v;
    }

    @Override
    public double calculaArea() {
        return lado * lado;
    }
}
