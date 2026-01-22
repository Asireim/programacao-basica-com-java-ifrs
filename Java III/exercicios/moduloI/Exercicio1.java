package moduloI;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        int idade, cont = 0, maiorIdade = 0, menorIdade = 1000, mulherSalario = 0, idadeMenorSalario = 0;
        double salario = 0 , somaSalario = 0, menorSalario = 1000000000;
        String sexoMenorSalario = "";

        System.out.println("Informe uma idade negativa para encerrar a aplicação.");

        do {
            System.out.println("Informe sua idade: ");
            idade = leitura.nextInt();
            leitura.nextLine();

            if (idade > 0) {
                if (idade > maiorIdade) {
                    maiorIdade = idade;
                } else if (idade < menorIdade) {
                    menorIdade = idade;
                }

                System.out.println("Informe seu sexo (F ou M): ");
                var sexo = leitura.nextLine();

                System.out.println("Informe seu salário: ");
                salario = leitura.nextDouble();
                leitura.nextLine();
                somaSalario += salario;

                if (salario < menorSalario) {
                    menorSalario = salario;
                    idadeMenorSalario = idade;
                    sexoMenorSalario = sexo;
                }

                if (salario <= 1500.0 && sexo.equalsIgnoreCase("F")) {
                    mulherSalario++;
                }

                cont++;
            }
        } while (idade > 0);

        var mediaSalario = somaSalario / cont;

        System.out.printf("""
                A média dos salários do grupo é: R$ %.2f
                A maior idade do grupo é: %d
                A menor idade do grupo é: %d
                A quantidade de mulheres com salário até R$ 1500,00 é: %d
                A idade e o sexo da pessoa que possui o menor salário: %d, %s
                """, mediaSalario, maiorIdade, menorIdade, mulherSalario, idadeMenorSalario, sexoMenorSalario);
    }
}
