package moduloIII;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.printf("""
                Menu de opções:
                
                1. Somar dois números.
                2. Número ao quadrado.
                
                Digite a opção desejada:
                """);
        var opcao = leitura.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Informe o primeiro número para a soma: ");
                var num1 = leitura.nextInt();

                System.out.println("Informe o segundo número para a soma: ");
                var num2 = leitura.nextInt();

                var soma = num1 + num2;
                System.out.println("A soma dos números informados resulta em: " + soma);
                break;
            case 2:
                System.out.println("Informe um número para saber o quadrado dele: ");
                var num3 = leitura.nextInt();

                var quadrado = num3 * num3;
                System.out.println("O quadrado do número informado é: " + quadrado);
                break;
        }
    }
}
