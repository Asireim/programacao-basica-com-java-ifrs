package exemplosIII;

import java.util.Scanner;

public class MediaParaFaca {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Informe o número de estudantes: ");
        var nro_estudantes = leitura.nextInt();

        int soma = 0;
        int notasLidas;

        for (notasLidas = 0; notasLidas <= nro_estudantes -1; notasLidas++) {
            System.out.println("Informe a nota: ");
            var nota = leitura.nextDouble();

            soma += nota;
        }

        var media = soma / nro_estudantes;
        System.out.println("A média é: " + media);
    }
}
