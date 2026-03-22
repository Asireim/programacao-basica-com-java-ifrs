package moduloIV;

import java.util.Scanner;

public class SomaFracoes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Numerador 1 (n1): ");
        int n1 = leitor.nextInt();
        System.out.print("Denominador 1 (d1): ");
        int d1 = leitor.nextInt();

        System.out.print("Numerador 2 (n2): ");
        int n2 = leitor.nextInt();
        System.out.print("Denominador 2 (d2): ");
        int d2 = leitor.nextInt();

        int dr = calcularMMC(d1, d2);

        int nr = ((dr / d1) * n1) + ((dr / d2) * n2);

        System.out.println("\nResultado da soma:");
        System.out.println(n1 + "/" + d1 + " + " + n2 + "/" + d2 + " = " + nr + "/" + dr);

        leitor.close();
    }

    public static int calcularMMC(int a, int b) {
        if (a == 0 || b == 0) return 0;
        int absA = Math.abs(a);
        int absB = Math.abs(b);
        return (absA * absB) / calcularMDC(absA, absB);
    }

    public static int calcularMDC(int a, int b) {
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }
}
