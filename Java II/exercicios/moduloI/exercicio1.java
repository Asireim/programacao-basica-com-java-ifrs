package moduloI;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Insira o primeiro valor: ");
        var num1 = leitura.nextInt();

        System.out.println("Insira o segundo valor: ");
        var num2 = leitura.nextInt();

        if (num1 > num2) {
            var diferenca = num1 - num2;
            System.out.printf("Resultado da diferença do número %s pelo número %s: %s", num1, num2, diferenca);
        } else if (num2 > num1) {
            var diferenca = num2 - num1;
            System.out.printf("Resultado da diferença do número %s pelo número %s: %s", num2, num1, diferenca);
        } else {
            var subtracao = num1 - num2;
            System.out.printf("Resultado da diferença do número %s pelo número %s: %s", num1, num2, subtracao);
        }
    }
}
