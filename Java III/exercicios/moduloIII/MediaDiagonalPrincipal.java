package moduloIII;

import java.util.Scanner;

public class MediaDiagonalPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[10][10];
        int soma = 0;

        System.out.println("Digite os valores da matriz 10x10:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 10; i++) {
            soma += matriz[i][i];
        }

        double media = soma / 10.0;

        System.out.println("Média dos elementos da diagonal principal: " + media);

        sc.close();
    }
}
