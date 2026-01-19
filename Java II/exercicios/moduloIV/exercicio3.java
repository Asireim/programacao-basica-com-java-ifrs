package moduloIV;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Informe um número em binário: ");
        var binario = leitura.nextLine();

        System.out.printf("O número %s em decimal é %d.%n", binario, Integer.parseInt(binario, 2));
    }
}
