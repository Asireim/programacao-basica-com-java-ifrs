package moduloI;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        int cont = 0, voto = 1, candidato1 = 0, candidato2 = 0, candidato3 = 0, candidato4 = 0, votoNulo = 0, votoBranco = 0;

        do {
            if (voto != 0) {
                System.out.printf("""
                Insira o código correspondente ao candidato desejado:
                
                1 - Candidato 1
                2 - Candidato 2
                3 - Candidato 3
                4 - Candidato 4
                5 - Voto nulo
                6 - Voto em branco
                
                0 - Finalizar Aplicação
                """);
                voto = leitura.nextInt();

                switch (voto) {
                    case 1:
                        candidato1++;
                        break;
                    case 2:
                        candidato2++;
                        break;
                    case 3:
                        candidato3++;
                        break;
                    case 4:
                        candidato4++;
                        break;
                    case 5:
                        votoNulo++;
                        break;
                    case 6:
                        votoBranco++;
                        break;
                    case 0:
                        System.out.println("Encerrando aplicação.");
                        break;
                    default:
                        System.out.println("Voto inválido!");
                        break;
                }

                if (voto >= 1 && voto <= 6) {
                    cont++;
                }
            }

        } while (voto != 0);

        double porcentagemNulos = (votoNulo * 100.0) / cont;
        double porcentagemBrancos = (votoBranco * 100.0) / cont;

        System.out.printf("""
                Total de votos para cada candidato:
                Candidato 1 - %d
                Candidato 2 - %d
                Candidato 3 - %d
                Candidato 4 - %d
                
                Total de votos nulos: %d
                Total de votos em branco: %d
                Percentagem de votos nulos sobre o total de votos: %.2f
                Percentagem de votos em branco sobre o total de votos: %.2f
                """, candidato1, candidato2, candidato3, candidato4, votoNulo, votoBranco, porcentagemNulos, porcentagemBrancos);
    }
}
