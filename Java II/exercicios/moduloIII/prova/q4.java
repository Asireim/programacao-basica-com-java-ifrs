package moduloIII.prova;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        int resultado = 0;

        System.out.print("Numero 1: ");
        var num1 = leitura.nextInt();

        System.out.print("Numero 2: ");
        var num2 = leitura.nextInt();

        System.out.print("Digite 1 para somar ou 2 para multiplicar: ");
        var opcao = leitura.nextInt();

        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 * num2;
                break;
            default:
                System.out.println("Opção inválida!");
        }

        if(opcao == 1 || opcao == 2) {
            System.out.printf("Resultado = %d\n", resultado);
        }
    }
}
