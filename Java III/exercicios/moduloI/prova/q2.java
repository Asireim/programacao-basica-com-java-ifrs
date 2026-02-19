package moduloI.prova;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int canal, canal4 = 0, canal5 = 0, canal7 = 0, canal12 = 0, totalPessoas = 0;

        do {
            System.out.println("Informe o número do canal (4, 5, 7, 12) ou 0 para encerrar:");
            canal = leitura.nextInt();

            if (canal != 0) {
                System.out.println("Informe o número de pessoas assistindo ao canal:");
                int pessoasAssistindo = leitura.nextInt();

                switch (canal) {
                    case 4:
                        canal4 += pessoasAssistindo;
                        totalPessoas += pessoasAssistindo;
                        break;

                    case 5:
                        canal5 += pessoasAssistindo;
                        totalPessoas += pessoasAssistindo;
                        break;

                    case 7:
                        canal7 += pessoasAssistindo;
                        totalPessoas += pessoasAssistindo;
                        break;

                    case 12:
                        canal12 += pessoasAssistindo;
                        totalPessoas += pessoasAssistindo;
                        break;

                    default:
                        System.out.println("Canal inválido! Digite apenas 4, 5, 7 ou 12.");
                        break;
                }
            }

        } while (canal != 0);

        if (totalPessoas > 0) {
            double porcentagem4 = (canal4 * 100.0) / totalPessoas;
            double porcentagem5 = (canal5 * 100.0) / totalPessoas;
            double porcentagem7 = (canal7 * 100.0) / totalPessoas;
            double porcentagem12 = (canal12 * 100.0) / totalPessoas;

            System.out.printf("""
                    Porcentagem de audiência:
                    Canal 4: %.1f%%
                    Canal 5: %.1f%%
                    Canal 7: %.1f%%
                    Canal 12: %.1f%%
                    """, porcentagem4, porcentagem5, porcentagem7, porcentagem12);
        } else {
            System.out.println("Nenhuma audiência registrada.");
        }
    }
}
