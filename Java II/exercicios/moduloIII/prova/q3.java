package moduloIII.prova;

public class q3 {
    public static void main(String[] args) {
        int N, cont;
        double H;

        System.out.print("Informe o valor N: ");
        N = Integer.parseInt(System.console().readLine());

        for(cont = 1, H = 0; cont <= N; cont = cont + 1) {
            H += 1.0 / cont;
        }

        System.out.printf("\nH = %f\n", H);
    }
}
