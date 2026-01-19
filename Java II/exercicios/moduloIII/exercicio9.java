package moduloIII;

public class exercicio9 {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 1;
        int contador = 1;

        do {
            System.out.printf(n1 + "%n");

            int proximo = n1 + n2;
            n1 = n2;
            n2 = proximo;

            contador++;
        } while (contador <= 10);
    }
}
