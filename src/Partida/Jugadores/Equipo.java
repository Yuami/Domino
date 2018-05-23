package Partida.Jugadores;

public class Equipo {
    private Jugador[] jugadores;
    private int puntuacion;
    private int turno = 0;

    public Equipo(Modalidad modalidad, Jugador ... jugadores) {
        if (jugadores.length != modalidad.getJugadores()){
            System.err.println("Faltan Jugadores para crear el equipo!");
            return;
        }

        this.jugadores = jugadores;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getTurno() {
        return turno;
    }

    public void cambiarTurno() {
        turno = (++turno) % jugadores.length;
    }
}
