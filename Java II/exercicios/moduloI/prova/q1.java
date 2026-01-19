package moduloI.prova;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Insira o preço do produto: ");
        var preco = leitura.nextDouble();

        double aumento = 0;
        if (preco < 50.0) {
            aumento = preco + ((preco * 5) / 100);
        } else if (preco >= 50.0 && preco <= 100.0) {
            aumento = preco + ((preco * 10) / 100);
        } else if (preco > 100.0) {
            aumento = preco + ((preco * 15) / 100);
        }

        String classificacao = "";
        if (aumento <= 80.0) {
            classificacao = "Barato.";
        } else if (aumento > 80.0 && aumento <= 120.0) {
            classificacao = "Normal.";
        } else if (aumento > 120.0 && aumento <= 200.0) {
            classificacao = "Caro.";
        } else if (aumento > 200.0) {
            classificacao = "Muito Caro.";
        }

        System.out.printf("""
                Preço inicial: R$ %.2f
                Preço c/ aumento: R$ %.2f
                Classificação: %s
                """, preco, aumento, classificacao);
    }
}
