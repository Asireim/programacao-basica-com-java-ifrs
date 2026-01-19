package exemplosI;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Insira a primeira nota do semestre: ");
        var nota1 = leitura.nextDouble();

        System.out.println("Insira a segunda nota do semestre: ");
        var nota2 = leitura.nextDouble();

        System.out.println("Insira a terceira nota do semestre: ");
        var nota3 = leitura.nextDouble();

        var media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média de notas do semestre foi: " + media);

        if (media >= 7) {
            System.out.println("Você foi aprovado!");
        } else {
            System.out.println("Você foi reprovado!");
        }

    }
}
