package moduloIII;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Insira o número da placa (4 dígitos): ");
        var placa = leitura.nextInt();

        var numero = placa % 10;

        switch (numero) {
            case 0:
                System.out.println("Realizar a vistoria em Janeiro do próximo ano.");
                break;
            case 1:
                System.out.println("Realizar a vistoria em Fevereiro do próximo ano.");
                break;
            case 2:
                System.out.println("Realizar a vistoria em Março do próximo ano.");
                break;
            case 3:
                System.out.println("Realizar a vistoria em Abril do próximo ano.");
                break;
            case 4:
                System.out.println("Realizar a vistoria em Maio do próximo ano.");
                break;
            case 5:
                System.out.println("Realizar a vistoria em Junho do próximo ano.");
                break;
            case 6:
                System.out.println("Realizar a vistoria em Setembro do próximo ano.");
                break;
            case 7:
                System.out.println("Realizar a vistoria em Outubro do próximo ano.");
                break;
            case 8:
                System.out.println("Realizar a vistoria em Novembro do próximo ano.");
                break;
            case 9:
                System.out.println("Realizar a vistoria em Dezembro do próximo ano.");
                break;
        }
    }
}
