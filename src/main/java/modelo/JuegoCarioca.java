package modelo;

import java.util.ArrayList;

public class JuegoCarioca {

    ArrayList<Carta> cartas = new ArrayList<Carta>();
    ArrayList<Jugador> jugadores = new ArrayList<Jugador>();  // Agregamos una lista para los jugadores

    Baraja baraja = new Baraja();

    public JuegoCarioca() {
        baraja.crearBaraja();
        baraja.mezclarBaraja();
        cartas = baraja.getCartasBaraja();
    }

    // Método para agregar jugadores al juego
    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    // Método para obtener los jugadores del juego
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void iniciarJuego() {  // Modificamos este método para usar la lista de jugadores interna
        baraja.repartirCartas(jugadores);
    }

    public void realizarRondas() {  // Modificamos este método para usar la lista de jugadores interna
        for (Jugador jugador : jugadores) {
            jugador.jugar();
        }
    }

    public void finalizarJuego() {  // Modificamos este método para usar la lista de jugadores interna
        for (Jugador jugador : jugadores) {
            if (jugador.getMano().size() == 0) {
                System.out.println("El ganador es: " + jugador.getNombre());
            }
        }
    }

    // Método para obtener el ganador del juego
    public Jugador getGanador() {
        for (Jugador jugador : jugadores) {
            if (jugador.getMano().size() == 0) {
                return jugador;
            }
        }
        return null;
    }
}
