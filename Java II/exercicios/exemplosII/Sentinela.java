package exemplosII;

import java.util.Scanner;

public class Sentinela {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Digite um número negativo para sair.");

        double nota = 0;
        double soma = 0;
        int cont = 0;

        while (nota >= 0) {
            cont++;
            System.out.println("Estudante " + (cont) + " - " + "Informe a nota: ");
            nota = leitura.nextDouble();

            soma += nota;
        }
        cont--;
        soma -= nota;

        var media = soma / cont;
        System.out.printf("A média das notas dos alunos é: %.1f", media);
    }
}
