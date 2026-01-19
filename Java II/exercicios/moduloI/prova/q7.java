package moduloI.prova;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Informe o custo de fábrica do carro: ");
        var custoFab = leitura.nextDouble();

        double distribuidor = 0;
        double impostos = 0;

        if (custoFab <= 25000.0) {
            distribuidor = ((custoFab * 5) / 100);
        } else if (custoFab > 25000.0 && custoFab <= 40000.0) {
            distribuidor = ((custoFab * 10) / 100);
            impostos = ((custoFab * 15) / 100);
        } else if (custoFab > 40000.0) {
            distribuidor = ((custoFab * 15) / 100);
            impostos = ((custoFab * 20) / 100);
        }
        var custoFinal = custoFab + distribuidor + impostos;

        System.out.printf("O custo final do veículo fica: R$ %.2f", custoFinal);
    }
}
