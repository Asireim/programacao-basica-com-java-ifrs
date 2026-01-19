package exemplosIV;

public class Incremento {
    public static void main(String[] args) {
        int c = 5;
        System.out.println( c );     // mostra 5
        System.out.println( c++ );   // mostra 5 depois incrementa
        System.out.println( c );     // mostra 6
        System.out.println(); // pula uma linha

        c = 5;
        System.out.println( c );     // mostra 5
        System.out.println( ++c );   // pré-incrementa depois mostra 6
        System.out.println( c );     // mostra 6
    }
}
