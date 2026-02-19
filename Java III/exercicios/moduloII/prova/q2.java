package moduloII.prova;

public class q2 {
    public static void main(String[] args) {
        int[] vetor = new int[6];

        // Leitura
        for(int cont = 0; cont < vetor.length; cont++) {
            System.out.printf("Posicao %d: ", cont);
            vetor[cont] = Integer.parseInt(System.console().readLine());
        }

        // Numeros pares
        int quantPares = 0;
        System.out.print("Numeros pares:");
        for(int cont = 0; cont < vetor.length; cont++) {
            if(vetor[cont] % 2 == 0) {
                System.out.printf(" %d", vetor[cont]);
                quantPares++;
            }
        }
        System.out.printf("\nQuantidade de numeros pares = %d\n", quantPares);

        // Numeros impares
        int quantImpares = 0;
        System.out.print("Numeros impares:");
        for(int cont = 0; cont < vetor.length; cont++) {
            if(vetor[cont] % 2 != 0) {
                System.out.printf(" %d", vetor[cont]);
                quantImpares++;
            }
        }
        System.out.printf("\nQuantidade de numeros impares = %d\n", quantImpares);
    }
}
