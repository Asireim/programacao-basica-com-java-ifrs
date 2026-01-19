package moduloII;

public class exercicio7 {
    public static void main(String[] args) {
        int cont = 15;

        int quadrado = 0;
        while (cont < 200) {
            quadrado = cont * cont;

            System.out.println("O quadrado de " + cont + " é: " + quadrado);

            cont++;
        }
    }
}
