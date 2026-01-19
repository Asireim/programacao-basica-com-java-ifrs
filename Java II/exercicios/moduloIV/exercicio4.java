package moduloIV;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Insira o valor de A: ");
        var a = leitura.nextDouble();

        System.out.println("Insira o valor de B: ");
        var b = leitura.nextDouble();

        System.out.println("Insira o valor de C: ");
        var c = leitura.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
