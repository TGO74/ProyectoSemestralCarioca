package controller;

import modelo.Carta;
import modelo.Jugador;

public class JugadorController {

    private Jugador jugador;

    public JugadorController(Jugador jugador) {
        this.jugador = jugador;
    }

    public void recogerCarta(Carta carta) {
        jugador.recogerCarta(carta);
    }

    public void botarCarta(Carta carta) {
        jugador.botarCarta(carta);
    }

    public String mostrarMano() {
        return jugador.mostrarMano();
    }

    // Puedes agregar más métodos según las acciones específicas del jugador
}
