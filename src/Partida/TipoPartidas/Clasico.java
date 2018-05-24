package Partida.TipoPartidas;

import Partida.Fichas.Bolsa;
import Partida.Fichas.Ficha;
import Partida.Jugadores.Equipo;
import Partida.Jugadores.Jugador;
import Partida.Jugadores.Modalidad;

import java.util.ArrayList;
import java.util.List;

public class Clasico extends Partida {

    private int maximoFichas;

    public Clasico(int cantidadJugadores, int maximoFichas, int objetivo, Modalidad modalidad) {
        super(cantidadJugadores,maximoFichas, objetivo, modalidad);
        this.maximoFichas = maximoFichas;
    }

    public Clasico(int maximoFichas, int objetivo){
        this(4, maximoFichas, objetivo, Modalidad.INDIVIDUAL);
    }

    @Override
    public void saque() {
        Equipo[] equipos = getEquipos();
        List<Jugador[]> jugadors = new ArrayList<>();

        for (Equipo equipo : equipos)
            jugadors.add(equipo.getJugadores());

        for (Jugador)
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
