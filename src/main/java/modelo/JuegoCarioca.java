package modelo;

import java.util.ArrayList;

public class JuegoCarioca {

    ArrayList<Carta> cartas = new ArrayList<Carta>();

    Baraja baraja = new Baraja();

    public JuegoCarioca() {
        baraja.crearBaraja();
        baraja.mezclarBaraja();
        cartas = baraja.getCartasBaraja();
    }

    public void iniciarJuego(ArrayList<Jugador> jugadores) {
        baraja.repartirCartas(jugadores);
    }

    public void realizarRondas(ArrayList<Jugador> jugadores) {
        for (Jugador jugador : jugadores) {
            jugador.jugar();
        }
    }


    public void finalizarJuego(ArrayList<Jugador> jugadores) {
        for (Jugador jugador : jugadores) {
            if (jugador.getMano().size() == 0) {
                System.out.println("El ganador es: " + jugador.getNombre());
            }
        }
    }
}
