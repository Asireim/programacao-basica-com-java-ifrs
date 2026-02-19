package moduloI.prova;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.print("Nota na prova 1: ");
        double prova1 = leitura.nextDouble();
        System.out.print("Nota na prova 2: ");
        double prova2 = leitura.nextDouble();
        System.out.print("Nota na prova 3: ");
        double prova3 = leitura.nextDouble();

        var media = (prova1 + prova2 + prova3) / 3;
        System.out.printf("A média do aluno foi: %.1f", media);

        if (media >= 7) {
            System.out.println("O aluno foi aprovado.");
        } else {
            System.out.println("O aluno ficou em exame.");

            System.out.println("Informe a nota do exame: ");
            var notaFinal = leitura.nextDouble();

            var mediaFinal = (media + notaFinal) / 2;
            System.out.printf("A média final do aluno foi: %.1f", notaFinal);

            if (notaFinal >= 5) {
                System.out.println("O aluno foi aprovado.");
            } else {
                System.out.println("O estudante foi reprovado.");
            }
        }
    }
}
