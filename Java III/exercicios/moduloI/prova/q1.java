package moduloI.prova;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        int somaIdade = 0, peso90alt150 = 0, idade1030 = 0, altura190 = 0;

        for (int cont = 1; cont <= 10; cont++) {
            System.out.println("Informe a sua idade: ");
            var idade = leitura.nextInt();

            System.out.println("Informe o seu peso: ");
            var peso = leitura.nextDouble();

            System.out.println("Informe sua altura (cm): ");
            var altura = leitura.nextInt();

            somaIdade += idade;

            if (peso > 90 && altura < 150) {
                peso90alt150++;
            }

            if (altura > 190) {
                altura190++;

                if (idade >= 10 && idade <= 30) {
                    idade1030++;
                }
            }


        }

        var mediaIdade = somaIdade / 10;

        double percentual = 0;

        if (altura190 > 0) {
            percentual = (idade1030 / (double) altura190) * 100;
        }


        System.out.printf("""
                Média de idades das dez pessoas: %d
                Quantidade de pessoas com peso superior a 90 quilos e altura inferior a 1,50 metro: %d
                Percentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1,90 metros: %.1f
                """, mediaIdade, peso90alt150, percentual);
    }
}
