package modelo;

import java.util.ArrayList;

public class Baraja {
    ArrayList<Carta> cartas = new ArrayList<Carta>();

    public Baraja(){



    }

    public ArrayList<Carta> getCartasBaraja() {
        return cartas;
    }

    //Metodo que crea una baraja para el jugador
    public void crearBaraja(){
        String[] palos = {"Corazones", "Diamantes", "Picas", "Treboles"};
        String[] valores = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho",
                "Nueve", "Diez", "Jota", "Reina", "Rey"};

        for(int i = 0; i < palos.length; i++){
            for(int j = 0; j < valores.length; j++){
                Carta carta = new Carta(palos[i], valores[j]);
                cartas.add(carta);
            }
        }
    }

    public void mezclarBaraja(){
        for(int i = 0; i < cartas.size(); i++){
            int random = (int) (Math.random() * cartas.size());
            Carta temp = cartas.get(i);
            cartas.set(i, cartas.get(random));
            cartas.set(random, temp);
        }
    }

    public void repartirCartas(ArrayList<Jugador> jugadores){
        for(Jugador jugador : jugadores){
            for(int i = 0; i < 3; i++){
                jugador.getMano().agregarCarta(cartas.get(0));
                cartas.remove(0);
            }
        }
    }
}