package app.extra.digito.verificador;

import app.extra.digito.verificador.entidades.NIF;
import app.extra.digito.verificador.servicios.NIFServicio;

/**
 *
 * @author Romina
 */
public class ExtraDigitoVerificador {

    public static void main(String[] args) {

        System.out.println(" /// Welcome /// ");
        
        NIFServicio serviceClass = new NIFServicio();
        
        //crear
        NIF nif = serviceClass.crear();
       
        //mostrar
        System.out.println(nif.toString());
        
    }
}
