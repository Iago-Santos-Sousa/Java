package AulaHeranca;

public class EmpregadoComissionadoTeste {
    public static void main(String[] args) {

        EmpregadoComissionado obj = new EmpregadoComissionado("Samuel", "Chaves",
                "930.98.091-55", 23890.4, 0.05);

        EmpregadoComissionadoPlus obj2 = new EmpregadoComissionadoPlus(5000,"Joao", "Manoel",
                "930.98.091-55", 23890.4, 0.05);

        System.out.printf("Empregado: %s %s\n", obj.getPrimeironome(), obj.getUltimonome());
        System.out.println("CPF: " + obj.getCPF());
        System.out.println("Total de vendas: " + obj.getVendaBruta());
        System.out.println("Total de comissao: " + obj.getTaxaComissao());
        System.out.printf("Salario: %.2f \n", obj.salario());

        System.out.println();

        obj2.setSalarioBase(1200);
        System.out.printf("Empregado: %s %s\n", obj2.getPrimeironome(), obj2.getUltimonome());
        System.out.println("CPF: " + obj2.getCPF());
        System.out.println("Total de vendas: " + obj2.getVendaBruta());
        System.out.println("Total de comissao: " + obj2.getTaxaComissao());
        System.out.printf("Salario do Joao: %.2f \n", obj2.salario());
    }
}
