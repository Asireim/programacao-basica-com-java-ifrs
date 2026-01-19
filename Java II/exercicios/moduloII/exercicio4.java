package moduloII;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Insira a idade: ");
        var idade = leitura.nextInt();

        var soma = idade;

        int cont = 0;
        while (idade != 0) {
            System.out.println("Insira a idade: ");
            idade = leitura.nextInt();

            soma += idade;
            cont++;
        }

        var media = soma / cont;
        System.out.println("A média das idades informadas é: " + media);
    }
}
