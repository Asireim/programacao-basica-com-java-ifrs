package exemplosII;

import java.util.Scanner;

public class BuscaDeValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];
        int cont;
        boolean achou = false;

        // Leitura dos números
        for (cont = 0; cont < 10; cont++) {
            System.out.print("Digite o número da posição " + (cont + 1) + ": ");
            numeros[cont] = scanner.nextInt();
        }

        for (cont = 0; cont < 10; cont++) {
            if (numeros[cont] > 50) {
                System.out.println("Número: " + numeros[cont] +
                        " | Posição: " + (cont + 1));
                achou = true;
            }
        }

        if (!achou) {
            System.out.println("Nenhum número maior do que 50 foi encontrado.");
        }
    }
}
