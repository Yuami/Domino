package Partida;

import Partida.Fichas.Casilla;
import Partida.Fichas.Ficha;
import Partida.Fichas.Tipos;

public class Bolsa {
    private int totalFichas;
    private int maximoFichas;
    private Ficha[] bolsa;

    public Bolsa(int maximoFichas) {
        this.maximoFichas = maximoFichas;

        int max = maximoFichas + 1;
        totalFichas = max * (max+1) / 2;

        Tipos[] tipos = Tipos.values();

        bolsa = new Ficha[totalFichas];
        for (int i = 0, index = 0; i <= maximoFichas; i++) {
            Casilla top = new Casilla(tipos[i]);
            for (int j = 0; j <= i; j++, index++) {
                Casilla bottom = new Casilla(tipos[j]);
                bolsa[index] = new Ficha(top, bottom);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder fichas = new StringBuilder();
        for (Ficha ficha : bolsa) fichas.append(ficha).append("\n");

        return fichas.toString();
    }

    public int getTotalFichas(){
        return totalFichas;
    }
}
