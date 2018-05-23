package Partida.Jugadores;

public enum Modalidad {
    INDIVIDUAL(1), PAREJAS(2), EQUIPO(6);

    private int cantidadJugadores;

    Modalidad(int cantidadJugadores) {
        this.cantidadJugadores = cantidadJugadores;
    }

    public int getCantidadJugadores() {
        return cantidadJugadores;
    }
}
