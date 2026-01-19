package exemplosII;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Insira o número de estudantes da turma: ");
        var estudantes = leitura.nextInt();

        var totalEstudantes = estudantes;

        double soma = 0;
        int cont = 1;
        while (estudantes > 0) {

            System.out.println("Estudante " + cont + " - " + "Insira a nota: ");
            var nota = leitura.nextDouble();

            soma += nota;
            estudantes --;
            cont++;
        }

        var media = soma / totalEstudantes;
        System.out.println("A média final dos estudantes é: " + media);
    }
}
