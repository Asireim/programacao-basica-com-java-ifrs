package exemplosI;

import java.util.Scanner;

public class MaiorDeVinteNotas {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        double maior = 0;
        double menor = 10;

        for (int cont = 1; cont <= 20; cont++) {
            System.out.println(cont + " - Insira a nota: ");
            var nota = leitura.nextDouble();

            if (nota > maior) {
                maior = nota;
            } else if (nota < menor) {
                menor = nota;
            }
        }

        System.out.println("A maior nota foi: " + maior);
        System.out.println("A menor nota foi: " + menor);
    }
}
