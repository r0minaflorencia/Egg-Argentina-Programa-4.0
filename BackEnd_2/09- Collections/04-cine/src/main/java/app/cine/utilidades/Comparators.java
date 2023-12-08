package app.cine.utilidades;

import app.cine.entidades.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Romina
 */
public class Comparators {

    //LAMBDA EXPRESSION:
    public static Comparator<Pelicula> orderByTitleAsc = (Pelicula p1, Pelicula p2)
            -> p1.getTitulo().compareToIgnoreCase(p2.getTitulo());
    
    //TRADITIONAL EXPRESSION:
    public static Comparator<Pelicula> orderByTitleDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p2.getTitulo().compareToIgnoreCase(p1.getTitulo());
        }
    };

    public static Comparator<Pelicula> orderByDurationAsc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p2.getDuracion().compareTo(p1.getDuracion());
        }
    };

    public static Comparator<Pelicula> orderByDurationDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDuracion().compareTo(p2.getDuracion());
        }
    };

}
