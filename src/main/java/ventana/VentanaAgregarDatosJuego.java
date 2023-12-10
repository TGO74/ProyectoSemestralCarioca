package ventana;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Controller.JuegoCariocaController;
import modelo.Jugador;

public class VentanaAgregarDatosJuego extends JFrame implements ActionListener {

    private JuegoCariocaController controller;
    private JButton botonAgregarJugador;
    private JButton botonIniciarJuego;
    private JButton botonVolverAlMenu;
    private JTextArea areaJugadores;

    public VentanaAgregarDatosJuego(JuegoCariocaController controller) {
        super("Agregar jugadores");
        this.controller = controller;
        setSize(500, 520);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        generarElementosVentana();
    }

    private void generarElementosVentana() {
        generarBotonAgregarJugador();
        generarBotonIniciarJuego();
        generarBotonVolverAlMenu();
        generarAreaJugadores();
    }

    private void generarBotonAgregarJugador() {
        botonAgregarJugador = new JButton("Agregar jugador");
        botonAgregarJugador.setBounds(175, 100, 150, 40);
        add(botonAgregarJugador);
        botonAgregarJugador.addActionListener(this);
    }

    private void generarBotonIniciarJuego() {
        botonIniciarJuego = new JButton("Iniciar Juego");
        botonIniciarJuego.setBounds(175, 160, 150, 40);
        add(botonIniciarJuego);
        botonIniciarJuego.addActionListener(this);
    }

    private void generarBotonVolverAlMenu() {
        botonVolverAlMenu = new JButton("Volver al Menú Principal");
        botonVolverAlMenu.setBounds(175, 220, 200, 40);
        add(botonVolverAlMenu);
        botonVolverAlMenu.addActionListener(this);
    }

    private void generarAreaJugadores() {
        areaJugadores = new JTextArea();
        areaJugadores.setBounds(20, 280, 460, 150);
        areaJugadores.setEditable(false);
        add(areaJugadores);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonAgregarJugador) {
            // Lógica para el botón "Agregar jugador"
            // Ingresar el nombre del jugador
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del jugador");

            // Validar que el nombre no sea vacío y agregarlo a la lista de jugadores
            if (nombre != null && !nombre.isEmpty()) {
                if (controller.getJugadores().size() < 4) {
                    controller.agregarJugador(nombre);
                    actualizarAreaJugadores();
                } else {
                    JOptionPane.showMessageDialog(this, "No se pueden agregar más de 4 jugadores.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "El nombre no puede estar vacío");
            }
        } else if (e.getSource() == botonIniciarJuego) {
            // Llamado ventana juego
            VentanaJuego ventanaJuego = new VentanaJuego(controller);
            ventanaJuego.setVisible(true);
        } else if (e.getSource() == botonVolverAlMenu) {
            // Lógica para el botón "Volver al Menú Principal"
            // Puedes realizar acciones adicionales antes de volver al menú principal si es necesario
            dispose(); // Cierra la ventana actual
        }
    }

    private void actualizarAreaJugadores() {
        // Actualizar el área de texto con los jugadores agregados
        StringBuilder jugadoresText = new StringBuilder("Jugadores:\n");
        for (Jugador jugador : controller.getJugadores()) {
            jugadoresText.append(jugador.getNombre()).append("\n");
        }
        areaJugadores.setText(jugadoresText.toString());
    }

    //setvisible(boolean visible)
    public void setVisible(boolean visible){
        super.setVisible(visible);
    }
}
