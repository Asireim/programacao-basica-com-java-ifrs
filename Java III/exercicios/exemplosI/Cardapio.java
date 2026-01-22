package exemplosI;

import java.util.Scanner;

public class Cardapio {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        double imposto = 0;
        int opcao;

        do {
            System.out.printf("""
                Menu de opções:
                
                1 - Imposto
                2 - Novo Salário
                3 - Classificação
                4 - Finalizar o programa
                """);
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o valor do seu salário: ");
                    var salario = leitura.nextDouble();

                    if (salario < 1000.0) {
                        imposto = ((5.0 / 100) * salario);
                    } else if (salario >= 1000.0 && salario <= 3000.0) {
                        imposto = ((10.0 / 100) * salario);
                    } else if (salario > 3000.0) {
                        imposto = ((15.0 / 100) * salario);
                    }

                    System.out.printf("O salário com desconto de imposto fica: R$ %.2f%n", salario - imposto);
                    break;
                case 2:
                    System.out.println("Informe o valor do seu salário: ");
                    salario = leitura.nextDouble();

                    if (salario > 4500.0) {
                        salario += 45.0;
                    } else if (salario >= 2250.0 && salario <= 4500.0) {
                        salario += 150.0;
                    } else if (salario >= 1350.0 && salario <= 2249.99) {
                        salario += 225.0;
                    } else if (salario < 1350) {
                        salario += 300;
                    }

                    System.out.printf("O salário com o aumento fica: R$ %.2f%n", salario);
                    break;
                case 3:
                    System.out.println("Informe o valor do seu salário: ");
                    salario = leitura.nextDouble();

                    if (salario <= 1500.0) {
                        System.out.println("Mal remunerado.");
                    } else if (salario > 1500.0) {
                        System.out.println("Bem remunerado.");
                    }
                    break;
                case 4:
                    System.out.println("Finalizando aplicação...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 4);

    }
}
