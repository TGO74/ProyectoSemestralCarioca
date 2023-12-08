package Principal;

import Controller.JuegoCariocaController;
import modelo.JuegoCarioca;
import Ventana.VentanaMenuBienvenida;

public class Principal {
    public static void main(String[] args) {
        // Crea el objeto para gestionar el juego
        JuegoCarioca juegoCarioca = new JuegoCarioca();
        // Crea el controlador del juego
        JuegoCariocaController controller = new JuegoCariocaController(juegoCarioca);
        // Crea la ventana del juego
        VentanaMenuBienvenida ventana = new VentanaMenuBienvenida(controller);
        ventana.setVisible(true);
    }
}

