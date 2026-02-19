package moduloI.prova;

public class q4 {
    public static void main(String[] args) {
        int a = 10, b = 10;

        if (a != 0 & b != 0) {
            System.out.print("Os valores são diferentes de 0 e ");
            if (a == b) {
                System.out.println("'A' é igual a B!");
            } else if (a > b) {
                System.out.println("'A' é maior que B!");
            } else {
                System.out.println("'A' é menor que B!");
            }
        } else {
            System.out.println("Os valores para 'A' e 'B' precisam ser positivos maiores que 0.");
        }
    }
}
