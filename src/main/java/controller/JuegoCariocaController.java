package controller;

import modelo.Carta;
import modelo.JuegoCarioca;
import modelo.Jugador;

import java.io.IOException;

public class JuegoCariocaController {

    private JuegoCarioca juegoCarioca;

    public JuegoCariocaController(JuegoCarioca juegoCarioca) {
        this.juegoCarioca = juegoCarioca;
    }

    //getJuegoCarioca
    public JuegoCarioca getJuegoCarioca(){
        return juegoCarioca;
    }

    public void agregarJugador(String nombre) {
        juegoCarioca.agregarJugador(nombre);
    }

    public void iniciarJuego() {
        juegoCarioca.iniciarJuego(juegoCarioca.getJugadores());
    }

    public void realizarRondas() {
        juegoCarioca.realizarRondas(juegoCarioca.getJugadores());
    }

    public void finalizarJuego() {
        juegoCarioca.finalizarJuego(juegoCarioca.getJugadores());
    }

    public String getJugadores() {
        return juegoCarioca.getJugadores().toString();
    }

    public Jugador getGanador() {
        return juegoCarioca.getGanador();
    }

    public void setJuegoCarioca(JuegoCarioca juegoCarioca) {
        this.juegoCarioca = juegoCarioca;
    }

    public void getResultados() {
        juegoCarioca.getResultado(juegoCarioca.getJugadores());
    }

    public void guardarPartida() throws IOException {
        juegoCarioca.guardarPartida(getJugadores());
    }

    public void mostrarPartidas() {
        juegoCarioca.mostrarPartidas();
    }

    public void mostrarJugadores() {
        juegoCarioca.mostrarJugadores();
    }

    public void realizarRecogerCarta(Jugador jugador) {
        Carta cartaRecogida = juegoCarioca.recogerCarta();
        jugador.getMano().agregarCarta(cartaRecogida);
    }

    public void realizarBotarCarta(Jugador jugador, Carta carta) {
        jugador.getMano().botarCarta(carta);
    }

    //getJugadorActual
    public Jugador getJugadorActual(){
        return juegoCarioca.getJugadorActual();
    }


}
