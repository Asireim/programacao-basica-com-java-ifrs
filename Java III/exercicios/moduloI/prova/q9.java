package moduloI.prova;

public class q9 {
    public static void main(String[] args) {
        int maiorNumAcidentes = -1, codCidadeMaiorNumAcid = 0, menorNumAcidentes = -1, codCidadeMenorNumAcid = 0,
                somaVeiculos = 0, numCidInf2000Veic = 0, somaAcidCidInf2000Veic = 0;

        for (int cont = 1; cont <= 20; cont++) {
            System.out.print("Codigo: ");
            int codigo = Integer.parseInt(System.console().readLine());

            System.out.print("Numero de veiculos de passeio em 2017: ");
            int veiculosPasseio = Integer.parseInt(System.console().readLine());

            System.out.print("Numero de acidentes de transito com vitimas em 2017: ");
            int numAcidentes = Integer.parseInt(System.console().readLine());

            if (numAcidentes > maiorNumAcidentes) {
                maiorNumAcidentes = numAcidentes;
                codCidadeMaiorNumAcid = codigo;
            }

            if (numAcidentes < menorNumAcidentes || menorNumAcidentes == -1) {
                menorNumAcidentes = numAcidentes;
                codCidadeMenorNumAcid = codigo;
            }

            somaVeiculos += veiculosPasseio;

            if (veiculosPasseio < 2000) {
                numCidInf2000Veic++;
                somaAcidCidInf2000Veic += numAcidentes;
            }
        }

        double mediaVeiculos = somaVeiculos / 20.0;
        double mediaAcidCidInf2000Veic = somaAcidCidInf2000Veic / (double) numCidInf2000Veic;

        System.out.printf("\nCODIGO DA CIDADE COM O MAIOR NUMERO DE ACIDENTES = %d\n", codCidadeMaiorNumAcid);
        System.out.printf("CODIGO DA CIDADE COM O MENOR NUMERO DE ACIDENTES = %d\n", codCidadeMenorNumAcid);
        System.out.printf("MEDIA DE VEICULOS DE PASSEIO = %.1f\n", mediaVeiculos);
        System.out.printf("MEDIA DE ACIDENTES NAS CIDADES COM MENOS DE 2000 VEICULOS DE PASSEIO = %.1f\n", mediaAcidCidInf2000Veic);
    }
}
