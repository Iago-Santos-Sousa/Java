package Polimorfismo;

public class EmpregadoTeste {

    public static void main(String[] args){

        //EmpregadoAssalariado
        EmpregadoAssalariado empregadoAssalariado = new EmpregadoAssalariado(4500, "Jorge",
                "Santos", "958475-67");

        System.out.println(empregadoAssalariado);

        System.out.println();

        //EmpregadoComissionado
        EmpregadoComissionado empregadoComissionado = new EmpregadoComissionado(25, 60,
                "Tiago", "Medeiros", "598548-89");

        System.out.println(empregadoComissionado);

        System.out.println();

        //EmpregadoComissionadoPlus
        EmpregadoComissionadoPlus empregadoComissionadoPlus = new EmpregadoComissionadoPlus(5000, 20,
                45, "Vidal", "Vilela", "4949494-89");

        System.out.println(empregadoComissionadoPlus);

        System.out.println();

        //EmpregadoHorista
        EmpregadoHorista empregadoHorista = new EmpregadoHorista(8, 6,
                "Gabriel", "Novaes", "8584-67");

        System.out.println(empregadoHorista);

        ;
    }
}
