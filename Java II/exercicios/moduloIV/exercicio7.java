package moduloIV;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        var primeiro = leitura.nextInt();

        System.out.println("Insira o segundo número: ");
        var segundo = leitura.nextInt();

        System.out.printf("""
                Selecione uma opção:
                
                1. O primeiro número elevado ao segundo número.
                2. Raiz quadrada de cada um dos números.
                3. Raiz cúbica de cada um dos números.
                """);
        var opcao = leitura.nextInt();

        if (opcao == 1) {
            System.out.printf("O número %d elevado pelo número %d é: %f", primeiro, segundo, Math.pow(primeiro, segundo));
        } else if (opcao == 2) {
            System.out.printf("""
                    A raíz quadrada do número %d é: %f
                    A raíz quadrada do número %d é: %f
                    """, primeiro, Math.sqrt(primeiro), segundo, Math.sqrt(segundo));
        } else if (opcao == 3) {
            System.out.printf("""
                    A raíz cúbica do número %d é: %f
                    A raíz cúbica do número %d é: %f
                    """, primeiro, Math.cbrt(primeiro), segundo, Math.cbrt(segundo));
        } else {
            System.out.println("Opção inválida!");
        }
    }
}
