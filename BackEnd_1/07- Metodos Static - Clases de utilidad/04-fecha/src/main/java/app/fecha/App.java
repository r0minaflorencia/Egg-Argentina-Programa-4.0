package app.fecha;

import app.fecha.services.FechaService;
import java.time.LocalDate;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {
      
        System.out.println(" /// Welcome /// ");
        FechaService serviceClass = new FechaService();
        
        //ingresar fecha de nacimiento
        LocalDate nacimiento = serviceClass.fechaNacimiento();
        
        //fecha actual
        LocalDate hoy = serviceClass.fechaActual();
        
        //edad
        serviceClass.diferencia(nacimiento, hoy);
        
    }
}
