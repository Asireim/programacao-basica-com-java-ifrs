package moduloI;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        int cont, a = 0, b = 0, c = 0, d = 0, e = 0;
        double conceitoA = 0, conceitoB = 0, conceitoC = 0, conceitoD = 0, conceitoE = 0;

        for (cont = 1; cont <= 75; cont++) {
            System.out.println("Aluno " + cont + " - Informe a nota final: ");
            var nota = leitura.nextDouble();

            System.out.println("Informe o código do aluno: ");
            var codigo = leitura.nextLine();
            leitura.nextLine();

            if (nota >= 0.0 && nota <= 2.9) {
                conceitoE += nota;
                e++;
            } else if (nota >= 3.0 && nota <= 4.9) {
                conceitoD += nota;
                d++;
            } else if (nota >= 5.0 && nota <= 6.9) {
                conceitoC += nota;
                c++;
            } else if (nota >= 7.0 && nota <= 8.9) {
                conceitoB += nota;
                b++;
            } else if (nota >= 9.0 && nota <= 10.0) {
                conceitoA += nota;
                a++;
            }
        }

        var mediaA = conceitoA / a;
        var mediaB = conceitoB / b;
        var mediaC = conceitoC / c;
        var mediaD = conceitoD / d;
        var mediaE = conceitoE / e;

        System.out.printf("""
        Quantidade de alunos: %d
        Média de nota alcançada para cada conceito:
        
        A: %.1f
        B: %.1f
        C: %.1f
        D: %.1f
        E: %.1f
        """, cont, mediaA, mediaB, mediaC, mediaD, mediaE);
    }
}
