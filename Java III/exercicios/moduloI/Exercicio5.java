package moduloI;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        int opcao = 2, somaIdade = 0, cont = 0, somaPeso = 0, somaAltura = 0, masculino = 0, feminino = 0, azuisRuivos = 0;
        double percentualMasc = 0, percentualFem = 0;

        do {
            if (opcao > 0) {
                cont++;
                System.out.println("Insira o sexo (F ou M): ");
                var sexo = leitura.nextLine();

                System.out.printf("""
                        Informe a cor dos olhos:
                        
                        1 - Azuis
                        2 - Verdes
                        3 - Castanhos
                        """);
                var olhos = leitura.nextInt();
                leitura.nextLine();

                System.out.printf("""
                        Informe a cor dos cabelos:
                        
                        L - louros
                        C - castanhos
                        P - pretos
                        R - ruivos
                        """);
                var cabelos = leitura.nextLine();

                System.out.println("Informe a sua idade: ");
                var idade = leitura.nextInt();

                System.out.println("Informe sua altura (cm): ");
                var altura = leitura.nextInt();

                System.out.println("Informe seu peso (kg): ");
                var peso = leitura.nextInt();

                if (sexo.equalsIgnoreCase("M")) {
                    masculino++;
                } else if (sexo.equalsIgnoreCase("F")) {
                    feminino++;
                }

                if (olhos == 1 && cabelos.equalsIgnoreCase("R")) {
                    azuisRuivos++;
                }

                somaIdade += idade;
                somaPeso += peso;
                somaAltura += altura;
                percentualMasc = (masculino * 100.0) / cont;
                percentualFem = (feminino * 100.0) / cont;

                System.out.printf("""
                Deseja inserir mais dados?
                
                0 - Não
                1 - Sim
                """);
                opcao = leitura.nextInt();
                leitura.nextLine();
            }
        } while (opcao > 0);

        var mediaIdade = somaIdade / cont;
        var mediaPeso = somaPeso / cont;
        var mediaAltura = somaAltura / cont;

        System.out.printf("""
                Média da idade dos participantes: %d
                Média do peso de seus habitantes: %d
                Média da altura de seus habitantes: %d
                Porcentagem de pessoas do sexo feminino: %.2f
                Porcentagem de pessoas do sexo masculino: %.2f
                Quantas pessoas possuem olhos azuis e cabelos ruivos: %d
                """, mediaIdade, mediaPeso, mediaAltura, percentualFem, percentualMasc, azuisRuivos);

    }
}
