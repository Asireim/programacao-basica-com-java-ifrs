package exemplosI;

import java.util.Scanner;

public class JogoAdvinhacao {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        var numSorteado = (int) (Math.random() * 1000 + 1);
        int palpite;

        do {
            System.out.println("Insira seu palpite: ");
            palpite = leitura.nextInt();

            if (palpite > numSorteado) {
                System.out.println("Muito alto!");
            } else if (palpite < numSorteado) {
                System.out.println("Muito baixo!");
            } else {
                System.out.println("Você acertou!");
            }

        } while (numSorteado != palpite);
    }
}
