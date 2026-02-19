package exemplosII;

import java.util.Scanner;

public class PesquisaTV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] contadores = new int[10];
        int cont, canal;

        for (cont = 0; cont < 10; cont++) {
            contadores[cont] = 0;
        }

        for (cont = 0; cont < 100; cont++) {
            System.out.print("Informe o canal assistido (1 a 10): ");
            canal = scanner.nextInt();

            if (canal >= 1 && canal <= 10) {
                contadores[canal - 1]++;
            } else {
                System.out.println("Canal inválido! Digite um número entre 1 e 10.");
                cont--; // repete a leitura
            }
        }

        System.out.println("\nResultado da pesquisa:");
        for (cont = 0; cont < 10; cont++) {
            System.out.println(contadores[cont] + " assistem o canal " + (cont + 1));
        }
    }
}
