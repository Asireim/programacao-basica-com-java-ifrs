package moduloIII;

import java.util.Scanner;

public class Concurso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] respostas = new char[10][10];
        char[] gabarito = new char[10];
        int[] pontos = new int[10];

        System.out.println("Digite as respostas dos 10 candidatos:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Candidato " + (i + 1) + ":");
            for (int j = 0; j < 10; j++) {
                System.out.print("Questão " + (j + 1) + ": ");
                respostas[i][j] = sc.next().toUpperCase().charAt(0);
            }
        }

        System.out.println("\nDigite o gabarito:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Questão " + (i + 1) + ": ");
            gabarito[i] = sc.next().toUpperCase().charAt(0);
        }

        for (int i = 0; i < 10; i++) {
            int acertos = 0;
            for (int j = 0; j < 10; j++) {
                if (respostas[i][j] == gabarito[j]) {
                    acertos++;
                }
            }
            pontos[i] = acertos;
        }

        System.out.println("\nPontuação dos candidatos:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Candidato " + (i + 1) + ": " + pontos[i] + " pontos");
        }

        sc.close();
    }
}
