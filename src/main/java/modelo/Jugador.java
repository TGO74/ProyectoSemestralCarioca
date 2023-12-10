package modelo;

import java.util.ArrayList;



public class Jugador {

    Mano mano = new Mano();

    private String nombre;

    private int puntos;

    private int puesto;

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

    public int getPuesto() {
        return this.puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

//Metodo recoger carta
    public void recogerCarta(Carta carta){
        mano.agregarCarta(carta);
    }


    public void botarCarta(Carta carta){
        mano.botarCarta(carta);
    }

    public String mostrarMano(){
        System.out.println("Mano de " + this.nombre);
        for(Carta carta : mano.getCartasMano()){
            System.out.println(carta.toString());
        }
        return null;
    }





    public void jugar(){
        System.out.println("Jugando " + this.nombre);
    }

    //toString
    @Override
    public String toString() {
        return "Jugador{" +
                "mano=" + mano +
                ", nombre='" + nombre + '\'' +
                ", puntos=" + puntos +
                ", puesto=" + puesto +
                '}';
    }


}
