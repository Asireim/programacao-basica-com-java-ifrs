package moduloI;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Insira o valor do primeiro lado: ");
        var primeiro = leitura.nextDouble();

        System.out.println("Insira o valor do segundo lado: ");
        var segundo = leitura.nextDouble();

        System.out.println("Insira o valor do terceiro lado: ");
        var terceiro = leitura.nextDouble();

        if (((primeiro + segundo) <= terceiro) || ((terceiro + segundo) <= primeiro) || ((primeiro + terceiro) <= segundo)) {
            System.out.println("Os valores informados não podem formar um triângulo.");
        } else {
            System.out.println("Os lados formam um triângulo.");
        }
    }
}
