package Ventana;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaReglas extends JFrame implements ActionListener {

    private JButton botonRegresar;

    public VentanaReglas() {
        super("Reglas del Juego");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        generarElementosVentana();
    }

    private void generarElementosVentana() {
        mostrarReglas();
        generarBotonRegresar();
    }

    private void mostrarReglas() {
        JOptionPane.showMessageDialog(this, "\nReglas Específicas del Juego:\n" +
                "" +
                "•\tEl juego se realiza con 2 barajas de 52 cartas cada una, es decir, 104 cartas en total.\n" +
                "•\tNo se permiten juegos con más de 2 comodines en una misma mano.\n" +
                "•\tNo se aceptan dos juegos iguales, como dos escalas de la misma figura.\n" +
                "•\tNo está permitido sacar las cartas bajas del contrincante.\n" +
                "•\tEn las escalas, los comodines deben ir entre tres cartas; por ejemplo, no se pueden tener dos comodines consecutivos en una escala.\n" +
                "•\tSolo está permitido el uso de un comodín al bajarse en cada trío o escala.\n" +
                "•\tSi un jugador baja una mano que tiene comodines, estos son reciclables y pueden ser reemplazados por otro jugador.\n" +
                "•\tEn caso de empate, el desempate se realiza considerando al jugador que haya ganado más rondas."+
                "" +
                "\nRondas del Juego de Carioca:\n" +
                "1.\tDos Tríos (6 cartas): Los jugadores deben formar dos tríos con cartas del mismo valor o número.\n" +
                "2.\tUn Trío y Una Escala (7 cartas): La combinación requerida consiste en un trío y una escala de 4 cartas consecutivas de la misma pinta.\n" +
                "3.\tDos Escalas (8 cartas): Se busca formar dos escalas de 4 cartas consecutivas de la misma pinta.\n" +
                "4.\tTres Tríos (9 cartas): Los jugadores deben crear tres tríos con cartas del mismo valor.\n" +
                "5.\tDos Tríos y Una Escala (10 cartas): La combinación requerida es de dos tríos y una escala de 4 cartas consecutivas de la misma pinta.\n" +
                "6.\tUn Trío y Dos Escalas (11 cartas): Los jugadores deben formar un trío y dos escalas de 4 cartas consecutivas de la misma pinta.\n" +
                "7.\tTres Escalas (12 cartas): La meta es crear tres escalas de 4 cartas consecutivas de la misma pinta.\n" +
                "8.\tCuatro Tríos (12 cartas): Los jugadores deben formar cuatro tríos con cartas del mismo valor.\n" +
                "9.\tEscala Sucia (13 cartas): Se busca lograr una escala completa desde el As hasta el Rey, sin importar la pinta o color.\n" +
                "10.\tEscala de Color (13 cartas): La combinación deseada es una escala completa desde el As hasta el Rey en la que todas las cartas sean del mismo color (rojo o negro).\n" +
                "11.\tEscala Pintada (13 cartas): Se pretende alcanzar una escala completa del As hasta el Rey, alternando el color de las cartas una por una.\n" +
                ""+
                "Valores de las Cartas al Finalizar las Rondas:\n" +
                "•\tAs (A): 20 puntos\n" +
                "•\t2 al 7: Su valor nominal (2 puntos, 3 puntos, ..., 7 puntos)\n" +
                "•\t8 al Rey: 10 puntos cada una\n");
    }

    private void generarBotonRegresar() {
        botonRegresar = new JButton("Regresar");
        botonRegresar.setBounds(250, 300, 100, 40);
        add(botonRegresar);
        botonRegresar.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonRegresar) {
            // Lógica para regresar a la ventana principal...
            // Puedes cerrar esta ventana y mostrar la ventana principal
            // Ejemplo: new VentanaMenuBienvenida().setVisible(true);
            this.dispose(); // Cierra la ventana actual
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            VentanaReglas ventanaReglas = new VentanaReglas();
            ventanaReglas.setVisible(true);
        });
    }
}
