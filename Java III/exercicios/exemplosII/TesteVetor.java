package exemplosII;

public class TesteVetor {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        int pos;

        for (pos = 0; pos < 20; pos++) {
            numeros[pos] = pos + 1;
        }

        System.out.println("Numeros de 1 a 20:");

        for (pos = 0; pos < 20; pos++) {
            System.out.println(numeros[pos]);
        }
    }
}
