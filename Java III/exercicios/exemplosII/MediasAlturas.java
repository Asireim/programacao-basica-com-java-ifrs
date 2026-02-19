package exemplosII;

import java.util.Scanner;

public class MediasAlturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] alturas = new int[10];
        int cont, soma = 0, maiores = 0;
        double media;

        for (cont = 0; cont < 10; cont++) {
            System.out.print("Digite a altura da pessoa " + (cont + 1) + ": ");
            alturas[cont] = scanner.nextInt();
        }

        for (cont = 0; cont < 10; cont++) {
            soma += alturas[cont];
        }

        media = soma / 10.0;

        for (cont = 0; cont < 10; cont++) {
            if (alturas[cont] > media) {
                maiores++;
            }
        }

        System.out.println("\nMédia das alturas: " + media);
        System.out.println("Quantidade de alturas acima da média: " + maiores);
    }
}
