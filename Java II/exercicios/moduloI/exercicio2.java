package moduloI;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Insira um valor numérico: ");
        var num = leitura.nextInt();

        if (num >= 1 && num <= 9) {
            System.out.println("O valor está na faixa permitida.");
        } else {
            System.out.println("O valor está fora da faixa permitida.");
        }
    }
}
