package moduloI;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Insira o primeiro valor: ");
        var a = leitura.nextDouble();

        System.out.println("Insira o segundo valor: ");
        var b = leitura.nextDouble();

        System.out.println("Insira o terceiro valor: ");
        var c = leitura.nextDouble();

        double delta = b * b - 4 * a * c;

        System.out.println("A equação possui " + delta + " raízes reais.");

        if(delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else if (delta > 0) {
            System.out.println("Possui duas raízes reais.");
        } else {
            System.out.println("Possui uma única raiz real.");
        }
    }
}
