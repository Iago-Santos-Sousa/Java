package Interface;

public class AreaTest {

    public static void main(String args[]){
        Retangulo retangulo = new Retangulo(2, 4);
        Quadrado quadrado = new Quadrado(2);

        System.out.println("Area do retangulo e: " + retangulo.calculaArea());
        System.out.println("Area do quadrado e: " + quadrado.calculaArea());

        retangulo.setAltura(6);
        retangulo.setBase(12);

        System.out.println("Area do retangulo e: " + retangulo.calculaArea());

    }
}
