package HerancaEx1;

public class HerancaTeste {
    public static void main(String[] args) {

        Assistente assistente = new Assistente("58575757", "Joao",
                1800);
        System.out.println(assistente.exibeDados());

        System.out.println();

        Tecnico tecnico  = new Tecnico(500, "Roberto",
                1800);
        System.out.println(tecnico.exibeDados());

        System.out.println();

        Administrativo administrativo  = new Administrativo(500, "Marcelo",
                1800);
        System.out.println(administrativo.exibeDados());

    }
}
