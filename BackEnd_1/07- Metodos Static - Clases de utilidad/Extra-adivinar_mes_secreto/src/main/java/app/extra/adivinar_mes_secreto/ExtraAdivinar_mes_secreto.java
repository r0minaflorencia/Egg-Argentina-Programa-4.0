package app.extra.adivinar_mes_secreto;

import app.extra.adivinar_mes_secreto.servicios.MesesServicio;

/**
 *
 * @author Romina
 */
public class ExtraAdivinar_mes_secreto {

    public static void main(String[] args) {

        System.out.println(" /// Welcome /// ");
        MesesServicio serviceClass = new MesesServicio();

        //buscar mes
        System.out.println("Buscar mes secreto");
        serviceClass.adivinarMes();
        
    }
    
}
