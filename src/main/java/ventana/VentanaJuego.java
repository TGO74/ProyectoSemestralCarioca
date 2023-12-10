package ventana;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import modelo.Carta;

public class VentanaJuego extends JFrame implements ActionListener {

    private Controller.JuegoCariocaController controller;
    private JLabel labelCartasJugador;
    private JLabel labelMazo;
    private JLabel labelNumeroRonda;
    private JButton botonRealizarAccion;
    private JButton botonTerminarPartida;

    public VentanaJuego(Controller.JuegoCariocaController controller) {
        super("Juego de Carioca");
        this.controller = controller;
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        generarElementosVentana();
    }

    private void generarElementosVentana() {
        labelCartasJugador = new JLabel("Cartas del Jugador:");
        labelCartasJugador.setBounds(20, 30, 200, 30);
        add(labelCartasJugador);

        labelMazo = new JLabel("Mazo:");
        labelMazo.setBounds(20, 200, 200, 30);
        add(labelMazo);

        labelNumeroRonda = new JLabel("Número de Ronda: 1");
        labelNumeroRonda.setBounds(20, 400, 200, 30);
        add(labelNumeroRonda);

        botonRealizarAccion = new JButton("Realizar Acción");
        botonRealizarAccion.setBounds(300, 500, 150, 40);
        add(botonRealizarAccion);
        botonRealizarAccion.addActionListener(this);

        JButton botonRecogerCarta = new JButton("Recoger Carta");
        botonRecogerCarta.setBounds(500, 500, 150, 40);
        add(botonRecogerCarta);
        botonRecogerCarta.addActionListener(this);

        JButton botonBotarCarta = new JButton("Botar Carta");
        botonBotarCarta.setBounds(700, 500, 150, 40);
        add(botonBotarCarta);
        botonBotarCarta.addActionListener(this);
    }

    //setvisible(boolean visible)
    public void setVisible(boolean visible){
        super.setVisible(visible);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
