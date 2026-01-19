package moduloI.prova;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Informe o saldo médio do cliente: ");
        var saldoMedio = leitura.nextDouble();

        double percentual = 0;
        if (saldoMedio > 1000.0) {
            percentual = 30;
        } else if (saldoMedio > 800.0 && saldoMedio <= 1000.0) {
            percentual = 25;
        } else if (saldoMedio > 600.0 && saldoMedio <= 800.0) {
            percentual = 20;
        } else if (saldoMedio < 600.0) {
            percentual = 10;
        }

        var credito = saldoMedio + ((saldoMedio * percentual) / 100);
        var valTotal = credito + saldoMedio;

        System.out.printf("""
                Saldo médio: R$ %.2f
                Valor do crédito: R$ %.2f
                Valor total: R$ %.2f
                """, saldoMedio, credito, valTotal);
    }
}
