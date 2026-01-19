package moduloI.prova;

public class q2 {
    public static void main(String[] args) {
        double N1 = 6.5, N2 = 7.5, N3 = 8, N4 = 5.4, RES;

        RES = (N1 + N2 + N3 + N4) / 4;
        System.out.println(RES);

        if (RES >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
