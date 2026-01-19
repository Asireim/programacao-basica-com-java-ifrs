package exemplosIV;

import java.util.Scanner;

public class CalculoMedidaEscada {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Informe o ângulo entre a escada e o chão (em graus): ");
        var anguloEscada = leitura.nextDouble();

        System.out.println("Informe a altura da parede (em metros): ");
        var alturaParede = leitura.nextDouble();

        var anguloRadianos = Math.toRadians(anguloEscada);
        var medidaEscada = alturaParede / Math.sin(anguloRadianos);

        System.out.printf("Medida da escada: %.1fm", medidaEscada);
    }
}
