package moduloII.prova;

public class q5 {
    public static void main(String[] args) {
        int[] vetor = new int[15];

        // Leitura
        for(int cont = 0; cont < vetor.length; cont++) {
            System.out.printf("vetor[%d]: ", cont);
            vetor[cont] = Integer.parseInt(System.console().readLine());
        }

        // Processamento e Saída
        boolean achou = false;
        System.out.println("\nPosicoes do vetor com elementos iguais a 30: ");
        for(int cont = 0; cont < vetor.length; cont++) {
            if(vetor[cont] == 30) {
                achou = true;
                System.out.printf("%d ", cont);
            }
        }
        System.out.println();

        if(!achou)
            System.out.println("Nenhuma posicao do vetor contem o valor 30!");
    }
}
