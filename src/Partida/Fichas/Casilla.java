package Partida.Fichas;

public class Casilla {
    private final int valor;
    private boolean usable = true;

    public Casilla(Tipos tipo){
        this.valor = tipo.getValor();
    }

    public int getValor() {
        return valor;
    }

    public boolean isUsable() {
        return usable;
    }

    public void setUsable(boolean usable) {
        this.usable = usable;
    }

    @Override
    public String toString() {
        return ""+valor;
    }
}
