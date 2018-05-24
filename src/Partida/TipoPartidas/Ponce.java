package Partida.TipoPartidas;

import Partida.Jugadores.Equipo;

public class Ponce extends Partida {

    private static final int maximoFichas = 6;

    public Ponce(int objetivo) {
        super(maximoFichas, objetivo);
    }

    @Override
    public void calcularPuntos() {

    }

    @Override
    public void start() {

    }

    @Override
    public Equipo salida() {
        return null;
    }

    @Override
    public Equipo tranca() {
        return null;
    }
}
