package moduloI;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Informe um número inteiro maior que 1: ");
        var numero = leitura.nextInt();

        boolean primo = true;

        if (numero <= 1) {
            primo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.println("O número é primo.");
        } else {
            System.out.println("O número NÃO é primo.");
        }
    }
}
