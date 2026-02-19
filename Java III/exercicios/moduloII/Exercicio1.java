package moduloII;

public class Exercicio1 {
    public static void main(String[] args) {
        String produtos[] = {"mouse", "teclado", "memoria ram", "monitor", "gabinete", "processador", "placa mãe", "cooler", "placa de vídeo", "fonte"};
        int codigos[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double precos[] = {49.99, 199.99, 249.99, 1999.99, 599.99, 1499.00, 549.99, 79.99, 2499.00, 499.00};

        for (int cont = 1; cont <= 10; cont++) {
            System.out.printf("""
                    Nome do produto: %s
                    Código do produto: %d
                    Preço do produto: R$ %.2f
                    ---
                    """, produtos[cont - 1], codigos[cont - 1], precos[cont - 1]);

            if (codigos[cont - 1] % 2 == 0 && precos[cont - 1] > 1000.0) {
                System.out.println("Produtos que soferão aumento: ");

            }
        }
    }
}
