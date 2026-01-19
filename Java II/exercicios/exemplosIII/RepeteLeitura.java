package exemplosIII;

import java.util.Scanner;

public class RepeteLeitura {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        int numero;

        do {
            System.out.println("Insira um número: ");
            numero = leitura.nextInt();
        } while (numero != 8);

        System.out.println("Você acertou o número: " + numero + "!");
    }
}
