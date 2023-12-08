package Ventana;

import Controller.JuegoCariocaController;
import modelo.Jugador;

import javax.swing.*;
import java.awt.event.*;

public class VentanaMenuBienvenida extends JFrame implements ActionListener {

    private JLabel textoMenu;
    private JButton botonAgregarJugadores;
    private JButton botonIniciarJuego;
    private JuegoCariocaController controller;

    public VentanaMenuBienvenida(JuegoCariocaController controller) {
        super("Menu Carioca");
        this.controller = controller;
        setSize(500, 520);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        generarElementosVentana();
    }

    private void generarElementosVentana() {
        generarMensajeMenu();
        generarBotonAgregarJugadores();
        generarBotonIniciarJuego();
    }

    private void generarMensajeMenu() {
        textoMenu = new JLabel("Sistema de Juego de Carioca");
        textoMenu.setBounds(20, 30, 500, 30);
        add(textoMenu);
    }

    private void generarBotonAgregarJugadores() {
        botonAgregarJugadores = new JButton("Agregar número de jugadores");
        botonAgregarJugadores.setBounds(175, 100, 150, 40);
        add(botonAgregarJugadores);
        botonAgregarJugadores.addActionListener(this);
    }

    private void generarBotonIniciarJuego() {
        botonIniciarJuego = new JButton("Iniciar Juego");
        botonIniciarJuego.setBounds(175, 180, 150, 40);
        add(botonIniciarJuego);
        botonIniciarJuego.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonAgregarJugadores) {
            int numJugadores = Integer.parseInt(JOptionPane.showInputDialog(this, "Introduce el número de jugadores:"));
            for (int i = 0; i < numJugadores; i++) {
                String nombre = JOptionPane.showInputDialog(this, "Introduce el nombre del jugador " + (i + 1) + ":");
                controller.agregarJugador(nombre);
            }
        } else if (e.getSource() == botonIniciarJuego) {
            controller.iniciarJuego();
            JOptionPane.showMessageDialog(this, "El juego ha comenzado!");
            for (Jugador jugador : controller.getJugadores()) {
                String cartas = jugador.mostrarMano();
                JOptionPane.showMessageDialog(this, "Las cartas de " + jugador.getNombre() + " son:\n" + cartas);
            }
            controller.realizarRondas();
            controller.finalizarJuego();
            Jugador ganador = controller.getGanador();
            if (ganador != null) {
                JOptionPane.showMessageDialog(this, "El ganador es: " + ganador.getNombre());
            } else {
                JOptionPane.showMessageDialog(this, "No hay ganador en este juego.");
            }
        }
    }
}

