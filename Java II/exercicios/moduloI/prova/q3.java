package moduloI.prova;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Insira o salário: ");
        var salario = leitura.nextDouble();

        double bonificacao = 0;
        if (salario <= 500.0) {
            bonificacao = salario + ((salario * 5) / 100);
        } else if (salario > 500.0 && salario <= 1200.0) {
            bonificacao = salario + ((salario * 12) / 100);
        }

        double auxilio = 0;
        if (bonificacao <= 600.0) {
            auxilio = bonificacao + 150.0;
        } else if (bonificacao > 600.0) {
            auxilio = bonificacao + 100.0;
        }

        System.out.printf("""
                Salário inicial: %.2f
                Salário com bonificação: %.2f
                Salário com auxílio escola: %.2f
                """, salario, bonificacao, auxilio);
    }
}
