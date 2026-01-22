package exemplosI;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Informe a medida do lado A: ");
        var a = leitura.nextDouble();

        System.out.println("Informe a medida do lado B: ");
        var b = leitura.nextDouble();

        System.out.println("Informe a medida do lado C: ");
        var c = leitura.nextDouble();

        if (a + b > c || a + c > b || b + c > a) {
            System.out.println("As medidas formam um triângulo.");

            if (a == b && b == c) {
                System.out.println("O triângulo é equilátero.");
            } else if (a != b && b != c && a != c) {
                System.out.println("O triângulo é escaleno.");
            } else {
                System.out.println("O triângulo é isósceles.");
            }
        } else {
            System.out.println("As medidas informadas não formam um triângulo.");
        }

    }
}
