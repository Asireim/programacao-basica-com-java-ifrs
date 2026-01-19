package exemplosII;

import java.util.Scanner;

public class FuncaoFx {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Digite zero para sair.");

        double x;
        double fx;

        System.out.println("Informe o valor de x: ");
        x = leitura.nextDouble();

        while (x != 0) {
            fx = ((Math.pow(x,2)) - (5 * x) + 6);

            System.out.println(fx);

            System.out.println("Informe o valor de x: ");
            x = leitura.nextDouble();
        }
    }
}
