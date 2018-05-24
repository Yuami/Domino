package Partida.Fichas;

public class Ficha {
    private final Casilla[] casillas = new Casilla[2];
    private boolean enMano = true;
    private final boolean doble;

    public Ficha(Casilla top, Casilla bottom){
        casillas[0] = top;
        casillas[1] = bottom;

        doble = casillas[0].getValor() == casillas[1].getValor();
    }

    public Casilla[] getFicha() {
        return casillas;
    }

    public boolean isEnMano() {
        return enMano;
    }

    public void setEnMano(boolean enMano) {
        this.enMano = enMano;
    }

    public int getValorTotal(){
        return casillas[0].getValor() + casillas[1].getValor();
    }

    public boolean isDoble() {
        return doble;
    }

    @Override
    public String toString() {
        return "[ " + casillas[0] + " | " + casillas[1] + " ]";
    }
}
