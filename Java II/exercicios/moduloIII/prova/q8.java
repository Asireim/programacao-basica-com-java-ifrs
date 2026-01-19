package moduloIII.prova;

import java.util.Scanner;

public class q8 {
    public static void  main(String[] args) {
        var leitura = new Scanner(System.in);

        int numero;

        do  {
            System.out.print("Digite um número inteiro entre 1 e 10: ");
            numero = leitura.nextInt();
        }  while(numero != 8);

        System.out.println("Você acertou o número!");
    }
}
