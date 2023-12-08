package app.extra.juego.ahorcado.entidades;

/**
 *
 * @author Romina
 */
public class Ahorcado {

    private char[] vector;
    private int chances;
    private String palabra;

    public Ahorcado() {
    }

    public Ahorcado(char[] vector, int chances, String palabra) {
        this.vector = vector;
        this.chances = chances;
        this.palabra = palabra;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

   

    public char[] getVector() {
        return vector;
    }

    public void setVector(char[] vector) {
        this.vector = vector;
    }

    public int getChances() {
        return chances;
    }

    public void setChances(int chances) {
        this.chances = chances;
    }

    
}
