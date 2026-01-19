package moduloIII.prova;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.print("Número: ");
        var numero = leitura.nextInt();

        int fatorial = 1;
        for(int valor = 2; valor <= numero; valor++){
            fatorial *= valor;
            System.out.printf("Fatorial = %d\n", fatorial);
        }
    }
}
