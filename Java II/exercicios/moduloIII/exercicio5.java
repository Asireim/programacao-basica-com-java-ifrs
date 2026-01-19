package moduloIII;

import java.util.Scanner;

//exercicio5 moduloII
public class exercicio5 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Informe a quantidade de litros de combustível: ");
        var combustivel = leitura.nextDouble();

        System.out.println("Informe a distância percorrida pelo carro: ");
        var distancia = leitura.nextDouble();

        System.out.println("Informe a quantidade de viagens realizadas: ");
        var viagens = leitura.nextInt();

        var calculo = distancia / combustivel;
        var media = calculo / viagens;

        System.out.println("O consumo médio do carro foi de: " + media);
    }
}
