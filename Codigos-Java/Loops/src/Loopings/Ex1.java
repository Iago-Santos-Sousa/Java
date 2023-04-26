package Loopings;

public class Ex1 {

    public int efetuaSomaImpar() {
        int contador = 1;
        int total = 0;
        while (contador < 500) {
            int resto = contador %2;
            int impar = contador %1;

            if (resto == 0 && impar == 1) {
                total = total + contador;
            }
            contador++;
        }

        return total;
    }


}
