package moduloI;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Insira a nota do trabalho de laboratório: ");
        var primeira = leitura.nextDouble();

        System.out.println("Insira a nota da avaliação semestral: ");
        var segunda = leitura.nextDouble();

        System.out.println("Insira a nota do exame final: ");
        var terceira = leitura.nextDouble();

        var media = (primeira + segunda + terceira) / 3;
        System.out.println("Média: " + media);

        System.out.println("Conceito: ");
        if (media >= 8.0 && media <= 10.0) {
            System.out.println("A");
        } else if (media >= 7.0 && media < 8.0) {
            System.out.println("B");
        } else if (media >= 6.0 && media < 7.0) {
            System.out.println("C");
        } else if (media >= 5.0 && media < 6.0) {
            System.out.println("D");
        } else if (media >= 0.0 && media < 5.0) {
            System.out.println("E");
        }
    }
}
