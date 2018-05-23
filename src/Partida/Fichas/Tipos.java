package Partida.Fichas;

public enum Tipos {
    CERO(0), UNO(1), DOS(2), TRES(3), CUATRO(4), CINCO(5), SEIS(6);

    private int valor;

    Tipos(int valor){
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
