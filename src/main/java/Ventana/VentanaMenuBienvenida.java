package Ventana;

import Controller.JuegoCariocaController;
import modelo.Jugador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaMenuBienvenida extends JFrame implements ActionListener {

    private JLabel textoMenu;
    private JButton botonIniciarJuego;
    private JButton botonPartidasJugadas;
    private JButton botonReglas;

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
        generarBotonIniciarJuego();
        generarBotonPartidasJugadas();
        generarBotonReglas();
    }

    private void generarMensajeMenu() {
        textoMenu = new JLabel("Sistema de Juego de Carioca");
        textoMenu.setBounds(20, 30, 500, 30);
        add(textoMenu);
    }

    private void generarBotonIniciarJuego() {
        botonIniciarJuego = new JButton("Nueva Partida");
        botonIniciarJuego.setBounds(175, 180, 150, 40);
        add(botonIniciarJuego);
        botonIniciarJuego.addActionListener(this);
    }

    private void generarBotonPartidasJugadas() {
        botonPartidasJugadas = new JButton("Mostrar Partidas Jugadas");
        botonPartidasJugadas.setBounds(175, 260, 150, 40);
        add(botonPartidasJugadas);
        botonPartidasJugadas.addActionListener(this);
    }

    private void generarBotonReglas() {
        botonReglas = new JButton("Reglas del Juego");
        botonReglas.setBounds(175, 340, 150, 40);
        add(botonReglas);
        botonReglas.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonIniciarJuego) {
            // Llamado ventana agregar datos
            VentanaAgregarDatosJuego ventanaAgregarDatosJuego = new VentanaAgregarDatosJuego(controller);
            ventanaAgregarDatosJuego.setVisible(true);

            // Puedes llamar a métodos del controlador u otras acciones aquí
        } else if (e.getSource() == botonPartidasJugadas) {
            // Lógica para mostrar las partidas jugadas...
            // Puedes llamar a métodos del controlador u otras acciones aquí
        } else if (e.getSource() == botonReglas) {
            // LLamado ventana reglas
            VentanaReglas ventanaReglas = new VentanaReglas();
            // Puedes llamar a métodos del controlador u otras acciones aquí
        }
    }
}