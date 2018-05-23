package Partida.Fichas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bolsa {
    private int totalFichas;
    private int maximoFichas;
    private List<Ficha> bolsa = new ArrayList<>();

    public Bolsa(int maximoFichas) {
        this.maximoFichas = maximoFichas;

        int max = maximoFichas + 1;
        totalFichas = max * (max+1) / 2;

        Tipos[] tipos = Tipos.values();

        for (int i = 0, index = 0; i <= maximoFichas; i++) {

            Casilla top = new Casilla(tipos[i]);

            for (int j = 0; j <= i; j++, index++) {
                Casilla bottom = new Casilla(tipos[j]);
                bolsa.add( new Ficha(top, bottom) );
            }

        }
    }

    @Override
    public String toString() {
        StringBuilder fichas = new StringBuilder();
        for (Ficha ficha : bolsa) fichas.append(ficha).append("\n");

        return fichas.toString();
    }

    public static String printFichas(Ficha[] bolsa){
        StringBuilder fichas = new StringBuilder();
        for (Ficha ficha : bolsa) fichas.append(ficha).append("\n");

        return fichas.toString();
    }

    public Ficha sacarFicha(){
        int r = new Random().nextInt(bolsa.size());

        Ficha ficha = bolsa.get(r);
        bolsa.remove(r);

        totalFichas--;
        return ficha;
    }

    public int getTotalFichas(){
        return totalFichas;
    }
}
