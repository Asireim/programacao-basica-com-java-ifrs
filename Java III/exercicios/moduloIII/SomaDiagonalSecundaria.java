package moduloIII;

import java.util.Scanner;

public class SomaDiagonalSecundaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] matriz = new double[5][5];
        double soma = 0;

        System.out.println("Digite os valores da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < 5; i++) {
            soma += matriz[i][4 - i];
        }
        System.out.println("Soma dos elementos da diagonal secundária: " + soma);

        sc.close();
    }
}
