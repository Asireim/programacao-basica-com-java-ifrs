package moduloIV;

import java.util.Scanner;

public class SerieExponencial {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        double x = leitor.nextDouble();

        double resultadoSoma = 0;

        for (int i = 0; i < 15; i++) {
            resultadoSoma += Math.pow(x, i) / calcularFatorial(i);
        }

        System.out.printf("O resultado de e^%.2f aproximado por 15 termos é: %.6f%n", x, resultadoSoma);

        leitor.close();
    }

    public static double calcularFatorial(int n) {
        if (n == 0) return 1;
        double fat = 1;
        for (int i = 1; i <= n; i++) {
            fat *= i;
        }
        return fat;
    }
}
