package Partida.Jugadores;

public enum Modalidad {
    INDIVIDUAL(1), PAREJAS(2), EQUIPO(3);

    private int cantidadJugadores;

    Modalidad(int cantidadJugadores) {
        this.cantidadJugadores = cantidadJugadores;
    }

    public int getJugadores() {
        return cantidadJugadores;
    }
}
