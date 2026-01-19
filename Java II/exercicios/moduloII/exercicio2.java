package moduloII;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Digite um número negativo para sair.");

        var num = 0;
        int cont = 0;
        int soma = 0;
        int somaQuadrados = 0;
        while (num >= 0) {
            System.out.println("Informe um número: ");
            num = leitura.nextInt();

            soma += num;
            var quadrados = num * num;
            somaQuadrados += quadrados;
            cont++;
        }
        cont--;
        soma -= num;
        somaQuadrados -= num * num;

        var media = soma / cont;

        System.out.printf("""
                O somatório dos números informados resulta em: %d
                A soma dos quadrados dos números informados resulta em: %d
                A média entre os números informados resulta em: %d
                """, soma, somaQuadrados, media);
    }
}
