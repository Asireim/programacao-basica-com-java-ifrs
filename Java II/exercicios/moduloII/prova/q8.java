package moduloII.prova;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Insira o número de estudantes: ");
        var nro_estudantes = leitura.nextInt();

        int soma = 0;
        int notasLidas = 0;

        while (notasLidas < nro_estudantes) {
            System.out.println("Informe a nota: ");
            var nota = leitura.nextDouble();

            soma += nota;
            notasLidas++;
        }

        var media = soma / nro_estudantes;
        System.out.println("A média é: " + media);
    }
}
