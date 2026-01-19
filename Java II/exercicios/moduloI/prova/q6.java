package moduloI.prova;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Insira o valor da hora trabalhada: ");
        var valorHora = leitura.nextDouble();

        System.out.println("Informe o número de horas trabalhadas: ");
        var numHoras = leitura.nextDouble();

        System.out.println("Informe o número de dependentes do funcionário: ");
        var dependentes = leitura.nextInt();

        System.out.println("Informe a quantidade de horas extras trabalhadas: ");
        var horasExtras = leitura.nextDouble();

        var salarioMes = numHoras * valorHora;
        var extraDependentes = 132.0 * dependentes;
        var acrescHrExtra = valorHora + ((valorHora * 50) / 100);
        var calcHrExtra =  acrescHrExtra * horasExtras;
        var salarioBruto = salarioMes + extraDependentes + calcHrExtra;
        
        double imposto = 0;
        if (salarioBruto < 1000.0) {
            imposto = 0;
        } else if (salarioBruto >= 1000.0 && salarioBruto <= 5000.0) {
            imposto = 10;
        } else if (salarioBruto > 5000.0) {
            imposto = 20;
        }

        var salarioFinal = salarioBruto - ((salarioBruto * imposto) / 100);

        System.out.printf("""
                Cálculo do salário a receber:
                
                Salário do mês: R$ %.2f
                Extra por dependentes: R$ %.2f
                Valor horas extras: R$ %.2f
                Salário bruto: R$ %.2f
                Salário final a receber: R$ %.2f
                
                """, salarioMes, extraDependentes, calcHrExtra, salarioBruto, salarioFinal);
    }
}
