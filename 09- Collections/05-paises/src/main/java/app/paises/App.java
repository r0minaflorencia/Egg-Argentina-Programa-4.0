package app.paises;

import app.paises.servicios.PaisService;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {
        
        System.out.println(" /// Welcome /// ");
        PaisService serviceClass = new PaisService();
        
        serviceClass.guardar();
        serviceClass.mostrar();
        serviceClass.eliminar();
        serviceClass.mostrar();
    }
}
