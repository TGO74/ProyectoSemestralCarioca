package modelo;

public class Jugador {

    Mano mano = new Mano();

    private String nombre;

    private int puntos;

    public Jugador(String nombre){
        this.nombre = nombre;
    }

    //getters y setters
    public Mano getMano() {
        return this.mano;
    }
    public String getNombre() {
        return this.nombre;
    }

    public int getPuntos() {
        return this.puntos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void recogerCarta(Carta carta){
        mano.agregarCarta(carta);
    }

    public void botarCarta(Carta carta){
        mano.botarCarta(carta);
    }

    public String mostrarMano(){
        String cartasMano = "Mano de " + this.nombre + "\\n";
        for(Carta carta : mano.getCartasMano()){
            cartasMano += carta.toString() + "\\n";
        }
        return cartasMano;
    }

    public void jugar(){
        System.out.println("Jugando " + this.nombre);
    }
}
