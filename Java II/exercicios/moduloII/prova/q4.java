package moduloII.prova;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        int soma = 0;
        int notaslidas = 0;

        System.out.println("Informe o número de estudantes: ");
        var nro_estudantes = leitura.nextInt();

        while (notaslidas < nro_estudantes) {
            System.out.println("Informe a nota: ");
            var nota = leitura.nextInt();

            soma += nota;
            notaslidas += 1;
        }

        double media = (double) soma / nro_estudantes;
        System.out.println("A média é: " + media);
    }
}
