package Partida.Fichas;

public class Ficha {
    private Casilla[] ficha = new Casilla[2];

    public Ficha(Casilla top, Casilla bottom){
        ficha[0] = top;
        ficha[1] = bottom;
    }

    public Casilla[] getFicha() {
        return ficha;
    }

    @Override
    public String toString() {
        return "[ " + ficha[0] + " | " + ficha[1] + " ]";
    }
}
