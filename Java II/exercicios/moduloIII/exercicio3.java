package moduloIII;

import java.util.Scanner;

// exercicio1 moduloII
public class exercicio3 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        int cont;
        int soma = 0;

        for (cont = 0; cont < 10; cont++) {
            System.out.println("Informe um número para a soma: ");
            var num = leitura.nextInt();

            soma += num;
        }

        System.out.println("A soma dos 10 números informados resulta em: " + soma);
    }
}
