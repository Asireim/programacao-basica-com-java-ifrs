package exemplosI;

import java.util.Scanner;

public class EstatisticasCinema {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        int a = 0, b = 0, c = 0, d = 0, e = 0, idadeD = 0, idadeE = 0;

        for (int cont = 1; cont <= 100; cont++) {
            System.out.println("Informe sua idade: ");
            var idade = leitura.nextInt();
            leitura.nextLine();

            System.out.println("Informe a nota (A, B, C, D ou E): ");
            var nota = leitura.nextLine();

            if (nota.equalsIgnoreCase("a")) {
                a++;
            } else if (nota.equalsIgnoreCase("b")) {
                b++;
            } else if (nota.equalsIgnoreCase("c")) {
                c++;
            } else if (nota.equalsIgnoreCase("d")) {
                d++;
                idadeD += idade;
            } else if (nota.equalsIgnoreCase("e")) {
                e++;

                 if (idade > idadeE) {
                     idadeE = idade;
                 }
            }
        }

        var mediaD = idadeD / d;
        var porcentagem = ((e / 100) * 100);

        System.out.printf("""
                Quantidade de respostas "Ótimo": %d
                Média de idade das pessoas que responderam “Ruim”: %d
                Porcentagem de respostas “Péssimo”: %d
                Maior idade que utilizou essa opção: %d
                """, a, mediaD, porcentagem, idadeE);
    }
}
