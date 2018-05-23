package Partida.TipoPartidas;

import Partida.Fichas.Bolsa;
import Partida.Fichas.Ficha;
import Partida.Jugadores.Equipo;
import Partida.Jugadores.Modalidad;

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
    public void inicioJuego() {

    }

    @Override
    public void calcularPuntos() {

    }

    @Override
    public void start() {
        Equipo[] equipos = getEquipos();
        for (Equipo equipo : equipos) {
            System.out.println(Bolsa.printFichas(equipo.getJugadores()[0].getFichas().toArray(new Ficha[0])));
        }
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
