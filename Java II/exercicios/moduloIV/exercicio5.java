package moduloIV;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Insira um número real (separado por vírgula): ");
        var real = leitura.nextDouble();

        System.out.println("Especifique o número de casas decimais: ");
        var casasDec = leitura.nextInt();

        var arredondado = Math.round(real * Math.pow(10, casasDec)) / Math.pow(10, casasDec);

        System.out.printf("O número %f arredondado para %d casas decimais fica: %f", real, casasDec, arredondado);
    }
}
