package moduloI;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        int opcao = 0;

        do {
            if (opcao != 3) {
                System.out.printf("""
                Menu de opções:
                
                1. Média Aritmética
                2. Média ponderada
                3. Sair
                """);
                opcao = leitura.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Insira a primeira nota: ");
                        var nota1 = leitura.nextDouble();

                        System.out.println("Insira a segunda nota: ");
                        var nota2 = leitura.nextDouble();

                        var somaNotas = nota1 + nota2;
                        var mediaNotas = somaNotas / 2;

                        System.out.printf("A média aritmética das notas informadas é: %.1f%n", mediaNotas);
                        break;
                    case 2:
                        System.out.println("Insira a primeira nota: ");
                        var nota3 = leitura.nextDouble();

                        System.out.println("Informe o peso da primeira nota: ");
                        var peso1 = leitura.nextInt();

                        System.out.println("Insira a segunda nota: ");
                        var nota4 = leitura.nextDouble();

                        System.out.println("Informe o peso da segunda nota: ");
                        var peso2 = leitura.nextInt();

                        System.out.println("Insira a terceira nota: ");
                        var nota5 = leitura.nextDouble();

                        System.out.println("Informe o peso da terceira nota: ");
                        var peso3 = leitura.nextInt();

                        var mediaPonderada = (nota3 * peso1 + nota4 * peso2 + nota5 * peso3) /
                                (peso1 + peso2 + peso3);;

                        System.out.printf("A média ponderada das notas informadas é: %.1f%n", mediaPonderada);
                        break;
                    case 3:
                        System.out.println("Encerrando aplicação...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            }
        } while (opcao != 3);




    }
}
