package moduloI;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        var num1 = leitura.nextInt();

        System.out.println("Informe o segundo valor: ");
        var num2 = leitura.nextInt();

        System.out.println("Informe o terceiro valor: ");
        var num3 = leitura.nextInt();

        System.out.println("Maior número: ");
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println(num3);
        }
    }
}
