package Partida.Jugadores;

public class Equipo {
    private Jugador[] jugadores;
    private int puntuacion;

    public Equipo(Modalidad modalidad, Jugador ... jugadores) {
        if (jugadores.length != modalidad.getCantidadJugadores()){
            System.err.println("Faltan Jugadores para crear el equipo!");
            return;
        }

        this.jugadores = jugadores;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }
}
