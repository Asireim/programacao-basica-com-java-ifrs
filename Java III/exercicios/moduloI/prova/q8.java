package moduloI.prova;

public class q8 {
    public static void main(String[] args) {
        double somaVista = 0, somaPrazo = 0, somaTotal = 0;

        for (int cont = 1; cont <= 15; cont++) {
            System.out.print("Codigo: ");
            String codigo = System.console().readLine();

            System.out.print("Valor: ");
            double valor = Double.parseDouble(System.console().readLine());

            if (codigo.equalsIgnoreCase("v")) {
                somaVista += valor;
            } else if (codigo.equalsIgnoreCase("p")) {
                somaPrazo += valor;
            }

            somaTotal += valor;
        }

        System.out.printf("\nSOMA DAS COMPRAS A VISTA = R$ %.2f\n", somaVista);
        System.out.printf("SOMA DAS COMPRAS A PRAZO = R$ %.2f\n", somaPrazo);
        System.out.printf("SOMA TOTAL = R$ %.2f\n", somaTotal);
    }
}
