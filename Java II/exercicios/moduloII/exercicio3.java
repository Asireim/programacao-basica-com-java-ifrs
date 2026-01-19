package moduloII;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Digite um número negativo para sair.");

        int num = 0;
        while (num >= 0) {
            System.out.println("Informe um número para saber o quadrado dele: ");
            num = leitura.nextInt();

            var quadrado = num * num;

            System.out.printf("O quadrado do número %d é %d.%n", num, quadrado);
        }

    }
}
