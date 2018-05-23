import Partida.Fichas.Bolsa;

public class Main {

    public static void main(String[] args) {
        Bolsa bolsa = new Bolsa(6);

        System.out.println(bolsa);
        System.out.println(bolsa.getTotalFichas());
    }
}
