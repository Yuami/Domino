package Partida.TipoPartidas;

import Partida.Jugadores.Equipo;
import Partida.Jugadores.Modalidad;

public class Latino extends Partida {

    private static final int maximoFichas = 6;

    public Latino(int objetivo) {
        super(maximoFichas, objetivo);
    }

    @Override
    public void inicioJuego() {

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
