package exemplosII;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Informe o número a transformar em fatorial: ");
        var numero = leitura.nextInt();

        int fatorial = 1;
        int valor = 2;

        while (valor <= numero) {
            fatorial *= valor;
            valor += 1;
        }

        System.out.println("O fatorial é: " + fatorial);
    }
}
