package exemplosII;

import java.util.Scanner;

public class LojaArtesanato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] vetValorUnit = new double[10];
        int[] vetQuantVend = new int[10];

        int cont;
        int objMaisVend = 0;
        double total, totalGeral = 0, comissao;

        for (cont = 0; cont < 10; cont++) {
            System.out.println("Produto " + (cont + 1));

            System.out.print("Valor unitário: ");
            vetValorUnit[cont] = scanner.nextDouble();

            System.out.print("Quantidade vendida: ");
            vetQuantVend[cont] = scanner.nextInt();

            System.out.println();
        }

        System.out.println("\nRelatório de vendas:");
        for (cont = 0; cont < 10; cont++) {

            total = vetValorUnit[cont] * vetQuantVend[cont];
            totalGeral += total;

            System.out.println("Produto " + (cont + 1) +
                    " | Quantidade: " + vetQuantVend[cont] +
                    " | Valor Unitário: " + vetValorUnit[cont] +
                    " | Total: " + total);
        }

        comissao = totalGeral * 0.05;

        System.out.println("\nTotal Geral: " + totalGeral);
        System.out.println("Comissão (5%): " + comissao);

        for (cont = 1; cont < 10; cont++) {
            if (vetQuantVend[cont] > vetQuantVend[objMaisVend]) {
                objMaisVend = cont;
            }
        }

        System.out.println("\nProduto mais vendido: " + (objMaisVend + 1));
        System.out.println("Valor unitário do produto mais vendido: " +
                vetValorUnit[objMaisVend]);
    }
}
