package Controller;

import modelo.JuegoCarioca;
import modelo.Jugador;

import java.util.ArrayList;

public class JuegoCariocaController {

    private JuegoCarioca juegoCarioca;

    public JuegoCariocaController(JuegoCarioca juegoCarioca) {
        this.juegoCarioca = juegoCarioca;
    }

    public void agregarJugador(String nombre){
        juegoCarioca.agregarJugador(new Jugador(nombre));
    }

    public void iniciarJuego(){
        juegoCarioca.iniciarJuego();
    }

    public void realizarRondas(){
        juegoCarioca.realizarRondas();
    }

    public void finalizarJuego(){
        juegoCarioca.finalizarJuego();
    }

    public ArrayList<Jugador> getJugadores(){
        return juegoCarioca.getJugadores();
    }

    public Jugador getGanador() {
        return juegoCarioca.getGanador();
    }
}
