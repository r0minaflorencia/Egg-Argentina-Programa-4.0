package app.nespresso;

import app.nespresso.entidades.Cafetera;
import app.nespresso.servicios.CafeteraService;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {

        System.out.println(" //// Nespresso //// ");
        System.out.println();
        CafeteraService serviceClass = new CafeteraService();

        //llenar
        Cafetera cafe = serviceClass.llenarCafetera();

        //toString
        System.out.println(cafe.toString());

        //servir
        serviceClass.servir(cafe);
        
        //vaciar cafetera
        serviceClass.vaciarCafetera(cafe);
        
        //cargar
        serviceClass.recargar(cafe);

    }
}
