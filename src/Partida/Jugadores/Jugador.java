package Partida.Jugadores;

import Partida.Fichas.Ficha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Jugador {

    private List<Ficha> fichas = new ArrayList<>();
    private int puntuacion = 0;
    private boolean saque = false;

    public Jugador(Ficha[] fichas) {
        this.fichas.addAll(Arrays.asList(fichas));
    }

    public List<Ficha> getFichas() {
        return fichas;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public boolean isSaque() {
        return saque;
    }

    public void cambiarSaque() {
        this.saque = !saque;
    }
}
