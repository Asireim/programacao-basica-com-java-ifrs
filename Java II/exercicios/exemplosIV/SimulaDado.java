package exemplosIV;

public class SimulaDado {
    public static void main(String[] args) {

        for(int cont = 1; cont <= 5; cont++ ) {

            int dado = (int)(1 + Math.random() * 6);

            System.out.println(dado);
        }
    }
}
