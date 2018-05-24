package Partida.TipoPartidas;

import Partida.Jugadores.Equipo;
import Partida.Jugadores.Modalidad;

public class Mexicano extends Partida {

    private static final int maximoFichas = 6;

    public Mexicano(int objetivo, Modalidad modalidad){
        super(objetivo, maximoFichas);
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
