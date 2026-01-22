package moduloI;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        double imposto = 0, inss = 0, salarioLiq, totalSalarios = 0, totalImpostos = 0;

        for (int cont = 1; cont <= 58; cont++) {
            System.out.println("Funcionário " + cont + " - Informe o salário:");
            var salario = leitura.nextDouble();

            if (salario > 1903.98 && salario <= 2826.65) {
                imposto = ((7.5 / 100) * salario);
            } else if (salario > 2826.66 && salario <= 3751.05) {
                imposto = (((double) 15 / 100) * salario);
            } else if (salario > 3751.06 && salario <= 4664.68) {
                imposto = ((22.5 / 100) * salario);
            } else if (salario > 4664.68) {
                imposto = ((27.5 / 100) * salario);
            }

            if (salario <= 1693.72) {
                inss = (((double) 8 / 100) * salario);
            } else if (salario > 1693.73 && salario <= 2822.90) {
                inss = (((double) 9 / 100) * salario);
            } else if (salario > 2822.90) {
                inss = (((double) 11 / 100) * salario);
            }

            var planoSaude = ((4.5 / 100) * salario);
            salarioLiq = salario - imposto - inss - planoSaude;
            totalSalarios += salarioLiq;
            totalImpostos += imposto;

            System.out.printf("Salário líquido: R$ %.2f%n", salarioLiq);
        }

        System.out.printf("""
                Valor total da folha de pagamento (soma dos salários de todos
                os funcionários): R$ %.2f
                Valor total do imposto de renda que a empresa deverá
                recolher: R$ %.2f
                """, totalSalarios, totalImpostos);
    }
}
