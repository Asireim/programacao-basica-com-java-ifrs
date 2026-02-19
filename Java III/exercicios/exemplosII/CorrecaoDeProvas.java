package exemplosII;

import java.util.Scanner;

public class CorrecaoDeProvas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] gabarito = new char[8];
        int cont, nroMatr, numResp, pontos, aprovados = 0;
        char resposta;

        System.out.println("Digite o gabarito da prova (8 questões):");
        for (cont = 0; cont < 8; cont++) {
            System.out.print("Questão " + (cont + 1) + ": ");
            gabarito[cont] = scanner.next().charAt(0);
        }

        for (cont = 0; cont < 10; cont++) {

            System.out.print("\nDigite o número da matrícula do aluno: ");
            nroMatr = scanner.nextInt();

            pontos = 0;

            for (numResp = 0; numResp < 8; numResp++) {
                System.out.print("Resposta da questão " + (numResp + 1) + ": ");
                resposta = scanner.next().charAt(0);

                if (resposta == gabarito[numResp]) {
                    pontos++;
                }
            }

            System.out.println("Matrícula: " + nroMatr + " | Pontos: " + pontos);

            if (pontos >= 6) {
                aprovados++;
            }
        }

        System.out.println("\nTotal de aprovados: " + aprovados);
    }
}
