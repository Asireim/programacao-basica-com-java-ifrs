package moduloI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Insira o primeiro valor: ");
        var primeiro = leitura.nextInt();

        System.out.println("Insira o segundo valor: ");
        var segundo = leitura.nextInt();

        System.out.println("Insira o terceiro valor: ");
        var terceiro = leitura.nextInt();

        System.out.println("Insira o quarto valor: ");
        var quarto = leitura.nextInt();

        List<Integer> numeros = new ArrayList<>();
        numeros.add(primeiro);
        numeros.add(segundo);
        numeros.add(terceiro);
        numeros.add(quarto);

        System.out.println("Dos números informados, apenas os seguintes são divisíveis por 2 e 3 ao mesmo tempo: ");
        for (int numero : numeros) {
            if (numero % 2 == 0 && numero % 3 == 0) {
                System.out.println(numero);
            }
        }
    }
}
