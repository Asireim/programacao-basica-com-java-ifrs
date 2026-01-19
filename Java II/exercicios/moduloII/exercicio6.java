package moduloII;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        double faturamento = 0;

        int finalizar = 1;
        while (finalizar != 0) {
            System.out.println("Informe o nome da mercadoria: ");
            var mercadoria = leitura.nextLine();

            System.out.println("Informe o preço unitário desta mercadoria: ");
            var unitario = leitura.nextDouble();
            leitura.nextLine();

            System.out.println("Informe a quantidade total vendida no mês: ");
            var quantidade = leitura.nextInt();
            leitura.nextLine();

            System.out.printf("""
                Deseja finalizar o registro?
                0 = Sim
                1 = Não
                """);
            finalizar = leitura.nextInt();
            leitura.nextLine();

            var calculo = unitario * quantidade;
            faturamento += calculo;
        }

        System.out.printf("O faturamento total mensal do armazém é: R$ %.2f", faturamento);
    }
}
