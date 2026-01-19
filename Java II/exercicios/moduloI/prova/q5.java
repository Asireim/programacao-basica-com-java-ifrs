package moduloI.prova;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Informe o salário bruto do funcionário: ");
        var salario = leitura.nextDouble();

        double imposto = salario - (salario * 7) / 100;

        double gratificacao = 0;
        if (imposto <= 1000.0) {
            gratificacao = imposto + 750.0;
        } else if (imposto > 1000.0 && imposto <= 2000.0) {
            gratificacao = imposto + 600.0;
        } else if (imposto > 2000.0 && imposto <= 3000.0) {
            gratificacao = imposto + 450;
        } else if (imposto > 3000.0) {
            gratificacao = imposto + 300.0;
        }

        System.out.printf("""
                Salário inicial: R$ %.2f
                Salário com desconto do imposto: R$ %.2f
                Salário com desconto + gratificação: R$ %.2f
                """, salario, imposto, gratificacao);
    }
}
