package moduloIV;

public class CalculoSerie {
    public static void main(String[] args) {
        double soma = 0;
        int numerador = 100;

        for (int i = 0; i <= 20; i++) {
            soma += (double) numerador / calcularFatorial(i);
            numerador--;
        }

        System.out.printf("O resultado da soma da série S é: %.4f%n", soma);
    }

    public static double calcularFatorial(int n) {
        double fat = 1;
        for (int i = 2; i <= n; i++) {
            fat *= i;
        }
        return fat;
    }
}
