package moduloI;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        String acao = "";
        int lucroSuperior1000 = 0, lucroInferior200 = 0;

        System.out.println("Digite F para encerrar a aplicação.");

        do {
            System.out.println("Informe o tipo de ação (digite uma letra qualquer): ");
            acao = leitura.nextLine();

            if (!acao.equalsIgnoreCase("F")) {
                System.out.println("Informe o preço de compra: ");
                var precoCompra = leitura.nextDouble();
                leitura.nextLine();

                System.out.println("Informe o preço de venda: ");
                var precoVenda = leitura.nextDouble();
                leitura.nextLine();

                var lucro = precoVenda - precoCompra;

                if (lucro > 1000.0) {
                    lucroSuperior1000++;
                } else if (lucro < 200.0) {
                    lucroInferior200++;
                }
            }
        } while (!acao.equalsIgnoreCase("F"));

        System.out.printf("""
                Quantidade de ações com lucro superior a R$ 1.000,00: %d
                Quantidade de ações com lucro inferior a R$ 200,00: %d
                """, lucroSuperior1000, lucroInferior200);
    }
}
