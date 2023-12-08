package modelo;

public class Carta {
    private String palo;
    private String valor;

    public Carta(String palo, String valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public String getPalo() {
        return this.palo;
    }

    public String getValor() {
        return this.valor;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String toString() {
        return this.valor + " de " + this.palo;
    }
}