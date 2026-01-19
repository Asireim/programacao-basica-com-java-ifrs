package moduloIII;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        int senha;

        do {
            System.out.println("Insira a senha (4 dígitos): ");
            senha = leitura.nextInt();
        } while (senha != 1234);

        System.out.println("Senha correta, acesso liberado.");
    }
}
