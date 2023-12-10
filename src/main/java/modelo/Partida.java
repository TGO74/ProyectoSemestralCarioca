package modelo;

import java.util.ArrayList;
import java.util.Date;

public class Partida {
    private String nombreJugador;
    private int puesto;
    private Date fecha;
    private int puntaje;

    public Partida(ArrayList<Jugador> jugadores) {
        for (Jugador jugador : jugadores) {
            this.nombreJugador = jugador.getNombre();
            this.puesto = jugador.getPuesto();
            this.fecha = new Date();
            this.puntaje = jugador.getPuntos();
        }
    }

    public Partida(String datum, String datum1, String datum2, Date date) {
    }


    public String getNombreJugador() {
        return nombreJugador;
    }

    public int getPuesto() {
        return puesto;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getPuntaje() {
        return puntaje;
    }




    @Override
    public String toString() {
        return "Partida{" +
                "nombreJugador='" + nombreJugador + '\'' +
                ", puesto=" + puesto +
                ", fecha=" + fecha +
                ", puntaje=" + puntaje +
                '}';
    }
}
