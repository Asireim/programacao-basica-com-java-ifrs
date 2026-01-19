package exemplosIII;

import java.util.Scanner;

public class NumeroExtenso {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Informe um número de 0 a 9: ");
        var numero = leitura.nextInt();

        switch (numero) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Três");
                break;
            case 4:
                System.out.println("Quatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            case 6:
                System.out.println("Seis");
                break;
            case 7:
                System.out.println("Sete");
                break;
            case 8:
                System.out.println("Oito");
                break;
            case 9:
                System.out.println("Nove");
                break;
            default:
                System.out.println("Número inválido.");
                break;
        }


    }
}
