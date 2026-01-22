package moduloI;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int notas50 = 100;
        int notas10 = 100;
        int notas5  = 100;
        int notas1  = 100;

        int saques = 0;

        while (saques < 100) {
            System.out.print("Digite o valor do saque (negativo para sair): ");
            int valor = leitura.nextInt();

            if (valor < 0) {
                break;
            }

            if (valor > 1000) {
                System.out.println("Valor máximo permitido é B$ 1000.");
                continue;
            }

            int restante = valor;

            int usa50 = Math.min(restante / 50, notas50);
            restante -= usa50 * 50;

            int usa10 = Math.min(restante / 10, notas10);
            restante -= usa10 * 10;

            int usa5 = Math.min(restante / 5, notas5);
            restante -= usa5 * 5;

            int usa1 = Math.min(restante, notas1);
            restante -= usa1;

            if (restante != 0) {
                System.out.println("Saque não permitido por falta de notas.");
                continue;
            }

            notas50 -= usa50;
            notas10 -= usa10;
            notas5  -= usa5;
            notas1  -= usa1;

            System.out.println("Saque realizado com:");
            if (usa50 > 0) System.out.println(usa50 + " nota(s) de B$ 50");
            if (usa10 > 0) System.out.println(usa10 + " nota(s) de B$ 10");
            if (usa5 > 0)  System.out.println(usa5 + " nota(s) de B$ 5");
            if (usa1 > 0)  System.out.println(usa1 + " nota(s) de B$ 1");

            saques++;
            System.out.println();
        }

        System.out.println("=== RELATÓRIO FINAL ===");
        System.out.println("Restam " + notas50 + " notas de B$ 50");
        System.out.println("Restam " + notas10 + " notas de B$ 10");
        System.out.println("Restam " + notas5  + " notas de B$ 5");
        System.out.println("Restam " + notas1  + " notas de B$ 1");
    }
}
