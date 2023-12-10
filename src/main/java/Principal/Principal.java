package Principal;


import modelo.JuegoCarioca;
import ventana.VentanaMenuBienvenida;
import dato.GestorDePartidas;

    public class Principal {
        public static void main(String[] args) {
            // Crea el objeto para gestionar el juego
            JuegoCarioca juegoCarioca = new JuegoCarioca();
            // Crea el GestorDePartida
            GestorDePartidas gestorDePartida = new GestorDePartidas();
            // Crea el controlador del juego
            Controller.JuegoCariocaController controller = new Controller.JuegoCariocaController(juegoCarioca);
            // Crea la ventana del juego
            VentanaMenuBienvenida ventana = new VentanaMenuBienvenida(controller);
            ventana.setVisible(true);
        }
    }

