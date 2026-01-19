package moduloIII.prova;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.print("Digite o numero inteiro desejado: ");
        var numero = leitura.nextInt();

        for (int cont = 1; cont <= 10; cont++) {
            int mult = numero * cont;
            System.out.printf("%d x %d = %d\n", numero, cont, mult);
        }
    }
}
