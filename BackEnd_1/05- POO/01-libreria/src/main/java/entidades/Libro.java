package entidades;

/**
 *
 * @author Romina
 */
public class Libro {

    private Integer isbn;
    private String titulo, autor;
    private int nroPaginas;

    public Libro() {
    }

    public Libro(Integer isbn, String titulo, String autor, int nroPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nroPaginas = nroPaginas;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNroPaginas() {
        return nroPaginas;
    }

    public void setNroPaginas(int nroPaginas) {
        this.nroPaginas = nroPaginas;
    }

    @Override
    public String toString() {
        return "Libro {" + "ISBN: " + isbn + ", título: " + titulo + ", autor: " + autor + ", cantidad de páginas: " + nroPaginas + '}';
    }

}
