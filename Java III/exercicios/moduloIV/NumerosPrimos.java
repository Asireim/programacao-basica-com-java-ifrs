package moduloIV;

public class NumerosPrimos {
    public static void main(String[] args) {
        System.out.println("Números primos de 1 a 100:");

        for (int i = 1; i <= 100; i++) {
            if (ePrimo(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean ePrimo(int numero) {
        if (numero < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
