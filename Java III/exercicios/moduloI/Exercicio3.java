package moduloI;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        int encerrar = -1, feminino = 0, masculino = 0, somaIdadeHomens = 0, somaIdadeMulheresExp = 0;

        do {
            if (encerrar != 0) {
                System.out.println("Informe seu sexo (F ou M): ");
                var sexo = leitura.nextLine();

                System.out.println("Informe sua idade: ");
                var idade = leitura.nextInt();
                leitura.nextLine();

                System.out.println("Informe seu tempo de experiência profissional (em anos): ");
                var experiencia = leitura.nextInt();
                leitura.nextLine();

                if (sexo.equalsIgnoreCase("F")) {
                    feminino++;
                } else if (sexo.equalsIgnoreCase("M")) {
                    masculino++;
                    somaIdadeHomens += idade;
                }

                if (sexo.equalsIgnoreCase("F") && experiencia > 0) {
                    somaIdadeMulheresExp += idade;
                }

                System.out.printf("""
                    Quer encerrar a aplicação?
                    
                    0 - Sim
                    1 - Não
                    """);
                encerrar = leitura.nextInt();
                leitura.nextLine();
            }
        } while (encerrar != 0);

        var mediaIdadeHomens = somaIdadeHomens / masculino;
        var mediaIdadeMulheresExp = somaIdadeMulheresExp / feminino;

        System.out.printf("""
                Número de candidatos do sexo feminino: %d
                Número de candidatos do sexo masculino: %d
                Idade média dos homens: %d
                Idade média das mulheres com experiência: %d
                """, feminino, masculino, mediaIdadeHomens, mediaIdadeMulheresExp);

    }
}
