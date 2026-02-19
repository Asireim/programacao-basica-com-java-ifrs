package moduloII;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] clientes = new String[8];
        int[] locacoes = new int[8];
        int[] locacoesGratis = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o nome do " + (i + 1) + "º cliente: ");
            clientes[i] = scanner.nextLine();

            System.out.print("Quantidade de DVDs locados em 2017: ");
            locacoes[i] = Integer.parseInt(scanner.nextLine());

            locacoesGratis[i] = locacoes[i] / 10;

            System.out.println();
        }

        System.out.println("\nClientes e suas locações grátis:");
        for (int i = 0; i < 8; i++) {
            System.out.println("Cliente: " + clientes[i] +
                    " | Locações grátis: " + locacoesGratis[i]);
        }

        scanner.close();
    }
}
