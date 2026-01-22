package exemplosI;

import java.util.Scanner;

public class MaiorDeDoisNumerosComEstruturasAninhadas {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        var num1 = leitura.nextInt();

        System.out.println("Informe o segundo número: ");
        var num2 = leitura.nextInt();

        if (num1 > num2) {
            System.out.println(num1);
        } else if (num2 > num1){
            System.out.println(num2);
        } else {
            System.out.println("Os números são iguais.");
        }
    }
}
