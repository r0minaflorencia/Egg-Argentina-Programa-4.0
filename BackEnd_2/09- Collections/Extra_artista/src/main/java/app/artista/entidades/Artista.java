package app.artista.entidades;

/**
 *
 * @author Romina
 */
public class Artista {
    
    private String nombre, discoMasVendido;

    public Artista() {
    }

    public Artista(String nombre, String discoMasVendido) {
        this.nombre = nombre;
        this.discoMasVendido = discoMasVendido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiscoMasVendido() {
        return discoMasVendido;
    }

    public void setDiscoMasVendido(String discoMasVendido) {
        this.discoMasVendido = discoMasVendido;
    }

    @Override
    public String toString() {
        return "Artista {" + nombre + ", disco mas vendido: " + discoMasVendido + '}';
    }
    
}
