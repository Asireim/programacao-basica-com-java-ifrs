package moduloIV;

public class exercicio2 {
    public static void main(String[] args) {
        for (int cont = 0; cont <= 100; cont++) {
            System.out.printf("O binário do número %d é %s.%n", cont, Integer.toBinaryString(cont));
        }
    }
}
