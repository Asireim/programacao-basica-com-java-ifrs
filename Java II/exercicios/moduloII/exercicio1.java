package moduloII;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        int cont = 0;
        int soma = 0;

        while (cont < 10) {
            System.out.println("Informe um número para a soma: ");
            var num = leitura.nextInt();

            soma += num;
            cont++;
        }

        System.out.println("A soma dos 10 números informados resulta em: " + soma);
    }
}
