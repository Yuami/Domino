package Partida.TipoPartidas;

import Partida.Jugadores.Jugador;

import java.util.ArrayList;
import java.util.List;

public abstract class Partida {
    private int turno = 0;
    private List<Jugador> jugadores = new ArrayList<>();
    private Jugador[][] equipos;


    public Partida(int totalJugadores, boolean porEquipos){

        for (int i = 0; i < totalJugadores; i++)
            this.jugadores.add(new Jugador());

        if (porEquipos) generarEquipos();
    }

    public Partida(Jugador[][] equipos){
        this.equipos = equipos;

        for (int i = 0; i < equipos.length; i++)
            for (int j = 0; j < equipos[0].length; j++) {
                int index = i * equipos.length + j;
                jugadores.add(equipos[index%2][index%(jugadores.size()/2)]);
            }
    }

    private void generarEquipos(){
        equipos = new Jugador[2][jugadores.size()/2];
        for (int i = 0; i < jugadores.size(); i++)
            equipos[i%2][i] = jugadores.get(i);
    }

    public Jugador[] getJugadores(){
        return jugadores.toArray(new Jugador[0]);
    }

    public Jugador getJugadorActual(){
        return jugadores.get(turno);
    }

    public void proximoTurno(){
        turno = (++turno) % jugadores.size();
    }
}
