package exemplosI;

import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        var n1 = leitura.nextInt();

        System.out.println("Insira o segundo número: ");
        var n2 = leitura.nextInt();

        if (n1 > n2) {
            System.out.println("O primeiro número é o maior.");
        } else if(n2 > n1) {
            System.out.println("O segundo número é o maior.");
        } else {
            System.out.println("Os números são iguais.");
        }
    }
}
