package app.extra.juego.ahorcado;

import app.extra.juego.ahorcado.servicios.AhorcadoService;

/**
 *
 * @author Romina
 */
public class ExtraJuegoAhorcado {

    public static void main(String[] args) {

        System.out.println(" /// Welcome /// ");
        AhorcadoService serviceClass = new AhorcadoService();
        
        //play
        serviceClass.jugar();

    }
}
