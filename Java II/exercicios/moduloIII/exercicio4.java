package moduloIII;

import java.util.Scanner;

//exercicio2 moduloII
public class exercicio4 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Digite um número negativo para sair.");

        int num;
        int cont = 0;
        int soma = 0;
        int somaQuadrados = 0;

        for (num = 0; num >= 0;) {
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
