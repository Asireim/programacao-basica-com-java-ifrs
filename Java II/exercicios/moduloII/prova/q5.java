package moduloII.prova;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.print("Informe o ano atual: ");
        var anoAtual = leitura.nextInt();

        double salario = 1000;
        int ano = 2016;
        double percentual = 0.005;

        while (ano <= anoAtual) {
            salario += percentual * salario;
            ano++;
            percentual = percentual * 2;
        }

        System.out.printf("\nSalario do funcionario no ano atual = R$ %.2f\n", salario);
    }
}
