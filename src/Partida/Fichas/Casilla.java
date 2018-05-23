package Partida.Fichas;

public class Casilla {
    private int valor;

    public Casilla(Tipos tipo){
        this.valor = tipo.getValor();
    }

    @Override
    public String toString() {
        return ""+valor;
    }
}
