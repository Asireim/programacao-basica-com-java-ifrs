package moduloII.prova;

public class q7 {
    public static void main(String[] args) {
        int numero = 2;
        int soma = 0;
        while(numero <= 500) {
            soma += numero;
            numero += 2;
        }
        System.out.printf("Soma = %d\n", soma);
    }
}
