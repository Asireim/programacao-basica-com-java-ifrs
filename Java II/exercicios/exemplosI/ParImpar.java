package exemplosI;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Insira um número: ");
        var numero = leitura.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
    }
}
