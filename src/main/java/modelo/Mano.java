package modelo;

import java.util.ArrayList;

public class Mano {

    ArrayList<Carta> cartasMano = new ArrayList<Carta>();

    public Mano(){

    }

            public ArrayList<Carta> getCartasMano() {
        return cartasMano;
            }

    public void agregarCarta(Carta carta){
        cartasMano.add(carta);
    }

    public void botarCarta(Carta carta){
        cartasMano.remove(carta);
    }

    public int size() {
        return cartasMano.size();
    }
}