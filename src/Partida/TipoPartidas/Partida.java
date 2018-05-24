package Partida.TipoPartidas;

import Partida.Fichas.Bolsa;
import Partida.Fichas.Ficha;
import Partida.Jugadores.Equipo;
import Partida.Jugadores.Jugador;
import Partida.Jugadores.Modalidad;

import java.util.ArrayList;
import java.util.List;

public abstract class Partida {
    private int turno = 0;
    private List<Equipo> equipos = new ArrayList<>();
    private final Bolsa bolsa;
    private Modalidad modalidad = Modalidad.PAREJAS;
    private int cantidadJugadores;
    private int objetivo;
    private Ficha[][][] repartido;
    private int numeroEquipos;
    private List<Ficha> extremos;

    public Partida(int maximoFichas, int objetivo) {
        this(4, maximoFichas, objetivo, Modalidad.PAREJAS);
    }

    public Partida(int cantidadJugadores, int maximoFichas, int objetivo, Modalidad modalidad) {
        this.bolsa = new Bolsa(maximoFichas);
        this.modalidad = modalidad;

        if (cantidadJugadores % modalidad.getJugadores() != 0 || cantidadJugadores <= modalidad.getJugadores()) return;
        this.cantidadJugadores = cantidadJugadores;
        this.objetivo = objetivo;
        this.numeroEquipos = cantidadJugadores / modalidad.getJugadores();

        repartirFichas();
        generarEquipos();
        start();
    }

    private void repartirFichas() {
        int fichasPorJugador = bolsa.getTotalFichas() / cantidadJugadores;
        int jugadoresPorEquipo = modalidad.getJugadores();

        repartido = new Ficha[numeroEquipos][jugadoresPorEquipo][fichasPorJugador];

        for (int i = 0; i < fichasPorJugador; i++)
            for (int j = 0; j < jugadoresPorEquipo; j++)
                for (int k = 0; k < numeroEquipos; k++)
                    repartido[k][j][i] = bolsa.sacarFicha();
    }
    public abstract void saque();

    public abstract void calcularPuntos();

    public abstract void start();

    public abstract Equipo salida();

    public abstract Equipo tranca();

    public int getTurno() {
        return turno;
    }

    public void siguienteEquipo() {
        turno = (++turno) % equipos.size();
    }

    public Equipo[] getEquipos() {
        return equipos.toArray(new Equipo[0]);
    }

    public Equipo getEquipoActual() {
        return equipos.get(turno);
    }

    public Jugador getJugadorActual() {
        Equipo equipo = getEquipoActual();
        return equipo.getJugadores()[equipo.getTurno()];
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public void generarEquipos() {
        int numeroJugadores = modalidad.getJugadores();
        int totalEquipos = cantidadJugadores / numeroJugadores;

        for (int i = 0; i < totalEquipos; i++) {
            Jugador[] jugadores = new Jugador[numeroJugadores];

            for (int j = 0; j < numeroJugadores; j++)
                jugadores[j] = new Jugador(repartido[i][j]);

            equipos.add(new Equipo(modalidad, jugadores));
        }
    }
}
