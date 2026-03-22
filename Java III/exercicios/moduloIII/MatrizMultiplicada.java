package moduloIII;

import java.util.Scanner;

public class MatrizMultiplicada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[6][4];
        int[] maiores = new int[6];

        System.out.println("Digite os valores da matriz 6x4:");
        for (int i = 0; i < 6; i++) {
            System.out.println("Linha " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 6; i++) {
            maiores[i] = matriz[i][0];
            for (int j = 1; j < 4; j++) {
                if (matriz[i][j] > maiores[i]) {
                    maiores[i] = matriz[i][j];
                }
            }
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] *= maiores[i];
            }
        }

        System.out.println("\nMatriz resultante:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
