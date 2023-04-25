package Lista_2;

public class Ex6 {
    // 6. Implemente um programa que gera e escreve os números ímpares entre 100 e 200.
    public static void main(String[] args) {

        for (int i = 100; i <= 200; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }

        }
    }
}
