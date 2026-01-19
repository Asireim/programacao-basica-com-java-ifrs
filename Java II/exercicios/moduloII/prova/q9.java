package moduloII.prova;

public class q9 {
    public static void main(String[] args) {
        System.out.print("Informe o valor N: ");
        int N = Integer.parseInt(System.console().readLine());

        double H = 0;
        int cont = 1;

        while (cont <= N) {
            H = H + 1.0 / cont;
            cont++;
        }

        System.out.printf("\nH = %f\n", H);
    }
}
