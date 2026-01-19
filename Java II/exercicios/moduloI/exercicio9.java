package moduloI;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Informe o valor do salário: ");
        var salario = leitura.nextDouble();

        double reajuste = 0;
        if (salario < 5000.0) {
            reajuste = salario + ((salario * 30) / 100);
        }

        System.out.printf("""
                Salário inicial: R$ %.2f
                Salário reajustado: R$ %.2f
                """, salario, reajuste);
    }
}
