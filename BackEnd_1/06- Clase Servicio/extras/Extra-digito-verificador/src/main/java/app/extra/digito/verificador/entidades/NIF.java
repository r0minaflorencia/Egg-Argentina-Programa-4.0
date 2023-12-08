package app.extra.digito.verificador.entidades;

/**
 *
 * @author Romina
 */
public class NIF {

    private int numero;
    private char letra;

    public NIF() {
    }

    public NIF(int numero, char letra) {
        this.numero = numero;
        this.letra = letra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "NIF {" + numero + "-" + letra + '}';
    }
    
}
