package moduloII;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[20];
        double[] resultado = new double[20];

        System.out.println("Digite 20 números inteiros:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Posição [" + i + "]: ");
            numeros[i] = scanner.nextInt();
        }

        int maior = numeros[0];
        for (int i = 1; i < 20; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        for (int i = 0; i < 20; i++) {
            resultado[i] = (double) numeros[i] / maior;
        }

        System.out.println("\nMaior valor: " + maior);
        System.out.println("\nValores após a divisão:");

        for (int i = 0; i < 20; i++) {
            System.out.println("Posição [" + i + "] = " + resultado[i]);
        }
    }
}
