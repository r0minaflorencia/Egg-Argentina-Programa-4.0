package app.cine;

import app.cine.entidades.Pelicula;
import app.cine.servicios.PeliculaService;
import java.util.List;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {
       
        System.out.println(" /// Welcome /// ");
        PeliculaService serviceClass = new PeliculaService();
        
        System.out.println("     Cinema");
        List<Pelicula> movies = serviceClass.arrayMovies();
        
        //mostrar
        serviceClass.showArray(movies);   
        
        System.out.println();
        
        //filtrar
        serviceClass.filterByDuration(movies);
        
        //ordenar
        serviceClass.sortByTitleAsc(movies);
        serviceClass.sortByTitleDesc(movies);
        
        serviceClass.sortByDurationAsc(movies);
        serviceClass.sortByDurationDesc(movies);
    }
}
