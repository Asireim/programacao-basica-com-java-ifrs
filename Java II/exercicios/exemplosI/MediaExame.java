package exemplosI;

import java.util.Scanner;

public class MediaExame {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Insira a primeira nota: ");
        var n1 = leitura.nextDouble();

        System.out.println("Insira a segunda nota: ");
        var n2 = leitura.nextDouble();

        System.out.println("Insira a terceira nota: ");
        var n3 = leitura.nextDouble();

        var media = (n1 + n2 + n3) / 3;
        System.out.println("A média do aluno é: " + media);

        if (media >= 0.0 && media <= 3.0) {
            System.out.println("Reprovado!");
        } else if (media >= 3.0 && media <= 7.0) {
            System.out.println("Exame!");
            System.out.println("É necessário tirar no mínimo " + (12 - media) + " para ser aprovado no exame!");
        } else if (media > 7.0) {
            System.out.println("Aprovado!");
        }
    }
}
