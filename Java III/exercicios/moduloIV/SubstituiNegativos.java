package moduloIV;

import java.util.Scanner;

public class SubstituiNegativos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] vetorA = new int[25];

        System.out.println("Digite 25 números inteiros:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Posição [" + i + "]: ");
            vetorA[i] = leitor.nextInt();
        }

        substituirNegativos(vetorA);

        System.out.println("\nVetor resultante (negativos substituídos por zero):");
        for (int valor : vetorA) {
            System.out.print(valor + " ");
        }

        leitor.close();
    }

    public static void substituirNegativos(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                vetor[i] = 0;
            }
        }
    }
}
