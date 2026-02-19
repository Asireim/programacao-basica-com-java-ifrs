package moduloII;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];
        int soma = 0;

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < 5; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = scanner.nextInt();
        }

        System.out.println("\nDigite os valores do vetor B:");
        for (int i = 0; i < 5; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            int resultado = B[4 - i] - A[i];
            soma += resultado;

            System.out.println("B[" + (4 - i) + "] - A[" + i + "] = " + resultado);
        }

        System.out.println("\nSoma total das subtrações: " + soma);
    }
}
