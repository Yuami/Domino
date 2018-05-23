package Partida.Fichas;

public class Ficha {
    private Casilla[] ficha = new Casilla[2];
    private boolean enMano = true;

    public Ficha(Casilla top, Casilla bottom){
        ficha[0] = top;
        ficha[1] = bottom;
    }

    public Casilla[] getFicha() {
        return ficha;
    }

    public void setFicha(Casilla[] ficha) {
        this.ficha = ficha;
    }

    public boolean isEnMano() {
        return enMano;
    }

    public void setEnMano(boolean enMano) {
        this.enMano = enMano;
    }

    @Override
    public String toString() {
        return "[ " + ficha[0] + " | " + ficha[1] + " ]";
    }
}
