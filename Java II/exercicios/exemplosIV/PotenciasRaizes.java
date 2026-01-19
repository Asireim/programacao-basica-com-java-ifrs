package exemplosIV;

import java.util.Scanner;

public class PotenciasRaizes {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.println("Informe um número positivo maior que zero: ");
        var numero = leitura.nextInt();

        var quadrado = Math.pow(numero, 2);
        var cubo = Math.pow(numero, 3);
        var raizQuadrada = Math.sqrt(numero);
        var raizCubica = Math.cbrt(numero);

        System.out.printf("""
                O número %d ao quadrado é: %f
                O número %d ao cubo é: %f
                A raíz quadrada do número %d é: %f
                A raíz cúbica do número %d é: %f
                """, numero, quadrado, numero, cubo, numero, raizQuadrada, numero, raizCubica);
    }
}
