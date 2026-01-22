package moduloI;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        int opcao = 0, meses = 0;

        do {
            System.out.printf("""
                %nMenu de opções:
                
                1. Novo salário
                2. Férias
                3. Décimo terceiro
                4. Sair
                
                """);
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Insira o salário do funcionário: ");
                    var salario = leitura.nextDouble();

                    double aumento = 0;

                    if (salario <= 1000.0) {
                        aumento = (15.0 / 100.0) * salario;
                    } else if (salario >= 1000.01 && salario <= 3000.0) {
                        aumento = (10.0 / 100.0) * salario;
                    } else if (salario > 3000.0) {
                        aumento = (5.0 / 100.0) * salario;
                    }

                    var novoSalario = salario + aumento;

                    System.out.printf("Novo salário: R$ %.2f", novoSalario);
                    break;
                case 2:
                    System.out.println("Insira o salário do funcionário: ");
                    salario = leitura.nextDouble();

                    var tercoSal = salario / 3;
                    var ferias = salario + tercoSal;

                    System.out.printf("Valor das férias: R$ %.2f%n", ferias);
                    break;
                case 3:
                    if (meses <= 12) {
                        System.out.println("Insira o salário do funcionário: ");
                        salario = leitura.nextDouble();

                        System.out.println("Informe quantos meses você trabalha na empresa: ");
                        meses = leitura.nextInt();

                        var decimo = (salario * meses) / 12;

                        System.out.printf("O valor do décimo terceiro salário deste funcionário é: R$ %.2f%n", decimo);
                    } else {
                        System.out.println("O número máximo de meses trabalhados deve ser 12!%n");
                    }
                    break;
                case 4:
                    System.out.println("Encerrando aplicação...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 4);


    }
}
