package Atividade;

public class AlunoTeste {

    public static void main(String[] args) {

        Aluno obj = new Aluno("Iago", "08/09/1998", "Santa Maria");
        System.out.printf(" Nome: %s%n DtNasc: %s%n Endereco: %s",
                obj.getNome(), obj.getDtNasc(), obj.getEndereco());

        System.out.println();
        System.out.println();

        AlunoGraduacao obj2 = new AlunoGraduacao("Joao", "18/05/1994",
                "Ceilandia", "ADS", "Completo");
        System.out.printf(" Nome: %s%n DtNasc: %s%n Endereco: %s",
                obj2.getNome(), obj2.getDtNasc(), obj2.getEndereco());
        System.out.println();
        System.out.println("Curso: " + obj2.getCurso());
        System.out.println("Ensino medio: " + obj2.getEnsinoMedio());

        System.out.println();
        System.out.println();

        AlunoPosGraduacao obj3 = new AlunoPosGraduacao("Roberto", "11/05/1992",
                "Samambaia", "Bacharel", "Especialização", "Qualquer");
        System.out.printf(" Nome: %s%n DtNasc: %s%n Endereco: %s",
                obj3.getNome(), obj3.getDtNasc(), obj3.getEndereco());
        System.out.println();
        System.out.println("Graducao: " + obj3.getGraduacao());
        System.out.println("Tipo da pos: " + obj3.getTipoPos());
        System.out.println("Programa: " + obj3.getPrograma());
    }
}
