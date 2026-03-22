package moduloIII;

import java.util.Scanner;

public class AlunosNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[15];
        double[][] notas = new double[15][5];

        // Leitura dos nomes
        for (int i = 0; i < 15; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
        }

        // Leitura das notas
        for (int i = 0; i < 15; i++) {
            System.out.println("\nNotas do aluno " + nomes[i] + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Prova " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
            }
        }

        // Cálculo e exibição dos resultados
        System.out.println("\nResultados:");
        for (int i = 0; i < 15; i++) {
            double soma = 0;

            for (int j = 0; j < 5; j++) {
                soma += notas[i][j];
            }

            double media = soma / 5;
            String situacao;

            if (media >= 7) {
                situacao = "Aprovado";
            } else if (media < 2) {
                situacao = "Reprovado";
            } else {
                situacao = "Exame";
            }

            System.out.printf("Aluno: %s | Média: %.2f | Situação: %s\n",
                    nomes[i], media, situacao);
        }

        sc.close();
    }
}
