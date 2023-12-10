package modelo;

import dato.GestorDePartidas;

import java.util.ArrayList;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class JuegoCarioca {


    ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
    ArrayList<Carta> cartas = new ArrayList<Carta>();

    ArrayList<Partida> partidas = new ArrayList<Partida>();

    GestorDePartidas gestorDePartidas = new GestorDePartidas();


    Baraja baraja = new Baraja();

    public JuegoCarioca() {
        baraja.crearBaraja();
        baraja.mezclarBaraja();
        cartas = baraja.getCartasBaraja();
    }

    //Getters y setters
    public ArrayList<Carta> getCartas() {
        return this.cartas;
    }

    public ArrayList<Jugador> getJugadores() {
        return this.jugadores;
    }

    public ArrayList<Partida> getPartidas() {
        return this.partidas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    public void setPartidas(ArrayList<Partida> partidas) {
        this.partidas = partidas;
    }




    //Metodos


    public void agregarPartida(Partida partida){
        partidas.add(partida);
    }


    // Método para iniciar el juego, repartiendo las cartas a los jugadores y crando nueva partida
    public void iniciarJuego(ArrayList<Jugador> jugadores) {
        baraja.repartirCartas(jugadores);
        Partida partida = new Partida(jugadores);

        //Crea archivo de partidas
        try {
            gestorDePartidas.crearArchivo("partidas.txt");
        } catch (IOException e) {
            System.out.println("Error al crear el archivo de partidas");
        }
        agregarPartida(partida);
    }

    public void realizarRondas(ArrayList<Jugador> jugadores) {
        for (Jugador jugador : jugadores) {
            jugador.jugar();
        }
    }


    //Método para finalizar el juego, indicando los resultados con el metodo getResultado
    public void finalizarJuego(ArrayList<Jugador> jugadores) {
        for (Jugador jugador : jugadores) {
            jugador.mostrarMano();
        }
        //Llamar al metodo getResultado
        getResultado(jugadores);

        //Guardar partida en archivo
        try {
            guardarPartida("partidas.txt");
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo de partidas");
        }


    }
    // Método para obtener el ganador del juego
    public Jugador getGanador() {
        for (Jugador jugador : jugadores) {
            if (jugador.getMano().size() == 0) {
                return jugador;
            }
        }
        return null;
    }




    // Método para obtener los resultados del juego, ordenados por puesto de menor a mayor puntaje, el que tiene 0 gana.
    // Obtenlo con el tamaño de la mano de cada jugador
    public ArrayList<String> getResultado(ArrayList<Jugador> jugadores) {
        ArrayList<String> resultados = new ArrayList<String>();

        // Recorre la lista de jugadores y obtén el puesto y el puntaje de cada uno
        for (int i = 0; i < jugadores.size(); i++) {
            Jugador jugador = jugadores.get(i);
            int puesto = i + 1;
            int puntaje = jugador.getMano().size();

            // Formato del resultado: "Puesto X: Jugador Y con Z puntos"
            String resultado = "Puesto " + puesto + ": " + jugador.getNombre() + " con " + puntaje + " puntos";

            // Agrega el resultado a la lista de resultados
            resultados.add(resultado);
        }




        return resultados;
    }

    //Guardar partida en archivo
    public void guardarPartida(String direccionArchivo) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(direccionArchivo))) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

            // Obtén los resultados usando el método getResultado
            ArrayList<String> resultados = getResultado(jugadores);

            // Recorre la lista de resultados y escribe la información en el archivo
            for (String resultado : resultados) {
                // Formato del resultado: "Puesto X: Jugador Y con Z puntos"
                String fechaPartida = dateFormat.format(new Date()); // Fecha actual
                String linea = fechaPartida + "," + resultado;

                // Escribe la línea en el archivo
                bw.write(linea);
                bw.newLine();
            }
        } catch (IOException e) {
            throw new IOException("Error al guardar el archivo de partidas", e);
        }
    }





    public void agregarJugador(String nombre){
        Jugador jugador = new Jugador(nombre);
        jugadores.add(jugador);
    }

    public void eliminarJugador(String nombre){
        for(Jugador j: jugadores){
            if(j.getNombre().equals(nombre)){
                jugadores.remove(j);
            }
        }
    }

    public void mostrarJugadores(){
        for(Jugador j: jugadores){
            System.out.println(j.getNombre());
        }
    }

    public void mostrarPartidas(){
        for(Partida p: partidas){
            System.out.println(p.toString());
        }
    }


    public Carta recogerCarta() {

        Carta cartaRecogida = baraja.getCartasBaraja().get(0);
        baraja.getCartasBaraja().remove(0);
        return cartaRecogida;
    }

    //getJuagadorActual
    public Jugador getJugadorActual(){
        return jugadores.get(0);
    }
}