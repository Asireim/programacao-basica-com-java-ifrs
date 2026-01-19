package exemplosIV;

import java.util.Scanner;

public class MediaNotasTurma {
    public static void main(String[] args) {
        var leitura = new Scanner(System.in);

        System.out.print("Numero de estudantes da turma: ");
        var nro_estudantes = leitura.nextInt();

        int soma = 0;

        for(int notaslidas = 0; notaslidas < nro_estudantes; notaslidas += 1){
            System.out.printf("Nota %d: ", notaslidas+1);
            var nota = leitura.nextInt();

            soma += nota;
        }

        double media = (double) soma / nro_estudantes;
        System.out.printf("Media das notas = %.1f\n", media);

    }
}
